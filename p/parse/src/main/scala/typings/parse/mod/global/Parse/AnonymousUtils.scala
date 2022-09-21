package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for working with Anonymously logged-in users.
  */
object AnonymousUtils {
  
  @JSGlobal("Parse.AnonymousUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLinked(user: User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def link(user: User[Attributes]): js.Promise[User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User[Attributes]]]
  inline def link(user: User[Attributes], options: ScopeOptions): js.Promise[User[Attributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User[Attributes]]]
  
  inline def logIn(): js.Promise[User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")().asInstanceOf[js.Promise[User[Attributes]]]
  inline def logIn(options: ScopeOptions): js.Promise[User[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User[Attributes]]]
}
