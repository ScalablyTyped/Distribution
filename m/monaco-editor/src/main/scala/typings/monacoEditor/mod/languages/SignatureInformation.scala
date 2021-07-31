package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureInformation extends StObject {
  
  /**
    * Index of the active parameter.
    *
    * If provided, this is used in place of `SignatureHelp.activeSignature`.
    */
  var activeParameter: js.UndefOr[Double] = js.undefined
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
  
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String
  
  /**
    * The parameters of this signature.
    */
  var parameters: js.Array[ParameterInformation]
}
object SignatureInformation {
  
  @scala.inline
  def apply(label: String, parameters: js.Array[ParameterInformation]): SignatureInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInformation]
  }
  
  @scala.inline
  implicit class SignatureInformationMutableBuilder[Self <: SignatureInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveParameter(value: Double): Self = StObject.set(x, "activeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveParameterUndefined: Self = StObject.set(x, "activeParameter", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String | IMarkdownString): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[ParameterInformation]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: ParameterInformation*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
