package typings.mfiles.global.MFiles

import typings.mfiles.IActionCreateAssignment
import typings.mfiles.IUserOrUserGroupIDExs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ActionCreateAssignment")
@js.native
class ActionCreateAssignment ()
  extends StObject
     with IActionCreateAssignment {
  
  /* CompleteClass */
  var AssignedTo: IUserOrUserGroupIDExs = js.native
  
  /* CompleteClass */
  override def Clone(): IActionCreateAssignment = js.native
  
  /* CompleteClass */
  var Deadline: Boolean = js.native
  
  /* CompleteClass */
  var DeadlineInDays: Double = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var MonitoredBy: IUserOrUserGroupIDExs = js.native
  
  /* CompleteClass */
  var Title: String = js.native
}
