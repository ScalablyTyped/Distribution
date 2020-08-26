package typings.oracleOraclejet.ojprogresslistMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojprogresslist.ojProgressListSettableProperties> */
@js.native
trait ojProgressListSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[(DataProvider[_, _]) | Null] = js.native
}

object ojProgressListSettablePropertiesLenient {
  @scala.inline
  def apply(): ojProgressListSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojProgressListSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojProgressListSettablePropertiesLenientOps[Self <: ojProgressListSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setData(value: DataProvider[_, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

