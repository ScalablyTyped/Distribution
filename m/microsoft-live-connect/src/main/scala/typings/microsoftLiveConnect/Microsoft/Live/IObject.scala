package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience interface for when you have a bunch of objects of different
  * types in a single collection. You discriminate between them using their
  * 'type' field.
  */
@js.native
trait IObject extends js.Object {
  /**
    * The object's type.
    */
  var `type`: String = js.native
}

object IObject {
  @scala.inline
  def apply(`type`: String): IObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObject]
  }
  @scala.inline
  implicit class IObjectOps[Self <: IObject] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

