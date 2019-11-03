package typings.passportDashStrategy

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-strategy", JSImport.Namespace)
@js.native
object passportDashStrategyMod extends js.Object {
  @js.native
  class Strategy ()
    extends typings.passport.passportMod.Strategy {
    /**
      * Performs authentication for the request.
      * Note: Virtual function - re-implement in the strategy.
      * @param req The request to authenticate.
      * @param options Options passed to the strategy.
      */
    def authenticate(req: Request[ParamsDictionary]): Unit = js.native
    def authenticate(req: Request[ParamsDictionary], options: js.Any): Unit = js.native
    /**
      * Internal error while performing authentication.
      *
      * Strategies should call this function when an internal error occurs
      * during the process of performing authentication; for example, if the
      * user directory is not available.
      *
      * @param {Error} err
      * @api public
      */
    def error(err: Error): Unit = js.native
    /**
      * Fail authentication, with optional `challenge` and `status`, defaulting
      * to 401.
      *
      * Strategies should call this function to fail an authentication attempt.
      *
      * @param {String} challenge (Can also be an object with 'message' and 'type' fields).
      * @param {Number} status
      * @api public
      */
    def fail(challenge: js.Any, status: Double): Unit = js.native
    def fail(status: Double): Unit = js.native
    /**
      * Pass without making a success or fail decision.
      *
      * Under most circumstances, Strategies should not need to call this
      * function.  It exists primarily to allow previous authentication state
      * to be restored, for example from an HTTP session.
      *
      * @api public
      */
    def pass(): Unit = js.native
    /**
      * Redirect to `url` with optional `status`, defaulting to 302.
      *
      * Strategies should call this function to redirect the user (via their
      * user agent) to a third-party website for authentication.
      *
      * @param {String} url
      * @param {Number} status
      * @api public
      */
    def redirect(url: String): Unit = js.native
    def redirect(url: String, status: Double): Unit = js.native
    //
    // Augmented strategy functions.
    // These are available only from the 'authenticate' function.
    // They are added manually by the passport framework.
    //
    /**
      * Authenticate `user`, with optional `info`.
      *
      * Strategies should call this function to successfully authenticate a
      * user.  `user` should be an object supplied by the application after it
      * has been given an opportunity to verify credentials.  `info` is an
      * optional argument containing additional user information.  This is
      * useful for third-party authentication strategies to pass profile
      * details.
      *
      * @param {Object} user
      * @param {Object} info
      * @api public
      */
    def success(user: js.Any): Unit = js.native
    def success(user: js.Any, info: js.Any): Unit = js.native
  }
  
}

