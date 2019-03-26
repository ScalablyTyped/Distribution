package typings
package passportDashOauth2Lib.passportDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2", "Strategy")
@js.native
object StrategyNs extends js.Object {
  @js.native
  class AuthorizationError protected ()
    extends passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.AuthorizationError {
    def this(message: java.lang.String, code: java.lang.String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: java.lang.String) = this()
    def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: java.lang.String, uri: java.lang.String) = this()
    def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
    def this(message: js.UndefOr[scala.Nothing], code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
    /* CompleteClass */
    override var code: java.lang.String = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var status: scala.Double = js.native
  }
  
  @js.native
  class InternalOAuthError protected ()
    extends passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.InternalOAuthError {
    def this(message: java.lang.String, err: js.Any) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var oauthError: js.Any = js.native
  }
  
  @js.native
  class TokenError protected ()
    extends passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs.TokenError {
    def this(message: java.lang.String, code: java.lang.String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: java.lang.String) = this()
    def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: java.lang.String, uri: java.lang.String) = this()
    def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
    def this(message: js.UndefOr[scala.Nothing], code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
    /* CompleteClass */
    override var code: java.lang.String = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override var status: scala.Double = js.native
  }
  
}

