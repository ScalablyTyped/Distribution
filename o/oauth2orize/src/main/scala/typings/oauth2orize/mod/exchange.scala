package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exchange {
  
  @JSImport("oauth2orize", "exchange.authorizationCode")
  @js.native
  def authorizationCode(issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "exchange.authorizationCode")
  @js.native
  def authorizationCode(options: Options, issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
  
  @JSImport("oauth2orize", "exchange.clientCredentials")
  @js.native
  def clientCredentials(issue: js.Function2[/* client */ js.Any, /* issued */ ExchangeDoneFunction, Unit]): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "exchange.clientCredentials")
  @js.native
  def clientCredentials(
    issue: js.Function3[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 2; issue(client, issued);
  @JSImport("oauth2orize", "exchange.clientCredentials")
  @js.native
  def clientCredentials(
    options: Options,
    issue: js.Function2[/* client */ js.Any, /* issued */ ExchangeDoneFunction, Unit]
  ): MiddlewareFunction = js.native
  // arity == 3; issue(client, scope, issued);
  @JSImport("oauth2orize", "exchange.clientCredentials")
  @js.native
  def clientCredentials(
    options: Options,
    issue: js.Function3[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 4; issue(client, scope, req.body, issued);
  @JSImport("oauth2orize", "exchange.clientCredentials")
  @js.native
  def clientCredentials(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 5; issue(client, scope, req.body, req.authInfo, issued);
  @JSImport("oauth2orize", "exchange.clientCredentials")
  @js.native
  def clientCredentials(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  
  @JSImport("oauth2orize", "exchange.code")
  @js.native
  def code(issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "exchange.code")
  @js.native
  def code(options: Options, issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
  
  @JSImport("oauth2orize", "exchange.password")
  @js.native
  def password(
    issue: js.Function4[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "exchange.password")
  @js.native
  def password(
    issue: js.Function5[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 4; issue(client, username, passwd, issued);
  @JSImport("oauth2orize", "exchange.password")
  @js.native
  def password(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 5; issue(client, username, passwd, scope, issued);
  @JSImport("oauth2orize", "exchange.password")
  @js.native
  def password(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 6; issue(client, username, passwd, scope, req.body, issued);
  @JSImport("oauth2orize", "exchange.password")
  @js.native
  def password(
    options: Options,
    issue: js.Function6[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 7; issue(client, username, passwd, scope, req.body, req.authInfo, issued);
  @JSImport("oauth2orize", "exchange.password")
  @js.native
  def password(
    options: Options,
    issue: js.Function7[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  
  @JSImport("oauth2orize", "exchange.refreshToken")
  @js.native
  def refreshToken(
    issue: js.Function3[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  @JSImport("oauth2orize", "exchange.refreshToken")
  @js.native
  def refreshToken(
    issue: js.Function4[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 3; issue(client, refreshToken, issued);
  @JSImport("oauth2orize", "exchange.refreshToken")
  @js.native
  def refreshToken(
    options: Options,
    issue: js.Function3[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 4; issue(client, refreshToken, scope, issued);
  @JSImport("oauth2orize", "exchange.refreshToken")
  @js.native
  def refreshToken(
    options: Options,
    issue: js.Function4[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 5; issue(client, refreshToken, scope, req.body, issued);
  @JSImport("oauth2orize", "exchange.refreshToken")
  @js.native
  def refreshToken(
    options: Options,
    issue: js.Function5[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 6; issue(client, refreshToken, scope, req.body, req.authInfo, issued);
  @JSImport("oauth2orize", "exchange.refreshToken")
  @js.native
  def refreshToken(
    options: Options,
    issue: js.Function6[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* body */ js.Any, 
      /* authInfo */ js.Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  
  @js.native
  trait Options extends StObject {
    
    // For maximum flexibility, multiple scope spearators can optionally be
    // allowed.  This allows the server to accept clients that separate scope
    // with either space or comma (' ', ',').  This violates the specification,
    // but achieves compatibility with existing client libraries that are already
    // deployed.
    var scopeSeparator: js.UndefOr[String] = js.native
    
    // The 'user' property of `req` holds the authenticated user.  In the case
    // of the token endpoint, the property will contain the OAuth 2.0 client.
    var userProperty: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
}
