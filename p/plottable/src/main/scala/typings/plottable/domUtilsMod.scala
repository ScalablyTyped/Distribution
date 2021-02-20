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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domUtilsMod {
  
  @JSImport("plottable/build/src/utils/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "SCREEN_REFRESH_RATE_MILLISECONDS")
  @js.native
  def SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
  @scala.inline
  def SCREEN_REFRESH_RATE_MILLISECONDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_REFRESH_RATE_MILLISECONDS")(x.asInstanceOf[js.Any])
  
  @JSImport("plottable/build/src/utils/domUtils", "clientRectInside")
  @js.native
  def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "clientRectsOverlap")
  @js.native
  def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "contains")
  @js.native
  def contains(parent: Element, child: Element): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "elementBBox")
  @js.native
  def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "elementHeight")
  @js.native
  def elementHeight(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
  @JSImport("plottable/build/src/utils/domUtils", "elementHeight")
  @js.native
  def elementHeight(elementOrSelection: Element): Double = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "elementWidth")
  @js.native
  def elementWidth(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
  @JSImport("plottable/build/src/utils/domUtils", "elementWidth")
  @js.native
  def elementWidth(elementOrSelection: Element): Double = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "entityBounds")
  @js.native
  def entityBounds(element: Element): IEntityBounds = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "expandRect")
  @js.native
  def expandRect(rect: ClientRect, amount: Double): Left = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "getElementTransform")
  @js.native
  def getElementTransform(elem: Element): ICssTransformMatrix | Null = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "getHtmlElementAncestors")
  @js.native
  def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "getRotate")
  @js.native
  def getRotate(el: SimpleSelection[_]): Double = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "getScaleValues")
  @js.native
  def getScaleValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "getTranslateValues")
  @js.native
  def getTranslateValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
  @JSImport("plottable/build/src/utils/domUtils", "intersectsBBox")
  @js.native
  def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "requestAnimationFramePolyfill")
  @js.native
  def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = js.native
}
