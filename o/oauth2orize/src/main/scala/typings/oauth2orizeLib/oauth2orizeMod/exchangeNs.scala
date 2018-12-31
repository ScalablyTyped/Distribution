package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "exchange")
@js.native
object exchangeNs extends js.Object {
  trait Options extends js.Object {
    // For maximum flexibility, multiple scope spearators can optionally be
    // allowed.  This allows the server to accept clients that separate scope
    // with either space or comma (' ', ',').  This violates the specification,
    // but achieves compatibility with existing client libraries that are already
    // deployed.
    var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
    // The 'user' property of `req` holds the authenticated user.  In the case
    // of the token endpoint, the property will contain the OAuth 2.0 client.
    var userProperty: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def authorizationCode(issue: oauth2orizeLib.oauth2orizeMod.IssueExchangeCodeFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def authorizationCode(options: Options, issue: oauth2orizeLib.oauth2orizeMod.IssueExchangeCodeFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def clientCredentials(
    issue: js.Function2[
      /* client */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def clientCredentials(
    issue: js.Function3[
      /* client */ js.Any, 
      /* scope */ js.Array[java.lang.String], 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 2; issue(client, issued);
  def clientCredentials(
    options: Options,
    issue: js.Function2[
      /* client */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 3; issue(client, scope, issued);
  def clientCredentials(
    options: Options,
    issue: js.Function3[
      /* client */ js.Any, 
      /* scope */ js.Array[java.lang.String], 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 4; issue(client, scope, req.body, issued);
  def clientCredentials(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* scope */ js.Array[java.lang.String], 
      /* body */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 5; issue(client, scope, req.body, req.authInfo, issued);
  def clientCredentials(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* scope */ js.Array[java.lang.String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def code(issue: oauth2orizeLib.oauth2orizeMod.IssueExchangeCodeFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def code(options: Options, issue: oauth2orizeLib.oauth2orizeMod.IssueExchangeCodeFunction): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def password(
    issue: js.Function4[
      /* client */ js.Any, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def password(
    issue: js.Function5[
      /* client */ js.Any, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 4; issue(client, username, passwd, issued);
  def password(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 5; issue(client, username, passwd, scope, issued);
  def password(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 6; issue(client, username, passwd, scope, req.body, issued);
  def password(
    options: Options,
    issue: js.Function6[
      /* client */ js.Any, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* body */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 7; issue(client, username, passwd, scope, req.body, req.authInfo, issued);
  def password(
    options: Options,
    issue: js.Function7[
      /* client */ js.Any, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def refreshToken(
    issue: js.Function3[
      /* client */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  def refreshToken(
    issue: js.Function4[
      /* client */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 3; issue(client, refreshToken, issued);
  def refreshToken(
    options: Options,
    issue: js.Function3[
      /* client */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 4; issue(client, refreshToken, scope, issued);
  def refreshToken(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 5; issue(client, refreshToken, scope, req.body, issued);
  def refreshToken(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* body */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
  // arity == 6; issue(client, refreshToken, scope, req.body, req.authInfo, issued);
  def refreshToken(
    options: Options,
    issue: js.Function6[
      /* client */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* scope */ js.Array[java.lang.String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ oauth2orizeLib.oauth2orizeMod.ExchangeDoneFunction, 
      scala.Unit
    ]
  ): oauth2orizeLib.oauth2orizeMod.MiddlewareFunction = js.native
}

