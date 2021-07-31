package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IAccessControlListComponent
import typings.mfiles.IAccessControlListComponentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlList")
@js.native
class AccessControlList ()
  extends StObject
     with IAccessControlList {
  
  /* CompleteClass */
  override val AutomaticComponents: IAccessControlListComponentContainer = js.native
  
  /* CompleteClass */
  override val CheckedOutToUserID: Double = js.native
  
  /* CompleteClass */
  override def Clone(): IAccessControlList = js.native
  
  /* CompleteClass */
  override def CloneFrom(AccessControlList: IAccessControlList): Unit = js.native
  
  /* CompleteClass */
  var CustomComponent: IAccessControlListComponent = js.native
  
  /* CompleteClass */
  override def EqualTo(AccessControlList: IAccessControlList): Boolean = js.native
  
  /* CompleteClass */
  override val HasCheckedOutToUserID: Boolean = js.native
  
  /* CompleteClass */
  override def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean = js.native
  
  /* CompleteClass */
  var IsFullyAuthoritative: Boolean = js.native
}
