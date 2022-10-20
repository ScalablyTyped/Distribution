package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.ngxInfiniteScroll.anon.ClientHeightKey
import typings.ngxInfiniteScroll.libServicesAxisResolverMod.AxisResolver
import typings.ngxInfiniteScroll.modelsMod.ContainerRef
import typings.ngxInfiniteScroll.modelsMod.IPositionElements
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesPositionResolverMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/position-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculatePoints(element: ElementRef[Any], resolver: IResolver): IPositionStats = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePoints")(element.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[IPositionStats]
  
  inline def calculatePointsForElement(height: Double, element: ElementRef[Any], resolver: IResolver): IPositionStats = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointsForElement")(height.asInstanceOf[js.Any], element.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[IPositionStats]
  
  inline def calculatePointsForWindow(height: Double, element: ElementRef[Any], resolver: IResolver): IPositionStats = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointsForWindow")(height.asInstanceOf[js.Any], element.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[IPositionStats]
  
  inline def createResolver(hasWindowElementAxis: IPositionElements): IResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("createResolver")(hasWindowElementAxis.asInstanceOf[js.Any]).asInstanceOf[IResolver]
  
  inline def createResolverWithContainer(resolver: Any, windowElement: ContainerRef): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolverWithContainer")(resolver.asInstanceOf[js.Any], windowElement.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def extractHeightForElement(hasContainerIsWindowAxis: IResolver): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHeightForElement")(hasContainerIsWindowAxis.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def extractHeightPropKeys(axis: AxisResolver): ClientHeightKey = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHeightPropKeys")(axis.asInstanceOf[js.Any]).asInstanceOf[ClientHeightKey]
  
  inline def getDocumentElement(isContainerWindow: Boolean, windowElement: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(isContainerWindow.asInstanceOf[js.Any], windowElement.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getElementHeight(elem: Any, isWindow: Boolean, offsetHeightKey: String, clientHeightKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementHeight")(elem.asInstanceOf[js.Any], isWindow.asInstanceOf[js.Any], offsetHeightKey.asInstanceOf[js.Any], clientHeightKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getElementOffsetTop(elem: ContainerRef, axis: AxisResolver, isWindow: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffsetTop")(elem.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], isWindow.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getElementPageYOffset(elem: ContainerRef, axis: AxisResolver, isWindow: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementPageYOffset")(elem.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], isWindow.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isElementWindow(windowElement: ContainerRef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementWindow")(windowElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
