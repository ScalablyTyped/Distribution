package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonacoWebWorker[T] extends js.Object {
  /**
    * Terminate the web worker, thus invalidating the returned proxy.
    */
  def dispose(): Unit
  /**
    * Get a proxy to the arbitrary loaded code.
    */
  def getProxy(): js.Promise[T]
  /**
    * Synchronize (send) the models at `resources` to the web worker,
    * making them available in the monaco.worker.getMirrorModels().
    */
  def withSyncedResources(resources: js.Array[Uri]): js.Promise[T]
}

object MonacoWebWorker {
  @scala.inline
  def apply[T](
    dispose: () => Unit,
    getProxy: () => js.Promise[T],
    withSyncedResources: js.Array[Uri] => js.Promise[T]
  ): MonacoWebWorker[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getProxy = js.Any.fromFunction0(getProxy), withSyncedResources = js.Any.fromFunction1(withSyncedResources))
  
    __obj.asInstanceOf[MonacoWebWorker[T]]
  }
}

