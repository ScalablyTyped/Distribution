package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssociatedPropertyDef extends StObject {
  
  def Clone(): IAssociatedPropertyDef
  
  var PropertyDef: MFBuiltInPropertyDef | Double
  
  var Required: Boolean
}
object IAssociatedPropertyDef {
  
  inline def apply(Clone: () => IAssociatedPropertyDef, PropertyDef: MFBuiltInPropertyDef | Double, Required: Boolean): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAssociatedPropertyDef] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IAssociatedPropertyDef): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
  }
}
