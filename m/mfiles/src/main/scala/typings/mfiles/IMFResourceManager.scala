package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFResourceManager extends js.Object {
  def GetLocaleSpecificDateFormat(): String
  def GetUICultures(): IStrings
  def LoadResourceString(LanguageID: Double, ResourceID: Double): String
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
}

