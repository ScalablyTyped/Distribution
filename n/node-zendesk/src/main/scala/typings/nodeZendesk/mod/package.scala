package typings.nodeZendesk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ZendeskCallback[TResponse, TResult] = js.Function3[
    /* error */ js.UndefOr[typings.std.Error], 
    /* response */ TResponse, 
    /* result */ TResult, 
    scala.Unit
  ]
  
  type ZendeskID = scala.Double
  
  @scala.inline
  def createClient(config: typings.nodeZendesk.mod.ClientOptions): typings.nodeZendesk.mod.Client = typings.nodeZendesk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[typings.nodeZendesk.mod.Client]
}
