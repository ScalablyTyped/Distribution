package typings.npmProfile.mod

import typings.npmProfile.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def adduser(
  opener: js.Function1[/* url */ String, js.Promise[Unit]],
  prompter: js.Function1[/* creds */ ProfileAuthCredentials, js.Promise[ProfileAuthCredentials]]
): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("adduser")(opener.asInstanceOf[js.Any], prompter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]
inline def adduser(
  opener: js.Function1[/* url */ String, js.Promise[Unit]],
  prompter: js.Function1[/* creds */ ProfileAuthCredentials, js.Promise[ProfileAuthCredentials]],
  opts: Options
): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("adduser")(opener.asInstanceOf[js.Any], prompter.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]

inline def adduserCouch(username: String, email: String, password: String): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("adduserCouch")(username.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]
inline def adduserCouch(username: String, email: String, password: String, opts: Options): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("adduserCouch")(username.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]

inline def adduserWeb(opener: js.Function1[/* url */ String, js.Promise[Unit]]): js.Promise[ProfileAuthToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("adduserWeb")(opener.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileAuthToken]]
inline def adduserWeb(opener: js.Function1[/* url */ String, js.Promise[Unit]], opts: Options): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("adduserWeb")(opener.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]

inline def createToken(password: String, readonly: Boolean, cidr_whitelist: js.Array[String]): js.Promise[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(password.asInstanceOf[js.Any], readonly.asInstanceOf[js.Any], cidr_whitelist.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Token]]
inline def createToken(password: String, readonly: Boolean, cidr_whitelist: js.Array[String], options: Options): js.Promise[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(password.asInstanceOf[js.Any], readonly.asInstanceOf[js.Any], cidr_whitelist.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Token]]

inline def get(): js.Promise[ProfileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[ProfileData]]
inline def get(options: Options): js.Promise[ProfileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileData]]

inline def listTokens(): js.Promise[js.Array[Token]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTokens")().asInstanceOf[js.Promise[js.Array[Token]]]
inline def listTokens(options: Options): js.Promise[js.Array[Token]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTokens")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Token]]]

inline def login(
  opener: js.Function1[/* url */ String, js.Promise[Unit]],
  prompter: js.Function1[/* creds */ ProfileAuthCredentials, js.Promise[ProfileAuthCredentials]]
): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(opener.asInstanceOf[js.Any], prompter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]
inline def login(
  opener: js.Function1[/* url */ String, js.Promise[Unit]],
  prompter: js.Function1[/* creds */ ProfileAuthCredentials, js.Promise[ProfileAuthCredentials]],
  opts: Options
): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(opener.asInstanceOf[js.Any], prompter.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]

inline def loginCouch(username: String, email: String, password: String): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginCouch")(username.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]
inline def loginCouch(username: String, email: String, password: String, opts: Options): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginCouch")(username.asInstanceOf[js.Any], email.asInstanceOf[js.Any], password.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]

inline def loginWeb(opener: js.Function1[/* url */ String, js.Promise[Unit]]): js.Promise[ProfileAuthToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWeb")(opener.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileAuthToken]]
inline def loginWeb(opener: js.Function1[/* url */ String, js.Promise[Unit]], opts: Options): js.Promise[ProfileAuthToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWeb")(opener.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileAuthToken]]

inline def removeToken(tokenOrKey: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeToken")(tokenOrKey.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def removeToken(tokenOrKey: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeToken")(tokenOrKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def set(updateOptions: UpdateProfileData): js.Promise[ProfileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(updateOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProfileData]]
inline def set(updateOptions: UpdateProfileData, options: Options): js.Promise[ProfileData] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(updateOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProfileData]]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typings.npmProfile.npmProfileBooleans.`false`
  - typings.npmProfile.anon.Dictkey
  - js.Tuple2[java.lang.String, java.lang.String]
  - java.lang.String
*/
type TFAStatus = _TFAStatus | (js.Tuple2[String, String]) | Null | String
