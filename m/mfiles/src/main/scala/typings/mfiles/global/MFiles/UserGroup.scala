package typings.mfiles.global.MFiles

import typings.mfiles.IIDs
import typings.mfiles.IUserGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserGroup")
@js.native
open class UserGroup ()
  extends StObject
     with IUserGroup {
  
  /* CompleteClass */
  override def AddMember(ID: Double): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IUserGroup = js.native
  
  /* CompleteClass */
  override def CloneFrom(UserGroup: IUserGroup): Unit = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Members: IIDs = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Predefined: Boolean = js.native
  
  /* CompleteClass */
  override def RemoveMember(ID: Double): Unit = js.native
}
