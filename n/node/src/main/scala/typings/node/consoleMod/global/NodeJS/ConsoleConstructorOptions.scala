package typings.node.consoleMod.global.NodeJS

import typings.node.NodeJS.InspectOptions
import typings.node.NodeJS.WritableStream
import typings.node.nodeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleConstructorOptions extends js.Object {
  var colorMode: js.UndefOr[Boolean | auto] = js.native
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  var inspectOptions: js.UndefOr[InspectOptions] = js.native
  var stderr: js.UndefOr[WritableStream] = js.native
  var stdout: WritableStream = js.native
}

object ConsoleConstructorOptions {
  @scala.inline
  def apply(stdout: WritableStream): ConsoleConstructorOptions = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleConstructorOptions]
  }
  @scala.inline
  implicit class ConsoleConstructorOptionsOps[Self <: ConsoleConstructorOptions] (val x: Self) extends AnyVal {
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
    def setStdout(value: WritableStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorMode(value: Boolean | auto): Self = this.set("colorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMode: Self = this.set("colorMode", js.undefined)
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    @scala.inline
    def setInspectOptions(value: InspectOptions): Self = this.set("inspectOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectOptions: Self = this.set("inspectOptions", js.undefined)
    @scala.inline
    def setStderr(value: WritableStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
  }
  
}

