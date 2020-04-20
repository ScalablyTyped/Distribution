package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var groups: AnonDataTypes
  var items: AnonDataTypes
  var series: AnonDataTypes
}

object AnonGroups {
  @scala.inline
  def apply(groups: AnonDataTypes, items: AnonDataTypes, series: AnonDataTypes): AnonGroups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroups]
  }
}

