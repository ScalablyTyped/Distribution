package typings.pixiJs.PIXI

import typings.pixiJs.anon.LoadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoaderOptions extends js.Object {
  var crossOrigin: js.UndefOr[Boolean | String] = js.native
  var loadType: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[LoadElement] = js.native
  var xhrType: js.UndefOr[String] = js.native
}

object ILoaderOptions {
  @scala.inline
  def apply(): ILoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderOptions]
  }
  @scala.inline
  implicit class ILoaderOptionsOps[Self <: ILoaderOptions] (val x: Self) extends AnyVal {
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
    def setCrossOrigin(value: Boolean | String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setLoadType(value: Double): Self = this.set("loadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadType: Self = this.set("loadType", js.undefined)
    @scala.inline
    def setMetadata(value: LoadElement): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setXhrType(value: String): Self = this.set("xhrType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhrType: Self = this.set("xhrType", js.undefined)
  }
  
}

