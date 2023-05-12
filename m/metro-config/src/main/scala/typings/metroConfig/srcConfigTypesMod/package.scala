package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.PartialExtraTransformOpti
import typings.metroConfig.metroConfigStrings.BUNDLING_REQUEST
import typings.metroConfig.metroConfigStrings.HMR
import typings.metroConfig.metroConfigStrings.START_UP
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type GetTransformOptions = js.Function3[
/* entryPoints */ js.Array[String], 
/* options */ GetTransformOptionsOpts, 
/* getDependenciesOf */ js.Function1[/* filePath */ String, js.Promise[js.Array[String]]], 
js.Promise[PartialExtraTransformOpti]]

type MetroConfig = InputConfigT

type Middleware = js.Function3[
/* incomingMessage */ IncomingMessage, 
/* serverResponse */ ServerResponse[IncomingMessage], 
/* error */ js.Function1[/* e */ js.UndefOr[js.Error], Any], 
Any]

type PerfLoggerFactory = js.Function2[
/* type */ START_UP | BUNDLING_REQUEST | HMR, 
/* opts */ js.UndefOr[PerfLoggerFactoryOptions], 
RootPerfLogger]
