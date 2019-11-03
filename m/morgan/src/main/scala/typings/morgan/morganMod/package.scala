package typings.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object morganMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    js.UndefOr[String | Null]
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  type TokenIndexer = StringDictionary[TokenCallbackFn]
}
