package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmOptions extends js.Object {
  
  /**
    * When `true`, exceptions will be ignored if `path` does not exist.
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * If an `EBUSY`, `EMFILE`, `ENFILE`, `ENOTEMPTY`, or
    * `EPERM` error is encountered, Node.js will retry the operation with a linear
    * backoff wait of `retryDelay` ms longer on each try. This option represents the
    * number of retries. This option is ignored if the `recursive` option is not
    * `true`.
    * @default 0
    */
  var maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, perform a recursive directory removal. In
    * recursive mode, errors are not reported if `path` does not exist, and
    * operations are retried on failure.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of time in milliseconds to wait between retries.
    * This option is ignored if the `recursive` option is not `true`.
    * @default 100
    */
  var retryDelay: js.UndefOr[Double] = js.native
}
object RmOptions {
  
  @scala.inline
  def apply(): RmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RmOptions]
  }
  
  @scala.inline
  implicit class RmOptionsOps[Self <: RmOptions] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
  }
}
