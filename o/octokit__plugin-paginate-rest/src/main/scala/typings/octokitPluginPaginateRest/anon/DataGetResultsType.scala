package typings.octokitPluginPaginateRest.anon

import typings.octokitPluginPaginateRest.typesMod.GetResultsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGetResultsType[T] extends js.Object {
  var data: GetResultsType[T]
}

object DataGetResultsType {
  @scala.inline
  def apply[T](data: GetResultsType[T]): DataGetResultsType[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGetResultsType[T]]
  }
}

