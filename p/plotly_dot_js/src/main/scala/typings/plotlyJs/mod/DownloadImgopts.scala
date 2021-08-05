package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.jpeg
import typings.plotlyJs.plotlyJsStrings.png
import typings.plotlyJs.plotlyJsStrings.svg
import typings.plotlyJs.plotlyJsStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadImgopts extends StObject {
  
  var filename: String
  
  var format: jpeg | png | webp | svg
  
  var height: Double
  
  var width: Double
}
object DownloadImgopts {
  
  inline def apply(filename: String, format: jpeg | png | webp | svg, height: Double, width: Double): DownloadImgopts = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadImgopts]
  }
  
  extension [Self <: DownloadImgopts](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: jpeg | png | webp | svg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
