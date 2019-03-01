package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomElements
  extends stdLib.HTMLElementTagNameMap
     with stdLib.SVGElementTagNameMap {
  var main: stdLib.HTMLMainElement
}

object DomElements {
  @scala.inline
  def apply(
    HTMLElementTagNameMap: stdLib.HTMLElementTagNameMap = null,
    SVGElementTagNameMap: stdLib.SVGElementTagNameMap = null,
    main: stdLib.HTMLMainElement
  ): DomElements = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, HTMLElementTagNameMap)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, SVGElementTagNameMap)
    __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[DomElements]
  }
}

