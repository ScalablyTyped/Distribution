package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Sub module: panorama
@js.native
trait PanoramaProjection
  extends StObject
     with KVO {
  
  def fromCoordToPov(coord: LatLng): PanoramaPov = js.native
}
