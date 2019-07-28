package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IClassGroup
import typings.mfiles.IIDs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ClassGroup")
@js.native
class ClassGroup () extends IClassGroup {
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Members: IIDs = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var ObjectType: MFBuiltInObjectType | Double = js.native
  /* CompleteClass */
  override def AddMember(Member: Double): Unit = js.native
  /* CompleteClass */
  override def Clone(): IClassGroup = js.native
  /* CompleteClass */
  override def RemoveMember(Member: Double): Unit = js.native
}

@JSGlobal("MFiles.ClassGroup")
@js.native
object ClassGroup extends Instantiable0[IClassGroup]

