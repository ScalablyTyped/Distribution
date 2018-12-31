package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardSelectionList extends js.Object {
  val Events: IEvents
  val Filter: java.lang.String
  val FilteringValue: java.lang.String
  val Items: js.Any
  val MoreResults: scala.Boolean
  def AutoSelect(identifier: java.lang.String): scala.Unit
  def SetFilter(Filter: java.lang.String, token: scala.Double, maxResults: scala.Double): scala.Unit
}

