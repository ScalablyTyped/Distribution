package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFMetadata extends StObject {
  
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
  implicit class PDFMetadataMutableBuilder[Self <: PDFMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: () => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
  }
}
