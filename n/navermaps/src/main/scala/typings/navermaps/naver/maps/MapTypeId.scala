package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapTypeId extends StObject
/**
  * MapTypeId
  */
@JSGlobal("naver.maps.MapTypeId")
@js.native
object MapTypeId extends StObject {
  
  @js.native
  sealed trait HYBRID
    extends StObject
       with MapTypeId
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with MapTypeId
  
  @js.native
  sealed trait SATELLITE
    extends StObject
       with MapTypeId
  
  @js.native
  sealed trait TERRAIN
    extends StObject
       with MapTypeId
}
