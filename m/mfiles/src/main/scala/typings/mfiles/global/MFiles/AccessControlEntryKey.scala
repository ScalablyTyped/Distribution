package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlEntryKey
import typings.mfiles.IIndirectPropertyID
import typings.mfiles.IUserOrUserGroupIDs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlEntryKey")
@js.native
class AccessControlEntryKey ()
  extends StObject
     with IAccessControlEntryKey {
  
  /* CompleteClass */
  override def Clone(): IAccessControlEntryKey = js.native
  
  /* CompleteClass */
  override def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs = js.native
  
  /* CompleteClass */
  override val HasConcreteUserOrGroupID: Boolean = js.native
  
  /* CompleteClass */
  override val IsGroup: Boolean = js.native
  
  /* CompleteClass */
  override val IsPseudoUser: Boolean = js.native
  
  /* CompleteClass */
  var PseudoUserID: IIndirectPropertyID = js.native
  
  /* CompleteClass */
  override def ResetResolvedPseudoUserOrGroupIDs(): Unit = js.native
  
  /* CompleteClass */
  override def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit = js.native
  
  /* CompleteClass */
  override val UserOrGroupID: Double = js.native
}
