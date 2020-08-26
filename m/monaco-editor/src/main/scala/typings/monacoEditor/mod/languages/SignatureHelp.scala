package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelp extends js.Object {
  /**
    * The active parameter of the active signature.
    */
  var activeParameter: Double = js.native
  /**
    * The active signature.
    */
  var activeSignature: Double = js.native
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation] = js.native
}

object SignatureHelp {
  @scala.inline
  def apply(activeParameter: Double, activeSignature: Double, signatures: js.Array[SignatureInformation]): SignatureHelp = {
    val __obj = js.Dynamic.literal(activeParameter = activeParameter.asInstanceOf[js.Any], activeSignature = activeSignature.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelp]
  }
  @scala.inline
  implicit class SignatureHelpOps[Self <: SignatureHelp] (val x: Self) extends AnyVal {
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
    def setActiveParameter(value: Double): Self = this.set("activeParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveSignature(value: Double): Self = this.set("activeSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: SignatureInformation*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[SignatureInformation]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
  
}

