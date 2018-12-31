package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtendedError
  extends nodeLib.Error {
  var details: js.UndefOr[js.Object] = js.undefined
  var notFound: js.UndefOr[scala.Boolean] = js.undefined
}

