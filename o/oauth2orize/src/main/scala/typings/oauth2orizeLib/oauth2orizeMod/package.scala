package typings
package oauth2orizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oauth2orizeMod {
  type DecisionParseFunction = js.Function2[
    /* req */ MiddlewareRequest, 
    /* done */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* params */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type DeserializeClientDoneFunction = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* client */ js.UndefOr[js.Any | scala.Boolean], 
    scala.Unit
  ]
  type DeserializeClientFunction = js.Function2[/* id */ java.lang.String, /* done */ DeserializeClientDoneFunction, scala.Unit]
  type ExchangeDoneFunction = js.Function4[
    /* err */ nodeLib.Error | scala.Null, 
    /* accessToken */ js.UndefOr[java.lang.String | scala.Boolean], 
    /* refreshToken */ js.UndefOr[java.lang.String], 
    /* params */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type ImmediateFunction = js.Function6[
    /* client */ js.Any, 
    /* user */ js.Any, 
    /* scope */ js.Array[java.lang.String], 
    /* type */ java.lang.String, 
    /* areq */ js.Any, 
    /* done */ js.Function4[
      /* err */ nodeLib.Error | scala.Null, 
      /* allow */ scala.Boolean, 
      /* info */ js.Any, 
      /* locals */ js.Any, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type IssueExchangeCodeFunction = js.Function4[
    /* client */ js.Any, 
    /* code */ java.lang.String, 
    /* redirectURI */ java.lang.String, 
    /* issued */ ExchangeDoneFunction, 
    scala.Unit
  ]
  type IssueGrantCodeFunction = js.Function5[
    /* client */ js.Any, 
    /* redirectUri */ java.lang.String, 
    /* user */ js.Any, 
    /* res */ js.Any, 
    /* issued */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* code */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type IssueGrantTokenFunction = js.Function4[
    /* client */ js.Any, 
    /* user */ js.Any, 
    /* ares */ js.Any, 
    /* issued */ js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* code */ js.UndefOr[java.lang.String], 
      /* params */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type MiddlewareErrorFunction = js.Function4[
    /* err */ nodeLib.Error, 
    /* req */ MiddlewareRequest, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ MiddlewareNextFunction, 
    scala.Unit
  ]
  type MiddlewareFunction = js.Function3[
    /* req */ MiddlewareRequest, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ MiddlewareNextFunction, 
    scala.Unit
  ]
  type MiddlewareNextFunction = js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  type SerializeClientDoneFunction = js.Function2[/* err */ nodeLib.Error | scala.Null, /* id */ java.lang.String, scala.Unit]
  type SerializeClientFunction = js.Function2[/* client */ js.Any, /* done */ SerializeClientDoneFunction, scala.Unit]
  type ValidateFunction = js.Function3[
    /* clientId */ java.lang.String, 
    /* redirectURI */ java.lang.String, 
    /* validated */ js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* client */ js.UndefOr[js.Any], 
      /* redirectURI */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
