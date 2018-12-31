package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @name pc.Timer
  * @description Create a new Timer instance
  * @class A Timer counts milliseconds from when start() is called until when stop() is called.
  */
@JSGlobal("pc.Timer")
@js.native
class Timer () extends js.Object {
  /**
    * @private
    * @function
    * @name pc.Timer#getMilliseconds
    * @description Get the number of milliseconds that passed between start() and stop() being called
    */
  def getMilliseconds(): scala.Double = js.native
  /**
    * @private
    * @function
    * @name pc.Timer#start
    * @description Start the timer
    */
  def start(): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Timer#stop
    * @description Stop the timer
    */
  def stop(): scala.Unit = js.native
}

