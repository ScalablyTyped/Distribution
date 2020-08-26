package typings.passport.mod

import typings.node.httpMod.IncomingMessage
import typings.passport.anon.PauseStream
import typings.passport.anon.UserProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthorizeOptions] extends js.Object {
  def authenticate(strategy: String): AuthenticateRet = js.native
  def authenticate(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authenticate(strategy: String, options: AuthenticateOptions): AuthenticateRet = js.native
  def authenticate(strategy: String, options: AuthenticateOptions, callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authenticate(strategy: js.Array[String]): AuthenticateRet = js.native
  def authenticate(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authenticate(strategy: js.Array[String], options: AuthenticateOptions): AuthenticateRet = js.native
  def authenticate(
    strategy: js.Array[String],
    options: AuthenticateOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): AuthenticateRet = js.native
  def authenticate(strategy: Strategy): AuthenticateRet = js.native
  def authenticate(strategy: Strategy, callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authenticate(strategy: Strategy, options: AuthenticateOptions): AuthenticateRet = js.native
  def authenticate(strategy: Strategy, options: AuthenticateOptions, callback: js.Function1[/* repeated */ js.Any, _]): AuthenticateRet = js.native
  def authorize(strategy: String): AuthorizeRet = js.native
  def authorize(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): AuthorizeRet = js.native
  def authorize(strategy: String, options: AuthorizeOptions): AuthorizeRet = js.native
  def authorize(strategy: String, options: AuthorizeOptions, callback: js.Function1[/* repeated */ js.Any, _]): AuthorizeRet = js.native
  def authorize(strategy: js.Array[String]): AuthorizeRet = js.native
  def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): AuthorizeRet = js.native
  def authorize(strategy: js.Array[String], options: AuthorizeOptions): AuthorizeRet = js.native
  def authorize(
    strategy: js.Array[String],
    options: AuthorizeOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): AuthorizeRet = js.native
  def deserializeUser[TUser, TID](
    fn: js.Function2[
      /* id */ TID, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
      Unit
    ]
  ): Unit = js.native
  def deserializeUser[TUser, TID, TR /* <: IncomingMessage */](
    fn: js.Function3[
      /* req */ TR, 
      /* id */ TID, 
      /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
      Unit
    ]
  ): Unit = js.native
  def framework[X, Y, Z](fw: Framework[X, Y, Z]): Authenticator[X, Y, Z, AuthenticateOptions] = js.native
  def initialize(): InitializeRet = js.native
  def initialize(options: UserProperty): InitializeRet = js.native
  def serializeUser[TUser, TID](
    fn: js.Function2[
      /* user */ TUser, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
      Unit
    ]
  ): Unit = js.native
  def serializeUser[TUser, TID, TR /* <: IncomingMessage */](
    fn: js.Function3[
      /* req */ TR, 
      /* user */ TUser, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
      Unit
    ]
  ): Unit = js.native
  def session(): AuthenticateRet = js.native
  def session(options: PauseStream): AuthenticateRet = js.native
  def transformAuthInfo(
    fn: js.Function2[
      /* info */ js.Any, 
      /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, Unit], 
      Unit
    ]
  ): Unit = js.native
  def unuse(name: String): this.type = js.native
  def use(name: String, strategy: Strategy): this.type = js.native
  def use(strategy: Strategy): this.type = js.native
}

