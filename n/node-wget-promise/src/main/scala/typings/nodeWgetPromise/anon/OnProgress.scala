package typings.nodeWgetPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnProgress extends js.Object {
  var onProgress: js.UndefOr[js.Any] = js.native
  var onStart: js.UndefOr[js.Any] = js.native
  var output: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object OnProgress {
  @scala.inline
  def apply(): OnProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgress]
  }
  @scala.inline
  implicit class OnProgressOps[Self <: OnProgress] (val x: Self) extends AnyVal {
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
    def setOnProgress(value: js.Any): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnStart(value: js.Any): Self = this.set("onStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

