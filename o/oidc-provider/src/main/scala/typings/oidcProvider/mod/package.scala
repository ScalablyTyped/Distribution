package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.oidcProviderStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdapterFactory = js.Function1[/* name */ String, Adapter]

type CanBePromise[T] = js.Promise[T] | T

type FindAccount = js.Function3[
/* ctx */ KoaContextWithOIDC, 
/* sub */ String, 
/* token */ js.UndefOr[AuthorizationCode | AccessToken | DeviceCode | BackchannelAuthenticationRequest], 
CanBePromise[js.UndefOr[Account]]]

type IssueRegistrationAccessTokenFunction = js.Function2[/* ctx */ KoaContextWithOIDC, /* client */ Client, Boolean]

type NoneAlg = none

type RotateRegistrationAccessTokenFunction = js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]]

/* Rewritten from type alias, can be one of: 
  - typings.oidcProvider.mod.AsymmetricSigningAlgorithm
  - typings.oidcProvider.mod.SymmetricSigningAlgorithm
  - typings.oidcProvider.mod.NoneAlg
*/
type SigningAlgorithmWithNone = _SigningAlgorithmWithNone | NoneAlg

type TTLFunction[T] = js.Function3[/* ctx */ KoaContextWithOIDC, /* token */ T, /* client */ Client, Double]

type UnknownObject = StringDictionary[Any]
