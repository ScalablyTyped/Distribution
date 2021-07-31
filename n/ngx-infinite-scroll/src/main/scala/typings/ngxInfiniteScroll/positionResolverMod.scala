package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.ngxInfiniteScroll.anon.ClientHeightKey
import typings.ngxInfiniteScroll.axisResolverMod.AxisResolver
import typings.ngxInfiniteScroll.modelsMod.ContainerRef
import typings.ngxInfiniteScroll.modelsMod.IPositionElements
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionResolverMod {
  
  @JSImport("ngx-infinite-scroll/src/services/position-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculatePoints(element: ElementRef[js.Any], resolver: IResolver): IPositionStats = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePoints")(element.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[IPositionStats]
  
  @scala.inline
  def calculatePointsForElement(height: Double, element: ElementRef[js.Any], resolver: IResolver): IPositionStats = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointsForElement")(height.asInstanceOf[js.Any], element.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[IPositionStats]
  
  @scala.inline
  def calculatePointsForWindow(height: Double, element: ElementRef[js.Any], resolver: IResolver): IPositionStats = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointsForWindow")(height.asInstanceOf[js.Any], element.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[IPositionStats]
  
  @scala.inline
  def createResolver(hasWindowElementAxis: IPositionElements): IResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("createResolver")(hasWindowElementAxis.asInstanceOf[js.Any]).asInstanceOf[IResolver]
  
  @scala.inline
  def createResolverWithContainer(resolver: js.Any, windowElement: ContainerRef): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolverWithContainer")(resolver.asInstanceOf[js.Any], windowElement.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def extractHeightForElement(hasContainerIsWindowAxis: IResolver): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHeightForElement")(hasContainerIsWindowAxis.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def extractHeightPropKeys(axis: AxisResolver): ClientHeightKey = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHeightPropKeys")(axis.asInstanceOf[js.Any]).asInstanceOf[ClientHeightKey]
  
  @scala.inline
  def getDocumentElement(isContainerWindow: Boolean, windowElement: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(isContainerWindow.asInstanceOf[js.Any], windowElement.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getElementHeight(elem: js.Any, isWindow: Boolean, offsetHeightKey: String, clientHeightKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementHeight")(elem.asInstanceOf[js.Any], isWindow.asInstanceOf[js.Any], offsetHeightKey.asInstanceOf[js.Any], clientHeightKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getElementOffsetTop(elem: ContainerRef, axis: AxisResolver, isWindow: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffsetTop")(elem.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], isWindow.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getElementPageYOffset(elem: ContainerRef, axis: AxisResolver, isWindow: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementPageYOffset")(elem.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], isWindow.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isElementWindow(windowElement: ContainerRef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementWindow")(windowElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
