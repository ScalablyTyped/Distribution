package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsMobileMSI extends MobileLobApp {
  
  // The command line.
  var commandLine: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set
    * this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
    */
  var ignoreVersionDetection: js.UndefOr[Boolean] = js.native
  
  // The product code.
  var productCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The product version of Windows Mobile MSI Line of Business (LoB) app.
  var productVersion: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsMobileMSI {
  
  @scala.inline
  def apply(): WindowsMobileMSI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMobileMSI]
  }
  
  @scala.inline
  implicit class WindowsMobileMSIOps[Self <: WindowsMobileMSI] (val x: Self) extends AnyVal {
    
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
    def setCommandLine(value: NullableOption[String]): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandLine: Self = this.set("commandLine", js.undefined)
    
    @scala.inline
    def setCommandLineNull: Self = this.set("commandLine", null)
    
    @scala.inline
    def setIgnoreVersionDetection(value: Boolean): Self = this.set("ignoreVersionDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreVersionDetection: Self = this.set("ignoreVersionDetection", js.undefined)
    
    @scala.inline
    def setProductCode(value: NullableOption[String]): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setProductCodeNull: Self = this.set("productCode", null)
    
    @scala.inline
    def setProductVersion(value: NullableOption[String]): Self = this.set("productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductVersion: Self = this.set("productVersion", js.undefined)
    
    @scala.inline
    def setProductVersionNull: Self = this.set("productVersion", null)
  }
}
