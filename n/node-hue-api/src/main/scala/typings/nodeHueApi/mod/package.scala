package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def nupnpSearch(): js.Promise[js.Array[typings.nodeHueApi.mod.IUpnpSearchResultItem]] = typings.nodeHueApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nupnpSearch")().asInstanceOf[js.Promise[js.Array[typings.nodeHueApi.mod.IUpnpSearchResultItem]]]

@scala.inline
def upnpSearch(timeout: scala.Double): js.Array[typings.nodeHueApi.mod.IUpnpSearchResultItem] = typings.nodeHueApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upnpSearch")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.nodeHueApi.mod.IUpnpSearchResultItem]]

type BridgeApi = typings.nodeHueApi.mod.HueApi

type api = typings.nodeHueApi.mod.HueApi
