package typings.parchment.anon

import org.scalablytyped.runtime.Instantiable1
import typings.parchment.storeMod.default
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var Attribute: typings.parchment.anon.Attribute
  var Class: TypeofClassAttributor
  var Store: Instantiable1[/* domNode */ HTMLElement, default]
  var Style: TypeofStyleAttributor
}

object Class {
  @scala.inline
  def apply(
    Attribute: Attribute,
    Class: TypeofClassAttributor,
    Store: Instantiable1[/* domNode */ HTMLElement, default],
    Style: TypeofStyleAttributor
  ): Class = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

