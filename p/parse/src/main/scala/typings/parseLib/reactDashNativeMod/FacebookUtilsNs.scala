package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a set of utilities for using Parse with Facebook.
  * @namespace
  * Provides a set of utilities for using Parse with Facebook.
  */
@JSImport("parse/react-native", "FacebookUtils")
@js.native
object FacebookUtilsNs extends js.Object {
  def init(): scala.Unit = js.native
  def init(options: js.Any): scala.Unit = js.native
  def isLinked(user: parseLib.ParseNs.User): scala.Boolean = js.native
  def link(user: parseLib.ParseNs.User, permissions: js.Any): scala.Unit = js.native
  def link(user: parseLib.ParseNs.User, permissions: js.Any, options: parseLib.ParseNs.SuccessFailureOptions): scala.Unit = js.native
  def logIn(permissions: js.Any): scala.Unit = js.native
  def logIn(permissions: js.Any, options: parseLib.ParseNs.SuccessFailureOptions): scala.Unit = js.native
  def unlink(user: parseLib.ParseNs.User): scala.Unit = js.native
  def unlink(user: parseLib.ParseNs.User, options: parseLib.ParseNs.SuccessFailureOptions): scala.Unit = js.native
}

