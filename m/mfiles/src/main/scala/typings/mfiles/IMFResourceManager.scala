package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMFResourceManager extends js.Object {
  def GetLocaleSpecificDateFormat(): String = js.native
  def GetUICultures(): IStrings = js.native
  def LoadResourceString(LanguageID: Double, ResourceID: Double): String = js.native
}

object IMFResourceManager {
  @scala.inline
  def apply(
    GetLocaleSpecificDateFormat: () => String,
    GetUICultures: () => IStrings,
    LoadResourceString: (Double, Double) => String
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal(GetLocaleSpecificDateFormat = js.Any.fromFunction0(GetLocaleSpecificDateFormat), GetUICultures = js.Any.fromFunction0(GetUICultures), LoadResourceString = js.Any.fromFunction2(LoadResourceString))
    __obj.asInstanceOf[IMFResourceManager]
  }
  @scala.inline
  implicit class IMFResourceManagerOps[Self <: IMFResourceManager] (val x: Self) extends AnyVal {
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
    def setGetLocaleSpecificDateFormat(value: () => String): Self = this.set("GetLocaleSpecificDateFormat", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUICultures(value: () => IStrings): Self = this.set("GetUICultures", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadResourceString(value: (Double, Double) => String): Self = this.set("LoadResourceString", js.Any.fromFunction2(value))
  }
  
}

