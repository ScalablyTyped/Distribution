package typings.pizzip.mod

import typings.node.Buffer
import typings.pizzip.anon.Base64
import typings.std.ArrayBuffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipObject extends js.Object {
  
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asArrayBuffer(): ArrayBuffer = js.native
  
  /**
    * the content as binary string.
    */
  def asBinary(): String = js.native
  
  /**
    * need nodejs. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asNodeBuffer(): Buffer = js.native
  
  /**
    * the content as an unicode string.
    */
  def asText(): String = js.native
  
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asUint8Array(): Uint8Array = js.native
  
  /**
    * the comment for this file
    */
  var comment: String = js.native
  
  /**
    * the last modification date
    */
  var date: Date = js.native
  
  /**
    * true if this is a directory
    */
  var dir: Boolean = js.native
  
  /**
    * The DOS permissions of the file, if any.
    */
  var dosPermissions: Double = js.native
  
  /**
    * the absolute path of the file
    */
  var name: String = js.native
  
  /**
    * the options of the file.
    */
  var options: Base64 = js.native
  
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc. On nodejs you can use the mode attribute of nodejs' fs.Stats.
    */
  var unixPermissions: Double | String = js.native
}
object ZipObject {
  
  @scala.inline
  def apply(
    asArrayBuffer: () => ArrayBuffer,
    asBinary: () => String,
    asNodeBuffer: () => Buffer,
    asText: () => String,
    asUint8Array: () => Uint8Array,
    comment: String,
    date: Date,
    dir: Boolean,
    dosPermissions: Double,
    name: String,
    options: Base64,
    unixPermissions: Double | String
  ): ZipObject = {
    val __obj = js.Dynamic.literal(asArrayBuffer = js.Any.fromFunction0(asArrayBuffer), asBinary = js.Any.fromFunction0(asBinary), asNodeBuffer = js.Any.fromFunction0(asNodeBuffer), asText = js.Any.fromFunction0(asText), asUint8Array = js.Any.fromFunction0(asUint8Array), comment = comment.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dosPermissions = dosPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], unixPermissions = unixPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipObject]
  }
  
  @scala.inline
  implicit class ZipObjectOps[Self <: ZipObject] (val x: Self) extends AnyVal {
    
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
    def setAsArrayBuffer(value: () => ArrayBuffer): Self = this.set("asArrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsBinary(value: () => String): Self = this.set("asBinary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsNodeBuffer(value: () => Buffer): Self = this.set("asNodeBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsText(value: () => String): Self = this.set("asText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsUint8Array(value: () => Uint8Array): Self = this.set("asUint8Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: Boolean): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDosPermissions(value: Double): Self = this.set("dosPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Base64): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnixPermissions(value: Double | String): Self = this.set("unixPermissions", value.asInstanceOf[js.Any])
  }
}
