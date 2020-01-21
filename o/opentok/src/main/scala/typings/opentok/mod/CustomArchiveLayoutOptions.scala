package typings.opentok.mod

import typings.opentok.opentokStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArchiveLayoutOptions extends ArchiveLayoutOptions {
  var stylesheet: String
  var `type`: custom
}

object CustomArchiveLayoutOptions {
  @scala.inline
  def apply(stylesheet: String, `type`: custom): CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArchiveLayoutOptions]
  }
}

