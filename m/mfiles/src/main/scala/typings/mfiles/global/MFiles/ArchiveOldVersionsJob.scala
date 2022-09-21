package typings.mfiles.global.MFiles

import typings.mfiles.IArchiveOldVersionsJob
import typings.mfiles.IImpersonation
import typings.mfiles.ITimestamp
import typings.mfiles.MFiles.MFExportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ArchiveOldVersionsJob")
@js.native
open class ArchiveOldVersionsJob ()
  extends StObject
     with IArchiveOldVersionsJob {
  
  /* CompleteClass */
  var AtLeastNDaysOlder: Double = js.native
  
  /* CompleteClass */
  var AtLeastNVersionsOlder: Double = js.native
  
  /* CompleteClass */
  var CheckedInBefore: ITimestamp = js.native
  
  /* CompleteClass */
  override def Clone(): IArchiveOldVersionsJob = js.native
  
  /* CompleteClass */
  var Flags: MFExportContentFlag = js.native
  
  /* CompleteClass */
  var Impersonation: IImpersonation = js.native
  
  /* CompleteClass */
  var MarkedForArchiving: Boolean = js.native
  
  /* CompleteClass */
  var NoVersionTag: Boolean = js.native
  
  /* CompleteClass */
  var TargetLocation: String = js.native
  
  /* CompleteClass */
  var UseAtLeastNDaysOlder: Boolean = js.native
  
  /* CompleteClass */
  var UseAtLeastNVersionsOlder: Boolean = js.native
  
  /* CompleteClass */
  var UseCheckedInBefore: Boolean = js.native
}
