package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptionsProperties[Props /* <: java.lang.String */, Data, Methods] extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var el: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var functional: js.UndefOr[moonjsLib.moonjsLibNumbers.`true`] = js.undefined
  var hooks: js.UndefOr[LifecycleHooks] = js.undefined
  var methods: js.UndefOr[Methods] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var props: js.UndefOr[js.Array[Props]] = js.undefined
  var render: js.UndefOr[js.Function2[/* h */ CreateElement, /* ctx */ js.Any, VDomElement]] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

