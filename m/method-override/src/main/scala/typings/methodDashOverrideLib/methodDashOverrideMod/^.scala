package typings
package methodDashOverrideLib.methodDashOverrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(
    getter: java.lang.String | (js.Function2[
      /* req */ expressLib.expressMod.Request, 
      /* res */ expressLib.expressMod.Response, 
      java.lang.String
    ])
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(
    getter: java.lang.String | (js.Function2[
      /* req */ expressLib.expressMod.Request, 
      /* res */ expressLib.expressMod.Response, 
      java.lang.String
    ]),
    options: MethodOverrideOptions
  ): expressLib.expressMod.RequestHandler = js.native
}

