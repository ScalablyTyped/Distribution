package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.ISemanticAliases
import typings.mfiles.IUserGroup
import typings.mfiles.IUserGroupAdmin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserGroupAdmin")
@js.native
open class UserGroupAdmin ()
  extends StObject
     with IUserGroupAdmin {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override def Clone(): IUserGroupAdmin = js.native
  
  /* CompleteClass */
  override def CloneFrom(UserGroupAdmin: IUserGroupAdmin): Unit = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var UserGroup: IUserGroup = js.native
}
