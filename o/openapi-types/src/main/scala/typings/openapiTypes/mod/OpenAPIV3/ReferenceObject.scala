package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.mod.OpenAPI.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceObject extends Parameter {
  @JSName("$ref")
  var $ref: String = js.native
}

object ReferenceObject {
  @scala.inline
  def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
  @scala.inline
  implicit class ReferenceObjectOps[Self <: ReferenceObject] (val x: Self) extends AnyVal {
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
  }
  
}

