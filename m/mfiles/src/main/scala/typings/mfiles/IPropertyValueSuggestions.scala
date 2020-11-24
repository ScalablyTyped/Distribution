package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValueSuggestions extends js.Object {
  
  def Add(Index: Double, IPropertyValueSuggestion: IPropertyValueSuggestion): Unit = js.native
  
  def Clone(): IPropertyValueSuggestions = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IPropertyValueSuggestion = js.native
  def Item(Index: Double, value: IPropertyValueSuggestion): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
