package typings.pathDashType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathDashTypeMod {
  type PathTypeFunction = js.Function1[/* path */ String, js.Promise[Boolean]]
  type PathTypeSyncFunction = js.Function1[/* path */ String, Boolean]
}
