package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredefinedArchiveLayoutOptions extends ArchiveLayoutOptions {
  var `type`: opentokLib.opentokLibStrings.bestFit | opentokLib.opentokLibStrings.pip | opentokLib.opentokLibStrings.verticalPresentation | opentokLib.opentokLibStrings.horizontalPresentation
}

object PredefinedArchiveLayoutOptions {
  @scala.inline
  def apply(
    `type`: opentokLib.opentokLibStrings.bestFit | opentokLib.opentokLibStrings.pip | opentokLib.opentokLibStrings.verticalPresentation | opentokLib.opentokLibStrings.horizontalPresentation
  ): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
}

