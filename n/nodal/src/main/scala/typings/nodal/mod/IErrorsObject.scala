package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrorsObject
  extends /* field */ StringDictionary[js.Array[String]] {
  var _query: js.UndefOr[js.Any] = js.native
}

object IErrorsObject {
  @scala.inline
  def apply(): IErrorsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrorsObject]
  }
  @scala.inline
  implicit class IErrorsObjectOps[Self <: IErrorsObject] (val x: Self) extends AnyVal {
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
    def set_query(value: js.Any): Self = this.set("_query", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_query: Self = this.set("_query", js.undefined)
  }
  
}

