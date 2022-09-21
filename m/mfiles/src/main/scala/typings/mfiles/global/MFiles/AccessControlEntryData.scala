package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlEntryData
import typings.mfiles.MFiles.MFPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlEntryData")
@js.native
open class AccessControlEntryData ()
  extends StObject
     with IAccessControlEntryData {
  
  /* CompleteClass */
  var AttachObjectsPermission: MFPermission = js.native
  
  /* CompleteClass */
  var ChangePermissionsPermission: MFPermission = js.native
  
  /* CompleteClass */
  override def Clone(): IAccessControlEntryData = js.native
  
  /* CompleteClass */
  var DeletePermission: MFPermission = js.native
  
  /* CompleteClass */
  var EditPermission: MFPermission = js.native
  
  /* CompleteClass */
  var ReadPermission: MFPermission = js.native
  
  /* CompleteClass */
  override def SetAllPermissions(Permission: MFPermission): Unit = js.native
}
