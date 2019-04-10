package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSGlobal("PIXI.loaders.TYPE")
@js.native
object TYPE extends js.Object {
  @js.native
  sealed trait AUDIO
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  @js.native
  sealed trait IMAGE
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  @js.native
  sealed trait JSON
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  @js.native
  sealed trait TEXT
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  @js.native
  sealed trait UNKNOWN
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  @js.native
  sealed trait VIDEO
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  @js.native
  sealed trait XML
    extends pixiDotJsLib.PIXINs.loadersNs.TYPE
  
  val AUDIO: AUDIO with java.lang.String = js.native
  val IMAGE: IMAGE with java.lang.String = js.native
  val JSON: JSON with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  val UNKNOWN: UNKNOWN with java.lang.String = js.native
  val VIDEO: VIDEO with java.lang.String = js.native
  val XML: XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.TYPE with java.lang.String] = js.native
}

