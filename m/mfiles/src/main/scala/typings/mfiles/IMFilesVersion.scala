package typings.mfiles

import typings.mfiles.MFiles.MFSoftwarePlatformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMFilesVersion extends StObject {
  
  var Build: Double
  
  def Clone(): IMFilesVersion
  
  def CompareTo(RightSide: IMFilesVersion): Double
  
  val Display: String
  
  var Major: Double
  
  var Minor: Double
  
  var Patch: Double
  
  var SoftwarePlatform: MFSoftwarePlatformType
}
object IMFilesVersion {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IMFilesVersion] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: Double): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IMFilesVersion): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCompareTo(value: IMFilesVersion => Double): Self = StObject.set(x, "CompareTo", js.Any.fromFunction1(value))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    inline def setMajor(value: Double): Self = StObject.set(x, "Major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "Minor", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Double): Self = StObject.set(x, "Patch", value.asInstanceOf[js.Any])
    
    inline def setSoftwarePlatform(value: MFSoftwarePlatformType): Self = StObject.set(x, "SoftwarePlatform", value.asInstanceOf[js.Any])
  }
}
