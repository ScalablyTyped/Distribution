package typings.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn = js.Function3[
    /* tokens */ typings.morgan.mod.TokenIndexer, 
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = org.scalablytyped.runtime.StringDictionary[typings.morgan.mod.TokenCallbackFn]
}
