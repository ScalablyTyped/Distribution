package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionProviderMetadata extends StObject {
  
  val documentation: js.UndefOr[js.Array[typings.monacoEditor.anon.Command]] = js.undefined
  
  /**
    * List of code action kinds that a {@link CodeActionProvider} may return.
    *
    * This list is used to determine if a given `CodeActionProvider` should be invoked or not.
    * To avoid unnecessary computation, every `CodeActionProvider` should list use `providedCodeActionKinds`. The
    * list of kinds may either be generic, such as `["quickfix", "refactor", "source"]`, or list out every kind provided,
    * such as `["quickfix.removeLine", "source.fixAll" ...]`.
    */
  val providedCodeActionKinds: js.UndefOr[js.Array[String]] = js.undefined
}
object CodeActionProviderMetadata {
  
  inline def apply(): CodeActionProviderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionProviderMetadata]
  }
  
  extension [Self <: CodeActionProviderMetadata](x: Self) {
    
    inline def setDocumentation(value: js.Array[typings.monacoEditor.anon.Command]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: typings.monacoEditor.anon.Command*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setProvidedCodeActionKinds(value: js.Array[String]): Self = StObject.set(x, "providedCodeActionKinds", value.asInstanceOf[js.Any])
    
    inline def setProvidedCodeActionKindsUndefined: Self = StObject.set(x, "providedCodeActionKinds", js.undefined)
    
    inline def setProvidedCodeActionKindsVarargs(value: String*): Self = StObject.set(x, "providedCodeActionKinds", js.Array(value*))
  }
}
