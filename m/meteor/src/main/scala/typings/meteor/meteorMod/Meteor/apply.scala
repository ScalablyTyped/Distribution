package typings.meteor.meteorMod.Meteor

import typings.meteor.EJSONable
import typings.meteor.EJSONableProperty
import typings.meteor.anon.OnResultReceived
import typings.meteor.meteorMod.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/meteor", "Meteor.apply")
@js.native
object apply extends js.Object {
  
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: js.UndefOr[scala.Nothing],
    asyncCallback: js.Function2[/* error */ js.UndefOr[globalError | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: OnResultReceived[Result]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: OnResultReceived[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[globalError | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
}
