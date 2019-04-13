package typings
package morganLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object morganMod {
  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    java.lang.String
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = org.scalablytyped.runtime.StringDictionary[TokenCallbackFn]
}
