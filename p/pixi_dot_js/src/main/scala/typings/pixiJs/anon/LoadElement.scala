package typings.pixiJs.anon

import typings.std.HTMLAudioElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadElement extends StObject {
  
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.undefined
  
  var mimeType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var skipSource: js.UndefOr[Boolean] = js.undefined
}
object LoadElement {
  
  @scala.inline
  def apply(): LoadElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadElement]
  }
  
  @scala.inline
  implicit class LoadElementMutableBuilder[Self <: LoadElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadElementUndefined: Self = StObject.set(x, "loadElement", js.undefined)
    
    @scala.inline
    def setMimeType(value: String | js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
    
    @scala.inline
    def setSkipSource(value: Boolean): Self = StObject.set(x, "skipSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipSourceUndefined: Self = StObject.set(x, "skipSource", js.undefined)
  }
}
