package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.AdvertisingState.linear
import typings.playerframework.PlayerFramework.AdvertisingState.loading
import typings.playerframework.PlayerFramework.AdvertisingState.nonLinear
import typings.playerframework.PlayerFramework.AdvertisingState.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdvertisingState extends js.Object

// Enumerations
@JSGlobal("PlayerFramework.AdvertisingState")
@js.native
object AdvertisingState extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdvertisingState with Double] = js.native
  /* 2 */ @js.native
  object linear extends TopLevel[linear with Double]
  
  /* 1 */ @js.native
  object loading extends TopLevel[loading with Double]
  
  /* 3 */ @js.native
  object nonLinear extends TopLevel[nonLinear with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

