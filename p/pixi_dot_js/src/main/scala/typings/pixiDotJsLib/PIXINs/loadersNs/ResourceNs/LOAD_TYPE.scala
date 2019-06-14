package typings
package pixiDotJsLib.PIXINs.loadersNs.ResourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LOAD_TYPE extends js.Object

@JSGlobal("PIXI.loaders.Resource.LOAD_TYPE")
@js.native
object LOAD_TYPE extends js.Object {
  @js.native
  sealed trait AUDIO
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE
  
  @js.native
  sealed trait IMAGE
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE
  
  @js.native
  sealed trait VIDEO
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE
  
  @js.native
  sealed trait XHR
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE
  
  /* 2 */ val AUDIO: AUDIO with scala.Double = js.native
  /* 1 */ val IMAGE: IMAGE with scala.Double = js.native
  /* 3 */ val VIDEO: VIDEO with scala.Double = js.native
  /* 0 */ val XHR: XHR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE with scala.Double] = js.native
}

