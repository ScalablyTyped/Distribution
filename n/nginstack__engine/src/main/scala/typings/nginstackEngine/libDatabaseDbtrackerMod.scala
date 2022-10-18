package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseDbtrackerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_options: typings.nginstackEngine.anon.Database): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/DBTracker", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DBTracker {
    def this(opt_options: typings.nginstackEngine.anon.Database) = this()
    
    /* CompleteClass */
    var active: Boolean = js.native
    
    /* CompleteClass */
    var autoUndo: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var database_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var event_ : Any = js.native
    
    /* CompleteClass */
    override def finish(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var getDBDate_ : Any = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* private */ /* CompleteClass */
    var id_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var maxActiveTime: Double = js.native
    
    /* CompleteClass */
    var poolId: Double = js.native
    
    /* private */ /* CompleteClass */
    var poolId_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var searchEvent_ : Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def undoChanges(): Double = js.native
  }
  @JSImport("@nginstack/engine/lib/database/DBTracker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finishAbandoned(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("finishAbandoned")().asInstanceOf[Double]
  inline def finishAbandoned(opt_database: Database): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("finishAbandoned")(opt_database.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait DBTracker extends StObject {
    
    var active: Boolean
    
    var autoUndo: Boolean
    
    /* private */ var database_ : Any
    
    /* private */ var event_ : Any
    
    def finish(): Unit
    
    /* private */ var getDBDate_ : Any
    
    var id: String
    
    /* private */ var id_ : Any
    
    /* private */ var logger_ : Any
    
    var maxActiveTime: Double
    
    var poolId: Double
    
    /* private */ var poolId_ : Any
    
    /* private */ var searchEvent_ : Any
    
    def start(): Unit
    
    def undoChanges(): Double
  }
  object DBTracker {
    
    inline def apply(
      active: Boolean,
      autoUndo: Boolean,
      database_ : Any,
      event_ : Any,
      finish: () => Unit,
      getDBDate_ : Any,
      id: String,
      id_ : Any,
      logger_ : Any,
      maxActiveTime: Double,
      poolId: Double,
      poolId_ : Any,
      searchEvent_ : Any,
      start: () => Unit,
      undoChanges: () => Double
    ): DBTracker = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], autoUndo = autoUndo.asInstanceOf[js.Any], database_ = database_.asInstanceOf[js.Any], event_ = event_.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), getDBDate_ = getDBDate_.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_ = id_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], maxActiveTime = maxActiveTime.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], poolId_ = poolId_.asInstanceOf[js.Any], searchEvent_ = searchEvent_.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), undoChanges = js.Any.fromFunction0(undoChanges))
      __obj.asInstanceOf[DBTracker]
    }
    
    extension [Self <: DBTracker](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAutoUndo(value: Boolean): Self = StObject.set(x, "autoUndo", value.asInstanceOf[js.Any])
      
      inline def setDatabase_(value: Any): Self = StObject.set(x, "database_", value.asInstanceOf[js.Any])
      
      inline def setEvent_(value: Any): Self = StObject.set(x, "event_", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setGetDBDate_(value: Any): Self = StObject.set(x, "getDBDate_", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setId_(value: Any): Self = StObject.set(x, "id_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setMaxActiveTime(value: Double): Self = StObject.set(x, "maxActiveTime", value.asInstanceOf[js.Any])
      
      inline def setPoolId(value: Double): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
      
      inline def setPoolId_(value: Any): Self = StObject.set(x, "poolId_", value.asInstanceOf[js.Any])
      
      inline def setSearchEvent_(value: Any): Self = StObject.set(x, "searchEvent_", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setUndoChanges(value: () => Double): Self = StObject.set(x, "undoChanges", js.Any.fromFunction0(value))
    }
  }
  
  type Database = typings.nginstackEngine.libDatabaseDatabaseMod.^
}
