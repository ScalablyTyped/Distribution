package typings.mdast.mod

import typings.mdast.mdastStrings.definition
import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition
  extends DefinitionContent
     with Node
     with Association
     with Resource {
  @JSName("type")
  var type_Definition: definition = js.native
}

object Definition {
  @scala.inline
  def apply(identifier: String, `type`: definition, url: String): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: definition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

