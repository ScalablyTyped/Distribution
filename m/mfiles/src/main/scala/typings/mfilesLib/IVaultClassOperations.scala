package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClassOperations extends js.Object {
  def AddObjectClassAdmin(ObjectClassAdmin: IObjectClassAdmin): IObjectClassAdmin = js.native
  def GetAllObjectClasses(): IObjectClasses = js.native
  def GetAllObjectClassesAdmin(): IObjectClassesAdmin = js.native
  def GetObjectClass(ObjectClass: mfilesLib.MFilesNs.MFBuiltInDocumentClass): IObjectClass = js.native
  def GetObjectClass(ObjectClass: mfilesLib.MFilesNs.MFBuiltInObjectClass): IObjectClass = js.native
  def GetObjectClass(ObjectClass: scala.Double): IObjectClass = js.native
  def GetObjectClassAdmin(Class: mfilesLib.MFilesNs.MFBuiltInDocumentClass): IObjectClassAdmin = js.native
  def GetObjectClassAdmin(Class: mfilesLib.MFilesNs.MFBuiltInObjectClass): IObjectClassAdmin = js.native
  def GetObjectClassAdmin(Class: scala.Double): IObjectClassAdmin = js.native
  def GetObjectClassIDByAlias(Alias: java.lang.String): scala.Double = js.native
  def GetObjectClassIDByGUID(ObjectClassGUID: java.lang.String): scala.Double = js.native
  def GetObjectClasses(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IObjectClasses = js.native
  def GetObjectClasses(ObjectType: scala.Double): IObjectClasses = js.native
  def GetObjectClassesAdmin(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IObjectClassesAdmin = js.native
  def GetObjectClassesAdmin(ObjectType: scala.Double): IObjectClassesAdmin = js.native
  def RemoveObjectClassAdmin(ObjectClassID: scala.Double): scala.Unit = js.native
  def UpdateObjectClassAdmin(ObjectClass: IObjectClassAdmin): scala.Unit = js.native
  def UpdateObjectNames(ObjectClassID: scala.Double): scala.Unit = js.native
}

