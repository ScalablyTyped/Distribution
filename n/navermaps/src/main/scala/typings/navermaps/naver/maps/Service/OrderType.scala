package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OrderType extends StObject
@JSGlobal("naver.maps.Service.OrderType")
@js.native
object OrderType extends StObject {
  
  @js.native
  sealed trait ADDR
    extends StObject
       with OrderType
  
  @js.native
  sealed trait ADM_CODE
    extends StObject
       with OrderType
  
  @js.native
  sealed trait LEGAL_CODE
    extends StObject
       with OrderType
  
  @js.native
  sealed trait ROAD_ADDR
    extends StObject
       with OrderType
}
