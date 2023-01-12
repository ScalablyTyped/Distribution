package typings.parcelCore

import typings.parcelWorkers.mod.BackendType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@parcel/workers.@parcel/workers.FarmOptions> */
  trait PartialFarmOptions extends StObject {
    
    var backend: js.UndefOr[BackendType] = js.undefined
    
    var forcedKillTime: js.UndefOr[Double] = js.undefined
    
    var maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.undefined
    
    var maxConcurrentWorkers: js.UndefOr[Double] = js.undefined
    
    var shouldPatchConsole: js.UndefOr[Boolean] = js.undefined
    
    var useLocalWorker: js.UndefOr[Boolean] = js.undefined
    
    var warmWorkers: js.UndefOr[Boolean] = js.undefined
    
    var workerPath: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ] = js.undefined
  }
  object PartialFarmOptions {
    
    inline def apply(): PartialFarmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFarmOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFarmOptions] (val x: Self) extends AnyVal {
      
      inline def setBackend(value: BackendType): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
      
      inline def setForcedKillTime(value: Double): Self = StObject.set(x, "forcedKillTime", value.asInstanceOf[js.Any])
      
      inline def setForcedKillTimeUndefined: Self = StObject.set(x, "forcedKillTime", js.undefined)
      
      inline def setMaxConcurrentCallsPerWorker(value: Double): Self = StObject.set(x, "maxConcurrentCallsPerWorker", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentCallsPerWorkerUndefined: Self = StObject.set(x, "maxConcurrentCallsPerWorker", js.undefined)
      
      inline def setMaxConcurrentWorkers(value: Double): Self = StObject.set(x, "maxConcurrentWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrentWorkersUndefined: Self = StObject.set(x, "maxConcurrentWorkers", js.undefined)
      
      inline def setShouldPatchConsole(value: Boolean): Self = StObject.set(x, "shouldPatchConsole", value.asInstanceOf[js.Any])
      
      inline def setShouldPatchConsoleUndefined: Self = StObject.set(x, "shouldPatchConsole", js.undefined)
      
      inline def setUseLocalWorker(value: Boolean): Self = StObject.set(x, "useLocalWorker", value.asInstanceOf[js.Any])
      
      inline def setUseLocalWorkerUndefined: Self = StObject.set(x, "useLocalWorker", js.undefined)
      
      inline def setWarmWorkers(value: Boolean): Self = StObject.set(x, "warmWorkers", value.asInstanceOf[js.Any])
      
      inline def setWarmWorkersUndefined: Self = StObject.set(x, "warmWorkers", js.undefined)
      
      inline def setWorkerPath(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
      
      inline def setWorkerPathUndefined: Self = StObject.set(x, "workerPath", js.undefined)
    }
  }
}
