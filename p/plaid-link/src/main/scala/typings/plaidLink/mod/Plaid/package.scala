package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type OnEvent = js.Function2[/* eventName */ EventName, /* metadata */ OnEventMetaData, Unit]

type OnExit = js.Function2[/* error */ Error | Null, /* metadata */ OnExitMetaData, Unit]

type OnLoad = js.Function0[Unit]

type OnSuccess = js.Function2[/* public_token */ String, /* metadata */ OnSuccessMetaData, Unit]
