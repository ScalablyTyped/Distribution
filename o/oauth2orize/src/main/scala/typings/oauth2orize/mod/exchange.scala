package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exchange {
  
  @JSImport("oauth2orize", "exchange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def authorizationCode(issue: IssueExchangeCodeFunction): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizationCode")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  inline def authorizationCode(options: Options, issue: IssueExchangeCodeFunction): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("authorizationCode")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  
  inline def clientCredentials(issue: js.Function2[/* client */ Any, /* issued */ ExchangeDoneFunction, Unit]): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("clientCredentials")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  inline def clientCredentials(
    issue: js.Function3[
      /* client */ Any, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("clientCredentials")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  // arity == 2; issue(client, issued);
  inline def clientCredentials(options: Options, issue: js.Function2[/* client */ Any, /* issued */ ExchangeDoneFunction, Unit]): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clientCredentials")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 3; issue(client, scope, issued);
  inline def clientCredentials(
    options: Options,
    issue: js.Function3[
      /* client */ Any, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clientCredentials")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 4; issue(client, scope, req.body, issued);
  inline def clientCredentials(
    options: Options,
    issue: js.Function4[
      /* client */ Any, 
      /* scope */ js.Array[String], 
      /* body */ Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clientCredentials")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 5; issue(client, scope, req.body, req.authInfo, issued);
  inline def clientCredentials(
    options: Options,
    issue: js.Function5[
      /* client */ Any, 
      /* scope */ js.Array[String], 
      /* body */ Any, 
      /* authInfo */ Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("clientCredentials")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  
  inline def code(issue: IssueExchangeCodeFunction): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  inline def code(options: Options, issue: IssueExchangeCodeFunction): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  
  inline def password(
    issue: js.Function4[
      /* client */ Any, 
      /* username */ String, 
      /* password */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  inline def password(
    issue: js.Function5[
      /* client */ Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  // arity == 4; issue(client, username, passwd, issued);
  inline def password(
    options: Options,
    issue: js.Function4[
      /* client */ Any, 
      /* username */ String, 
      /* password */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("password")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 5; issue(client, username, passwd, scope, issued);
  inline def password(
    options: Options,
    issue: js.Function5[
      /* client */ Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("password")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 6; issue(client, username, passwd, scope, req.body, issued);
  inline def password(
    options: Options,
    issue: js.Function6[
      /* client */ Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* body */ Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("password")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 7; issue(client, username, passwd, scope, req.body, req.authInfo, issued);
  inline def password(
    options: Options,
    issue: js.Function7[
      /* client */ Any, 
      /* username */ String, 
      /* password */ String, 
      /* scope */ js.Array[String], 
      /* body */ Any, 
      /* authInfo */ Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("password")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  
  inline def refreshToken(
    issue: js.Function3[/* client */ Any, /* refreshToken */ String, /* issued */ ExchangeDoneFunction, Unit]
  ): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  inline def refreshToken(
    issue: js.Function4[
      /* client */ Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(issue.asInstanceOf[js.Any]).asInstanceOf[MiddlewareFunction]
  // arity == 3; issue(client, refreshToken, issued);
  inline def refreshToken(
    options: Options,
    issue: js.Function3[/* client */ Any, /* refreshToken */ String, /* issued */ ExchangeDoneFunction, Unit]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 4; issue(client, refreshToken, scope, issued);
  inline def refreshToken(
    options: Options,
    issue: js.Function4[
      /* client */ Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 5; issue(client, refreshToken, scope, req.body, issued);
  inline def refreshToken(
    options: Options,
    issue: js.Function5[
      /* client */ Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* body */ Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  // arity == 6; issue(client, refreshToken, scope, req.body, req.authInfo, issued);
  inline def refreshToken(
    options: Options,
    issue: js.Function6[
      /* client */ Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* body */ Any, 
      /* authInfo */ Any, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(options.asInstanceOf[js.Any], issue.asInstanceOf[js.Any])).asInstanceOf[MiddlewareFunction]
  
  trait Options extends StObject {
    
    // For maximum flexibility, multiple scope spearators can optionally be
    // allowed.  This allows the server to accept clients that separate scope
    // with either space or comma (' ', ',').  This violates the specification,
    // but achieves compatibility with existing client libraries that are already
    // deployed.
    var scopeSeparator: js.UndefOr[String] = js.undefined
    
    // The 'user' property of `req` holds the authenticated user.  In the case
    // of the token endpoint, the property will contain the OAuth 2.0 client.
    var userProperty: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      inline def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
}
