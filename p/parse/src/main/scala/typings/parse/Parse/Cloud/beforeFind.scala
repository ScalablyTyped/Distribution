package typings.parse.Parse.Cloud

import typings.parse.Parse.Object
import typings.parse.Parse.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Cloud.beforeFind")
@js.native
object beforeFind extends js.Object {
  def apply(arg1: js.Any): Unit = js.native
  def apply(
    arg1: js.Any,
    func: js.Function1[
      /* request */ BeforeFindRequest, 
      (js.Promise[Query[Object] | Unit]) | Query[Object] | Unit
    ]
  ): Unit = js.native
}

