package typings.mfiles.global.MFiles

import typings.mfiles.IApprovalAssignmentClassInfo
import typings.mfiles.ISignatureSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ApprovalAssignmentClassInfo")
@js.native
class ApprovalAssignmentClassInfo ()
  extends StObject
     with IApprovalAssignmentClassInfo {
  
  /* CompleteClass */
  var AnyAssigneeApproves: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IApprovalAssignmentClassInfo = js.native
  
  /* CompleteClass */
  var SignatureForApproval: ISignatureSettings = js.native
  
  /* CompleteClass */
  var SignatureForRejection: ISignatureSettings = js.native
}
