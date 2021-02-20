package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGotoLocationOptions extends StObject {
  
  var alternativeDeclarationCommand: js.UndefOr[String] = js.native
  
  var alternativeDefinitionCommand: js.UndefOr[String] = js.native
  
  var alternativeImplementationCommand: js.UndefOr[String] = js.native
  
  var alternativeReferenceCommand: js.UndefOr[String] = js.native
  
  var alternativeTypeDefinitionCommand: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[GoToLocationValues] = js.native
  
  var multipleDeclarations: js.UndefOr[GoToLocationValues] = js.native
  
  var multipleDefinitions: js.UndefOr[GoToLocationValues] = js.native
  
  var multipleImplementations: js.UndefOr[GoToLocationValues] = js.native
  
  var multipleReferences: js.UndefOr[GoToLocationValues] = js.native
  
  var multipleTypeDefinitions: js.UndefOr[GoToLocationValues] = js.native
}
object IGotoLocationOptions {
  
  @scala.inline
  def apply(): IGotoLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGotoLocationOptions]
  }
  
  @scala.inline
  implicit class IGotoLocationOptionsMutableBuilder[Self <: IGotoLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeDeclarationCommand(value: String): Self = StObject.set(x, "alternativeDeclarationCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeDeclarationCommandUndefined: Self = StObject.set(x, "alternativeDeclarationCommand", js.undefined)
    
    @scala.inline
    def setAlternativeDefinitionCommand(value: String): Self = StObject.set(x, "alternativeDefinitionCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeDefinitionCommandUndefined: Self = StObject.set(x, "alternativeDefinitionCommand", js.undefined)
    
    @scala.inline
    def setAlternativeImplementationCommand(value: String): Self = StObject.set(x, "alternativeImplementationCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeImplementationCommandUndefined: Self = StObject.set(x, "alternativeImplementationCommand", js.undefined)
    
    @scala.inline
    def setAlternativeReferenceCommand(value: String): Self = StObject.set(x, "alternativeReferenceCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeReferenceCommandUndefined: Self = StObject.set(x, "alternativeReferenceCommand", js.undefined)
    
    @scala.inline
    def setAlternativeTypeDefinitionCommand(value: String): Self = StObject.set(x, "alternativeTypeDefinitionCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeTypeDefinitionCommandUndefined: Self = StObject.set(x, "alternativeTypeDefinitionCommand", js.undefined)
    
    @scala.inline
    def setMultiple(value: GoToLocationValues): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleDeclarations(value: GoToLocationValues): Self = StObject.set(x, "multipleDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleDeclarationsUndefined: Self = StObject.set(x, "multipleDeclarations", js.undefined)
    
    @scala.inline
    def setMultipleDefinitions(value: GoToLocationValues): Self = StObject.set(x, "multipleDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleDefinitionsUndefined: Self = StObject.set(x, "multipleDefinitions", js.undefined)
    
    @scala.inline
    def setMultipleImplementations(value: GoToLocationValues): Self = StObject.set(x, "multipleImplementations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleImplementationsUndefined: Self = StObject.set(x, "multipleImplementations", js.undefined)
    
    @scala.inline
    def setMultipleReferences(value: GoToLocationValues): Self = StObject.set(x, "multipleReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleReferencesUndefined: Self = StObject.set(x, "multipleReferences", js.undefined)
    
    @scala.inline
    def setMultipleTypeDefinitions(value: GoToLocationValues): Self = StObject.set(x, "multipleTypeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleTypeDefinitionsUndefined: Self = StObject.set(x, "multipleTypeDefinitions", js.undefined)
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
