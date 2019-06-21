package typings
package neverbounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete extends js.Object {
  var complete: java.lang.String
  var failed: java.lang.String
  var parsing: java.lang.String
  var queued: java.lang.String
  var running: java.lang.String
  var under_review: java.lang.String
  var uploading: java.lang.String
  var waiting: java.lang.String
  var waiting_analyzed: java.lang.String
}

object Anon_Complete {
  @scala.inline
  def apply(
    complete: java.lang.String,
    failed: java.lang.String,
    parsing: java.lang.String,
    queued: java.lang.String,
    running: java.lang.String,
    under_review: java.lang.String,
    uploading: java.lang.String,
    waiting: java.lang.String,
    waiting_analyzed: java.lang.String
  ): Anon_Complete = {
    val __obj = js.Dynamic.literal(complete = complete, failed = failed, parsing = parsing, queued = queued, running = running, under_review = under_review, uploading = uploading, waiting = waiting, waiting_analyzed = waiting_analyzed)
  
    __obj.asInstanceOf[Anon_Complete]
  }
}

