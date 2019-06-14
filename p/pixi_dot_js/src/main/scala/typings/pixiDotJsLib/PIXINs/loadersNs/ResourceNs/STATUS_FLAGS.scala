package typings
package pixiDotJsLib.PIXINs.loadersNs.ResourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUS_FLAGS extends js.Object

@JSGlobal("PIXI.loaders.Resource.STATUS_FLAGS")
@js.native
object STATUS_FLAGS extends js.Object {
  @js.native
  sealed trait COMPLETE
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS
  
  @js.native
  sealed trait DATA_URL
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS
  
  @js.native
  sealed trait LOADING
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS
  
  @js.native
  sealed trait NONE
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS
  
  /* 2 */ val COMPLETE: COMPLETE with scala.Double = js.native
  /* 1 */ val DATA_URL: DATA_URL with scala.Double = js.native
  /* 3 */ val LOADING: LOADING with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.STATUS_FLAGS with scala.Double] = js.native
}

