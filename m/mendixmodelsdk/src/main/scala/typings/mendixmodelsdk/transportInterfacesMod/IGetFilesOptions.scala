package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.json
import typings.mendixmodelsdk.mendixmodelsdkStrings.zip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetFilesOptions extends js.Object {
  var filter: js.UndefOr[String] = js.native
  var format: js.UndefOr[json | zip] = js.native
  var path: js.UndefOr[String] = js.native
}

object IGetFilesOptions {
  @scala.inline
  def apply(): IGetFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetFilesOptions]
  }
  @scala.inline
  implicit class IGetFilesOptionsOps[Self <: IGetFilesOptions] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormat(value: json | zip): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

