package typings.officeUiFabricReact.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Section extends js.Object {
  var section: Element
  var title: String
}

object Section {
  @scala.inline
  def apply(section: Element, title: String): Section = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
}

