package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionDesktopApp
  extends StObject
     with WindowsInformationProtectionApp {
  
  // The binary name.
  var binaryName: js.UndefOr[String] = js.undefined
  
  // The high binary version.
  var binaryVersionHigh: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The lower binary version.
  var binaryVersionLow: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsInformationProtectionDesktopApp {
  
  @scala.inline
  def apply(): WindowsInformationProtectionDesktopApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionDesktopApp]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionDesktopAppMutableBuilder[Self <: WindowsInformationProtectionDesktopApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryName(value: String): Self = StObject.set(x, "binaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryNameUndefined: Self = StObject.set(x, "binaryName", js.undefined)
    
    @scala.inline
    def setBinaryVersionHigh(value: NullableOption[String]): Self = StObject.set(x, "binaryVersionHigh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryVersionHighNull: Self = StObject.set(x, "binaryVersionHigh", null)
    
    @scala.inline
    def setBinaryVersionHighUndefined: Self = StObject.set(x, "binaryVersionHigh", js.undefined)
    
    @scala.inline
    def setBinaryVersionLow(value: NullableOption[String]): Self = StObject.set(x, "binaryVersionLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryVersionLowNull: Self = StObject.set(x, "binaryVersionLow", null)
    
    @scala.inline
    def setBinaryVersionLowUndefined: Self = StObject.set(x, "binaryVersionLow", js.undefined)
  }
}
