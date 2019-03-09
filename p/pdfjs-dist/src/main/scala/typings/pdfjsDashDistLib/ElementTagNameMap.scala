package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
trait ElementTagNameMap
  extends HTMLElementTagNameMap
     with SVGElementTagNameMap

object ElementTagNameMap {
  @scala.inline
  def apply(
    HTMLElementTagNameMap: HTMLElementTagNameMap = null,
    SVGElementTagNameMap: SVGElementTagNameMap = null
  ): ElementTagNameMap = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, HTMLElementTagNameMap)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, SVGElementTagNameMap)
    __obj.asInstanceOf[ElementTagNameMap]
  }
}

