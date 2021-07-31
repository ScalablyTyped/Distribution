package typings.parse.mod

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.FullOptions
import typings.parse.mod.global.Parse.SuccessFailureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
object FacebookUtils {
  
  @JSImport("parse", "FacebookUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  @scala.inline
  def init(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isLinked(user: typings.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def link(user: typings.parse.mod.global.Parse.User[Attributes], permissions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def link(
    user: typings.parse.mod.global.Parse.User[Attributes],
    permissions: js.Any,
    options: SuccessFailureOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def logIn(permissions: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def logIn(permissions: js.Any, options: FullOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unlink(user: typings.parse.mod.global.Parse.User[Attributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unlink(user: typings.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
