package typings.perfy

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("perfy", JSImport.Namespace)
  @js.native
  val ^ : Perfy = js.native
  
  type AsyncOperationFn = js.Function1[/* done */ js.Function0[PerfyResult], Unit]
  
  @js.native
  trait Perfy extends StObject {
    
    /**
      * Gets the total number of existing performance instances.
      */
    def count(): Double = js.native
    
    /**
      * Destroys the performance instance with the given name.
      * @param name - Name of the performance instance to be destroyed.
      */
    def destroy(name: String): this.type = js.native
    
    /**
      * Destroys all existing performance instances.
      */
    def destroyAll(): this.type = js.native
    
    /**
      * Ends the performance instance with the given name;
      * and calculates the elapsed high-resolution real time.
      * Note that if autoDestroy is not disabled when .start() is called; corresponding performance instance is immediately destroyed after returning the result
      * @param name - Unique name of the performance instance to be ended
      */
    def end(name: String): PerfyResult = js.native
    
    def exec(fn: AsyncOperationFn): this.type = js.native
    def exec(fn: SyncOperationFn): PerfyResult = js.native
    /**
      * Initializes a new performance instance right before executing the given function,
      * and automatically ends after the execution is done
      * @param name - Unique name of the performance instance.
      * Set this if you want the keep the instance for later use (such as getting the result at a later time).
      * @param fn - Function to be executed.
      * This function is invoked with an optional done argument which is only required
      * if you are running an asynchronous operation.
      * You should omit the done argument if it's a synchronous operation.
      */
    def exec(name: String, fn: AsyncOperationFn): this.type = js.native
    
    /**
      * Specifies whether a performance instance exists with the given name. This method will return false for an item, if called after .end(name) is called since the instance is destroyed
      * @param name - Unique name of the performance instance.
      */
    def exists(name: String): Boolean = js.native
    
    /**
      * Gets the names of existing performance instances.
      */
    def names(): js.Array[String] = js.native
    
    /**
      * Gets the calculated result of the performance instance for the given name.
      * To be used with non-destroyed, ended instances.
      * If instance is not yet ended or does not exist at all, returns null
      * @param name - Unique name of the performance instance.
      */
    def result(name: String): PerfyResult | Null = js.native
    
    /**
      * Initializes a new performance instance with the given name;
      * and marks the current high-resolution real time.
      * @param name - Unique name of the performance instance to be started.
      * Setting an existing name will overwrite this item. Use .exists() method to check for existence.
      * @param [autoDestroy=true] - Specifies whether this performance instance should be destroyed when .end() is called
      */
    def start(name: String): this.type = js.native
    def start(name: String, autoDestroy: Boolean): this.type = js.native
  }
  
  trait PerfyResult extends StObject {
    
    /** UTC end time of the execution (low-resolution). e.g. 1533302466486 */
    val endTime: Double
    
    /** Float representation of full elapsed time in milliseconds. e.g. 1235.125 */
    val fullMilliseconds: Double
    
    /** Float representation of full elapsed time in nanoseconds. e.g. 1235125283 */
    val fullNanoseconds: Double
    
    /** Alias of `time` */
    val fullSeconds: Double
    
    /** Nanoseconds portion converted to milliseconds. 235.125283 */
    val milliseconds: Double
    
    /** Initialized name of the performance instance */
    val name: String
    
    /** Nanoseconds portion of the elapsed time. e.g. 235125283 */
    val nanoseconds: Double
    
    /** Seconds portion of the elapsed time. e.g. 1 */
    val seconds: Double
    
    /** UTC start time of the execution (low-resolution). e.g. 1533302465251 */
    val startTime: Double
    
    /** Text summary shorthand for elapsed time */
    val summary: String
    
    /** Number — Float representation of full elapsed time in seconds. e.g. 1.235 */
    val time: Double
  }
  object PerfyResult {
    
    inline def apply(
      endTime: Double,
      fullMilliseconds: Double,
      fullNanoseconds: Double,
      fullSeconds: Double,
      milliseconds: Double,
      name: String,
      nanoseconds: Double,
      seconds: Double,
      startTime: Double,
      summary: String,
      time: Double
    ): PerfyResult = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], fullMilliseconds = fullMilliseconds.asInstanceOf[js.Any], fullNanoseconds = fullNanoseconds.asInstanceOf[js.Any], fullSeconds = fullSeconds.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerfyResult]
    }
    
    extension [Self <: PerfyResult](x: Self) {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setFullMilliseconds(value: Double): Self = StObject.set(x, "fullMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setFullNanoseconds(value: Double): Self = StObject.set(x, "fullNanoseconds", value.asInstanceOf[js.Any])
      
      inline def setFullSeconds(value: Double): Self = StObject.set(x, "fullSeconds", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNanoseconds(value: Double): Self = StObject.set(x, "nanoseconds", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  type SyncOperationFn = js.Function0[PerfyResult]
  
  type _To = Perfy
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Perfy = ^
}
