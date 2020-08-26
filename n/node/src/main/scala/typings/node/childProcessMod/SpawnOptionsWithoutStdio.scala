package typings.node.childProcessMod

import typings.node.nodeStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnOptionsWithoutStdio extends SpawnOptions {
  @JSName("stdio")
  var stdio_SpawnOptionsWithoutStdio: js.UndefOr[pipe | (js.Array[js.UndefOr[Null | pipe]])] = js.native
}

object SpawnOptionsWithoutStdio {
  @scala.inline
  def apply(): SpawnOptionsWithoutStdio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptionsWithoutStdio]
  }
  @scala.inline
  implicit class SpawnOptionsWithoutStdioOps[Self <: SpawnOptionsWithoutStdio] (val x: Self) extends AnyVal {
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
    def setStdioVarargs(value: (js.UndefOr[Null | pipe])*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: pipe | (js.Array[js.UndefOr[Null | pipe]])): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
  }
  
}

