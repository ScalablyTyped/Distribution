package typings.next.nextServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConstructor extends js.Object {
  /**
    * Object what you would use in next.config.js - @default {}
    */
  var conf: js.UndefOr[NextConfig] = js.native
  var customServer: js.UndefOr[Boolean] = js.native
  var dev: js.UndefOr[Boolean] = js.native
  /**
    * Where the Next project is located - @default '.'
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Hide error messages containing server information - @default false
    */
  var quiet: js.UndefOr[Boolean] = js.native
}

object ServerConstructor {
  @scala.inline
  def apply(): ServerConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerConstructor]
  }
  @scala.inline
  implicit class ServerConstructorOps[Self <: ServerConstructor] (val x: Self) extends AnyVal {
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
    def setConf(value: NextConfig): Self = this.set("conf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConf: Self = this.set("conf", js.undefined)
    @scala.inline
    def setCustomServer(value: Boolean): Self = this.set("customServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomServer: Self = this.set("customServer", js.undefined)
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
  }
  
}

