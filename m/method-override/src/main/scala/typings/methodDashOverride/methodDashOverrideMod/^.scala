package typings.methodDashOverride.methodDashOverrideMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(getter: String): RequestHandler = js.native
  def apply(getter: String, options: MethodOverrideOptions): RequestHandler = js.native
  def apply(getter: js.Function2[/* req */ Request, /* res */ Response, String]): RequestHandler = js.native
  def apply(
    getter: js.Function2[/* req */ Request, /* res */ Response, String],
    options: MethodOverrideOptions
  ): RequestHandler = js.native
}

