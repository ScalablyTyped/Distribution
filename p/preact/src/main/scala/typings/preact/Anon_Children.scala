package typings.preact

import typings.preact.srcMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ComponentChildren
}

object Anon_Children {
  @scala.inline
  def apply(children: ComponentChildren = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

