package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete extends js.Object {
  var complete: String
  var failed: String
  var parsing: String
  var queued: String
  var running: String
  var under_review: String
  var uploading: String
  var waiting: String
  var waiting_analyzed: String
}

object Anon_Complete {
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
  ): Anon_Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], under_review = under_review.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], waiting_analyzed = waiting_analyzed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Complete]
  }
}

