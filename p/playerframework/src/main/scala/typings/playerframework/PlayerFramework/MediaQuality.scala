package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaQuality extends StObject
@JSGlobal("PlayerFramework.MediaQuality")
@js.native
object MediaQuality extends StObject {
  
  /**
    * Typically indicates greater than or equal to 720p media quality.
    **/
  @js.native
  sealed trait highDefinition
    extends StObject
       with MediaQuality
  
  /**
    * Typically indicates less than 720p media quality.
    **/
  @js.native
  sealed trait standardDefinition
    extends StObject
       with MediaQuality
}
