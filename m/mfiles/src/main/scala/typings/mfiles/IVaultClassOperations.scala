package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInDocumentClass
import typings.mfiles.MFilesNs.MFBuiltInObjectClass
import typings.mfiles.MFilesNs.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClassOperations extends js.Object {
  def AddObjectClassAdmin(ObjectClassAdmin: IObjectClassAdmin): IObjectClassAdmin = js.native
  def GetAllObjectClasses(): IObjectClasses = js.native
  def GetAllObjectClassesAdmin(): IObjectClassesAdmin = js.native
  def GetObjectClass(ObjectClass: Double): IObjectClass = js.native
  def GetObjectClass(ObjectClass: MFBuiltInDocumentClass): IObjectClass = js.native
  def GetObjectClass(ObjectClass: MFBuiltInObjectClass): IObjectClass = js.native
  def GetObjectClassAdmin(Class: Double): IObjectClassAdmin = js.native
  def GetObjectClassAdmin(Class: MFBuiltInDocumentClass): IObjectClassAdmin = js.native
  def GetObjectClassAdmin(Class: MFBuiltInObjectClass): IObjectClassAdmin = js.native
  def GetObjectClassIDByAlias(Alias: String): Double = js.native
  def GetObjectClassIDByGUID(ObjectClassGUID: String): Double = js.native
  def GetObjectClasses(ObjectType: Double): IObjectClasses = js.native
  def GetObjectClasses(ObjectType: MFBuiltInObjectType): IObjectClasses = js.native
  def GetObjectClassesAdmin(ObjectType: Double): IObjectClassesAdmin = js.native
  def GetObjectClassesAdmin(ObjectType: MFBuiltInObjectType): IObjectClassesAdmin = js.native
  def RemoveObjectClassAdmin(ObjectClassID: Double): Unit = js.native
  def UpdateObjectClassAdmin(ObjectClass: IObjectClassAdmin): Unit = js.native
  def UpdateObjectNames(ObjectClassID: Double): Unit = js.native
}

