package typings
package officeDashJsDashPreviewLib.OfficeExtensionNs

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

