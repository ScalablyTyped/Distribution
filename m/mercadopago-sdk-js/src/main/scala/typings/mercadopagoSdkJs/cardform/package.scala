package typings.mercadopagoSdkJs.cardform

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CardFormListeners = js.Array[CardFormListener]

type EventListener = js.Function1[/* evt */ Event, Unit]

type FechingCallback = js.Function0[Any]

type OnBinChange = js.Function1[/* bin */ String, Unit]

type OnCardTokenReceived = js.Function2[
/* error */ js.UndefOr[Error], 
/* response */ js.UndefOr[CardTokenResponseCardForm], 
Unit]

type OnError = js.Function2[/* error */ js.UndefOr[js.Array[Error]], /* event */ js.UndefOr[String], Unit]

type OnFetching = js.Function1[/* name */ String, FechingCallback]

type OnFormMounted = js.Function1[/* error */ js.UndefOr[Error], Unit]

type OnFormUnmounted = js.Function1[/* error */ js.UndefOr[Error], Unit]

type OnIdentificationTypesReceived = js.Function2[
/* error */ js.UndefOr[Error], 
/* response */ js.UndefOr[js.Array[IdentificationTypesResponseCardForm]], 
Unit]

type OnInstallmentsReceived = js.Function2[
/* error */ js.UndefOr[Error], 
/* response */ js.UndefOr[InstallmentsResponseCardForm], 
Unit]

type OnIssuersReceived = js.Function2[
/* error */ js.UndefOr[Error], 
/* response */ js.UndefOr[js.Array[IssuersResponseCardForm]], 
Unit]

type OnPaymentMethodsReceived = js.Function2[
/* error */ js.UndefOr[Error], 
/* response */ js.UndefOr[js.Array[PaymentMethodsResponseCardForm]], 
Unit]

type OnReady = js.Function0[Unit]

type OnSubmit = js.Function1[/* event */ Event, Unit]

type OnValidityChange = js.Function2[/* error */ js.UndefOr[js.Array[Error]], /* field */ js.UndefOr[String], Unit]
