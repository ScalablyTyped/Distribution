package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGotoLocationOptions extends StObject {
  
  var alternativeDeclarationCommand: js.UndefOr[String] = js.undefined
  
  var alternativeDefinitionCommand: js.UndefOr[String] = js.undefined
  
  var alternativeImplementationCommand: js.UndefOr[String] = js.undefined
  
  var alternativeReferenceCommand: js.UndefOr[String] = js.undefined
  
  var alternativeTypeDefinitionCommand: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[GoToLocationValues] = js.undefined
  
  var multipleDeclarations: js.UndefOr[GoToLocationValues] = js.undefined
  
  var multipleDefinitions: js.UndefOr[GoToLocationValues] = js.undefined
  
  var multipleImplementations: js.UndefOr[GoToLocationValues] = js.undefined
  
  var multipleReferences: js.UndefOr[GoToLocationValues] = js.undefined
  
  var multipleTypeDefinitions: js.UndefOr[GoToLocationValues] = js.undefined
}
object IGotoLocationOptions {
  
  inline def apply(): IGotoLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGotoLocationOptions]
  }
  
  extension [Self <: IGotoLocationOptions](x: Self) {
    
    inline def setAlternativeDeclarationCommand(value: String): Self = StObject.set(x, "alternativeDeclarationCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeDeclarationCommandUndefined: Self = StObject.set(x, "alternativeDeclarationCommand", js.undefined)
    
    inline def setAlternativeDefinitionCommand(value: String): Self = StObject.set(x, "alternativeDefinitionCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeDefinitionCommandUndefined: Self = StObject.set(x, "alternativeDefinitionCommand", js.undefined)
    
    inline def setAlternativeImplementationCommand(value: String): Self = StObject.set(x, "alternativeImplementationCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeImplementationCommandUndefined: Self = StObject.set(x, "alternativeImplementationCommand", js.undefined)
    
    inline def setAlternativeReferenceCommand(value: String): Self = StObject.set(x, "alternativeReferenceCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeReferenceCommandUndefined: Self = StObject.set(x, "alternativeReferenceCommand", js.undefined)
    
    inline def setAlternativeTypeDefinitionCommand(value: String): Self = StObject.set(x, "alternativeTypeDefinitionCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeTypeDefinitionCommandUndefined: Self = StObject.set(x, "alternativeTypeDefinitionCommand", js.undefined)
    
    inline def setMultiple(value: GoToLocationValues): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleDeclarations(value: GoToLocationValues): Self = StObject.set(x, "multipleDeclarations", value.asInstanceOf[js.Any])
    
    inline def setMultipleDeclarationsUndefined: Self = StObject.set(x, "multipleDeclarations", js.undefined)
    
    inline def setMultipleDefinitions(value: GoToLocationValues): Self = StObject.set(x, "multipleDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMultipleDefinitionsUndefined: Self = StObject.set(x, "multipleDefinitions", js.undefined)
    
    inline def setMultipleImplementations(value: GoToLocationValues): Self = StObject.set(x, "multipleImplementations", value.asInstanceOf[js.Any])
    
    inline def setMultipleImplementationsUndefined: Self = StObject.set(x, "multipleImplementations", js.undefined)
    
    inline def setMultipleReferences(value: GoToLocationValues): Self = StObject.set(x, "multipleReferences", value.asInstanceOf[js.Any])
    
    inline def setMultipleReferencesUndefined: Self = StObject.set(x, "multipleReferences", js.undefined)
    
    inline def setMultipleTypeDefinitions(value: GoToLocationValues): Self = StObject.set(x, "multipleTypeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMultipleTypeDefinitionsUndefined: Self = StObject.set(x, "multipleTypeDefinitions", js.undefined)
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
