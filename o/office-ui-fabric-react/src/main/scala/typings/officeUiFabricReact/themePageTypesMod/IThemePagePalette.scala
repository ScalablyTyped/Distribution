package typings.officeUiFabricReact.themePageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemePagePalette extends js.Object {
  var description: String
  var key: String
  var name: String
  var value: String
}

object IThemePagePalette {
  @scala.inline
  def apply(description: String, key: String, name: String, value: String): IThemePagePalette = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePagePalette]
  }
}

