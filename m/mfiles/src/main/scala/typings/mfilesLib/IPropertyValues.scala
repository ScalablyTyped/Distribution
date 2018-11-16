package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValues extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, PropertyValue: IPropertyValue): scala.Unit = js.native
  def Clone(): IPropertyValues = js.native
  def CloneFrom(PropertyValues: IPropertyValues): scala.Unit = js.native
  def IndexOf(PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef): scala.Double = js.native
  def IndexOf(PropertyDef: scala.Double): scala.Double = js.native
  def IndexOfByAlias(Vault: IVault, PropertyDefAlias: java.lang.String): scala.Double = js.native
  def Item(Index: scala.Double): IPropertyValue = js.native
  def Item(Index: scala.Double, value: IPropertyValue): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
  def SearchForProperty(PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef): IPropertyValue = js.native
  def SearchForProperty(PropertyDef: scala.Double): IPropertyValue = js.native
  def SearchForPropertyByAlias(Vault: IVault, PropertyDefAlias: java.lang.String, ReturnNULLIfNotFound: scala.Boolean): IPropertyValue = js.native
  def SearchForPropertyEx(PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef, ReturnNULLIfNotFound: scala.Boolean): IPropertyValue = js.native
  def SearchForPropertyEx(PropertyDef: scala.Double, ReturnNULLIfNotFound: scala.Boolean): IPropertyValue = js.native
}

