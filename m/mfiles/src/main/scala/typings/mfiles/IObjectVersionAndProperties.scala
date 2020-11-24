package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectVersionAndProperties extends js.Object {
  
  def Clone(): IObjectVersionAndProperties = js.native
  
  val ObjVer: IObjVer = js.native
  
  val Properties: IPropertyValues = js.native
  
  val Vault: IVault = js.native
  
  val VersionData: IObjectVersion = js.native
}
object IObjectVersionAndProperties {
  
  @scala.inline
  def apply(
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
  implicit class IObjectVersionAndPropertiesOps[Self <: IObjectVersionAndProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => IObjectVersionAndProperties): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertyValues): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVault(value: IVault): Self = this.set("Vault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionData(value: IObjectVersion): Self = this.set("VersionData", value.asInstanceOf[js.Any])
  }
}
