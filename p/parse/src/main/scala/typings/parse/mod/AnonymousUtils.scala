package typings.parse.mod

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.ScopeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for working with Anonymously logged-in users.
  */
object AnonymousUtils {
  
  @JSImport("parse", "AnonymousUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLinked(user: typings.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def link(user: typings.parse.mod.global.Parse.User[Attributes]): js.Promise[typings.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.User[Attributes]]]
  inline def link(user: typings.parse.mod.global.Parse.User[Attributes], options: ScopeOptions): js.Promise[typings.parse.mod.global.Parse.User[Attributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.User[Attributes]]]
  
  inline def logIn(): js.Promise[typings.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")().asInstanceOf[js.Promise[typings.parse.mod.global.Parse.User[Attributes]]]
  inline def logIn(options: ScopeOptions): js.Promise[typings.parse.mod.global.Parse.User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.User[Attributes]]]
}
