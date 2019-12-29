package typings.meteor.meteorMeteorMod.Meteor

import typings.meteor.Anon_ErrorOnResultReceivedResult
import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.meteorMeteorMod.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.apply")
@js.native
object apply extends js.Object {
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Anon_ErrorOnResultReceivedResult[Result]
  ): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: Anon_ErrorOnResultReceivedResult[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[global_Error | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
}

