package typings.morgan

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object morganMod {
  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ Request, 
    /* res */ Response, 
    js.UndefOr[String | Null]
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  type TokenIndexer = StringDictionary[TokenCallbackFn]
}
