package typings.nats.errorMod

import typings.nats.anon.Operation
import typings.nats.typesMod.ApiError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/error", "NatsError")
@js.native
open class NatsError protected ()
  extends StObject
     with Error {
  /**
    * @param {String} message
    * @param {String} code
    * @param {Error} [chainedError]
    * @constructor
    *
    * @api private
    */
  def this(message: String, code: String) = this()
  def this(message: String, code: String, chainedError: js.Error) = this()
  
  var api_error: js.UndefOr[ApiError] = js.native
  
  var chainedError: js.UndefOr[js.Error] = js.native
  
  var code: String = js.native
  
  def isAuthError(): Boolean = js.native
  
  def isJetStreamError(): Boolean = js.native
  
  def isPermissionError(): Boolean = js.native
  
  def isProtocolError(): Boolean = js.native
  
  def jsError(): ApiError | Null = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var permissionContext: js.UndefOr[Operation] = js.native
}
/* static members */
object NatsError {
  
  @JSImport("nats/lib/nats-base-client/error", "NatsError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorForCode(code: String): NatsError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorForCode")(code.asInstanceOf[js.Any]).asInstanceOf[NatsError]
  inline def errorForCode(code: String, chainedError: js.Error): NatsError = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForCode")(code.asInstanceOf[js.Any], chainedError.asInstanceOf[js.Any])).asInstanceOf[NatsError]
}
