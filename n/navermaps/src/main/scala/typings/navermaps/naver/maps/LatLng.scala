package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LatLng
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.navermaps.naver.maps.Coord because Already inherited */ @js.native
trait LatLng
  extends StObject
     with Point {
  
  def destinationPoint(angle: Double, meter: Double): LatLng = js.native
  
  def isEmpty(): Boolean = js.native
  
  def lat(): Double = js.native
  
  def lng(): Double = js.native
  
  def toPoint(): Point = js.native
}
