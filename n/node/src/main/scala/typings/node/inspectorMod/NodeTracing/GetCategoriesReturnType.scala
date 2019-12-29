package typings.node.inspectorMod.NodeTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCategoriesReturnType extends js.Object {
  /**
    * A list of supported tracing categories.
    */
  var categories: js.Array[String]
}

object GetCategoriesReturnType {
  @scala.inline
  def apply(categories: js.Array[String]): GetCategoriesReturnType = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCategoriesReturnType]
  }
}

