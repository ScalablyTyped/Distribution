package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndProperties extends js.Object {
  val ObjVer: IObjVer
  val Properties: IPropertyValues
  val Vault: IVault
  val VersionData: IObjectVersion
  def Clone(): IObjectVersionAndProperties
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer, Properties = Properties, Vault = Vault, VersionData = VersionData)
  
    __obj.asInstanceOf[IObjectVersionAndProperties]
  }
}

