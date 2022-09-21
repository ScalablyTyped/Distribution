package typings.nodeZendesk.mod

import typings.nodeZendesk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(config: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[Client]

type GroupID = Double

type ZendeskCallback[TResponse, TResult] = js.Function3[/* error */ js.UndefOr[js.Error], /* response */ TResponse, /* result */ TResult, Unit]

type ZendeskID = Double
