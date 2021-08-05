package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createServer(): typings.oauth2orize.mod.OAuth2Server = typings.oauth2orize.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.oauth2orize.mod.OAuth2Server]
inline def createServer(options: typings.oauth2orize.mod.ServerOptions): typings.oauth2orize.mod.OAuth2Server = typings.oauth2orize.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.oauth2orize.mod.OAuth2Server]

type DecisionParseFunction = js.Function2[
/* req */ typings.oauth2orize.mod.MiddlewareRequest, 
/* done */ js.Function2[/* err */ typings.std.Error | scala.Null, /* params */ js.Any, scala.Unit], 
scala.Unit]

type DeserializeClientDoneFunction = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* client */ js.UndefOr[js.Any | scala.Boolean], 
scala.Unit]

type DeserializeClientFunction = js.Function2[
/* id */ java.lang.String, 
/* done */ typings.oauth2orize.mod.DeserializeClientDoneFunction, 
scala.Unit]

type ExchangeDoneFunction = js.Function4[
/* err */ typings.std.Error | scala.Null, 
/* accessToken */ js.UndefOr[java.lang.String | scala.Boolean], 
/* refreshToken */ js.UndefOr[java.lang.String], 
/* params */ js.UndefOr[js.Any], 
scala.Unit]

type ImmediateFunction = js.Function6[
/* client */ js.Any, 
/* user */ js.Any, 
/* scope */ js.Array[java.lang.String], 
/* type */ java.lang.String, 
/* areq */ js.Any, 
/* done */ js.Function4[
  /* err */ typings.std.Error | scala.Null, 
  /* allow */ scala.Boolean, 
  /* info */ js.Any, 
  /* locals */ js.Any, 
  scala.Unit
], 
scala.Unit]

type IssueExchangeCodeFunction = js.Function4[
/* client */ js.Any, 
/* code */ java.lang.String, 
/* redirectURI */ java.lang.String, 
/* issued */ typings.oauth2orize.mod.ExchangeDoneFunction, 
scala.Unit]

type IssueGrantCodeFunction = js.Function5[
/* client */ js.Any, 
/* redirectUri */ java.lang.String, 
/* user */ js.Any, 
/* res */ js.Any, 
/* issued */ js.Function2[
  /* err */ typings.std.Error | scala.Null, 
  /* code */ js.UndefOr[java.lang.String], 
  scala.Unit
], 
scala.Unit]

type IssueGrantTokenFunction = js.Function4[
/* client */ js.Any, 
/* user */ js.Any, 
/* ares */ js.Any, 
/* issued */ js.Function3[
  /* err */ typings.std.Error | scala.Null, 
  /* code */ js.UndefOr[java.lang.String], 
  /* params */ js.UndefOr[js.Any], 
  scala.Unit
], 
scala.Unit]

type MiddlewareErrorFunction = js.Function4[
/* err */ typings.std.Error, 
/* req */ typings.oauth2orize.mod.MiddlewareRequest, 
/* res */ typings.node.httpMod.ServerResponse, 
/* next */ typings.oauth2orize.mod.MiddlewareNextFunction, 
scala.Unit]

type MiddlewareFunction = js.Function3[
/* req */ typings.oauth2orize.mod.MiddlewareRequest, 
/* res */ typings.node.httpMod.ServerResponse, 
/* next */ typings.oauth2orize.mod.MiddlewareNextFunction, 
scala.Unit]

type MiddlewareNextFunction = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]

type SerializeClientDoneFunction = js.Function2[/* err */ typings.std.Error | scala.Null, /* id */ java.lang.String, scala.Unit]

type SerializeClientFunction = js.Function2[
/* client */ js.Any, 
/* done */ typings.oauth2orize.mod.SerializeClientDoneFunction, 
scala.Unit]

type ValidateFunction = js.Function3[
/* clientId */ java.lang.String, 
/* redirectURI */ java.lang.String, 
/* validated */ js.Function3[
  /* err */ typings.std.Error | scala.Null, 
  /* client */ js.UndefOr[js.Any], 
  /* redirectURI */ js.UndefOr[java.lang.String], 
  scala.Unit
], 
scala.Unit]
