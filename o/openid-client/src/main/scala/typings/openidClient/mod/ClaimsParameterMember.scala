package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimsParameterMember
  extends /* key */ StringDictionary[js.Any] {
  var essential: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[String]] = js.native
}

object ClaimsParameterMember {
  @scala.inline
  def apply(): ClaimsParameterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsParameterMember]
  }
  @scala.inline
  implicit class ClaimsParameterMemberOps[Self <: ClaimsParameterMember] (val x: Self) extends AnyVal {
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
    def setEssential(value: Boolean): Self = this.set("essential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEssential: Self = this.set("essential", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

