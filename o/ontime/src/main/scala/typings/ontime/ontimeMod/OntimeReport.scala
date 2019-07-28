package typings.ontime.ontimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OntimeReport extends js.Object {
  /**
    * Clears timers for scheduling jobs that the ontime instance knows.
    * This does not terminate the current execution of a job; you still need to call ot.done() for that purpose.
    */
  def cancel(): Unit
  /**
    * Should be called after the job has been finished.
    * This is important especially when single is set to true because scheduling the next run is done in the method.
    */
  def done(): Unit
}

object OntimeReport {
  @scala.inline
  def apply(cancel: () => Unit, done: () => Unit): OntimeReport = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), done = js.Any.fromFunction0(done))
  
    __obj.asInstanceOf[OntimeReport]
  }
}

