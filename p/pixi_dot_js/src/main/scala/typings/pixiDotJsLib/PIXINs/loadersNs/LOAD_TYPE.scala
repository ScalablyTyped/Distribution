package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LOAD_TYPE extends js.Object

@JSGlobal("PIXI.loaders.LOAD_TYPE")
@js.native
object LOAD_TYPE extends js.Object {
  @js.native
  sealed trait AUDIO
    extends pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE
  
  @js.native
  sealed trait IMAGE
    extends pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE
  
  @js.native
  sealed trait VIDEO
    extends pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE
  
  @js.native
  sealed trait XHR
    extends pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE
  
  val AUDIO: AUDIO with java.lang.String = js.native
  val IMAGE: IMAGE with java.lang.String = js.native
  val VIDEO: VIDEO with java.lang.String = js.native
  val XHR: XHR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.LOAD_TYPE with java.lang.String] = js.native
}

