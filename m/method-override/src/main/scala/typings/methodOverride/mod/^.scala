package typings.methodOverride.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("method-override", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: String): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: String, options: MethodOverrideOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(getter: js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_[_], String]): RequestHandler[ParamsDictionary] = js.native
  def apply(
    getter: js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_[_], String],
    options: MethodOverrideOptions
  ): RequestHandler[ParamsDictionary] = js.native
}

