package typings
package playerframeworkLib.PlayerFrameworkNs

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
  sealed trait linear
    extends playerframeworkLib.PlayerFrameworkNs.AdvertisingState
  
  /**
  		* An ad is loading.
  		**/
  @js.native
  sealed trait loading
    extends playerframeworkLib.PlayerFrameworkNs.AdvertisingState
  
  /**
  		* A non-linear ad is playing.
  		**/
  @js.native
  sealed trait nonLinear
    extends playerframeworkLib.PlayerFrameworkNs.AdvertisingState
  
  /**
  		* No ad is loading or playing.
  		**/
  @js.native
  sealed trait none
    extends playerframeworkLib.PlayerFrameworkNs.AdvertisingState
  
  /* 2 */ val linear: linear with scala.Double = js.native
  /* 1 */ val loading: loading with scala.Double = js.native
  /* 3 */ val nonLinear: nonLinear with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.AdvertisingState with scala.Double] = js.native
}

