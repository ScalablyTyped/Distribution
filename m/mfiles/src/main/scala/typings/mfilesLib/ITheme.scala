package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITheme
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double] {
  var last: mfilesLib.mfilesLibNumbers.`0`
}

object ITheme {
  @scala.inline
  def apply(
    last: mfilesLib.mfilesLibNumbers.`0`,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double] = null
  ): ITheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("last")(last)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ITheme]
  }
}

