package typings.mfiles

import typings.mfiles.MFiles.MFACLEnforcingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultExternalObjectOperations extends StObject {
  
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties
}
object IVaultExternalObjectOperations {
  
  inline def apply(
    PromoteObject: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
  ): IVaultExternalObjectOperations = {
    val __obj = js.Dynamic.literal(PromoteObject = js.Any.fromFunction4(PromoteObject))
    __obj.asInstanceOf[IVaultExternalObjectOperations]
  }
  
  extension [Self <: IVaultExternalObjectOperations](x: Self) {
    
    inline def setPromoteObject(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = StObject.set(x, "PromoteObject", js.Any.fromFunction4(value))
  }
}
