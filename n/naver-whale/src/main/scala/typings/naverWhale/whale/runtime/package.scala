package typings.naverWhale.whale.runtime

import org.scalablytyped.runtime.NumberDictionary
import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ExtensionConnectEvent = Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, Unit]]

type ExtensionMessageEvent = Event[
js.Function3[
  /* message */ Any, 
  /* sender */ typings.chrome.chrome.runtime.MessageSender, 
  /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
  Unit
]]

type Manifest = typings.chrome.chrome.runtime.ManifestV2 | typings.chrome.chrome.runtime.ManifestV3

type ManifestIcons = NumberDictionary[String]

type PortDisconnectEvent = Event[js.Function1[/* port */ typings.chrome.chrome.runtime.Port, Unit]]

type PortMessageEvent = Event[
js.Function2[/* message */ Any, /* port */ typings.chrome.chrome.runtime.Port, Unit]]

type RuntimeEvent = Event[js.Function0[Unit]]

type RuntimeInstalledEvent = Event[js.Function1[/* details */ typings.chrome.chrome.runtime.InstalledDetails, Unit]]

type RuntimeRestartRequiredEvent = Event[js.Function1[/* reason */ String, Unit]]

type RuntimeUpdateAvailableEvent = Event[
js.Function1[/* details */ typings.chrome.chrome.runtime.UpdateAvailableDetails, Unit]]
