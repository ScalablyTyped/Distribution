package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapTypeControlStyle extends StObject
// --------------------------------------------------------------------------
//  Enums
// --------------------------------------------------------------------------
/**
  * MapTypeControlStyle
  */
@JSGlobal("naver.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends StObject {
  
  @js.native
  sealed trait BUTTON
    extends StObject
       with MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN
    extends StObject
       with MapTypeControlStyle
}
