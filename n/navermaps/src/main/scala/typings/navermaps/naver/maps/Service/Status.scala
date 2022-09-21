package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
@JSGlobal("naver.maps.Service.Status")
@js.native
object Status extends StObject {
  
  @js.native
  sealed trait ERROR
    extends StObject
       with Status
  
  @js.native
  sealed trait OK
    extends StObject
       with Status
}
