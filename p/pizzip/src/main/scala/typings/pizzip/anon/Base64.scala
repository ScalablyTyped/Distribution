package typings.pizzip.anon

import typings.pizzip.mod.Compression
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base64 extends js.Object {
  
  /**
    * @deprecated
    */
  var base64: Boolean = js.native
  
  /**
    * @deprecated
    */
  var binary: Boolean = js.native
  
  var compression: Compression = js.native
  
  /**
    * @deprecated use File.date
    */
  var date: Date = js.native
  
  /**
    * @deprecated use File.dir
    */
  var dir: Boolean = js.native
}
object Base64 {
  
  @scala.inline
  def apply(base64: Boolean, binary: Boolean, compression: Compression, date: Date, dir: Boolean): Base64 = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64]
  }
  
  @scala.inline
  implicit class Base64Ops[Self <: Base64] (val x: Self) extends AnyVal {
    
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
    def setBase64(value: Boolean): Self = this.set("base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: Compression): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: Boolean): Self = this.set("dir", value.asInstanceOf[js.Any])
  }
}
