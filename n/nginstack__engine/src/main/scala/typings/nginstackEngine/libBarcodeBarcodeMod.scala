package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBarcodeBarcodeMod {
  
  inline def apply(code: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/barcode/Barcode", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Barcode {
    def this(code: String, `type`: String) = this()
    
    /* CompleteClass */
    var angle: Double = js.native
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    override def getJpegImage(): js.typedarray.ArrayBuffer = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/engine/lib/barcode/Barcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/barcode/Barcode", "CODE_128_A")
  @js.native
  val CODE_128_A: String = js.native
  
  @JSImport("@nginstack/engine/lib/barcode/Barcode", "CODE_128_B")
  @js.native
  val CODE_128_B: String = js.native
  
  @JSImport("@nginstack/engine/lib/barcode/Barcode", "CODE_128_C")
  @js.native
  val CODE_128_C: String = js.native
  
  @JSImport("@nginstack/engine/lib/barcode/Barcode", "CODE_2_5_INTERLEAVED")
  @js.native
  val CODE_2_5_INTERLEAVED: String = js.native
  
  @JSImport("@nginstack/engine/lib/barcode/Barcode", "CODE_EAN13")
  @js.native
  val CODE_EAN13: String = js.native
  
  trait Barcode extends StObject {
    
    var angle: Double
    
    var code: String
    
    def getJpegImage(): js.typedarray.ArrayBuffer
    
    var height: Double
    
    var `type`: String
  }
  object Barcode {
    
    inline def apply(
      angle: Double,
      code: String,
      getJpegImage: () => js.typedarray.ArrayBuffer,
      height: Double,
      `type`: String
    ): Barcode = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], getJpegImage = js.Any.fromFunction0(getJpegImage), height = height.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Barcode]
    }
    
    extension [Self <: Barcode](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setGetJpegImage(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "getJpegImage", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
