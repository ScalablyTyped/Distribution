package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.cryptoMod.KeyObject
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import typings.openidClient.anon.Country
import typings.openidClient.anon.OmitRequestOptionskeyofUR
import typings.std.InstanceType
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Address[ExtendedAddress /* <: js.Object */] = Override[Country, ExtendedAddress]

type Client = InstanceType[TypeOfGenericClient[BaseClient]]

type CustomHttpOptionsProvider = js.Function2[/* url */ URL_, /* options */ OmitRequestOptionskeyofUR, HttpOptions]

type DPoPInput = KeyObject | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<openid-client.anon.FnCall>[0] */ js.Any)

type KnownKeys[T] = Any

type Override[T1, T2] = (Omit[
T1, 
/* keyof std.Omit<T2, keyof openid-client.openid-client.KnownKeys<T2>> */ String]) & T2

/* Rewritten from type alias, can be one of: 
  - typings.openidClient.openidClientStrings.code
  - typings.openidClient.openidClientStrings.id_token
  - typings.openidClient.openidClientStrings.`code id_token`
  - typings.openidClient.openidClientStrings.none
  - java.lang.String
*/
type ResponseType = _ResponseType | String

type RetryFunction = js.Function2[/* retry */ Double, /* error */ js.Error, Double]

type StrategyVerifyCallback[TUser] = js.Function2[
/* tokenset */ TokenSet, 
/* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[TUser], Unit], 
Unit]

type StrategyVerifyCallbackReq[TUser] = js.Function3[
/* req */ IncomingMessage, 
/* tokenset */ TokenSet, 
/* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[TUser], Unit], 
Unit]

type StrategyVerifyCallbackReqUserInfo[TUser, TUserInfo /* <: js.Object */, TAddress /* <: js.Object */] = js.Function4[
/* req */ IncomingMessage, 
/* tokenset */ TokenSet, 
/* userinfo */ UserinfoResponse[TUserInfo, TAddress], 
/* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[TUser], Unit], 
Unit]

type StrategyVerifyCallbackUserInfo[TUser, TUserInfo /* <: js.Object */, TAddress /* <: js.Object */] = js.Function3[
/* tokenset */ TokenSet, 
/* userinfo */ UserinfoResponse[TUserInfo, TAddress], 
/* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[TUser], Unit], 
Unit]

/* Rewritten from type alias, can be one of: 
  - typings.openidClient.openidClientStrings.access_token
  - typings.openidClient.openidClientStrings.refresh_token
  - java.lang.String
*/
type TokenTypeHint = _TokenTypeHint | String

type UnknownObject = StringDictionary[Any]

type UserinfoResponse[UserInfo /* <: js.Object */, ExtendedAddress /* <: js.Object */] = Override[typings.openidClient.anon.Address[ExtendedAddress], UserInfo]
