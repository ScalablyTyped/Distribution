package typings.nodeUci.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var bestmove: String = js.native
  var info: js.Array[String] = js.native
}

object SearchResult {
  @scala.inline
  def apply(bestmove: String, info: js.Array[String]): SearchResult = {
    val __obj = js.Dynamic.literal(bestmove = bestmove.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
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
    def setBestmove(value: String): Self = this.set("bestmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoVarargs(value: String*): Self = this.set("info", js.Array(value :_*))
    @scala.inline
    def setInfo(value: js.Array[String]): Self = this.set("info", value.asInstanceOf[js.Any])
  }
  
}

