package typings.parchment

import org.scalablytyped.runtime.Instantiable1
import typings.parchment.distSrcAttributorStoreMod.default
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeClass extends js.Object {
  var Attribute: Anon_Attribute
  var Class: TypeofClassClassAttributor
  var Store: Instantiable1[/* domNode */ HTMLElement, default]
  var Style: TypeofClassStyleAttributor
}

object Anon_AttributeClass {
  @scala.inline
  def apply(
    Attribute: Anon_Attribute,
    Class: TypeofClassClassAttributor,
    Store: Instantiable1[/* domNode */ HTMLElement, default],
    Style: TypeofClassStyleAttributor
  ): Anon_AttributeClass = {
    val __obj = js.Dynamic.literal(Attribute = Attribute, Class = Class, Store = Store, Style = Style)
  
    __obj.asInstanceOf[Anon_AttributeClass]
  }
}

