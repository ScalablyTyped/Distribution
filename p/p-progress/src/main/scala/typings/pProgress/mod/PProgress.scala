package typings.pProgress.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PProgress[ValueType] extends Promise[ValueType] {
  /**
  	The current progress percentage of the promise as a number between 0 and 1.
  	*/
  val progress: Double = js.native
  /**
  	Accepts a function that gets `instance.progress` as an argument and is called for every progress event.
  	*/
  def onProgress(callback: ProgressNotifier): Unit = js.native
}

