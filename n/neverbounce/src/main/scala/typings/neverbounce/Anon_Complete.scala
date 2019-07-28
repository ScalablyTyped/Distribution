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
    val __obj = js.Dynamic.literal(complete = complete, failed = failed, parsing = parsing, queued = queued, running = running, under_review = under_review, uploading = uploading, waiting = waiting, waiting_analyzed = waiting_analyzed)
  
    __obj.asInstanceOf[Anon_Complete]
  }
}

