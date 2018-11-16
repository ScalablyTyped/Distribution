package typings
package plottableLib.buildSrcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "DOM")
@js.native
object DOMNs extends js.Object {
  var SCREEN_REFRESH_RATE_MILLISECONDS: scala.Double = js.native
  def clientRectInside(innerClientRect: stdLib.ClientRect, outerClientRect: stdLib.ClientRect): scala.Boolean = js.native
  def clientRectsOverlap(clientRectA: stdLib.ClientRect, clientRectB: stdLib.ClientRect): scala.Boolean = js.native
  def contains(parent: stdLib.Element, child: stdLib.Element): scala.Boolean = js.native
  def elementBBox(element: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): stdLib.SVGRect = js.native
  def elementHeight(elementOrSelection: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.Element, _, _, _]): scala.Double = js.native
  def elementHeight(elementOrSelection: stdLib.Element): scala.Double = js.native
  def elementWidth(elementOrSelection: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.Element, _, _, _]): scala.Double = js.native
  def elementWidth(elementOrSelection: stdLib.Element): scala.Double = js.native
  def entityBounds(element: stdLib.Element): plottableLib.buildSrcCoreInterfacesMod.IEntityBounds = js.native
  def expandRect(rect: stdLib.ClientRect, amount: scala.Double): plottableLib.Anon_BottomLeft = js.native
  def getElementTransform(elem: stdLib.Element): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix | scala.Null = js.native
  def getHtmlElementAncestors(elem: stdLib.Element): js.Array[stdLib.HTMLElement] = js.native
  def getRotate(el: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): scala.Double = js.native
  def getScaleValues(el: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): js.Tuple2[scala.Double, scala.Double] = js.native
  def getTranslateValues(el: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): js.Tuple2[scala.Double, scala.Double] = js.native
  def intersectsBBox(
    xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    bbox: stdLib.SVGRect
  ): scala.Boolean = js.native
  def intersectsBBox(
    xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    bbox: stdLib.SVGRect,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def intersectsBBox(
    xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    yValOrRange: scala.Double,
    bbox: stdLib.SVGRect
  ): scala.Boolean = js.native
  def intersectsBBox(
    xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    yValOrRange: scala.Double,
    bbox: stdLib.SVGRect,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def intersectsBBox(
    xValOrRange: scala.Double,
    yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    bbox: stdLib.SVGRect
  ): scala.Boolean = js.native
  def intersectsBBox(
    xValOrRange: scala.Double,
    yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    bbox: stdLib.SVGRect,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def intersectsBBox(xValOrRange: scala.Double, yValOrRange: scala.Double, bbox: stdLib.SVGRect): scala.Boolean = js.native
  def intersectsBBox(
    xValOrRange: scala.Double,
    yValOrRange: scala.Double,
    bbox: stdLib.SVGRect,
    tolerance: scala.Double
  ): scala.Boolean = js.native
  def requestAnimationFramePolyfill(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

