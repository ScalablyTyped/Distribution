package typings.nginstackEngine

import typings.nginstackEngine.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseDbtrackerpoolMod {
  
  inline def apply(opt_options: Id): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/DBTrackerPool", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DBTrackerPool {
    def this(opt_options: Id) = this()
    
    /* CompleteClass */
    override def acquire(): Any = js.native
    
    /* private */ /* CompleteClass */
    var database_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var generateTrackers_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getAvailableTrackers_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getDBTracker_ : Any = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    override def release(tracker: typings.nginstackEngine.libDatabaseDbtrackerMod.^): Unit = js.native
    
    /* CompleteClass */
    override def tryAcquire(): typings.nginstackEngine.libDatabaseDbtrackerMod.^ = js.native
  }
  @JSImport("@nginstack/engine/lib/database/DBTrackerPool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DBTrackerPool extends StObject {
    
    def acquire(): Any
    
    /* private */ var database_ : Any
    
    /* private */ var generateTrackers_ : Any
    
    /* private */ var getAvailableTrackers_ : Any
    
    /* private */ var getDBTracker_ : Any
    
    var id: Double
    
    def release(tracker: typings.nginstackEngine.libDatabaseDbtrackerMod.^): Unit
    
    def tryAcquire(): typings.nginstackEngine.libDatabaseDbtrackerMod.^
  }
  object DBTrackerPool {
    
    inline def apply(
      acquire: () => Any,
      database_ : Any,
      generateTrackers_ : Any,
      getAvailableTrackers_ : Any,
      getDBTracker_ : Any,
      id: Double,
      release: typings.nginstackEngine.libDatabaseDbtrackerMod.^ => Unit,
      tryAcquire: () => typings.nginstackEngine.libDatabaseDbtrackerMod.^
    ): DBTrackerPool = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), database_ = database_.asInstanceOf[js.Any], generateTrackers_ = generateTrackers_.asInstanceOf[js.Any], getAvailableTrackers_ = getAvailableTrackers_.asInstanceOf[js.Any], getDBTracker_ = getDBTracker_.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], release = js.Any.fromFunction1(release), tryAcquire = js.Any.fromFunction0(tryAcquire))
      __obj.asInstanceOf[DBTrackerPool]
    }
    
    extension [Self <: DBTrackerPool](x: Self) {
      
      inline def setAcquire(value: () => Any): Self = StObject.set(x, "acquire", js.Any.fromFunction0(value))
      
      inline def setDatabase_(value: Any): Self = StObject.set(x, "database_", value.asInstanceOf[js.Any])
      
      inline def setGenerateTrackers_(value: Any): Self = StObject.set(x, "generateTrackers_", value.asInstanceOf[js.Any])
      
      inline def setGetAvailableTrackers_(value: Any): Self = StObject.set(x, "getAvailableTrackers_", value.asInstanceOf[js.Any])
      
      inline def setGetDBTracker_(value: Any): Self = StObject.set(x, "getDBTracker_", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: typings.nginstackEngine.libDatabaseDbtrackerMod.^ => Unit): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
      
      inline def setTryAcquire(value: () => typings.nginstackEngine.libDatabaseDbtrackerMod.^): Self = StObject.set(x, "tryAcquire", js.Any.fromFunction0(value))
    }
  }
  
  type Database = typings.nginstackEngine.libDatabaseDatabaseMod.^
}
