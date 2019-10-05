package typings.atOracleOraclejet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojanimation", JSImport.Namespace)
@js.native
object ojanimationMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atOracleOraclejet.atOracleOraclejetStrings.collapse
    - typings.atOracleOraclejet.atOracleOraclejetStrings.expand
    - typings.atOracleOraclejet.atOracleOraclejetStrings.fadeIn
    - typings.atOracleOraclejet.atOracleOraclejetStrings.fadeOut
    - typings.atOracleOraclejet.atOracleOraclejetStrings.flipIn
    - typings.atOracleOraclejet.atOracleOraclejetStrings.flipOut
    - typings.atOracleOraclejet.atOracleOraclejetStrings.ripple
    - typings.atOracleOraclejet.atOracleOraclejetStrings.slideIn
    - typings.atOracleOraclejet.atOracleOraclejetStrings.slideOut
    - typings.atOracleOraclejet.atOracleOraclejetStrings.zoomIn
    - typings.atOracleOraclejet.atOracleOraclejetStrings.zoomOut
  */
  trait AnimationMethods extends js.Object
  
  def collapse(element: Element): js.Promise[Boolean] = js.native
  def collapse(element: Element, options: Anon_Delay): js.Promise[Boolean] = js.native
  def expand(element: Element): js.Promise[Boolean] = js.native
  def expand(element: Element, options: Anon_Delay): js.Promise[Boolean] = js.native
  def fadeIn(element: Element): js.Promise[Boolean] = js.native
  def fadeIn(element: Element, options: Anon_DelayDuration): js.Promise[Boolean] = js.native
  def fadeOut(element: Element): js.Promise[Boolean] = js.native
  def fadeOut(element: Element, options: Anon_DelayDuration): js.Promise[Boolean] = js.native
  def flipIn(element: Element): js.Promise[Boolean] = js.native
  def flipIn(element: Element, options: Anon_Axis): js.Promise[Boolean] = js.native
  def flipOut(element: Element): js.Promise[Boolean] = js.native
  def flipOut(element: Element, options: Anon_Axis): js.Promise[Boolean] = js.native
  def ripple(element: Element): js.Promise[Boolean] = js.native
  def ripple(element: Element, options: Anon_Color): js.Promise[Boolean] = js.native
  def slideIn(element: Element): js.Promise[Boolean] = js.native
  def slideIn(element: Element, options: Anon_DelayDirection): js.Promise[Boolean] = js.native
  def slideOut(element: Element): js.Promise[Boolean] = js.native
  def slideOut(element: Element, options: Anon_DelayDirection): js.Promise[Boolean] = js.native
  def zoomIn(element: Element): js.Promise[Boolean] = js.native
  def zoomIn(element: Element, options: Anon_AxisDelay): js.Promise[Boolean] = js.native
  def zoomOut(element: Element): js.Promise[Boolean] = js.native
  def zoomOut(element: Element, options: Anon_AxisDelay): js.Promise[Boolean] = js.native
}

