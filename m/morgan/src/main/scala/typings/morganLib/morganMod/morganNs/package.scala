package typings
package morganLib.morganMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object morganNs {
  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    java.lang.String
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
}
