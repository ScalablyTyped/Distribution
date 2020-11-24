package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.H
import typings.pdfmake.pdfmakeStrings.L
import typings.pdfmake.pdfmakeStrings.M
import typings.pdfmake.pdfmakeStrings.Q
import typings.pdfmake.pdfmakeStrings.alphanumeric
import typings.pdfmake.pdfmakeStrings.numeric
import typings.pdfmake.pdfmakeStrings.octet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentQr
  extends ContentBase
     with _Content {
  
  var eccLevel: js.UndefOr[L | M | Q | H] = js.native
  
  var fit: js.UndefOr[Double] = js.native
  
  var foreground: js.UndefOr[String] = js.native
  
  var mask: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[numeric | alphanumeric | octet] = js.native
  
  var qr: String = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object ContentQr {
  
  @scala.inline
  def apply(qr: String): ContentQr = {
    val __obj = js.Dynamic.literal(qr = qr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentQr]
  }
  
  @scala.inline
  implicit class ContentQrOps[Self <: ContentQr] (val x: Self) extends AnyVal {
    
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
    def setQr(value: String): Self = this.set("qr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEccLevel(value: L | M | Q | H): Self = this.set("eccLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEccLevel: Self = this.set("eccLevel", js.undefined)
    
    @scala.inline
    def setFit(value: Double): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setForeground(value: String): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setMask(value: Double): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMode(value: numeric | alphanumeric | octet): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
