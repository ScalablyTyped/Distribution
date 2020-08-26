package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscriminatorObject extends js.Object {
  var mapping: js.UndefOr[StringDictionary[String]] = js.native
  var propertyName: String = js.native
}

object DiscriminatorObject {
  @scala.inline
  def apply(propertyName: String): DiscriminatorObject = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscriminatorObject]
  }
  @scala.inline
  implicit class DiscriminatorObjectOps[Self <: DiscriminatorObject] (val x: Self) extends AnyVal {
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapping(value: StringDictionary[String]): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
  }
  
}

