package typings.mfiles.global.MFiles

import typings.mfiles.IUserOrUserGroupIDEx
import typings.mfiles.IUserOrUserGroupIDExs
import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserOrUserGroupIDExs")
@js.native
open class UserOrUserGroupIDExs ()
  extends StObject
     with IUserOrUserGroupIDExs {
  
  /* CompleteClass */
  override def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IUserOrUserGroupIDExs = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx = js.native
  
  /* CompleteClass */
  override def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IUserOrUserGroupIDEx = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
