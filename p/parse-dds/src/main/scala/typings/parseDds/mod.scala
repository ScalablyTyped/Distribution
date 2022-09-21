package typings.parseDds

import typings.parseDds.anon.Length
import typings.parseDds.parseDdsStrings.dxt1
import typings.parseDds.parseDdsStrings.dxt3
import typings.parseDds.parseDdsStrings.dxt5
import typings.parseDds.parseDdsStrings.rgba32f
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buffer: js.typedarray.ArrayBuffer): DdsInfo = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[DdsInfo]
  
  @JSImport("parse-dds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DdsInfo extends StObject {
    
    var cubemap: Boolean
    
    var flags: Double
    
    var format: dxt1 | dxt3 | dxt5 | rgba32f
    
    var images: js.Array[Length]
    
    // width, height
    var shape: js.Tuple2[Double, Double]
  }
  object DdsInfo {
    
    inline def apply(
      cubemap: Boolean,
      flags: Double,
      format: dxt1 | dxt3 | dxt5 | rgba32f,
      images: js.Array[Length],
      shape: js.Tuple2[Double, Double]
    ): DdsInfo = {
      val __obj = js.Dynamic.literal(cubemap = cubemap.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[DdsInfo]
    }
    
    extension [Self <: DdsInfo](x: Self) {
      
      inline def setCubemap(value: Boolean): Self = StObject.set(x, "cubemap", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: dxt1 | dxt3 | dxt5 | rgba32f): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[Length]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Length*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
}
