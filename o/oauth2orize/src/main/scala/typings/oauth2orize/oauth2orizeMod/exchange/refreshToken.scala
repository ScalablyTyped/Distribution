package typings.oauth2orize.oauth2orizeMod.exchange

import typings.oauth2orize.oauth2orizeMod.ExchangeDoneFunction
import typings.oauth2orize.oauth2orizeMod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "exchange.refreshToken")
@js.native
object refreshToken extends js.Object {
  def apply(
    issue: js.Function3[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  def apply(
    issue: js.Function4[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* scope */ js.Array[String], 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 3; issue(client, refreshToken, issued);
  def apply(
    options: Options,
    issue: js.Function3[
      /* client */ js.Any, 
      /* refreshToken */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  // arity == 4; issue(client, refreshToken, scope, issued);
  def apply(
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
  def apply(
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
  def apply(
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
}

