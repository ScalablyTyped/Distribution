package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends StObject {
  
  var Format: String = js.native
  
  var Overlap: String = js.native
  
  var Size: Width = js.native
  
  var TileSize: String = js.native
  
  var Url: String = js.native
  
  var xmlns: js.UndefOr[String] = js.native
}
object Format {
  
  @scala.inline
  def apply(Format: String, Overlap: String, Size: Width, TileSize: String, Url: String): Format = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Overlap = Overlap.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TileSize = TileSize.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlap(value: String): Self = StObject.set(x, "Overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Width): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: String): Self = StObject.set(x, "TileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
