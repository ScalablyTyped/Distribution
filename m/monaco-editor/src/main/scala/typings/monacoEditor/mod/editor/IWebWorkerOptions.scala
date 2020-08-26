package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebWorkerOptions extends js.Object {
  /**
    * The data to send over when calling create on the module.
    */
  var createData: js.UndefOr[js.Any] = js.native
  /**
    * An object that can be used by the web worker to make calls back to the main thread.
    */
  var host: js.UndefOr[js.Any] = js.native
  /**
    * Keep idle models.
    * Defaults to false, which means that idle models will stop syncing after a while.
    */
  var keepIdleModels: js.UndefOr[Boolean] = js.native
  /**
    * A label to be used to identify the web worker for debugging purposes.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The AMD moduleId to load.
    * It should export a function `create` that should return the exported proxy.
    */
  var moduleId: String = js.native
}

object IWebWorkerOptions {
  @scala.inline
  def apply(moduleId: String): IWebWorkerOptions = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebWorkerOptions]
  }
  @scala.inline
  implicit class IWebWorkerOptionsOps[Self <: IWebWorkerOptions] (val x: Self) extends AnyVal {
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
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateData(value: js.Any): Self = this.set("createData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateData: Self = this.set("createData", js.undefined)
    @scala.inline
    def setHost(value: js.Any): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setKeepIdleModels(value: Boolean): Self = this.set("keepIdleModels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepIdleModels: Self = this.set("keepIdleModels", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

