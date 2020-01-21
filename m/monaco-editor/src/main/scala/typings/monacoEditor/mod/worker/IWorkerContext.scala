package typings.monacoEditor.mod.worker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkerContext[H] extends js.Object {
  /**
    * A proxy to the main thread host object.
    */
  var host: H
  /**
    * Get all available mirror models in this worker.
    */
  def getMirrorModels(): js.Array[IMirrorModel]
}

object IWorkerContext {
  @scala.inline
  def apply[H](getMirrorModels: () => js.Array[IMirrorModel], host: H): IWorkerContext[H] = {
    val __obj = js.Dynamic.literal(getMirrorModels = js.Any.fromFunction0(getMirrorModels), host = host.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWorkerContext[H]]
  }
}

