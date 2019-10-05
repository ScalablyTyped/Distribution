package typings.oauth2orize.oauth2orizeMod.exchange

import typings.oauth2orize.oauth2orizeMod.ExchangeDoneFunction
import typings.oauth2orize.oauth2orizeMod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "exchange.password")
@js.native
object password extends js.Object {
  def apply(
    issue: js.Function4[
      /* client */ js.Any, 
      /* username */ String, 
      /* password */ String, 
      /* issued */ ExchangeDoneFunction, 
      Unit
    ]
  ): MiddlewareFunction = js.native
  def apply(
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
  def apply(
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
  def apply(
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
  def apply(
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
  def apply(
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
}

