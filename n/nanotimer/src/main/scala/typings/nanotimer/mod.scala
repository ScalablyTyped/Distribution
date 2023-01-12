package typings.nanotimer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanotimer", JSImport.Namespace)
  @js.native
  /**
    * Creates an instance of NanoTimer.
    * @param log - if true, will enable logging.
    */
  open class ^ ()
    extends StObject
       with NanoTimer {
    def this(log: Boolean) = this()
  }
  
  @js.native
  trait NanoTimer extends StObject {
    
    /**
      * Clears current running interval.
      */
    def clearInterval(): Unit = js.native
    
    /**
      * Clears current running timeOut.
      */
    def clearTimeout(): Unit = js.native
    
    /**
      * Returns true if the timer currently has a scheduled timeout, or false otherwise
      */
    def hasTimeout(): Boolean = js.native
    
    def setInterval(task: js.Function1[/* repeated */ Any, Unit], args: String, interval: String): Unit = js.native
    def setInterval(
      task: js.Function1[/* repeated */ Any, Unit],
      args: String,
      interval: String,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Unit = js.native
    /**
      * Call the task at the regular interval specified in interval.
      */
    def setInterval(task: js.Function1[/* repeated */ Any, Unit], args: js.Array[Any], interval: String): Unit = js.native
    def setInterval(
      task: js.Function1[/* repeated */ Any, Unit],
      args: js.Array[Any],
      interval: String,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Unit = js.native
    
    def setTimeout(task: js.Function1[/* repeated */ Any, Unit], args: String, timeout: String): Unit = js.native
    def setTimeout(
      task: js.Function1[/* repeated */ Any, Unit],
      args: String,
      timeout: String,
      callback: js.Function1[/* results */ TimeoutResults, Unit]
    ): Unit = js.native
    /**
      * Call the task after the waiting the the timeout specified.
      */
    def setTimeout(task: js.Function1[/* repeated */ Any, Unit], args: js.Array[Any], timeout: String): Unit = js.native
    def setTimeout(
      task: js.Function1[/* repeated */ Any, Unit],
      args: js.Array[Any],
      timeout: String,
      callback: js.Function1[/* results */ TimeoutResults, Unit]
    ): Unit = js.native
    
    /**
      * Calculate the time it tooks to execute the task.
      */
    def time(task: js.Function1[/* cb */ js.Function0[Unit], Unit], args: String, interval: String): Double = js.native
    def time(
      task: js.Function1[/* cb */ js.Function0[Unit], Unit],
      args: String,
      interval: String,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Double = js.native
    def time(task: js.Function1[/* cb */ js.Function0[Unit], Unit], args: js.Array[Any], interval: String): Double = js.native
    def time(
      task: js.Function1[/* cb */ js.Function0[Unit], Unit],
      args: js.Array[Any],
      interval: String,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Double = js.native
  }
  
  trait TimeoutResults extends StObject {
    
    var waitTime: Double
  }
  object TimeoutResults {
    
    inline def apply(waitTime: Double): TimeoutResults = {
      val __obj = js.Dynamic.literal(waitTime = waitTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeoutResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeoutResults] (val x: Self) extends AnyVal {
      
      inline def setWaitTime(value: Double): Self = StObject.set(x, "waitTime", value.asInstanceOf[js.Any])
    }
  }
}
