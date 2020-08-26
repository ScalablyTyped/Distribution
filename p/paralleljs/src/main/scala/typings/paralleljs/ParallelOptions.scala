package typings.paralleljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelOptions extends js.Object {
  /**
    * This is the path to the file eval.js.  This is required when running in node, and required for some browsers (IE 10) in order to work around cross-domain restrictions for web workers.  Defaults to the same location as parallel.js in node environments, and null in the browser.
    **/
  var evalPath: js.UndefOr[String] = js.native
  /**
    * The maximum number of permitted worker threads.  This will default to 4, or the number of cpus on your computer if you're running node.
    **/
  var maxWorkers: js.UndefOr[Double] = js.native
  /**
    * If webworkers are not available, whether or not to fall back to synchronous processing using setTimeout.  Defaults to true.
    **/
  var synchronous: js.UndefOr[Boolean] = js.native
}

object ParallelOptions {
  @scala.inline
  def apply(): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelOptions]
  }
  @scala.inline
  implicit class ParallelOptionsOps[Self <: ParallelOptions] (val x: Self) extends AnyVal {
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
    def setEvalPath(value: String): Self = this.set("evalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalPath: Self = this.set("evalPath", js.undefined)
    @scala.inline
    def setMaxWorkers(value: Double): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
  }
  
}

