package typings.mendixmodelsdk.elementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IByNameReferrable extends js.Object {
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  val qualifiedName: String | Null = js.native
}

object IByNameReferrable {
  @scala.inline
  def apply(): IByNameReferrable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IByNameReferrable]
  }
  @scala.inline
  implicit class IByNameReferrableOps[Self <: IByNameReferrable] (val x: Self) extends AnyVal {
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
    def setQualifiedName(value: String): Self = this.set("qualifiedName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifiedNameNull: Self = this.set("qualifiedName", null)
  }
  
}

