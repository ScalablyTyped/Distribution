package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationProperty extends js.Object {
  var cols: js.Array[String]
  var modelClass: ModelClass[_]
  var props: js.Array[String]
  var size: Double
}

object RelationProperty {
  @scala.inline
  def apply(cols: js.Array[String], modelClass: ModelClass[_], props: js.Array[String], size: Double): RelationProperty = {
    val __obj = js.Dynamic.literal(cols = cols, modelClass = modelClass, props = props, size = size)
  
    __obj.asInstanceOf[RelationProperty]
  }
}

