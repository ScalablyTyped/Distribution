package typings
package pDashProgressLib.pDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PProgress[ValueType]
  extends stdLib.Promise[ValueType] {
  /**
  	The current progress percentage of the promise as a number between 0 and 1.
  	*/
  val progress: scala.Double = js.native
  /**
  	Accepts a function that gets `instance.progress` as an argument and is called for every progress event.
  	*/
  def onProgress(callback: pDashProgressLib.pDashProgressMod.PProgressNs.ProgressNotifier): scala.Unit = js.native
}

