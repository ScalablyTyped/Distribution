package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationOptions extends StObject {
  
  var initializationOptions: js.UndefOr[js.Any] = js.undefined
  
  var syntaxes: js.Array[String]
}
object InitializationOptions {
  
  inline def apply(syntaxes: js.Array[String]): InitializationOptions = {
    val __obj = js.Dynamic.literal(syntaxes = syntaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationOptions]
  }
  
  extension [Self <: InitializationOptions](x: Self) {
    
    inline def setInitializationOptions(value: js.Any): Self = StObject.set(x, "initializationOptions", value.asInstanceOf[js.Any])
    
    inline def setInitializationOptionsUndefined: Self = StObject.set(x, "initializationOptions", js.undefined)
    
    inline def setSyntaxes(value: js.Array[String]): Self = StObject.set(x, "syntaxes", value.asInstanceOf[js.Any])
    
    inline def setSyntaxesVarargs(value: String*): Self = StObject.set(x, "syntaxes", js.Array(value :_*))
  }
}
