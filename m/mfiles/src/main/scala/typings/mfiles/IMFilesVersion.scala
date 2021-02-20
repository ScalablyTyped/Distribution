package typings.mfiles

import typings.mfiles.MFiles.MFSoftwarePlatformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMFilesVersion extends StObject {
  
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
  implicit class IMFilesVersionMutableBuilder[Self <: IMFilesVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Double): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IMFilesVersion): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompareTo(value: IMFilesVersion => Double): Self = StObject.set(x, "CompareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "Major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "Minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "Patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwarePlatform(value: MFSoftwarePlatformType): Self = StObject.set(x, "SoftwarePlatform", value.asInstanceOf[js.Any])
  }
}
