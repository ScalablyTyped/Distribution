package typings.nodeUci.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var bestmove: String
  var info: js.Array[String]
}

object SearchResult {
  @scala.inline
  def apply(bestmove: String, info: js.Array[String]): SearchResult = {
    val __obj = js.Dynamic.literal(bestmove = bestmove.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

