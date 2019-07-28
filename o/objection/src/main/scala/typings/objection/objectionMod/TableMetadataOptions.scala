package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMetadataOptions extends js.Object {
  var table: String
}

object TableMetadataOptions {
  @scala.inline
  def apply(table: String): TableMetadataOptions = {
    val __obj = js.Dynamic.literal(table = table)
  
    __obj.asInstanceOf[TableMetadataOptions]
  }
}

