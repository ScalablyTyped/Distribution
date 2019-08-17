package typings.oauth2orize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauth2orizeMod {
  import typings.node.httpMod.ServerResponse
  import typings.std.Error

  type DecisionParseFunction = js.Function2[
    /* req */ MiddlewareRequest, 
    /* done */ js.Function2[/* err */ Error | Null, /* params */ js.Any, Unit], 
    Unit
  ]
  type DeserializeClientDoneFunction = js.Function2[/* err */ Error | Null, /* client */ js.UndefOr[js.Any | Boolean], Unit]
  type DeserializeClientFunction = js.Function2[/* id */ String, /* done */ DeserializeClientDoneFunction, Unit]
  type ExchangeDoneFunction = js.Function4[
    /* err */ Error | Null, 
    /* accessToken */ js.UndefOr[String | Boolean], 
    /* refreshToken */ js.UndefOr[String], 
    /* params */ js.UndefOr[js.Any], 
    Unit
  ]
  type ImmediateFunction = js.Function6[
    /* client */ js.Any, 
    /* user */ js.Any, 
    /* scope */ js.Array[String], 
    /* type */ String, 
    /* areq */ js.Any, 
    /* done */ js.Function4[
      /* err */ Error | Null, 
      /* allow */ Boolean, 
      /* info */ js.Any, 
      /* locals */ js.Any, 
      Unit
    ], 
    Unit
  ]
  type IssueExchangeCodeFunction = js.Function4[
    /* client */ js.Any, 
    /* code */ String, 
    /* redirectURI */ String, 
    /* issued */ ExchangeDoneFunction, 
    Unit
  ]
  type IssueGrantCodeFunction = js.Function5[
    /* client */ js.Any, 
    /* redirectUri */ String, 
    /* user */ js.Any, 
    /* res */ js.Any, 
    /* issued */ js.Function2[/* err */ Error | Null, /* code */ js.UndefOr[String], Unit], 
    Unit
  ]
  type IssueGrantTokenFunction = js.Function4[
    /* client */ js.Any, 
    /* user */ js.Any, 
    /* ares */ js.Any, 
    /* issued */ js.Function3[
      /* err */ Error | Null, 
      /* code */ js.UndefOr[String], 
      /* params */ js.UndefOr[js.Any], 
      Unit
    ], 
    Unit
  ]
  type MiddlewareErrorFunction = js.Function4[
    /* err */ Error, 
    /* req */ MiddlewareRequest, 
    /* res */ ServerResponse, 
    /* next */ MiddlewareNextFunction, 
    Unit
  ]
  type MiddlewareFunction = js.Function3[
    /* req */ MiddlewareRequest, 
    /* res */ ServerResponse, 
    /* next */ MiddlewareNextFunction, 
    Unit
  ]
  type MiddlewareNextFunction = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type SerializeClientDoneFunction = js.Function2[/* err */ Error | Null, /* id */ String, Unit]
  type SerializeClientFunction = js.Function2[/* client */ js.Any, /* done */ SerializeClientDoneFunction, Unit]
  type ValidateFunction = js.Function3[
    /* clientId */ String, 
    /* redirectURI */ String, 
    /* validated */ js.Function3[
      /* err */ Error | Null, 
      /* client */ js.UndefOr[js.Any], 
      /* redirectURI */ js.UndefOr[String], 
      Unit
    ], 
    Unit
  ]
}
