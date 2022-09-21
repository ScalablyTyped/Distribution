package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.DisplayNameGetter
import typings.powerbiVisualsTools.mod.jsCommon.IStringResourceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnumMember extends StObject {
  
  var displayName: DisplayNameGetter
  
  var value: EnumMemberValue
}
object IEnumMember {
  
  inline def apply(displayName: DisplayNameGetter, value: EnumMemberValue): IEnumMember = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumMember]
  }
  
  extension [Self <: IEnumMember](x: Self) {
    
    inline def setDisplayName(value: DisplayNameGetter): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameFunction1(value: /* resourceProvider */ IStringResourceProvider => String): Self = StObject.set(x, "displayName", js.Any.fromFunction1(value))
    
    inline def setValue(value: EnumMemberValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
