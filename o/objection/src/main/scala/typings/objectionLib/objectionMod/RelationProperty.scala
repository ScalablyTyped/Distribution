package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationProperty extends js.Object {
  var cols: js.Array[java.lang.String]
  var modelClass: ModelClass[_]
  var props: js.Array[java.lang.String]
  var size: scala.Double
}

object RelationProperty {
  @scala.inline
  def apply(
    cols: js.Array[java.lang.String],
    modelClass: ModelClass[_],
    props: js.Array[java.lang.String],
    size: scala.Double
  ): RelationProperty = {
    val __obj = js.Dynamic.literal(cols = cols, modelClass = modelClass, props = props, size = size)
  
    __obj.asInstanceOf[RelationProperty]
  }
}

