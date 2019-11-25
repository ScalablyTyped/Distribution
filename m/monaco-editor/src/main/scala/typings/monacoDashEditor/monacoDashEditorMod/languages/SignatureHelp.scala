package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelp extends js.Object {
  /**
    * The active parameter of the active signature.
    */
  var activeParameter: Double
  /**
    * The active signature.
    */
  var activeSignature: Double
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation]
}

object SignatureHelp {
  @scala.inline
  def apply(activeParameter: Double, activeSignature: Double, signatures: js.Array[SignatureInformation]): SignatureHelp = {
    val __obj = js.Dynamic.literal(activeParameter = activeParameter.asInstanceOf[js.Any], activeSignature = activeSignature.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureHelp]
  }
}

