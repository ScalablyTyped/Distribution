package typings.pixiJs.PIXI.LoaderResource

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XHR_RESPONSE_TYPE extends js.Object

@JSGlobal("PIXI.LoaderResource.XHR_RESPONSE_TYPE")
@js.native
object XHR_RESPONSE_TYPE extends js.Object {
  /** Blob */
  @js.native
  sealed trait BLOB extends XHR_RESPONSE_TYPE
  
  /** ArrayBuffer */
  @js.native
  sealed trait BUFFER extends XHR_RESPONSE_TYPE
  
  /** string */
  @js.native
  sealed trait DEFAULT extends XHR_RESPONSE_TYPE
  
  /** Document */
  @js.native
  sealed trait DOCUMENT extends XHR_RESPONSE_TYPE
  
  /** Object */
  @js.native
  sealed trait JSON extends XHR_RESPONSE_TYPE
  
  /** String */
  @js.native
  sealed trait TEXT extends XHR_RESPONSE_TYPE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[XHR_RESPONSE_TYPE with String] = js.native
  /* "blob" */ @js.native
  object BLOB extends TopLevel[BLOB with String]
  
  /* "arraybuffer" */ @js.native
  object BUFFER extends TopLevel[BUFFER with String]
  
  /* "text" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  /* "document" */ @js.native
  object DOCUMENT extends TopLevel[DOCUMENT with String]
  
  /* "json" */ @js.native
  object JSON extends TopLevel[JSON with String]
  
  /* "text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
}

