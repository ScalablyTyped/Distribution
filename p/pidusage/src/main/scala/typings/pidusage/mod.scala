package typings.pidusage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pid: String): js.Promise[Stat] = ^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stat]]
  inline def apply(pid: String, callback: js.Function2[/* err */ js.Error | Null, /* stats */ Stat, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pid: String, options: StringDictionary[Any]): js.Promise[Stat] = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stat]]
  inline def apply(
    pid: String,
    options: StringDictionary[Any],
    callback: js.Function2[/* err */ js.Error | Null, /* stats */ Stat, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pid: Double): js.Promise[Stat] = ^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stat]]
  inline def apply(pid: Double, callback: js.Function2[/* err */ js.Error | Null, /* stats */ Stat, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pid: Double, options: StringDictionary[Any]): js.Promise[Stat] = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stat]]
  inline def apply(
    pid: Double,
    options: StringDictionary[Any],
    callback: js.Function2[/* err */ js.Error | Null, /* stats */ Stat, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pids: js.Array[Double | String]): js.Promise[StringDictionary[Stat]] = ^.asInstanceOf[js.Dynamic].apply(pids.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StringDictionary[Stat]]]
  inline def apply(
    pids: js.Array[Double | String],
    callback: js.Function2[/* err */ js.Error | Null, /* stats */ StringDictionary[Stat], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(pids.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pids: js.Array[Double | String], options: StringDictionary[Any]): js.Promise[StringDictionary[Stat]] = (^.asInstanceOf[js.Dynamic].apply(pids.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StringDictionary[Stat]]]
  inline def apply(
    pids: js.Array[Double | String],
    options: StringDictionary[Any],
    callback: js.Function2[/* err */ js.Error | Null, /* stats */ StringDictionary[Stat], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(pids.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If needed this function can be used to clear the event loop.
    * Indeed, we're registering an interval to free up the in-memory metrics.
    * By calling this, it will clear this interval and all delete all in-memory data
    */
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  trait Stat extends StObject {
    
    /**
      * percentage (from 0 to 100*vcore)
      */
    var cpu: Double
    
    /**
      * ms user + system time
      */
    var ctime: Double
    
    /**
      * ms since the start of the process
      */
    var elapsed: Double
    
    /**
      * bytes
      */
    var memory: Double
    
    /**
      * PID
      */
    var pid: Double
    
    /**
      * PPID
      */
    var ppid: Double
    
    /**
      * ms since epoch
      */
    var timestamp: Double
  }
  object Stat {
    
    inline def apply(
      cpu: Double,
      ctime: Double,
      elapsed: Double,
      memory: Double,
      pid: Double,
      ppid: Double,
      timestamp: Double
    ): Stat = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    extension [Self <: Stat](x: Self) {
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type Status = Stat
}
