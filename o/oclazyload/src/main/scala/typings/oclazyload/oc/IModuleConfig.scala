package typings.oclazyload.oc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModuleConfig extends IOptionsConfig {
  /**
    * The list of files to be loaded for this module.
    */
  var files: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the module for easy retrieval later.
    */
  var name: js.UndefOr[String] = js.native
}

object IModuleConfig {
  @scala.inline
  def apply(): IModuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModuleConfig]
  }
  @scala.inline
  implicit class IModuleConfigOps[Self <: IModuleConfig] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

