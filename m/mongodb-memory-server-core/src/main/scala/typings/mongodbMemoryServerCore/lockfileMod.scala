package typings.mongodbMemoryServerCore

import typings.asyncMutex.mod.Mutex
import typings.node.eventsMod.EventEmitter
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockfileMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFile")
  @js.native
  open class LockFile protected () extends StObject {
    def this(file: String, uuid: String) = this()
    
    /**
      * File locked by this instance
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * Unlock the File that is locked by this instance
      */
    def unlock(): js.Promise[Unit] = js.native
    
    /**
      * Helper function for the unlock-cleanup
      * @param fileio Unlink the file?
      */
    /* protected */ def unlockCleanup(): js.Promise[Unit] = js.native
    /* protected */ def unlockCleanup(fileio: Boolean): js.Promise[Unit] = js.native
    
    /**
      * UUID Unique to this lock instance
      */
    var uuid: js.UndefOr[String] = js.native
  }
  /* static members */
  object LockFile {
    
    @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check the status of the lockfile
      * @param file The file to use as the LockFile
      */
    inline def checkLock(file: String): js.Promise[LockFileStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLock")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LockFileStatus]]
    inline def checkLock(file: String, uuid: String): js.Promise[LockFileStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkLock")(file.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LockFileStatus]]
    
    /**
      * Function create the path and lock file
      * @param file The file to use as the LockFile
      */
    inline def createLock(file: String): js.Promise[LockFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLock")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LockFile]]
    
    /** Listen for events from this process */
    @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFile.events")
    @js.native
    def events: LockFileEventsClass = js.native
    inline def events_=(x: LockFileEventsClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
    
    /** All Files that are handled by this process */
    @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFile.files")
    @js.native
    def files: Set[String] = js.native
    inline def files_=(x: Set[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("files")(x.asInstanceOf[js.Any])
    
    /**
      * Acquire an lockfile
      * @param file The file to use as the LockFile
      */
    inline def lock(file: String): js.Promise[LockFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LockFile]]
    
    /** Mutex to stop same-process race conditions */
    @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFile.mutex")
    @js.native
    def mutex: Mutex = js.native
    inline def mutex_=(x: Mutex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutex")(x.asInstanceOf[js.Any])
    
    /**
      * Wait for the Lock file to become available
      * @param file The file to use as the LockFile
      */
    inline def waitForLock(file: String): js.Promise[LockFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForLock")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LockFile]]
  }
  
  @js.native
  sealed trait LockFileEvents extends StObject
  @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFileEvents")
  @js.native
  object LockFileEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LockFileEvents & String] = js.native
    
    @js.native
    sealed trait lock
      extends StObject
         with LockFileEvents
    /* "lock" */ val lock: typings.mongodbMemoryServerCore.lockfileMod.LockFileEvents.lock & String = js.native
    
    @js.native
    sealed trait unlock
      extends StObject
         with LockFileEvents
    /* "unlock" */ val unlock: typings.mongodbMemoryServerCore.lockfileMod.LockFileEvents.unlock & String = js.native
  }
  
  @js.native
  sealed trait LockFileStatus extends StObject
  @JSImport("mongodb-memory-server-core/lib/util/lockfile", "LockFileStatus")
  @js.native
  object LockFileStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LockFileStatus & Double] = js.native
    
    /**
      * Status is "available" to be grabbed (lockfile not existing or being invalid)
      */
    @js.native
    sealed trait available
      extends StObject
         with LockFileStatus
    /* 0 */ val available: typings.mongodbMemoryServerCore.lockfileMod.LockFileStatus.available & Double = js.native
    
    /**
      * Status is "available for asking instance" (instance that asked has the lock)
      */
    @js.native
    sealed trait availableInstance
      extends StObject
         with LockFileStatus
    /* 1 */ val availableInstance: typings.mongodbMemoryServerCore.lockfileMod.LockFileStatus.availableInstance & Double = js.native
    
    /**
      * Status is "locked by another process"
      */
    @js.native
    sealed trait lockedDifferent
      extends StObject
         with LockFileStatus
    /* 3 */ val lockedDifferent: typings.mongodbMemoryServerCore.lockfileMod.LockFileStatus.lockedDifferent & Double = js.native
    
    /**
      * Status is "locked by another instance in this process"
      */
    @js.native
    sealed trait lockedSelf
      extends StObject
         with LockFileStatus
    /* 2 */ val lockedSelf: typings.mongodbMemoryServerCore.lockfileMod.LockFileStatus.lockedSelf & Double = js.native
  }
  
  /** Dummy class for types */
  @js.native
  trait LockFileEventsClass extends EventEmitter {
    
    def emit(event: LockFileEvents, args: Any*): Boolean = js.native
    
    def on(event: LockFileEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def once(event: LockFileEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  }
}
