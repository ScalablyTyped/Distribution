package typings.meteor.meteorMod.Meteor

import typings.meteor.AnonReturnStubValue
import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.meteorMod.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.apply")
@js.native
object apply extends js.Object {
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: AnonReturnStubValue[Result]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: AnonReturnStubValue[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[globalError | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
}

