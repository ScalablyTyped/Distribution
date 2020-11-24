package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsDefenderScanActionResult extends DeviceActionResult {
  
  // Scan type either full scan or quick scan
  var scanType: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsDefenderScanActionResult {
  
  @scala.inline
  def apply(): WindowsDefenderScanActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDefenderScanActionResult]
  }
  
  @scala.inline
  implicit class WindowsDefenderScanActionResultOps[Self <: WindowsDefenderScanActionResult] (val x: Self) extends AnyVal {
    
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
    def setScanType(value: NullableOption[String]): Self = this.set("scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
    
    @scala.inline
    def setScanTypeNull: Self = this.set("scanType", null)
  }
}
