package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValuesWithIconClues extends StObject {
  
  def Clone(): IPropertyValuesWithIconClues
  
  val IconClues: IPropertyValueIconClues
  
  val ObjVer: IObjVer
  
  val PropertyValues: IPropertyValues
}
object IPropertyValuesWithIconClues {
  
  inline def apply(
    Clone: () => IPropertyValuesWithIconClues,
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IconClues = IconClues.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPropertyValuesWithIconClues] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IPropertyValuesWithIconClues): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setIconClues(value: IPropertyValueIconClues): Self = StObject.set(x, "IconClues", value.asInstanceOf[js.Any])
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setPropertyValues(value: IPropertyValues): Self = StObject.set(x, "PropertyValues", value.asInstanceOf[js.Any])
  }
}
