package typings.parcelWorkers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/workers", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WorkerFarm {
    def this(options: FarmOptions) = this()
    
    /* CompleteClass */
    override def end(): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelWorkers.parcelWorkersStrings.process
    - typings.parcelWorkers.parcelWorkersStrings.threads
  */
  trait BackendType extends StObject
  object BackendType {
    
    inline def process: typings.parcelWorkers.parcelWorkersStrings.process = "process".asInstanceOf[typings.parcelWorkers.parcelWorkersStrings.process]
    
    inline def threads: typings.parcelWorkers.parcelWorkersStrings.threads = "threads".asInstanceOf[typings.parcelWorkers.parcelWorkersStrings.threads]
  }
  
  trait FarmOptions extends StObject {
    
    var backend: BackendType
    
    var forcedKillTime: Double
    
    var maxConcurrentCallsPerWorker: Double
    
    var maxConcurrentWorkers: Double
    
    var shouldPatchConsole: js.UndefOr[Boolean] = js.undefined
    
    var shouldTrace: js.UndefOr[Boolean] = js.undefined
    
    var useLocalWorker: Boolean
    
    var warmWorkers: Boolean
    
    var workerPath: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ] = js.undefined
  }
  object FarmOptions {
    
    inline def apply(
      backend: BackendType,
      forcedKillTime: Double,
      maxConcurrentCallsPerWorker: Double,
      maxConcurrentWorkers: Double,
      useLocalWorker: Boolean,
      warmWorkers: Boolean
    ): FarmOptions = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], forcedKillTime = forcedKillTime.asInstanceOf[js.Any], maxConcurrentCallsPerWorker = maxConcurrentCallsPerWorker.asInstanceOf[js.Any], maxConcurrentWorkers = maxConcurrentWorkers.asInstanceOf[js.Any], useLocalWorker = useLocalWorker.asInstanceOf[js.Any], warmWorkers = warmWorkers.asInstanceOf[js.Any])
      __obj.asInstanceOf[FarmOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FarmOptions] (val x: Self) extends AnyVal {
      
      inline def setBackend(value: BackendType): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setForcedKillTime(value: Double): Self = StObject.set(x, "forcedKillTime", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentCallsPerWorker(value: Double): Self = StObject.set(x, "maxConcurrentCallsPerWorker", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentWorkers(value: Double): Self = StObject.set(x, "maxConcurrentWorkers", value.asInstanceOf[js.Any])
      
      inline def setShouldPatchConsole(value: Boolean): Self = StObject.set(x, "shouldPatchConsole", value.asInstanceOf[js.Any])
      
      inline def setShouldPatchConsoleUndefined: Self = StObject.set(x, "shouldPatchConsole", js.undefined)
      
      inline def setShouldTrace(value: Boolean): Self = StObject.set(x, "shouldTrace", value.asInstanceOf[js.Any])
      
      inline def setShouldTraceUndefined: Self = StObject.set(x, "shouldTrace", js.undefined)
      
      inline def setUseLocalWorker(value: Boolean): Self = StObject.set(x, "useLocalWorker", value.asInstanceOf[js.Any])
      
      inline def setWarmWorkers(value: Boolean): Self = StObject.set(x, "warmWorkers", value.asInstanceOf[js.Any])
      
      inline def setWorkerPath(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
      
      inline def setWorkerPathUndefined: Self = StObject.set(x, "workerPath", js.undefined)
    }
  }
  
  trait WorkerFarm extends StObject {
    
    def end(): js.Promise[Unit]
  }
  object WorkerFarm {
    
    inline def apply(end: () => js.Promise[Unit]): WorkerFarm = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
      __obj.asInstanceOf[WorkerFarm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkerFarm] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: () => js.Promise[Unit]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    }
  }
}
