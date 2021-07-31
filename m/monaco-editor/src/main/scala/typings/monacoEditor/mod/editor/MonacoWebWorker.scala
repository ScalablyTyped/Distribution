package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonacoWebWorker[T] extends StObject {
  
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
  
  @scala.inline
  implicit class MonacoWebWorkerMutableBuilder[Self <: MonacoWebWorker[?], T] (val x: Self & MonacoWebWorker[T]) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxy(value: () => js.Promise[T]): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithSyncedResources(value: js.Array[Uri] => js.Promise[T]): Self = StObject.set(x, "withSyncedResources", js.Any.fromFunction1(value))
  }
}
