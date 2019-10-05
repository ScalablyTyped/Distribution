package typings.normalizeDashScrollDashLeft

import typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftMod.ScrollType
import typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftStrings.ltr
import typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftStrings.rtl
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("normalize-scroll-left", JSImport.Namespace)
@js.native
object normalizeDashScrollDashLeftMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftStrings.indeterminate
    - typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftStrings.default
    - typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftStrings.negative
    - typings.normalizeDashScrollDashLeft.normalizeDashScrollDashLeftStrings.reverse
  */
  trait ScrollType extends js.Object
  
  def _setScrollType(): Unit = js.native
  def _setScrollType(`type`: ScrollType): Unit = js.native
  def detectScrollType(): ScrollType = js.native
  @JSName("getNormalizedScrollLeft")
  def getNormalizedScrollLeft_ltr(element: HTMLElement, direction: ltr): Double = js.native
  @JSName("getNormalizedScrollLeft")
  def getNormalizedScrollLeft_rtl(element: HTMLElement, direction: rtl): Double = js.native
  @JSName("setNormalizedScrollLeft")
  def setNormalizedScrollLeft_ltr(element: HTMLElement, scrollLeft: Double, direction: ltr): Unit = js.native
  @JSName("setNormalizedScrollLeft")
  def setNormalizedScrollLeft_rtl(element: HTMLElement, scrollLeft: Double, direction: rtl): Unit = js.native
}

