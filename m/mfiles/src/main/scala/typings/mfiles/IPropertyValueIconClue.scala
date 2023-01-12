package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueIconClue extends StObject {
  
  def Clone(): IPropertyValueIconClue
  
  val PropertyDef: MFBuiltInPropertyDef | Double
  
  val ValueListItem: Double
}
object IPropertyValueIconClue {
  
  inline def apply(
    Clone: () => IPropertyValueIconClue,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPropertyValueIconClue] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IPropertyValueIconClue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setValueListItem(value: Double): Self = StObject.set(x, "ValueListItem", value.asInstanceOf[js.Any])
  }
}
