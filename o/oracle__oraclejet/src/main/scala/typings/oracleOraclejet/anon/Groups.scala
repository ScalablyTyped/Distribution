package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: DataTypes
  var items: DataTypes
  var series: DataTypes
}

object Groups {
  @scala.inline
  def apply(groups: DataTypes, items: DataTypes, series: DataTypes): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

