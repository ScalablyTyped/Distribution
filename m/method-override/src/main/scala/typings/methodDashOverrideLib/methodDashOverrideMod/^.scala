package typings
package methodDashOverrideLib.methodDashOverrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    getter: java.lang.String | (js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      java.lang.String
    ])
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    getter: java.lang.String | (js.Function2[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      java.lang.String
    ]),
    options: methodDashOverrideLib.methodDashOverrideMod.eNs.MethodOverrideOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
}

