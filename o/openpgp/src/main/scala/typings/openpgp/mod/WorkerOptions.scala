package typings.openpgp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerOptions extends js.Object {
  /**
    * number of workers to initialize
    */
  var n: js.UndefOr[Double] = js.native
  /**
    * relative path to the worker scripts, default: 'openpgp.worker.js'
    */
  var path: String = js.native
  /**
    * alternative to path parameter: web workers initialized with 'openpgp.worker.js'
    */
  var workers: js.UndefOr[js.Array[_]] = js.native
}

object WorkerOptions {
  @scala.inline
  def apply(path: String): WorkerOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
  @scala.inline
  implicit class WorkerOptionsOps[Self <: WorkerOptions] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setWorkersVarargs(value: js.Any*): Self = this.set("workers", js.Array(value :_*))
    @scala.inline
    def setWorkers(value: js.Array[_]): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
  
}

