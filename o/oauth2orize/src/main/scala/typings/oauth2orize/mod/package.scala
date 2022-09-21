package typings.oauth2orize.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.oauth2orize.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createServer(): OAuth2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[OAuth2Server]
inline def createServer(options: ServerOptions): OAuth2Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[OAuth2Server]

type DecisionParseFunction = js.Function2[
/* req */ MiddlewareRequest, 
/* done */ js.Function2[/* err */ js.Error | Null, /* params */ Any, Unit], 
Unit]

type DeserializeClientDoneFunction = js.Function2[/* err */ js.Error | Null, /* client */ js.UndefOr[Any | Boolean], Unit]

type DeserializeClientFunction = js.Function2[/* id */ String, /* done */ DeserializeClientDoneFunction, Unit]

type ExchangeDoneFunction = js.Function4[
/* err */ js.Error | Null, 
/* accessToken */ js.UndefOr[String | Boolean], 
/* refreshToken */ js.UndefOr[String], 
/* params */ js.UndefOr[Any], 
Unit]

type ImmediateFunction = js.Function6[
/* client */ Any, 
/* user */ Any, 
/* scope */ js.Array[String], 
/* type */ String, 
/* areq */ Any, 
/* done */ js.Function4[/* err */ js.Error | Null, /* allow */ Boolean, /* info */ Any, /* locals */ Any, Unit], 
Unit]

type IssueExchangeCodeFunction = js.Function4[
/* client */ Any, 
/* code */ String, 
/* redirectURI */ String, 
/* issued */ ExchangeDoneFunction, 
Unit]

type IssueGrantCodeFunction = js.Function5[
/* client */ Any, 
/* redirectUri */ String, 
/* user */ Any, 
/* res */ Any, 
/* issued */ js.Function2[/* err */ js.Error | Null, /* code */ js.UndefOr[String], Unit], 
Unit]

type IssueGrantTokenFunction = js.Function4[
/* client */ Any, 
/* user */ Any, 
/* ares */ Any, 
/* issued */ js.Function3[
  /* err */ js.Error | Null, 
  /* code */ js.UndefOr[String], 
  /* params */ js.UndefOr[Any], 
  Unit
], 
Unit]

type MiddlewareErrorFunction = js.Function4[
/* err */ js.Error, 
/* req */ MiddlewareRequest, 
/* res */ ServerResponse[IncomingMessage], 
/* next */ MiddlewareNextFunction, 
Unit]

type MiddlewareFunction = js.Function3[
/* req */ MiddlewareRequest, 
/* res */ ServerResponse[IncomingMessage], 
/* next */ MiddlewareNextFunction, 
Unit]

type MiddlewareNextFunction = js.Function1[/* err */ js.UndefOr[js.Error], Unit]

type SerializeClientDoneFunction = js.Function2[/* err */ js.Error | Null, /* id */ String, Unit]

type SerializeClientFunction = js.Function2[/* client */ Any, /* done */ SerializeClientDoneFunction, Unit]

type ValidateFunction = js.Function3[
/* clientId */ String, 
/* redirectURI */ String, 
/* validated */ js.Function3[
  /* err */ js.Error | Null, 
  /* client */ js.UndefOr[Any], 
  /* redirectURI */ js.UndefOr[String], 
  Unit
], 
Unit]
