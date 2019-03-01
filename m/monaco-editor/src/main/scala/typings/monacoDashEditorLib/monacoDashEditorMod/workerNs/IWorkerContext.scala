package typings
package monacoDashEditorLib.monacoDashEditorMod.workerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkerContext extends js.Object {
  /**
    * Get all available mirror models in this worker.
    */
  def getMirrorModels(): js.Array[IMirrorModel]
}

object IWorkerContext {
  @scala.inline
  def apply(getMirrorModels: js.Function0[js.Array[IMirrorModel]]): IWorkerContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMirrorModels")(getMirrorModels)
    __obj.asInstanceOf[IWorkerContext]
  }
}

