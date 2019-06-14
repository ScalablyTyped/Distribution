package typings
package pixiDotJsLib.PIXINs.loadersNs.ResourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSGlobal("PIXI.loaders.Resource.TYPE")
@js.native
object TYPE extends js.Object {
  @js.native
  sealed trait AUDIO
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  @js.native
  sealed trait IMAGE
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  @js.native
  sealed trait JSON
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  @js.native
  sealed trait TEXT
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  @js.native
  sealed trait UNKNOWN
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  @js.native
  sealed trait VIDEO
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  @js.native
  sealed trait XML
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE
  
  /* 4 */ val AUDIO: AUDIO with scala.Double = js.native
  /* 3 */ val IMAGE: IMAGE with scala.Double = js.native
  /* 1 */ val JSON: JSON with scala.Double = js.native
  /* 6 */ val TEXT: TEXT with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  /* 5 */ val VIDEO: VIDEO with scala.Double = js.native
  /* 2 */ val XML: XML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.TYPE with scala.Double] = js.native
}

