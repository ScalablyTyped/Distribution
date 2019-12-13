package typings.parse.Parse.Query

import typings.parse.Parse.Attributes
import typings.parse.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Query")
@js.native
object ^ extends js.Object {
  def and[U /* <: Object[Attributes] */](args: typings.parse.Parse.Query[U]*): typings.parse.Parse.Query[U] = js.native
  def fromJSON[U /* <: Object[Attributes] */](className: String, json: js.Any): typings.parse.Parse.Query[U] = js.native
  def nor[U /* <: Object[Attributes] */](args: typings.parse.Parse.Query[U]*): typings.parse.Parse.Query[U] = js.native
  def or[U /* <: Object[Attributes] */](var_args: typings.parse.Parse.Query[U]*): typings.parse.Parse.Query[U] = js.native
}

