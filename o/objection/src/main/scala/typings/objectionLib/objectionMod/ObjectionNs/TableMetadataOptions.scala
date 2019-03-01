package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMetadataOptions extends js.Object {
  var table: java.lang.String
}

object TableMetadataOptions {
  @scala.inline
  def apply(table: java.lang.String): TableMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[TableMetadataOptions]
  }
}

