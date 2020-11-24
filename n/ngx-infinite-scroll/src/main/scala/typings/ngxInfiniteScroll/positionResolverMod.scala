package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.ngxInfiniteScroll.anon.ClientHeightKey
import typings.ngxInfiniteScroll.axisResolverMod.AxisResolver
import typings.ngxInfiniteScroll.modelsMod.ContainerRef
import typings.ngxInfiniteScroll.modelsMod.IPositionElements
import typings.ngxInfiniteScroll.modelsMod.IPositionStats
import typings.ngxInfiniteScroll.modelsMod.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ngx-infinite-scroll/src/services/position-resolver", JSImport.Namespace)
@js.native
object positionResolverMod extends js.Object {
  
  def calculatePoints(element: ElementRef[_], resolver: IResolver): IPositionStats = js.native
  
  def calculatePointsForElement(height: Double, element: ElementRef[_], resolver: IResolver): IPositionStats = js.native
  
  def calculatePointsForWindow(height: Double, element: ElementRef[_], resolver: IResolver): IPositionStats = js.native
  
  def createResolver(hasWindowElementAxis: IPositionElements): IResolver = js.native
  
  def createResolverWithContainer(resolver: js.Any, windowElement: ContainerRef): js.Any = js.native
  
  def extractHeightForElement(hasContainerIsWindowAxis: IResolver): js.Any = js.native
  
  def extractHeightPropKeys(axis: AxisResolver): ClientHeightKey = js.native
  
  def getDocumentElement(isContainerWindow: Boolean, windowElement: js.Any): js.Any = js.native
  
  def getElementHeight(elem: js.Any, isWindow: Boolean, offsetHeightKey: String, clientHeightKey: String): js.Any = js.native
  
  def getElementOffsetTop(elem: ContainerRef, axis: AxisResolver, isWindow: Boolean): js.Any = js.native
  
  def getElementPageYOffset(elem: ContainerRef, axis: AxisResolver, isWindow: Boolean): js.Any = js.native
  
  def isElementWindow(windowElement: ContainerRef): Boolean = js.native
}
