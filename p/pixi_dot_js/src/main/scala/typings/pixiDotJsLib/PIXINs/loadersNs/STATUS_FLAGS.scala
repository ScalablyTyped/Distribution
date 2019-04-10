package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUS_FLAGS extends js.Object

@JSGlobal("PIXI.loaders.STATUS_FLAGS")
@js.native
object STATUS_FLAGS extends js.Object {
  @js.native
  sealed trait COMPLETE
    extends pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS
  
  @js.native
  sealed trait DATA_URL
    extends pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS
  
  @js.native
  sealed trait LOADING
    extends pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS
  
  @js.native
  sealed trait NONE
    extends pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS
  
  val COMPLETE: COMPLETE with java.lang.String = js.native
  val DATA_URL: DATA_URL with java.lang.String = js.native
  val LOADING: LOADING with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.STATUS_FLAGS with java.lang.String] = js.native
}

