package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ZoomControlStyle extends StObject
@JSGlobal("naver.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends StObject {
  
  @js.native
  sealed trait LARGE
    extends StObject
       with ZoomControlStyle
  
  @js.native
  sealed trait SMALL
    extends StObject
       with ZoomControlStyle
}
