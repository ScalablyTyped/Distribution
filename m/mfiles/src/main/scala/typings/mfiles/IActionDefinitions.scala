package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionDefinitions extends StObject {
  
  def Add(Index: Double, ActionDefinition: IActionDefinition): Unit = js.native
  
  def Clone(): IActionDefinitions = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IActionDefinition = js.native
  def Item(Index: Double, value: IActionDefinition): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
