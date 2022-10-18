package typings.openidClient.mod

import typings.node.httpMod.IncomingMessage
import typings.openidClient.anon.FnCallFormatParam
import typings.openidClient.anon.Message
import typings.openidClient.anon.`1`
import typings.std.Error
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors {
  
  @JSImport("openid-client", "errors.OPError")
  @js.native
  open class OPError protected ()
    extends StObject
       with Error {
    def this(params: typings.openidClient.anon.Error) = this()
    def this(params: typings.openidClient.anon.Error, response: `1` & IncomingMessage) = this()
    
    var error: js.UndefOr[String] = js.native
    
    var error_description: js.UndefOr[String] = js.native
    
    var error_uri: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var response: js.UndefOr[`1` & IncomingMessage] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var session_state: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
  }
  
  @JSImport("openid-client", "errors.RPError")
  @js.native
  open class RPError protected ()
    extends StObject
       with Error {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[FnCallFormatParam]) = this()
    def this(options: Message) = this()
    
    var auth_time: js.UndefOr[Double] = js.native
    
    var body: js.UndefOr[js.Object] = js.native
    
    var checks: js.UndefOr[js.Object] = js.native
    
    var exp: js.UndefOr[Double] = js.native
    
    var iat: js.UndefOr[Double] = js.native
    
    var jwt: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var nbf: js.UndefOr[Double] = js.native
    
    var now: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var response: js.UndefOr[`1` & IncomingMessage] = js.native
    
    var tolerance: js.UndefOr[Double] = js.native
  }
}
