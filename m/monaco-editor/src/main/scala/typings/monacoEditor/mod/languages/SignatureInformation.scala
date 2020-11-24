package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureInformation extends js.Object {
  
  /**
    * Index of the active parameter.
    *
    * If provided, this is used in place of `SignatureHelp.activeSignature`.
    */
  var activeParameter: js.UndefOr[Double] = js.native
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.native
  
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String = js.native
  
  /**
    * The parameters of this signature.
    */
  var parameters: js.Array[ParameterInformation] = js.native
}
object SignatureInformation {
  
  @scala.inline
  def apply(label: String, parameters: js.Array[ParameterInformation]): SignatureInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInformation]
  }
  
  @scala.inline
  implicit class SignatureInformationOps[Self <: SignatureInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: ParameterInformation*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[ParameterInformation]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveParameter(value: Double): Self = this.set("activeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveParameter: Self = this.set("activeParameter", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String | IMarkdownString): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
}
