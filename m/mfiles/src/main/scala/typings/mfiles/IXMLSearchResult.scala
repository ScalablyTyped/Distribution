package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXMLSearchResult extends js.Object {
  val MoreResults: Boolean
  val SearchResult: String
}

object IXMLSearchResult {
  @scala.inline
  def apply(MoreResults: Boolean, SearchResult: String): IXMLSearchResult = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults, SearchResult = SearchResult)
  
    __obj.asInstanceOf[IXMLSearchResult]
  }
}

