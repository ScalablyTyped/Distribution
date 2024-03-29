package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GroundOverlay
  */
@js.native
trait GroundOverlay
  extends StObject
     with OverlayView {
  
  def getBounds(): Bounds = js.native
  
  def getOpacity(): Double = js.native
  
  def getUrl(): String = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
}
