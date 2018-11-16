package typings
package normalizeDashScrollDashLeftLib.normalizeDashScrollDashLeftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("normalize-scroll-left", JSImport.Namespace)
@js.native
object normalizeDashScrollDashLeftModMembers extends js.Object {
  def _setScrollType(): scala.Unit = js.native
  def _setScrollType(`type`: ScrollType): scala.Unit = js.native
  def detectScrollType(): ScrollType = js.native
  @JSName("getNormalizedScrollLeft")
  def getNormalizedScrollLeft_ltr(
    element: stdLib.HTMLElement,
    direction: normalizeDashScrollDashLeftLib.normalizeDashScrollDashLeftLibStrings.ltr
  ): scala.Double = js.native
  @JSName("getNormalizedScrollLeft")
  def getNormalizedScrollLeft_rtl(
    element: stdLib.HTMLElement,
    direction: normalizeDashScrollDashLeftLib.normalizeDashScrollDashLeftLibStrings.rtl
  ): scala.Double = js.native
  @JSName("setNormalizedScrollLeft")
  def setNormalizedScrollLeft_ltr(
    element: stdLib.HTMLElement,
    scrollLeft: scala.Double,
    direction: normalizeDashScrollDashLeftLib.normalizeDashScrollDashLeftLibStrings.ltr
  ): scala.Unit = js.native
  @JSName("setNormalizedScrollLeft")
  def setNormalizedScrollLeft_rtl(
    element: stdLib.HTMLElement,
    scrollLeft: scala.Double,
    direction: normalizeDashScrollDashLeftLib.normalizeDashScrollDashLeftLibStrings.rtl
  ): scala.Unit = js.native
}

