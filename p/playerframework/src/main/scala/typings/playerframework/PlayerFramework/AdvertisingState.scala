package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AdvertisingState extends StObject
// Enumerations
@JSGlobal("PlayerFramework.AdvertisingState")
@js.native
object AdvertisingState extends StObject {
  
  /**
    * A linear ad is playing.
    **/
  @js.native
  sealed trait linear extends AdvertisingState
  
  /**
    * An ad is loading.
    **/
  @js.native
  sealed trait loading extends AdvertisingState
  
  /**
    * A non-linear ad is playing.
    **/
  @js.native
  sealed trait nonLinear extends AdvertisingState
  
  /**
    * No ad is loading or playing.
    **/
  @js.native
  sealed trait none extends AdvertisingState
}
