package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  /**
    * Whether causal consistency should be enabled on this session
    * @default true
    */
  var causalConsistency: js.UndefOr[Boolean] = js.native
  /**
    * The default TransactionOptions to use for transactions started on this session.
    */
  var defaultTransactionOptions: js.UndefOr[TransactionOptions] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
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
    def setCausalConsistency(value: Boolean): Self = this.set("causalConsistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausalConsistency: Self = this.set("causalConsistency", js.undefined)
    @scala.inline
    def setDefaultTransactionOptions(value: TransactionOptions): Self = this.set("defaultTransactionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTransactionOptions: Self = this.set("defaultTransactionOptions", js.undefined)
  }
  
}

