package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3des extends js.Object {
  var algorithm: js.UndefOr[
    nodeDashForgeLib.nodeDashForgeLibStrings.aes128 | nodeDashForgeLib.nodeDashForgeLibStrings.aes192 | nodeDashForgeLib.nodeDashForgeLibStrings.aes256 | nodeDashForgeLib.nodeDashForgeLibStrings.`3des`
  ] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var generateLocalKeyId: js.UndefOr[scala.Boolean] = js.undefined
  var localKeyId: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.Hex] = js.undefined
  var saltSize: js.UndefOr[scala.Double] = js.undefined
  var useMac: js.UndefOr[scala.Boolean] = js.undefined
}

