package typings.paralleljs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parallel[T] extends StObject {
  
  /**
    * Data
    **/
  var data: T = js.native
  
  /**
    * Map will apply the supplied function to every element in the wrapped data.  Parallel will spawn one worker for each array element in the data, or the supplied maxWorkers argument.  The values returned will be stored for further processing.
    * @param fn A function to apply.  Receives the wrapped data as an argument.  The value returned will be assigned to the wrapped data.
    * @return Parallel instance.
    **/
  def map[N](fn: js.Function1[/* data */ N, N]): Parallel[T] = js.native
  
  /**
    * Reduce applies an operation to every member of the wrapped data, and returns a scalar value produced by the operation.  Use it for combining the results of a map operation, by summing numbers for example.  This takes a reducing function, which gets an argument, data, an array of the stored value, and the current element.
    * @param fn A function to apply.  Receives the stored value and current element as argument.  The value returned will be stored as the current value for the next iteration.  Finally, the current value will be assigned to current data.
    * @return Parallel instance.
    **/
  def reduce[N](fn: js.Function1[/* data */ js.Array[N], N]): Parallel[T] = js.native
  
  /**
    * If you have state that you want to share between your main thread and worker threads, this is how.  Require takes either a string or a function.  A string should point to a file name.  NOte that in order to use require with a file name as an argument, you have to provide the evalPath property in the options object.
    * @param state Shared state function or js file.
    * @return Parallel instance.
    **/
  def require(file: String): Parallel[T] = js.native
  /**
    * @see require
    **/
  def require(fn: js.Function): Parallel[T] = js.native
  
  /**
    * This function will spawn a new process on a worker thread.  Pass it the function you want to call.  Your function will receive one argument, which is the current data.  The value returned from your spawned function will update the current data.
    * @param fn A function to execute on a worker thread.  Receives the wrapped data as an argument.  The value returned will be assigned to the wrapped data.
    * @return Parallel instance.
    **/
  def spawn(fn: js.Function1[/* data */ T, T]): Parallel[T] = js.native
  
  /**
    * The functions given to then are called after the last requested operation has finished.  success receives the resulting data object, while fail will receive an error object.
    * @param success A function that gets called upon successful completion.  Receives the wrapped data as an argument.
    * @param fail A function that gets called if the job fails.  The function is passed an error object.
    * @return Parallel instance.
    **/
  def `then`(success: js.Function1[/* data */ T, Unit]): Parallel[T] = js.native
  def `then`(success: js.Function1[/* data */ T, Unit], fail: js.Function1[/* e */ Error, Unit]): Parallel[T] = js.native
}
