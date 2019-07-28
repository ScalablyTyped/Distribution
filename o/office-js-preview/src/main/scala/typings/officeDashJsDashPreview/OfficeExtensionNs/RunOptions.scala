package typings.officeDashJsDashPreview.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOptions[T] extends js.Object {
  /**
    *  A previously-created context, or API object, or array of objects. 
    * The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up 
    * by `context.sync()`.
    */
  var previousObjects: js.UndefOr[ClientObject | js.Array[ClientObject] | ClientRequestContext] = js.undefined
  /**
    * The URL of the remote workbook and the request headers to be sent.
    */
  var session: js.UndefOr[RequestUrlAndHeaderInfo | T] = js.undefined
}

object RunOptions {
  @scala.inline
  def apply[T](
    previousObjects: ClientObject | js.Array[ClientObject] | ClientRequestContext = null,
    session: RequestUrlAndHeaderInfo | T = null
  ): RunOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (previousObjects != null) __obj.updateDynamic("previousObjects")(previousObjects.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOptions[T]]
  }
}

