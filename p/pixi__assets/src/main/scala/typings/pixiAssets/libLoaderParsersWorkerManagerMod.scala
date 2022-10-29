package typings.pixiAssets

import typings.std.ImageBitmap
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersWorkerManagerMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/WorkerManager", "WorkerManager")
  @js.native
  val WorkerManager: WorkerManagerClass = js.native
  
  trait WorkerManagerClass extends StObject {
    
    /* private */ var _createdWorkers: Any
    
    /* private */ var _initWorkers: Any
    
    /* private */ var _initialized: Any
    
    /* private */ var _isImageBitmapSupported: Any
    
    /* private */ var _run: Any
    
    /* private */ var complete: Any
    
    /* private */ var getWorker: Any
    
    def isImageBitmapSupported(): js.Promise[Boolean]
    
    def loadImageBitmap(src: String): js.Promise[ImageBitmap]
    
    /* private */ var next: Any
    
    /* private */ val queue: Any
    
    /* private */ var resolveHash: Any
    
    /* private */ var returnWorker: Any
    
    var worker: Worker
    
    /* private */ val workerPool: Any
  }
  object WorkerManagerClass {
    
    inline def apply(
      _createdWorkers: Any,
      _initWorkers: Any,
      _initialized: Any,
      _isImageBitmapSupported: Any,
      _run: Any,
      complete: Any,
      getWorker: Any,
      isImageBitmapSupported: () => js.Promise[Boolean],
      loadImageBitmap: String => js.Promise[ImageBitmap],
      next: Any,
      queue: Any,
      resolveHash: Any,
      returnWorker: Any,
      worker: Worker,
      workerPool: Any
    ): WorkerManagerClass = {
      val __obj = js.Dynamic.literal(_createdWorkers = _createdWorkers.asInstanceOf[js.Any], _initWorkers = _initWorkers.asInstanceOf[js.Any], _initialized = _initialized.asInstanceOf[js.Any], _isImageBitmapSupported = _isImageBitmapSupported.asInstanceOf[js.Any], _run = _run.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], getWorker = getWorker.asInstanceOf[js.Any], isImageBitmapSupported = js.Any.fromFunction0(isImageBitmapSupported), loadImageBitmap = js.Any.fromFunction1(loadImageBitmap), next = next.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], resolveHash = resolveHash.asInstanceOf[js.Any], returnWorker = returnWorker.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any], workerPool = workerPool.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerManagerClass]
    }
    
    extension [Self <: WorkerManagerClass](x: Self) {
      
      inline def setComplete(value: Any): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setGetWorker(value: Any): Self = StObject.set(x, "getWorker", value.asInstanceOf[js.Any])
      
      inline def setIsImageBitmapSupported(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageBitmapSupported", js.Any.fromFunction0(value))
      
      inline def setLoadImageBitmap(value: String => js.Promise[ImageBitmap]): Self = StObject.set(x, "loadImageBitmap", js.Any.fromFunction1(value))
      
      inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Any): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setResolveHash(value: Any): Self = StObject.set(x, "resolveHash", value.asInstanceOf[js.Any])
      
      inline def setReturnWorker(value: Any): Self = StObject.set(x, "returnWorker", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: Worker): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerPool(value: Any): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
      
      inline def set_createdWorkers(value: Any): Self = StObject.set(x, "_createdWorkers", value.asInstanceOf[js.Any])
      
      inline def set_initWorkers(value: Any): Self = StObject.set(x, "_initWorkers", value.asInstanceOf[js.Any])
      
      inline def set_initialized(value: Any): Self = StObject.set(x, "_initialized", value.asInstanceOf[js.Any])
      
      inline def set_isImageBitmapSupported(value: Any): Self = StObject.set(x, "_isImageBitmapSupported", value.asInstanceOf[js.Any])
      
      inline def set_run(value: Any): Self = StObject.set(x, "_run", value.asInstanceOf[js.Any])
    }
  }
}
