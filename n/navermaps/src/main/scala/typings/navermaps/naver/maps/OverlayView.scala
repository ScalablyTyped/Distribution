package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Overlay
@js.native
trait OverlayView
  extends StObject
     with KVO {
  
  def draw(): Unit = js.native
  
  def getContainerTopLeft(): Point = js.native
  
  def getMap(): Map | Null = js.native
  
  def getPanes(): MapPanes = js.native
  
  def getProjection(): MapSystemProjection = js.native
  
  def onAdd(): Any = js.native
  
  def onRemove(): Any = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}
