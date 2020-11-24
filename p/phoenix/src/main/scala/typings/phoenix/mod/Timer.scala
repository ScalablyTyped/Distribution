package typings.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phoenix", "Timer")
@js.native
class Timer protected () extends js.Object {
  def this(callback: js.Function0[Unit], timerCalc: js.Function1[/* tries */ Double, Double]) = this()
  
  def reset(): Unit = js.native
  
  def scheduleTimeout(): Unit = js.native
}
