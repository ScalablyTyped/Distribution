package typings.mfiles.global.MFiles

import typings.mfiles.ISignatureSettings
import typings.mfiles.ITaskAssignmentClassInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.TaskAssignmentClassInfo")
@js.native
open class TaskAssignmentClassInfo ()
  extends StObject
     with ITaskAssignmentClassInfo {
  
  /* CompleteClass */
  var AnyAssigneeCompletes: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): ITaskAssignmentClassInfo = js.native
  
  /* CompleteClass */
  var SignatureForCompletion: ISignatureSettings = js.native
}
