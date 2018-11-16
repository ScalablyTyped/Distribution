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

