package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueIconClues extends StObject {
  
  def Clone(): IPropertyValueIconClues
  
  val Count: Double
  
  def Item(Index: Double): IPropertyValueIconClue
}
object IPropertyValueIconClues {
  
  @scala.inline
  def apply(Clone: () => IPropertyValueIconClues, Count: Double, Item: Double => IPropertyValueIconClue): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
  
  @scala.inline
  implicit class IPropertyValueIconCluesMutableBuilder[Self <: IPropertyValueIconClues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValueIconClues): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IPropertyValueIconClue): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
