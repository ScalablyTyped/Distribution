package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXMLSearchResult extends js.Object {
  val MoreResults: scala.Boolean
  val SearchResult: java.lang.String
}

object IXMLSearchResult {
  @scala.inline
  def apply(MoreResults: scala.Boolean, SearchResult: java.lang.String): IXMLSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MoreResults")(MoreResults)
    __obj.updateDynamic("SearchResult")(SearchResult)
    __obj.asInstanceOf[IXMLSearchResult]
  }
}

