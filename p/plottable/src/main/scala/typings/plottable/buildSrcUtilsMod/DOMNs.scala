package typings.plottable.buildSrcUtilsMod

import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.plottable.Anon_BottomHeight
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Range
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.plottable.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
import typings.std.ClientRect
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "DOM")
@js.native
object DOMNs extends js.Object {
  var SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
  def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
  def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
  def contains(parent: Element, child: Element): Boolean = js.native
  def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
  def elementHeight(elementOrSelection: Selection[Element, _, _, _]): Double = js.native
  def elementHeight(elementOrSelection: Element): Double = js.native
  def elementWidth(elementOrSelection: Selection[Element, _, _, _]): Double = js.native
  def elementWidth(elementOrSelection: Element): Double = js.native
  def entityBounds(element: Element): IEntityBounds = js.native
  def expandRect(rect: ClientRect, amount: Double): Anon_BottomHeight = js.native
  def getElementTransform(elem: Element): ICssTransformMatrix | Null = js.native
  def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = js.native
  def getRotate(el: SimpleSelection[_]): Double = js.native
  def getScaleValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
  def getTranslateValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
  def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = js.native
}

