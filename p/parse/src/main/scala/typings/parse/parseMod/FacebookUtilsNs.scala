package typings.parse.parseMod

import typings.parse.ParseNs.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a set of utilities for using Parse with Facebook.
  * @namespace
  * Provides a set of utilities for using Parse with Facebook.
  */
@JSImport("parse", "FacebookUtils")
@js.native
object FacebookUtilsNs extends js.Object {
  def init(): Unit = js.native
  def init(options: js.Any): Unit = js.native
  def isLinked(user: typings.parse.ParseNs.User): Boolean = js.native
  def link(user: typings.parse.ParseNs.User, permissions: js.Any): Unit = js.native
  def link(user: typings.parse.ParseNs.User, permissions: js.Any, options: SuccessFailureOptions): Unit = js.native
  def logIn(permissions: js.Any): Unit = js.native
  def logIn(permissions: js.Any, options: SuccessFailureOptions): Unit = js.native
  def unlink(user: typings.parse.ParseNs.User): Unit = js.native
  def unlink(user: typings.parse.ParseNs.User, options: SuccessFailureOptions): Unit = js.native
}

