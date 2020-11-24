package typings.pdfjsDist.anon

import typings.pdfjsDist.mod.PDFInfo
import typings.pdfjsDist.mod.PDFMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  
  var info: PDFInfo = js.native
  
  var metadata: PDFMetadata = js.native
}
object Info {
  
  @scala.inline
  def apply(info: PDFInfo, metadata: PDFMetadata): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: PDFInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: PDFMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}
