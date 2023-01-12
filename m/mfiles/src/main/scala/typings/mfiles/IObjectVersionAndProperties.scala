package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectVersionAndProperties extends StObject {
  
  def Clone(): IObjectVersionAndProperties
  
  val ObjVer: IObjVer
  
  val Properties: IPropertyValues
  
  val Vault: IVault
  
  val VersionData: IObjectVersion
}
object IObjectVersionAndProperties {
  
  inline def apply(
    Clone: () => IObjectVersionAndProperties,
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Vault: IVault,
    VersionData: IObjectVersion
  ): IObjectVersionAndProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Vault = Vault.asInstanceOf[js.Any], VersionData = VersionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionAndProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjectVersionAndProperties] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IObjectVersionAndProperties): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertyValues): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setVault(value: IVault): Self = StObject.set(x, "Vault", value.asInstanceOf[js.Any])
    
    inline def setVersionData(value: IObjectVersion): Self = StObject.set(x, "VersionData", value.asInstanceOf[js.Any])
  }
}
