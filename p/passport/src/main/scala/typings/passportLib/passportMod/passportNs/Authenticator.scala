package typings
package passportLib.passportMod.passportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthorizeOptions] extends js.Object {
  def authenticate(strategy: java.lang.String): AuthenticateRet = js.native
  def authenticate(strategy: java.lang.String, callback: js.Function1[/* repeated */js.Any, _]): AuthenticateRet = js.native
  def authenticate(strategy: java.lang.String, options: AuthenticateOptions): AuthenticateRet = js.native
  def authenticate(
    strategy: java.lang.String,
    options: AuthenticateOptions,
    callback: js.Function1[/* repeated */js.Any, _]
  ): AuthenticateRet = js.native
  def authenticate(strategy: js.Array[java.lang.String]): AuthenticateRet = js.native
  def authenticate(strategy: js.Array[java.lang.String], callback: js.Function1[/* repeated */js.Any, _]): AuthenticateRet = js.native
  def authenticate(strategy: js.Array[java.lang.String], options: AuthenticateOptions): AuthenticateRet = js.native
  def authenticate(
    strategy: js.Array[java.lang.String],
    options: AuthenticateOptions,
    callback: js.Function1[/* repeated */js.Any, _]
  ): AuthenticateRet = js.native
  def authorize(strategy: java.lang.String): AuthorizeRet = js.native
  def authorize(strategy: java.lang.String, callback: js.Function1[/* repeated */js.Any, _]): AuthorizeRet = js.native
  def authorize(strategy: java.lang.String, options: AuthorizeOptions): AuthorizeRet = js.native
  def authorize(
    strategy: java.lang.String,
    options: AuthorizeOptions,
    callback: js.Function1[/* repeated */js.Any, _]
  ): AuthorizeRet = js.native
  def authorize(strategy: js.Array[java.lang.String]): AuthorizeRet = js.native
  def authorize(strategy: js.Array[java.lang.String], callback: js.Function1[/* repeated */js.Any, _]): AuthorizeRet = js.native
  def authorize(strategy: js.Array[java.lang.String], options: AuthorizeOptions): AuthorizeRet = js.native
  def authorize(
    strategy: js.Array[java.lang.String],
    options: AuthorizeOptions,
    callback: js.Function1[/* repeated */js.Any, _]
  ): AuthorizeRet = js.native
  def deserializeUser[TUser, TID](
    fn: js.Function2[
      /* id */ TID, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def framework[X, Y, Z](fw: Framework[X, Y, Z]): Authenticator[X, Y, Z, AuthenticateOptions] = js.native
  def initialize(): InitializeRet = js.native
  def initialize(options: passportLib.Anon_UserProperty): InitializeRet = js.native
  def serializeUser[TUser, TID](
    fn: js.Function2[
      /* user */ TUser, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def session(): AuthenticateRet = js.native
  def session(options: passportLib.Anon_PauseStream): AuthenticateRet = js.native
  def transformAuthInfo(
    fn: js.Function2[
      /* info */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def unuse(name: java.lang.String): this.type = js.native
  def use(name: java.lang.String, strategy: Strategy): this.type = js.native
  def use(strategy: Strategy): this.type = js.native
}

