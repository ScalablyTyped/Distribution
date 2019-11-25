package typings.opentok.opentokMod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.custom
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.opentok.opentokMod.PredefinedArchiveLayoutOptions
  - typings.opentok.opentokMod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends js.Object

object ArchiveLayoutOptions {
  @scala.inline
  def PredefinedArchiveLayoutOptions(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): ArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveLayoutOptions]
  }
  @scala.inline
  def CustomArchiveLayoutOptions(stylesheet: String, `type`: custom): ArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveLayoutOptions]
  }
}

