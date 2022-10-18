package typings.plottable

import typings.d3Selection.mod.Selection_
import typings.plottable.anon.PickSVGRectxywidthheight
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Range
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.plottable.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
import typings.std.ClientRect
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsDomUtilsMod {
  
  @JSImport("plottable/build/src/utils/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/utils/domUtils", "SCREEN_REFRESH_RATE_MILLISECONDS")
  @js.native
  def SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
  inline def SCREEN_REFRESH_RATE_MILLISECONDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_REFRESH_RATE_MILLISECONDS")(x.asInstanceOf[js.Any])
  
  inline def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clientRectInside")(innerClientRect.asInstanceOf[js.Any], outerClientRect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clientRectsOverlap")(clientRectA.asInstanceOf[js.Any], clientRectB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def contains(parent: Element, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def elementBBox(element: SimpleSelection[Any]): PickSVGRectxywidthheight = ^.asInstanceOf[js.Dynamic].applyDynamic("elementBBox")(element.asInstanceOf[js.Any]).asInstanceOf[PickSVGRectxywidthheight]
  
  inline def elementHeight(elementOrSelection: Selection_[Element, Any, Any, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementHeight")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def elementHeight(elementOrSelection: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementHeight")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def elementWidth(elementOrSelection: Selection_[Element, Any, Any, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementWidth")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def elementWidth(elementOrSelection: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("elementWidth")(elementOrSelection.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def entityBounds(element: Element): IEntityBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("entityBounds")(element.asInstanceOf[js.Any]).asInstanceOf[IEntityBounds]
  
  inline def expandRect(rect: ClientRect, amount: Double): ClientRect = (^.asInstanceOf[js.Dynamic].applyDynamic("expandRect")(rect.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[ClientRect]
  
  inline def getElementTransform(elem: Element): ICssTransformMatrix | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementTransform")(elem.asInstanceOf[js.Any]).asInstanceOf[ICssTransformMatrix | Null]
  
  inline def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlElementAncestors")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getRotate(el: SimpleSelection[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRotate")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScaleValues(el: SimpleSelection[Any]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleValues")(el.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def getTranslateValues(el: SimpleSelection[Any]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateValues")(el.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: PickSVGRectxywidthheight): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: PickSVGRectxywidthheight, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsBBox")(xValOrRange.asInstanceOf[js.Any], yValOrRange.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimationFramePolyfill")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
