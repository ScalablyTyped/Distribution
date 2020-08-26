package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoWebWorker[T] extends js.Object {
  /**
    * Terminate the web worker, thus invalidating the returned proxy.
    */
  def dispose(): Unit = js.native
  /**
    * Get a proxy to the arbitrary loaded code.
    */
  def getProxy(): js.Promise[T] = js.native
  /**
    * Synchronize (send) the models at `resources` to the web worker,
    * making them available in the monaco.worker.getMirrorModels().
    */
  def withSyncedResources(resources: js.Array[Uri]): js.Promise[T] = js.native
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
  @scala.inline
  implicit class MonacoWebWorkerOps[Self <: MonacoWebWorker[_], T] (val x: Self with MonacoWebWorker[T]) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProxy(value: () => js.Promise[T]): Self = this.set("getProxy", js.Any.fromFunction0(value))
    @scala.inline
    def setWithSyncedResources(value: js.Array[Uri] => js.Promise[T]): Self = this.set("withSyncedResources", js.Any.fromFunction1(value))
  }
  
}

