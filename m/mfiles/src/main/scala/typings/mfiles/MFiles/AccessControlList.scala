package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IAccessControlListComponent
import typings.mfiles.IAccessControlListComponentContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlList")
@js.native
class AccessControlList () extends IAccessControlList {
  /* CompleteClass */
  override val AutomaticComponents: IAccessControlListComponentContainer = js.native
  /* CompleteClass */
  override val CheckedOutToUserID: Double = js.native
  /* CompleteClass */
  override var CustomComponent: IAccessControlListComponent = js.native
  /* CompleteClass */
  override val HasCheckedOutToUserID: Boolean = js.native
  /* CompleteClass */
  override var IsFullyAuthoritative: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IAccessControlList = js.native
  /* CompleteClass */
  override def CloneFrom(AccessControlList: IAccessControlList): Unit = js.native
  /* CompleteClass */
  override def EqualTo(AccessControlList: IAccessControlList): Boolean = js.native
  /* CompleteClass */
  override def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean = js.native
}

@JSGlobal("MFiles.AccessControlList")
@js.native
object AccessControlList extends Instantiable0[IAccessControlList]

