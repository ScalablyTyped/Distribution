package typings.parse.reactNativeMod

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.FullOptions
import typings.parse.mod.global.Parse.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
@JSImport("parse/react-native", "FacebookUtils")
@js.native
object FacebookUtils extends js.Object {
  
  def init(): Unit = js.native
  def init(options: js.Any): Unit = js.native
  
  def isLinked(user: typings.parse.mod.global.Parse.User[Attributes]): Boolean = js.native
  
  def link(user: typings.parse.mod.global.Parse.User[Attributes], permissions: js.Any): Unit = js.native
  def link(
    user: typings.parse.mod.global.Parse.User[Attributes],
    permissions: js.Any,
    options: SuccessFailureOptions
  ): Unit = js.native
  
  def logIn(permissions: js.Any): Unit = js.native
  def logIn(permissions: js.Any, options: FullOptions): Unit = js.native
  
  def unlink(user: typings.parse.mod.global.Parse.User[Attributes]): Unit = js.native
  def unlink(user: typings.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = js.native
}
