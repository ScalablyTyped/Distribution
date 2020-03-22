package typings.objection.mod

import typings.objection.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationProperty extends js.Object {
  var cols: js.Array[String]
  var modelClass: TypeofModel
  var props: js.Array[String]
  var size: Double
}

object RelationProperty {
  @scala.inline
  def apply(cols: js.Array[String], modelClass: TypeofModel, props: js.Array[String], size: Double): RelationProperty = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], modelClass = modelClass.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelationProperty]
  }
}

