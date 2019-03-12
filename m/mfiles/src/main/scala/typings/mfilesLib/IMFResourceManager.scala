package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFResourceManager extends js.Object {
  def GetLocaleSpecificDateFormat(): java.lang.String
  def GetUICultures(): IStrings
  def LoadResourceString(LanguageID: scala.Double, ResourceID: scala.Double): java.lang.String
}

object IMFResourceManager {
  @scala.inline
  def apply(
    GetLocaleSpecificDateFormat: () => java.lang.String,
    GetUICultures: () => IStrings,
    LoadResourceString: (scala.Double, scala.Double) => java.lang.String
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal(GetLocaleSpecificDateFormat = js.Any.fromFunction0(GetLocaleSpecificDateFormat), GetUICultures = js.Any.fromFunction0(GetUICultures), LoadResourceString = js.Any.fromFunction2(LoadResourceString))
  
    __obj.asInstanceOf[IMFResourceManager]
  }
}

