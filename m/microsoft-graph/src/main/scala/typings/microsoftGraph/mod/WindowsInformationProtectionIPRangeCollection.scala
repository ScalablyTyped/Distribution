package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionIPRangeCollection extends StObject {
  
  // Display name
  var displayName: js.UndefOr[String] = js.undefined
  
  // Collection of ip ranges
  var ranges: js.UndefOr[js.Array[IpRange]] = js.undefined
}
object WindowsInformationProtectionIPRangeCollection {
  
  inline def apply(): WindowsInformationProtectionIPRangeCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionIPRangeCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsInformationProtectionIPRangeCollection] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setRanges(value: js.Array[IpRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: IpRange*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
