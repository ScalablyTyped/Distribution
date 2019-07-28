package typings.atOracleOraclejet.ojanimationMod

import typings.atOracleOraclejet.Anon_Axis
import typings.atOracleOraclejet.Anon_AxisDelay
import typings.atOracleOraclejet.Anon_Color
import typings.atOracleOraclejet.Anon_Delay
import typings.atOracleOraclejet.Anon_DelayDirection
import typings.atOracleOraclejet.Anon_DelayDuration
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojanimation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

