package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebWorkerOptions extends js.Object {
  /**
    * The data to send over when calling create on the module.
    */
  var createData: js.UndefOr[js.Any] = js.undefined
  /**
    * An object that can be used by the web worker to make calls back to the main thread.
    */
  var host: js.UndefOr[js.Any] = js.undefined
  /**
    * A label to be used to identify the web worker for debugging purposes.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The AMD moduleId to load.
    * It should export a function `create` that should return the exported proxy.
    */
  var moduleId: String
}

object IWebWorkerOptions {
  @scala.inline
  def apply(moduleId: String, createData: js.Any = null, host: js.Any = null, label: String = null): IWebWorkerOptions = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    if (createData != null) __obj.updateDynamic("createData")(createData.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebWorkerOptions]
  }
}

