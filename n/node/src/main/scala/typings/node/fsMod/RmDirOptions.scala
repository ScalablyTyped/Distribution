package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmDirOptions extends js.Object {
  
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
    * @deprecated since v14.14.0 In future versions of Node.js,
    * `fs.rmdir(path, { recursive: true })` will throw on nonexistent
    * paths, or when given a file as a target.
    * Use `fs.rm(path, { recursive: true, force: true })` instead.
    *
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
object RmDirOptions {
  
  @scala.inline
  def apply(): RmDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RmDirOptions]
  }
  
  @scala.inline
  implicit class RmDirOptionsOps[Self <: RmDirOptions] (val x: Self) extends AnyVal {
    
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
