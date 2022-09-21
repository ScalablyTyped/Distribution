package typings.phaser.Phaser.Types

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Create {
  
  type GenerateTextureCallback = js.Function2[/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D, Unit]
  
  trait GenerateTextureConfig extends StObject {
    
    /**
      * The HTML Canvas to draw the texture to.
      */
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    /**
      * Should the canvas be cleared before the texture is drawn?
      */
    var clearCanvas: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of data, where each row is a string of single values 0-9A-F, or the period character.
      */
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * The indexed palette that the data cell values map to.
      */
    var palette: js.UndefOr[Palette] = js.undefined
    
    /**
      * The height of each 'pixel' in the generated texture.
      */
    var pixelHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of each 'pixel' in the generated texture.
      */
    var pixelWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * A callback to send the canvas to after the texture has been drawn.
      */
    var postRender: js.UndefOr[GenerateTextureCallback] = js.undefined
    
    /**
      * A callback to send the canvas to prior to the texture being drawn.
      */
    var preRender: js.UndefOr[GenerateTextureCallback] = js.undefined
    
    /**
      * Should the canvas be resized before the texture is drawn?
      */
    var resizeCanvas: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateTextureConfig {
    
    inline def apply(): GenerateTextureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateTextureConfig]
    }
    
    extension [Self <: GenerateTextureConfig](x: Self) {
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
      
      inline def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPixelHeight(value: Double): Self = StObject.set(x, "pixelHeight", value.asInstanceOf[js.Any])
      
      inline def setPixelHeightUndefined: Self = StObject.set(x, "pixelHeight", js.undefined)
      
      inline def setPixelWidth(value: Double): Self = StObject.set(x, "pixelWidth", value.asInstanceOf[js.Any])
      
      inline def setPixelWidthUndefined: Self = StObject.set(x, "pixelWidth", js.undefined)
      
      inline def setPostRender(value: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "postRender", js.Any.fromFunction2(value))
      
      inline def setPostRenderUndefined: Self = StObject.set(x, "postRender", js.undefined)
      
      inline def setPreRender(value: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction2(value))
      
      inline def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      inline def setResizeCanvas(value: Boolean): Self = StObject.set(x, "resizeCanvas", value.asInstanceOf[js.Any])
      
      inline def setResizeCanvasUndefined: Self = StObject.set(x, "resizeCanvas", js.undefined)
    }
  }
  
  trait Palette extends StObject {
    
    /**
      * Color value 1.
      */
    var `0`: String
    
    /**
      * Color value 2.
      */
    var `1`: String
    
    /**
      * Color value 3.
      */
    var `2`: String
    
    /**
      * Color value 4.
      */
    var `3`: String
    
    /**
      * Color value 5.
      */
    var `4`: String
    
    /**
      * Color value 6.
      */
    var `5`: String
    
    /**
      * Color value 7.
      */
    var `6`: String
    
    /**
      * Color value 8.
      */
    var `7`: String
    
    /**
      * Color value 9.
      */
    var `8`: String
    
    /**
      * Color value 10.
      */
    var `9`: String
    
    /**
      * Color value 11.
      */
    var A: String
    
    /**
      * Color value 12.
      */
    var B: String
    
    /**
      * Color value 13.
      */
    var C: String
    
    /**
      * Color value 14.
      */
    var D: String
    
    /**
      * Color value 15.
      */
    var E: String
    
    /**
      * Color value 16.
      */
    var F: String
  }
  object Palette {
    
    inline def apply(
      `0`: String,
      `1`: String,
      `2`: String,
      `3`: String,
      `4`: String,
      `5`: String,
      `6`: String,
      `7`: String,
      `8`: String,
      `9`: String,
      A: String,
      B: String,
      C: String,
      D: String,
      E: String,
      F: String
    ): Palette = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], C = C.asInstanceOf[js.Any], D = D.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any])
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
      __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
      __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Palette]
    }
    
    extension [Self <: Palette](x: Self) {
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      inline def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
      
      inline def setA(value: String): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
    }
  }
}
