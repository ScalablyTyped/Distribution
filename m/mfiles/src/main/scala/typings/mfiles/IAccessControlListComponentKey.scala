package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlListComponentKey extends StObject {
  
  def Clone(): IAccessControlListComponentKey
  
  var ItemID: Double
  
  var PropertyDefID: MFBuiltInPropertyDef | Double
}
object IAccessControlListComponentKey {
  
  inline def apply(
    Clone: () => IAccessControlListComponentKey,
    ItemID: Double,
    PropertyDefID: MFBuiltInPropertyDef | Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ItemID = ItemID.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccessControlListComponentKey] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IAccessControlListComponentKey): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setItemID(value: Double): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDefID", value.asInstanceOf[js.Any])
  }
}
