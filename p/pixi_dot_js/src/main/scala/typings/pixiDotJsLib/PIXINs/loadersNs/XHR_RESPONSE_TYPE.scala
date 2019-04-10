package typings
package pixiDotJsLib.PIXINs.loadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XHR_RESPONSE_TYPE extends js.Object

@JSGlobal("PIXI.loaders.XHR_RESPONSE_TYPE")
@js.native
object XHR_RESPONSE_TYPE extends js.Object {
  @js.native
  sealed trait BLOB
    extends pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait BUFFER
    extends pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait DEFAULT
    extends pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait DOCUMENT
    extends pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait JSON
    extends pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait TEXT
    extends pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE
  
  val BLOB: BLOB with java.lang.String = js.native
  val BUFFER: BUFFER with java.lang.String = js.native
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val DOCUMENT: DOCUMENT with java.lang.String = js.native
  val JSON: JSON with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[pixiDotJsLib.PIXINs.loadersNs.XHR_RESPONSE_TYPE with java.lang.String] = js.native
}

