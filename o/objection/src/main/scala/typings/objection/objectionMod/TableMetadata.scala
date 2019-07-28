package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableMetadata extends js.Object {
  var columns: js.Array[String]
}

object TableMetadata {
  @scala.inline
  def apply(columns: js.Array[String]): TableMetadata = {
    val __obj = js.Dynamic.literal(columns = columns)
  
    __obj.asInstanceOf[TableMetadata]
  }
}

