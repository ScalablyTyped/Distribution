package typings.pixiJs.PIXI.LoaderResource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
