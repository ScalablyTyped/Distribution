package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete extends js.Object {
  var complete: String = js.native
  var failed: String = js.native
  var parsing: String = js.native
  var queued: String = js.native
  var running: String = js.native
  var under_review: String = js.native
  var uploading: String = js.native
  var waiting: String = js.native
  var waiting_analyzed: String = js.native
}

object Complete {
  @scala.inline
  def apply(
    complete: String,
    failed: String,
    parsing: String,
    queued: String,
    running: String,
    under_review: String,
    uploading: String,
    waiting: String,
    waiting_analyzed: String
  ): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], under_review = under_review.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], waiting_analyzed = waiting_analyzed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete] (val x: Self) extends AnyVal {
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
    def setComplete(value: String): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: String): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsing(value: String): Self = this.set("parsing", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueued(value: String): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunning(value: String): Self = this.set("running", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnder_review(value: String): Self = this.set("under_review", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploading(value: String): Self = this.set("uploading", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaiting(value: String): Self = this.set("waiting", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaiting_analyzed(value: String): Self = this.set("waiting_analyzed", value.asInstanceOf[js.Any])
  }
  
}

