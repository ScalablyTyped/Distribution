package typings.npmWhich.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the `npmwhich`-module.
  */
@js.native
trait StaticWhichOptions extends js.Object {
  /**
    * The directory to find the binary for.
    */
  var cwd: String = js.native
  /**
    * The environment to use for resolving the binary.
    */
  var env: js.UndefOr[ProcessEnv] = js.native
}

object StaticWhichOptions {
  @scala.inline
  def apply(cwd: String): StaticWhichOptions = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticWhichOptions]
  }
  @scala.inline
  implicit class StaticWhichOptionsOps[Self <: StaticWhichOptions] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
  }
  
}

