package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IIDs
import typings.mfiles.IObjectType
import typings.mfiles.IObjectTypeTargetsForBrowsing
import typings.mfiles.ISessionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjType")
@js.native
class ObjType () extends IObjectType {
  /* CompleteClass */
  override var AccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override var AllowAdding: Boolean = js.native
  /* CompleteClass */
  override var AllowedAsGroupingLevel: Boolean = js.native
  /* CompleteClass */
  override var CanHaveFiles: Boolean = js.native
  /* CompleteClass */
  override var DefaultAccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override var DefaultPropertyDef: Double = js.native
  /* CompleteClass */
  override var External: Boolean = js.native
  /* CompleteClass */
  override val GUID: String = js.native
  /* CompleteClass */
  override var HasOwnerType: Boolean = js.native
  /* CompleteClass */
  override var Hierarchical: Boolean = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Icon: js.Array[Double] = js.native
  /* CompleteClass */
  override var NamePlural: String = js.native
  /* CompleteClass */
  override var NameSingular: String = js.native
  /* CompleteClass */
  override var ObjectTypeTargetsForBrowsing: IObjectTypeTargetsForBrowsing = js.native
  /* CompleteClass */
  override var OwnerPropertyDef: Double = js.native
  /* CompleteClass */
  override var OwnerType: Double = js.native
  /* CompleteClass */
  override val ReadOnlyPropertiesDuringInsert: IIDs = js.native
  /* CompleteClass */
  override val ReadOnlyPropertiesDuringUpdate: IIDs = js.native
  /* CompleteClass */
  override var RealObjectType: Boolean = js.native
  /* CompleteClass */
  override var ShowCreationCommandInTaskPane: Boolean = js.native
  /* CompleteClass */
  override var Translatable: Boolean = js.native
  /* CompleteClass */
  override def CanHaveItemIcons(): Boolean = js.native
  /* CompleteClass */
  override def Clone(): IObjectType = js.native
  /* CompleteClass */
  override def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def IsAddingAllowedForUser(SessionInfo: ISessionInfo): Boolean = js.native
}

@JSGlobal("MFiles.ObjType")
@js.native
object ObjType extends Instantiable0[IObjectType]

