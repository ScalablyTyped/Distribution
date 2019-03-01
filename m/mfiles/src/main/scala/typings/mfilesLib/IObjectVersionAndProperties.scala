package typings
package mfilesLib

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
    Clone: js.Function0[IObjectVersionAndProperties],
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Vault: IVault,
    VersionData: IObjectVersion
  ): IObjectVersionAndProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ObjVer")(ObjVer)
    __obj.updateDynamic("Properties")(Properties)
    __obj.updateDynamic("Vault")(Vault)
    __obj.updateDynamic("VersionData")(VersionData)
    __obj.asInstanceOf[IObjectVersionAndProperties]
  }
}

