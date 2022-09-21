package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeocodeStatus extends StObject
@JSGlobal("naver.maps.Service.GeocodeStatus")
@js.native
object GeocodeStatus extends StObject {
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with GeocodeStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with GeocodeStatus
  
  @js.native
  sealed trait SYSTEM_ERROR
    extends StObject
       with GeocodeStatus
}
