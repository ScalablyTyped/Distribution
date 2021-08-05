package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(config: typings.nodeZendesk.mod.ClientOptions): typings.nodeZendesk.mod.Client = typings.nodeZendesk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[typings.nodeZendesk.mod.Client]

type ZendeskCallback[TResponse, TResult] = js.Function3[
/* error */ js.UndefOr[typings.std.Error], 
/* response */ TResponse, 
/* result */ TResult, 
scala.Unit]

type ZendeskID = scala.Double
