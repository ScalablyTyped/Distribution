package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.Process.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Process is a list of steps that are called in sequence. The step can be a number, a
  * promise (jQuery, native, or any other “thenable”), or a function:
  *
  * - **number**: the process will wait for the specified number of milliseconds before proceeding.
  * - **promise**: the process will continue to the next step when the promise is successfully
  *  resolved or stop if the promise is rejected.
  * - **function**: the process will execute the function. The process will stop if the function
  *  returns either a boolean `false` or a promise that is rejected; if the function returns a
  *  number, the process will wait for that number of milliseconds before proceeding.
  *
  * If the process fails, an {@link OO.ui.Error error} is generated. Depending on how the error is
  * configured, users can dismiss the error and try the process again, or not. If a process is
  * stopped, its remaining steps will not be performed.
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Process
  */
@js.native
trait Process extends StObject {
  
  /**
    * Start the process.
    *
    * @return Promise that is resolved when all steps have successfully completed.
    *  If any of the steps return a promise that is rejected or a boolean false, this promise is
    *  rejected and any remaining steps are not performed.
    */
  def execute(): Promise[Unit, js.Array[Any | Error], Any] = js.native
  
  /**
    * Add step to the beginning of the process.
    *
    * @param step
    * - Number of milliseconds to wait before proceeding
    * - Promise that must be resolved before proceeding
    * - Function to execute
    *   - If the function returns a boolean false the process will stop
    *   - If the function returns a promise, the process will continue to the next
    *     step when the promise is resolved or stop if the promise is rejected
    *   - If the function returns a number, the process will wait for that number of
    *     milliseconds before proceeding
    * @param context Execution context of the function. The context is
    *  ignored if the step is a number or promise.
    * @return this
    */
  def first[C](step: Step[C]): this.type = js.native
  def first[C](step: Step[C], context: C): this.type = js.native
  
  /**
    * Add step to the end of the process.
    *
    * @param step
    * - Number of milliseconds to wait before proceeding
    * - Promise that must be resolved before proceeding
    * - Function to execute
    *   - If the function returns a boolean false the process will stop
    *   - If the function returns a promise, the process will continue to the next
    *     step when the promise is resolved or stop if the promise is rejected
    *   - If the function returns a number, the process will wait for that number of
    *     milliseconds before proceeding
    * @param context Execution context of the function. The context is
    *  ignored if the step is a number or promise.
    * @return this
    */
  def next[C](step: Step[C]): this.type = js.native
  def next[C](step: Step[C], context: C): this.type = js.native
}
object Process {
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param step Number of milliseconds to wait before proceeding,
    * promise that must be resolved before proceeding, or a function to execute.
    * See {@link Process.first first} for more information.
    * @param context Execution context of the function. The context is ignored if the step
    * is a number or promise.
    */
  Instantiable1[/* step */ Step[js.Object], Process]
       with Instantiable2[/* step */ Step[js.Object], /* context */ js.Object, Process]
  
  type Step[C] = Double | (Promise[Unit, Any, Any]) | (js.ThisFunction0[
    /* this */ C, 
    Boolean | Double | (Promise[Unit, Any, Any]) | Error | js.Array[Error] | Unit
  ])
}
