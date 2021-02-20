package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyValuesWithIconClues extends StObject {
  
  def Clone(): IPropertyValuesWithIconClues = js.native
  
  val IconClues: IPropertyValueIconClues = js.native
  
  val ObjVer: IObjVer = js.native
  
  val PropertyValues: IPropertyValues = js.native
}
object IPropertyValuesWithIconClues {
  
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconClues,
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IconClues = IconClues.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
  
  @scala.inline
  implicit class IPropertyValuesWithIconCluesMutableBuilder[Self <: IPropertyValuesWithIconClues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IPropertyValuesWithIconClues): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIconClues(value: IPropertyValueIconClues): Self = StObject.set(x, "IconClues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValues(value: IPropertyValues): Self = StObject.set(x, "PropertyValues", value.asInstanceOf[js.Any])
  }
}
