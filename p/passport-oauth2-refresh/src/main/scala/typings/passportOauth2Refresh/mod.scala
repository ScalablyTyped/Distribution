package typings.passportOauth2Refresh

import typings.oauth.mod.oauth2tokenCallback
import typings.passportOauth2.mod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-oauth2-refresh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def has(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def requestNewAccessToken(name: String, refreshToken: String, done: oauth2tokenCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requestNewAccessToken")(name.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def requestNewAccessToken(name: String, refreshToken: String, params: Any, done: oauth2tokenCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requestNewAccessToken")(name.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any], params.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def use(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def use(name: String, strategy: Strategy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(name.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def use(name: Strategy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def use(name: Strategy, strategy: Strategy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(name.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
