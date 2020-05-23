package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IAdditionalClassInfo
import typings.mfiles.IAssociatedPropertyDefs
import typings.mfiles.IAutomaticPermissions
import typings.mfiles.IObjectClass
import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectClass")
@js.native
class ObjectClass () extends IObjectClass {
  /* CompleteClass */
  override var AccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override val AdditionalClassInfo: IAdditionalClassInfo = js.native
  /* CompleteClass */
  override var AssociatedPropertyDefs: IAssociatedPropertyDefs = js.native
  /* CompleteClass */
  override var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  /* CompleteClass */
  override var ForceWorkflow: Boolean = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var NamePropertyDef: Double = js.native
  /* CompleteClass */
  override var ObjectType: MFBuiltInObjectType | Double = js.native
  /* CompleteClass */
  override var Workflow: Double = js.native
  /* CompleteClass */
  override def Clone(): IObjectClass = js.native
}

@JSGlobal("MFiles.ObjectClass")
@js.native
object ObjectClass extends Instantiable0[IObjectClass]

