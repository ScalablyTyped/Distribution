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

