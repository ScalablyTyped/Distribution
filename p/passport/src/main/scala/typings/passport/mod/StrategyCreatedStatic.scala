package typings.passport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyCreatedStatic extends js.Object {
  /**
    * Internal error while performing authentication.
    *
    * Strategies should call this function when an internal error occurs
    * during the process of performing authentication; for example, if the
    * user directory is not available.
    */
  def error(err: js.Any): Unit = js.native
  /**
    * Fail authentication, with optional `challenge` and `status`, defaulting
    * to 401.
    *
    * Strategies should call this function to fail an authentication attempt.
    */
  def fail(): Unit = js.native
  def fail(challenge: js.UndefOr[scala.Nothing], status: Double): Unit = js.native
  def fail(challenge: String): Unit = js.native
  def fail(challenge: String, status: Double): Unit = js.native
  def fail(challenge: Double): Unit = js.native
  def fail(challenge: Double, status: Double): Unit = js.native
  /**
    * Pass without making a success or fail decision.
    *
    * Under most circumstances, Strategies should not need to call this
    * function.  It exists primarily to allow previous authentication state
    * to be restored, for example from an HTTP session.
    */
  def pass(): Unit = js.native
  /**
    * Redirect to `url` with optional `status`, defaulting to 302.
    *
    * Strategies should call this function to redirect the user (via their
    * user agent) to a third-party website for authentication.
    */
  def redirect(url: String): Unit = js.native
  def redirect(url: String, status: Double): Unit = js.native
  /**
    * Authenticate `user`, with optional `info`.
    *
    * Strategies should call this function to successfully authenticate a
    * user.  `user` should be an object supplied by the application after it
    * has been given an opportunity to verify credentials.  `info` is an
    * optional argument containing additional user information.  This is
    * useful for third-party authentication strategies to pass profile
    * details.
    */
  def success(user: js.Object): Unit = js.native
  def success(user: js.Object, info: js.Object): Unit = js.native
}

