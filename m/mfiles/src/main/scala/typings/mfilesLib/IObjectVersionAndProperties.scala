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

