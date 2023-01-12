package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBarcodeQrcodeMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/barcode/QRCode", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with QRCode
  @JSImport("@nginstack/engine/lib/barcode/QRCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/barcode/QRCode", "ECC_HIGH")
  @js.native
  def ECC_HIGH: String = js.native
  inline def ECC_HIGH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECC_HIGH")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/barcode/QRCode", "ECC_LOW")
  @js.native
  def ECC_LOW: String = js.native
  inline def ECC_LOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECC_LOW")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/barcode/QRCode", "ECC_MEDIUM")
  @js.native
  def ECC_MEDIUM: String = js.native
  inline def ECC_MEDIUM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECC_MEDIUM")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/barcode/QRCode", "ECC_QUARTILE")
  @js.native
  def ECC_QUARTILE: String = js.native
  inline def ECC_QUARTILE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECC_QUARTILE")(x.asInstanceOf[js.Any])
  
  inline def toDataURL(content: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(content.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toDataURL(content: String, options: QRCodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def toDataURL(content: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(content.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toDataURL(content: js.typedarray.ArrayBuffer, options: QRCodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def toDataURL(content: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(content.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toDataURL(content: js.typedarray.Uint8Array, options: QRCodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toDataURL")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toFile(content: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(content.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(content: String, path: String, options: QRCodeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(content.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(content: js.typedarray.ArrayBuffer, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(content.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(content: js.typedarray.ArrayBuffer, path: String, options: QRCodeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(content.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(content: js.typedarray.Uint8Array, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(content.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toFile(content: js.typedarray.Uint8Array, path: String, options: QRCodeOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toFile")(content.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toUint8Array(content: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(content.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUint8Array(content: String, options: QRCodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUint8Array(content: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(content.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUint8Array(content: js.typedarray.ArrayBuffer, options: QRCodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUint8Array(content: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(content.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUint8Array(content: js.typedarray.Uint8Array, options: QRCodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  trait QRCode extends StObject
  
  trait QRCodeOptions extends StObject {
    
    var darkColor: js.UndefOr[String] = js.undefined
    
    var errorCorrection: js.UndefOr[String] = js.undefined
    
    var ignoreContrastCheck: js.UndefOr[Boolean] = js.undefined
    
    var lightColor: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object QRCodeOptions {
    
    inline def apply(): QRCodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QRCodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QRCodeOptions] (val x: Self) extends AnyVal {
      
      inline def setDarkColor(value: String): Self = StObject.set(x, "darkColor", value.asInstanceOf[js.Any])
      
      inline def setDarkColorUndefined: Self = StObject.set(x, "darkColor", js.undefined)
      
      inline def setErrorCorrection(value: String): Self = StObject.set(x, "errorCorrection", value.asInstanceOf[js.Any])
      
      inline def setErrorCorrectionUndefined: Self = StObject.set(x, "errorCorrection", js.undefined)
      
      inline def setIgnoreContrastCheck(value: Boolean): Self = StObject.set(x, "ignoreContrastCheck", value.asInstanceOf[js.Any])
      
      inline def setIgnoreContrastCheckUndefined: Self = StObject.set(x, "ignoreContrastCheck", js.undefined)
      
      inline def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
