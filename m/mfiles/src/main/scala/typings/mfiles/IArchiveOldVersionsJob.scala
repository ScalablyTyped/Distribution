package typings.mfiles

import typings.mfiles.MFiles.MFExportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IArchiveOldVersionsJob extends js.Object {
  
  var AtLeastNDaysOlder: Double = js.native
  
  var AtLeastNVersionsOlder: Double = js.native
  
  var CheckedInBefore: ITimestamp = js.native
  
  def Clone(): IArchiveOldVersionsJob = js.native
  
  var Flags: MFExportContentFlag = js.native
  
  var Impersonation: IImpersonation = js.native
  
  var MarkedForArchiving: Boolean = js.native
  
  var NoVersionTag: Boolean = js.native
  
  var TargetLocation: String = js.native
  
  var UseAtLeastNDaysOlder: Boolean = js.native
  
  var UseAtLeastNVersionsOlder: Boolean = js.native
  
  var UseCheckedInBefore: Boolean = js.native
}
object IArchiveOldVersionsJob {
  
  @scala.inline
  def apply(
    AtLeastNDaysOlder: Double,
    AtLeastNVersionsOlder: Double,
    CheckedInBefore: ITimestamp,
    Clone: () => IArchiveOldVersionsJob,
    Flags: MFExportContentFlag,
    Impersonation: IImpersonation,
    MarkedForArchiving: Boolean,
    NoVersionTag: Boolean,
    TargetLocation: String,
    UseAtLeastNDaysOlder: Boolean,
    UseAtLeastNVersionsOlder: Boolean,
    UseCheckedInBefore: Boolean
  ): IArchiveOldVersionsJob = {
    val __obj = js.Dynamic.literal(AtLeastNDaysOlder = AtLeastNDaysOlder.asInstanceOf[js.Any], AtLeastNVersionsOlder = AtLeastNVersionsOlder.asInstanceOf[js.Any], CheckedInBefore = CheckedInBefore.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MarkedForArchiving = MarkedForArchiving.asInstanceOf[js.Any], NoVersionTag = NoVersionTag.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseAtLeastNDaysOlder = UseAtLeastNDaysOlder.asInstanceOf[js.Any], UseAtLeastNVersionsOlder = UseAtLeastNVersionsOlder.asInstanceOf[js.Any], UseCheckedInBefore = UseCheckedInBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
  
  @scala.inline
  implicit class IArchiveOldVersionsJobOps[Self <: IArchiveOldVersionsJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAtLeastNDaysOlder(value: Double): Self = this.set("AtLeastNDaysOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtLeastNVersionsOlder(value: Double): Self = this.set("AtLeastNVersionsOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedInBefore(value: ITimestamp): Self = this.set("CheckedInBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IArchiveOldVersionsJob): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: MFExportContentFlag): Self = this.set("Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = this.set("Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkedForArchiving(value: Boolean): Self = this.set("MarkedForArchiving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoVersionTag(value: Boolean): Self = this.set("NoVersionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocation(value: String): Self = this.set("TargetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAtLeastNDaysOlder(value: Boolean): Self = this.set("UseAtLeastNDaysOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAtLeastNVersionsOlder(value: Boolean): Self = this.set("UseAtLeastNVersionsOlder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCheckedInBefore(value: Boolean): Self = this.set("UseCheckedInBefore", value.asInstanceOf[js.Any])
  }
}
