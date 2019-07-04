package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashZendeskMod {
  type ZendeskCallback[TResponse, TResult] = js.Function3[
    /* error */ js.UndefOr[stdLib.Error], 
    /* response */ TResponse, 
    /* result */ TResult, 
    scala.Unit
  ]
  type ZendeskID = scala.Double
}
