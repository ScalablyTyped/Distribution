package typings.passport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Framework[InitializeRet, AuthenticateRet, AuthorizeRet] extends js.Object {
  
  def authenticate(
    passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
    name: String
  ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
  def authenticate(
    passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
    name: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, _]
  ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
  def authenticate(
    passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
    name: String,
    options: js.Any
  ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
  def authenticate(
    passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
    name: String,
    options: js.Any,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): js.Function1[/* repeated */ js.Any, AuthenticateRet] = js.native
  
  var authorize: js.UndefOr[
    js.Function4[
      /* passport */ Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions], 
      /* name */ String, 
      /* options */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Function1[/* repeated */ js.Any, _]], 
      js.Function1[/* repeated */ _, AuthorizeRet]
    ]
  ] = js.native
  
  def initialize(passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions]): js.Function1[/* repeated */ js.Any, InitializeRet] = js.native
  def initialize(
    passport: Authenticator[InitializeRet, AuthenticateRet, AuthorizeRet, AuthenticateOptions],
    options: js.Any
  ): js.Function1[/* repeated */ js.Any, InitializeRet] = js.native
}
