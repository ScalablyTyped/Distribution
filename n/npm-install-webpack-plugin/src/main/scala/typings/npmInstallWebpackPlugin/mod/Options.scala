package typings.npmInstallWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Use --save or --save-dev
    * @default false
    */
  var dev: js.UndefOr[Boolean | DevFunction] = js.native
  /**
    * npm command used inside company, yarn is not supported yet
    */
  var npm: js.UndefOr[String] = js.native
  /**
    * Install missing peerDependencies
    * @default true
    */
  var peerDependencies: js.UndefOr[Boolean] = js.native
  /**
    * Reduce amount of console logging
    * @default false
    */
  var quiet: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDevFunction2(value: (/* module */ String, /* path */ String) => Boolean): Self = this.set("dev", js.Any.fromFunction2(value))
    @scala.inline
    def setDev(value: Boolean | DevFunction): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    @scala.inline
    def setNpm(value: String): Self = this.set("npm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpm: Self = this.set("npm", js.undefined)
    @scala.inline
    def setPeerDependencies(value: Boolean): Self = this.set("peerDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerDependencies: Self = this.set("peerDependencies", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
  }
  
}

