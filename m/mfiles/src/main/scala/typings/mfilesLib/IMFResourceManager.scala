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
    GetLocaleSpecificDateFormat: js.Function0[java.lang.String],
    GetUICultures: js.Function0[IStrings],
    LoadResourceString: js.Function2[scala.Double, scala.Double, java.lang.String]
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal(GetLocaleSpecificDateFormat = GetLocaleSpecificDateFormat, GetUICultures = GetUICultures, LoadResourceString = LoadResourceString)
  
    __obj.asInstanceOf[IMFResourceManager]
  }
}

