package typings
package pixiDotJsLib.PIXINs.loadersNs.ResourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XHR_RESPONSE_TYPE extends js.Object

@JSGlobal("PIXI.loaders.Resource.XHR_RESPONSE_TYPE")
@js.native
object XHR_RESPONSE_TYPE extends js.Object {
  @js.native
  sealed trait BLOB
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait BUFFER
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait DEFAULT
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait DOCUMENT
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait JSON
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait TEXT
    extends pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
  
  /* 2 */ val BLOB: BLOB with scala.Double = js.native
  /* 1 */ val BUFFER: BUFFER with scala.Double = js.native
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 3 */ val DOCUMENT: DOCUMENT with scala.Double = js.native
  /* 4 */ val JSON: JSON with scala.Double = js.native
  /* 5 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE with scala.Double] = js.native
}

