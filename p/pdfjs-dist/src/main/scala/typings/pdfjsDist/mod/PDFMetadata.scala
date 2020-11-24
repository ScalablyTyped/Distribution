package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFMetadata extends js.Object {
  
  def get(name: String): String = js.native
  
  def has(name: String): Boolean = js.native
  
  def parse(): Unit = js.native
}
object PDFMetadata {
  
  @scala.inline
  def apply(get: String => String, has: String => Boolean, parse: () => Unit): PDFMetadata = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), parse = js.Any.fromFunction0(parse))
    __obj.asInstanceOf[PDFMetadata]
  }
  
  @scala.inline
  implicit class PDFMetadataOps[Self <: PDFMetadata] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: () => Unit): Self = this.set("parse", js.Any.fromFunction0(value))
  }
}
