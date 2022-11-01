package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaProjection
  extends StObject
     with KVO {
  
  def fromCoordToOffset(coord: LatLng): Point = js.native
  
  def fromCoordToPov(coord: LatLng): PanoramaPov = js.native
  
  def fromOffsetToCoord(offset: Point): LatLng = js.native
  
  def fromScrollToPov(dx: Double, dy: Double): PanoramaPov = js.native
}
