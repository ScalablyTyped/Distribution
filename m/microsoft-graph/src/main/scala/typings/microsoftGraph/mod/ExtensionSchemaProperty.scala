package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionSchemaProperty extends js.Object {
  // The name of the strongly-typed property defined as part of a schema extension.
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the property that is defined as part of a schema extension. Allowed values are Binary, Boolean, DateTime,
    * Integer or String. See the table below for more details.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ExtensionSchemaProperty {
  @scala.inline
  def apply(): ExtensionSchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionSchemaProperty]
  }
  @scala.inline
  implicit class ExtensionSchemaPropertyOps[Self <: ExtensionSchemaProperty] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

