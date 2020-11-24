package typings.ol.olXmlMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/xml", "makeObjectPropertySetter")
@js.native
object makeObjectPropertySetter extends js.Object {
  
  def apply[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _]): Parser = js.native
  def apply[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: js.UndefOr[scala.Nothing],
    opt_this: T
  ): Parser = js.native
  def apply[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: String
  ): Parser = js.native
  def apply[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: String,
    opt_this: T
  ): Parser = js.native
}
