package typings
package opentokLib.opentokMod.OpenTokNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArchiveLayoutOptions extends ArchiveLayoutOptions {
  var stylesheet: java.lang.String
  var `type`: opentokLib.opentokLibStrings.custom
}

object CustomArchiveLayoutOptions {
  @scala.inline
  def apply(stylesheet: java.lang.String, `type`: opentokLib.opentokLibStrings.custom): CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CustomArchiveLayoutOptions]
  }
}

