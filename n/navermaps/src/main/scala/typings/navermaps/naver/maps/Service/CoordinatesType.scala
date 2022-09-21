package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoordinatesType extends StObject
@JSGlobal("naver.maps.Service.CoordinatesType")
@js.native
object CoordinatesType extends StObject {
  
  @js.native
  sealed trait EPSG3857
    extends StObject
       with CoordinatesType
  
  @js.native
  sealed trait LATLNG
    extends StObject
       with CoordinatesType
  
  @js.native
  sealed trait TM128
    extends StObject
       with CoordinatesType
  
  @js.native
  sealed trait UTMK
    extends StObject
       with CoordinatesType
}
