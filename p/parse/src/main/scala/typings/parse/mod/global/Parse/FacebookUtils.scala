package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a set of utilities for using Parse with Facebook.
  * Provides a set of utilities for using Parse with Facebook.
  */
object FacebookUtils {
  
  @JSGlobal("Parse.FacebookUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isLinked(user: User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def link(user: User[Attributes], permissions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def link(user: User[Attributes], permissions: js.Any, options: SuccessFailureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logIn(permissions: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logIn(permissions: js.Any, options: FullOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlink(user: User[Attributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unlink(user: User[Attributes], options: SuccessFailureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
