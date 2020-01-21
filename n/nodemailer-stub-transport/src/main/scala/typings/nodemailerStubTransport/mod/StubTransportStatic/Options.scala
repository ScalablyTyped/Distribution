package typings.nodemailerStubTransport.mod.StubTransportStatic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Specifies a custom error.
    * @type {any}
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * Value that indicates if the BCC addresses must be included in generated message.
    * @type {boolean}
    */
  var keepBcc: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(error: js.Any = null, keepBcc: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(keepBcc)) __obj.updateDynamic("keepBcc")(keepBcc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

