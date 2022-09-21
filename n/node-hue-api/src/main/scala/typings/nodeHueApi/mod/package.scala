package typings.nodeHueApi.mod

import typings.nodeHueApi.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def nupnpSearch(): js.Promise[js.Array[IUpnpSearchResultItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nupnpSearch")().asInstanceOf[js.Promise[js.Array[IUpnpSearchResultItem]]]

inline def upnpSearch(timeout: Double): js.Array[IUpnpSearchResultItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("upnpSearch")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Array[IUpnpSearchResultItem]]

type BridgeApi = HueApi

type api = HueApi
