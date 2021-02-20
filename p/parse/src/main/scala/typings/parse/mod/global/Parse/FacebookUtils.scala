package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
object FacebookUtils {
  
  @JSGlobal("Parse.FacebookUtils.init")
  @js.native
  def init(): Unit = js.native
  @JSGlobal("Parse.FacebookUtils.init")
  @js.native
  def init(options: js.Any): Unit = js.native
  
  @JSGlobal("Parse.FacebookUtils.isLinked")
  @js.native
  def isLinked(user: typings.parse.mod.global.Parse.User[Attributes]): Boolean = js.native
  
  @JSGlobal("Parse.FacebookUtils.link")
  @js.native
  def link(user: typings.parse.mod.global.Parse.User[Attributes], permissions: js.Any): Unit = js.native
  @JSGlobal("Parse.FacebookUtils.link")
  @js.native
  def link(
    user: typings.parse.mod.global.Parse.User[Attributes],
    permissions: js.Any,
    options: SuccessFailureOptions
  ): Unit = js.native
  
  @JSGlobal("Parse.FacebookUtils.logIn")
  @js.native
  def logIn(permissions: js.Any): Unit = js.native
  @JSGlobal("Parse.FacebookUtils.logIn")
  @js.native
  def logIn(permissions: js.Any, options: FullOptions): Unit = js.native
  
  @JSGlobal("Parse.FacebookUtils.unlink")
  @js.native
  def unlink(user: typings.parse.mod.global.Parse.User[Attributes]): Unit = js.native
  @JSGlobal("Parse.FacebookUtils.unlink")
  @js.native
  def unlink(user: typings.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = js.native
}
