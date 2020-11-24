package typings.plottable

import typings.d3Selection.mod.Selection_
import typings.plottable.anon.Left
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Range
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.mathUtilsMod.ICssTransformMatrix
import typings.std.ClientRect
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/domUtils", JSImport.Namespace)
@js.native
object domUtilsMod extends js.Object {
  
  var SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
  
  def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
  
  def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
  
  def contains(parent: Element, child: Element): Boolean = js.native
  
  def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
  
  def elementHeight(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
  def elementHeight(elementOrSelection: Element): Double = js.native
  
  def elementWidth(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
  def elementWidth(elementOrSelection: Element): Double = js.native
  
  def entityBounds(element: Element): IEntityBounds = js.native
  
  def expandRect(rect: ClientRect, amount: Double): Left = js.native
  
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
