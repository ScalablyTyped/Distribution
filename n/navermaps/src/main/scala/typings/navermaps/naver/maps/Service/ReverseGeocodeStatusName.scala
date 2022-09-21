package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReverseGeocodeStatusName extends StObject
@JSGlobal("naver.maps.Service.ReverseGeocodeStatusName")
@js.native
object ReverseGeocodeStatusName extends StObject {
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with ReverseGeocodeStatusName
  
  @js.native
  sealed trait NO_RESULTS
    extends StObject
       with ReverseGeocodeStatusName
  
  @js.native
  sealed trait OK
    extends StObject
       with ReverseGeocodeStatusName
  
  @js.native
  sealed trait UNKNOWN_ERROR_IO_ERROR
    extends StObject
       with ReverseGeocodeStatusName
}
