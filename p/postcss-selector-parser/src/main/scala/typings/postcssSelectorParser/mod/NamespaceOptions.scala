package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceOptions[Value /* <: js.UndefOr[String] */] extends NodeOptions[Value] {
  var namespace: js.UndefOr[String | `true`] = js.native
}

object NamespaceOptions {
  @scala.inline
  def apply[/* <: js.UndefOr[java.lang.String] */ Value](value: Value): NamespaceOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceOptions[Value]]
  }
  @scala.inline
  implicit class NamespaceOptionsOps[Self <: NamespaceOptions[_], /* <: js.UndefOr[java.lang.String] */ Value] (val x: Self with NamespaceOptions[Value]) extends AnyVal {
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
    def setNamespace(value: String | `true`): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
  
}

