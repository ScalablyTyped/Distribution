package typings.nodeZendesk

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
}
