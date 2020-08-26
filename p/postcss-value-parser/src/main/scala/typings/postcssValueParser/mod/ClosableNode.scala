package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosableNode extends js.Object {
  /**
    * Whether the parsed CSS value ended before the node was properly closed
    */
  var unclosed: js.UndefOr[`true`] = js.native
}

object ClosableNode {
  @scala.inline
  def apply(): ClosableNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosableNode]
  }
  @scala.inline
  implicit class ClosableNodeOps[Self <: ClosableNode] (val x: Self) extends AnyVal {
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
    def setUnclosed(value: `true`): Self = this.set("unclosed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnclosed: Self = this.set("unclosed", js.undefined)
  }
  
}

