package typings.next

import typings.next.anon.ExposedMethods
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWorkerMod {
  
  @JSImport("next/dist/lib/worker", "Worker")
  @js.native
  open class Worker protected () extends StObject {
    def this(workerPath: String, options: FarmOptions & ExposedMethods) = this()
    
    /* private */ var _worker: Any = js.native
    
    /**
      * Quietly end the worker if it exists
      */
    def close(): Unit = js.native
    
    def end(): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestWorker * / any['end'] */ js.Any
      ] = js.native
  }
  
  type FarmOptions = /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof JestWorker * / any>[1] */ js.Any
}
