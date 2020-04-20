package typings.officeUiFabricReact

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSection extends js.Object {
  var section: Element
  var title: String
}

object AnonSection {
  @scala.inline
  def apply(section: Element, title: String): AnonSection = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSection]
  }
}

