package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMetadataOptions extends js.Object {
  var table: String
}

object TableMetadataOptions {
  @scala.inline
  def apply(table: String): TableMetadataOptions = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadataOptions]
  }
}

