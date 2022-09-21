package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlEntry
import typings.mfiles.MFiles.MFPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlEntry")
@js.native
open class AccessControlEntry ()
  extends StObject
     with IAccessControlEntry {
  
  /* CompleteClass */
  var ChangePermissionsPermission: MFPermission = js.native
  
  /* CompleteClass */
  override def Clone(): IAccessControlEntry = js.native
  
  /* CompleteClass */
  var EditPermission: MFPermission = js.native
  
  /* CompleteClass */
  var IsGroup: Boolean = js.native
  
  /* CompleteClass */
  var ReadPermission: MFPermission = js.native
  
  /* CompleteClass */
  var UserOrGroupID: Double = js.native
}
