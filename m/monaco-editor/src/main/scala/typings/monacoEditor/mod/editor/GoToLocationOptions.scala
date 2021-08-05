package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IGotoLocationOptions>> */
trait GoToLocationOptions extends StObject {
  
  val alternativeDeclarationCommand: String
  
  val alternativeDefinitionCommand: String
  
  val alternativeImplementationCommand: String
  
  val alternativeReferenceCommand: String
  
  val alternativeTypeDefinitionCommand: String
  
  val multiple: GoToLocationValues
  
  val multipleDeclarations: GoToLocationValues
  
  val multipleDefinitions: GoToLocationValues
  
  val multipleImplementations: GoToLocationValues
  
  val multipleReferences: GoToLocationValues
  
  val multipleTypeDefinitions: GoToLocationValues
}
object GoToLocationOptions {
  
  inline def apply(
    alternativeDeclarationCommand: String,
    alternativeDefinitionCommand: String,
    alternativeImplementationCommand: String,
    alternativeReferenceCommand: String,
    alternativeTypeDefinitionCommand: String,
    multiple: GoToLocationValues,
    multipleDeclarations: GoToLocationValues,
    multipleDefinitions: GoToLocationValues,
    multipleImplementations: GoToLocationValues,
    multipleReferences: GoToLocationValues,
    multipleTypeDefinitions: GoToLocationValues
  ): GoToLocationOptions = {
    val __obj = js.Dynamic.literal(alternativeDeclarationCommand = alternativeDeclarationCommand.asInstanceOf[js.Any], alternativeDefinitionCommand = alternativeDefinitionCommand.asInstanceOf[js.Any], alternativeImplementationCommand = alternativeImplementationCommand.asInstanceOf[js.Any], alternativeReferenceCommand = alternativeReferenceCommand.asInstanceOf[js.Any], alternativeTypeDefinitionCommand = alternativeTypeDefinitionCommand.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], multipleDeclarations = multipleDeclarations.asInstanceOf[js.Any], multipleDefinitions = multipleDefinitions.asInstanceOf[js.Any], multipleImplementations = multipleImplementations.asInstanceOf[js.Any], multipleReferences = multipleReferences.asInstanceOf[js.Any], multipleTypeDefinitions = multipleTypeDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoToLocationOptions]
  }
  
  extension [Self <: GoToLocationOptions](x: Self) {
    
    inline def setAlternativeDeclarationCommand(value: String): Self = StObject.set(x, "alternativeDeclarationCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeDefinitionCommand(value: String): Self = StObject.set(x, "alternativeDefinitionCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeImplementationCommand(value: String): Self = StObject.set(x, "alternativeImplementationCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeReferenceCommand(value: String): Self = StObject.set(x, "alternativeReferenceCommand", value.asInstanceOf[js.Any])
    
    inline def setAlternativeTypeDefinitionCommand(value: String): Self = StObject.set(x, "alternativeTypeDefinitionCommand", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: GoToLocationValues): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleDeclarations(value: GoToLocationValues): Self = StObject.set(x, "multipleDeclarations", value.asInstanceOf[js.Any])
    
    inline def setMultipleDefinitions(value: GoToLocationValues): Self = StObject.set(x, "multipleDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMultipleImplementations(value: GoToLocationValues): Self = StObject.set(x, "multipleImplementations", value.asInstanceOf[js.Any])
    
    inline def setMultipleReferences(value: GoToLocationValues): Self = StObject.set(x, "multipleReferences", value.asInstanceOf[js.Any])
    
    inline def setMultipleTypeDefinitions(value: GoToLocationValues): Self = StObject.set(x, "multipleTypeDefinitions", value.asInstanceOf[js.Any])
  }
}
