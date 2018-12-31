package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
trait CustomPreview extends js.Object {
  var bindRemoteObjectFunctionId: RemoteObjectId
  var configObjectId: js.UndefOr[RemoteObjectId] = js.undefined
  var formatterObjectId: RemoteObjectId
  var hasBody: scala.Boolean
  var header: java.lang.String
}

