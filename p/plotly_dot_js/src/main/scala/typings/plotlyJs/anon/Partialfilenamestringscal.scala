package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  filename :string,   scale :number,   format :'png' | 'svg' | 'jpeg' | 'webp',   height :number,   width :number}> */
trait Partialfilenamestringscal extends StObject {
  
  var filename: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[png | svg | jpeg | webp] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Partialfilenamestringscal {
  
  inline def apply(): Partialfilenamestringscal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfilenamestringscal]
  }
  
  extension [Self <: Partialfilenamestringscal](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFormat(value: png | svg | jpeg | webp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
