package typings.nouislider.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.nouislider.nouisliderBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API extends StObject {
  
  def destroy(): Unit = js.native
  
  def get(): GetResult = js.native
  def get(unencoded: Boolean): GetResult = js.native
  
  def getOrigins(): NumberDictionary[HTMLElement] = js.native
  
  def getTooltips(): NumberDictionary[HTMLElement | `false`] = js.native
  
  def off(eventName: String): Unit = js.native
  
  def on(eventName: String, callback: EventCallback): Unit = js.native
  
  var options: Options = js.native
  
  def pips(grid: Pips): HTMLElement = js.native
  
  def removePips(): Unit = js.native
  
  def removeTooltips(): Unit = js.native
  
  def reset(): Unit = js.native
  def reset(fireSetEvent: Boolean): Unit = js.native
  
  def set(input: String): Unit = js.native
  def set(input: String, fireSetEvent: Boolean): Unit = js.native
  def set(input: String, fireSetEvent: Boolean, exactInput: Boolean): Unit = js.native
  def set(input: String, fireSetEvent: Unit, exactInput: Boolean): Unit = js.native
  def set(input: js.Array[Double | String]): Unit = js.native
  def set(input: js.Array[Double | String], fireSetEvent: Boolean): Unit = js.native
  def set(input: js.Array[Double | String], fireSetEvent: Boolean, exactInput: Boolean): Unit = js.native
  def set(input: js.Array[Double | String], fireSetEvent: Unit, exactInput: Boolean): Unit = js.native
  def set(input: Double): Unit = js.native
  def set(input: Double, fireSetEvent: Boolean): Unit = js.native
  def set(input: Double, fireSetEvent: Boolean, exactInput: Boolean): Unit = js.native
  def set(input: Double, fireSetEvent: Unit, exactInput: Boolean): Unit = js.native
  
  def setHandle(handleNumber: Double, value: String): Unit = js.native
  def setHandle(handleNumber: Double, value: String, fireSetEvent: Boolean): Unit = js.native
  def setHandle(handleNumber: Double, value: String, fireSetEvent: Boolean, exactInput: Boolean): Unit = js.native
  def setHandle(handleNumber: Double, value: String, fireSetEvent: Unit, exactInput: Boolean): Unit = js.native
  def setHandle(handleNumber: Double, value: Double): Unit = js.native
  def setHandle(handleNumber: Double, value: Double, fireSetEvent: Boolean): Unit = js.native
  def setHandle(handleNumber: Double, value: Double, fireSetEvent: Boolean, exactInput: Boolean): Unit = js.native
  def setHandle(handleNumber: Double, value: Double, fireSetEvent: Unit, exactInput: Boolean): Unit = js.native
  
  def steps(): js.Array[NextStepsForHandle] = js.native
  
  var target: HTMLElement = js.native
  
  def updateOptions(optionsToUpdate: UpdatableOptions, fireSetEvent: Boolean): Unit = js.native
}
