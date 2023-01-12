package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsMobileMSI
  extends StObject
     with MobileLobApp {
  
  // The command line.
  var commandLine: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set
    * this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
    */
  var ignoreVersionDetection: js.UndefOr[Boolean] = js.undefined
  
  // The product code.
  var productCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The product version of Windows Mobile MSI Line of Business (LoB) app.
  var productVersion: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsMobileMSI {
  
  inline def apply(): WindowsMobileMSI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMobileMSI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsMobileMSI] (val x: Self) extends AnyVal {
    
    inline def setCommandLine(value: NullableOption[String]): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    inline def setCommandLineNull: Self = StObject.set(x, "commandLine", null)
    
    inline def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
    
    inline def setIgnoreVersionDetection(value: Boolean): Self = StObject.set(x, "ignoreVersionDetection", value.asInstanceOf[js.Any])
    
    inline def setIgnoreVersionDetectionUndefined: Self = StObject.set(x, "ignoreVersionDetection", js.undefined)
    
    inline def setProductCode(value: NullableOption[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeNull: Self = StObject.set(x, "productCode", null)
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProductVersion(value: NullableOption[String]): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    inline def setProductVersionNull: Self = StObject.set(x, "productVersion", null)
    
    inline def setProductVersionUndefined: Self = StObject.set(x, "productVersion", js.undefined)
  }
}
