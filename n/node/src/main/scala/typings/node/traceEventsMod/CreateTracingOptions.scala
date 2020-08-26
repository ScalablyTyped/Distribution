package typings.node.traceEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTracingOptions extends js.Object {
  /**
    * An array of trace category names. Values included in the array are
    * coerced to a string when possible. An error will be thrown if the
    * value cannot be coerced.
    */
  var categories: js.Array[String] = js.native
}

object CreateTracingOptions {
  @scala.inline
  def apply(categories: js.Array[String]): CreateTracingOptions = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTracingOptions]
  }
  @scala.inline
  implicit class CreateTracingOptionsOps[Self <: CreateTracingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
  }
  
}

