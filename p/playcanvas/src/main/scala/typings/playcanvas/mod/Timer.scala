package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Timer counts milliseconds from when start() is called until when stop() is called.
  *
  * @ignore
  */
@JSImport("playcanvas", "Timer")
@js.native
open class Timer () extends StObject {
  
  var _a: Double = js.native
  
  var _b: Double = js.native
  
  var _isRunning: Boolean = js.native
  
  /**
    * Get the number of milliseconds that passed between start() and stop() being called.
    *
    * @returns {number} The elapsed milliseconds.
    */
  def getMilliseconds(): Double = js.native
  
  /**
    * Start the timer.
    */
  def start(): Unit = js.native
  
  /**
    * Stop the timer.
    */
  def stop(): Unit = js.native
}
