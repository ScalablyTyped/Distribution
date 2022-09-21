package typings.nats.internalModMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "NatsError")
@js.native
open class NatsError protected ()
  extends typings.nats.errorMod.NatsError {
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
}
/* static members */
object NatsError {
  
  @JSImport("nats/lib/nats-base-client/internal_mod", "NatsError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorForCode(code: String): typings.nats.errorMod.NatsError = ^.asInstanceOf[js.Dynamic].applyDynamic("errorForCode")(code.asInstanceOf[js.Any]).asInstanceOf[typings.nats.errorMod.NatsError]
  inline def errorForCode(code: String, chainedError: js.Error): typings.nats.errorMod.NatsError = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForCode")(code.asInstanceOf[js.Any], chainedError.asInstanceOf[js.Any])).asInstanceOf[typings.nats.errorMod.NatsError]
}
