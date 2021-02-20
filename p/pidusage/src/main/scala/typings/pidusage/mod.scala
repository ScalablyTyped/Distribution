package typings.pidusage

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pid: String): js.Promise[Stat] = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pid: String, callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]): Unit = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pid: String, options: StringDictionary[js.Any]): js.Promise[Stat] = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(
    pid: String,
    options: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]
  ): Unit = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pid: Double): js.Promise[Stat] = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pid: Double, callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]): Unit = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pid: Double, options: StringDictionary[js.Any]): js.Promise[Stat] = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(
    pid: Double,
    options: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error | Null, /* stats */ Stat, Unit]
  ): Unit = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pids: js.Array[Double | String]): js.Promise[StringDictionary[Stat]] = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(
    pids: js.Array[Double | String],
    callback: js.Function2[/* err */ Error | Null, /* stats */ StringDictionary[Stat], Unit]
  ): Unit = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(pids: js.Array[Double | String], options: StringDictionary[js.Any]): js.Promise[StringDictionary[Stat]] = js.native
  @JSImport("pidusage", JSImport.Namespace)
  @js.native
  def apply(
    pids: js.Array[Double | String],
    options: StringDictionary[js.Any],
    callback: js.Function2[/* err */ Error | Null, /* stats */ StringDictionary[Stat], Unit]
  ): Unit = js.native
  
  /**
    * If needed this function can be used to clear the event loop.
    * Indeed, we're registering an interval to free up the in-memory metrics.
    * By calling this, it will clear this interval and all delete all in-memory data
    */
  @JSImport("pidusage", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @js.native
  trait Stat extends StObject {
    
    /**
      * percentage (from 0 to 100*vcore)
      */
    var cpu: Double = js.native
    
    /**
      * ms user + system time
      */
    var ctime: Double = js.native
    
    /**
      * ms since the start of the process
      */
    var elapsed: Double = js.native
    
    /**
      * bytes
      */
    var memory: Double = js.native
    
    /**
      * PID
      */
    var pid: Double = js.native
    
    /**
      * PPID
      */
    var ppid: Double = js.native
    
    /**
      * ms since epoch
      */
    var timestamp: Double = js.native
  }
  object Stat {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type Status = Stat
}
