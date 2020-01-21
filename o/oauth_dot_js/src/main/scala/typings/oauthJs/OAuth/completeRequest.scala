package typings.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OAuth.completeRequest")
@js.native
object completeRequest extends js.Object {
  /**
    * Fill in parameters to help construct a request message.
    * This function doesn't fill in every parameter.
    * @param message Target request message.
    * @param accessor Accessor object. The accessorSecret property is optional.
    */
  def apply(message: Message, accessor: Accessor): Unit = js.native
}

