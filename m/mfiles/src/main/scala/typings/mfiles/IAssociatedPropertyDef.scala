package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssociatedPropertyDef extends StObject {
  
  def Clone(): IAssociatedPropertyDef = js.native
  
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  var Required: Boolean = js.native
}
object IAssociatedPropertyDef {
  
  @scala.inline
  def apply(Clone: () => IAssociatedPropertyDef, PropertyDef: MFBuiltInPropertyDef | Double, Required: Boolean): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
  
  @scala.inline
  implicit class IAssociatedPropertyDefMutableBuilder[Self <: IAssociatedPropertyDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAssociatedPropertyDef): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
  }
}
