package typings.mfiles

import typings.mfiles.MFiles.MFSoftwarePlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMFilesVersion extends js.Object {
  
  var Build: Double = js.native
  
  def Clone(): IMFilesVersion = js.native
  
  def CompareTo(RightSide: IMFilesVersion): Double = js.native
  
  val Display: String = js.native
  
  var Major: Double = js.native
  
  var Minor: Double = js.native
  
  var Patch: Double = js.native
  
  var SoftwarePlatform: MFSoftwarePlatformType = js.native
}
object IMFilesVersion {
  
  @scala.inline
  def apply(
    Build: Double,
    Clone: () => IMFilesVersion,
    CompareTo: IMFilesVersion => Double,
    Display: String,
    Major: Double,
    Minor: Double,
    Patch: Double,
    SoftwarePlatform: MFSoftwarePlatformType
  ): IMFilesVersion = {
    val __obj = js.Dynamic.literal(Build = Build.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CompareTo = js.Any.fromFunction1(CompareTo), Display = Display.asInstanceOf[js.Any], Major = Major.asInstanceOf[js.Any], Minor = Minor.asInstanceOf[js.Any], Patch = Patch.asInstanceOf[js.Any], SoftwarePlatform = SoftwarePlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMFilesVersion]
  }
  
  @scala.inline
  implicit class IMFilesVersionOps[Self <: IMFilesVersion] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: Double): Self = this.set("Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IMFilesVersion): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompareTo(value: IMFilesVersion => Double): Self = this.set("CompareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("Display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = this.set("Major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = this.set("Minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = this.set("Patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwarePlatform(value: MFSoftwarePlatformType): Self = this.set("SoftwarePlatform", value.asInstanceOf[js.Any])
  }
}
