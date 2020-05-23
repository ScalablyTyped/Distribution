package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlEntryContainer
import typings.mfiles.IAccessControlEntryData
import typings.mfiles.IAccessControlEntryKey
import typings.mfiles.IAccessControlListComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlListComponent")
@js.native
class AccessControlListComponent () extends IAccessControlListComponent {
  /* CompleteClass */
  override var AccessControlEntries: IAccessControlEntryContainer = js.native
  /* CompleteClass */
  override var CanDeactivate: Boolean = js.native
  /* CompleteClass */
  override val CurrentUserBinding: Double = js.native
  /* CompleteClass */
  override val HasCurrentUser: Boolean = js.native
  /* CompleteClass */
  override val HasCurrentUserBinding: Boolean = js.native
  /* CompleteClass */
  override val HasNamedACLLink: Boolean = js.native
  /* CompleteClass */
  override val HasPseudoUsers: Boolean = js.native
  /* CompleteClass */
  override var IsActive: Boolean = js.native
  /* CompleteClass */
  override val NamedACLLink: Double = js.native
  /* CompleteClass */
  override def Clone(): IAccessControlListComponent = js.native
  /* CompleteClass */
  override def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData = js.native
  /* CompleteClass */
  override def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey = js.native
  /* CompleteClass */
  override def ResetCurrentUserBinding(): Unit = js.native
  /* CompleteClass */
  override def ResetNamedACLLink(): Unit = js.native
}

@JSGlobal("MFiles.AccessControlListComponent")
@js.native
object AccessControlListComponent extends Instantiable0[IAccessControlListComponent]

