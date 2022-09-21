package typings.palx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(hex: String): PalxPalette = ^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any]).asInstanceOf[PalxPalette]
  inline def apply(hex: String, options: js.Object): PalxPalette = (^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PalxPalette]
  
  @JSImport("palx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PalxPalette
    extends StObject
       with /* name */ StringDictionary[String | js.Array[String]] {
    
    var base: String
    
    var black: String
    
    var blue: js.Array[String]
    
    var cyan: js.Array[String]
    
    var fuschia: js.Array[String]
    
    var gray: js.Array[String]
    
    var green: js.Array[String]
    
    var indigo: js.Array[String]
    
    var lime: js.Array[String]
    
    var orange: js.Array[String]
    
    var pink: js.Array[String]
    
    var red: js.Array[String]
    
    var teal: js.Array[String]
    
    var violet: js.Array[String]
    
    var yellow: js.Array[String]
  }
  object PalxPalette {
    
    inline def apply(
      base: String,
      black: String,
      blue: js.Array[String],
      cyan: js.Array[String],
      fuschia: js.Array[String],
      gray: js.Array[String],
      green: js.Array[String],
      indigo: js.Array[String],
      lime: js.Array[String],
      orange: js.Array[String],
      pink: js.Array[String],
      red: js.Array[String],
      teal: js.Array[String],
      violet: js.Array[String],
      yellow: js.Array[String]
    ): PalxPalette = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], fuschia = fuschia.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], violet = violet.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
      __obj.asInstanceOf[PalxPalette]
    }
    
    extension [Self <: PalxPalette](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: js.Array[String]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBlueVarargs(value: String*): Self = StObject.set(x, "blue", js.Array(value*))
      
      inline def setCyan(value: js.Array[String]): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
      
      inline def setCyanVarargs(value: String*): Self = StObject.set(x, "cyan", js.Array(value*))
      
      inline def setFuschia(value: js.Array[String]): Self = StObject.set(x, "fuschia", value.asInstanceOf[js.Any])
      
      inline def setFuschiaVarargs(value: String*): Self = StObject.set(x, "fuschia", js.Array(value*))
      
      inline def setGray(value: js.Array[String]): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      inline def setGrayVarargs(value: String*): Self = StObject.set(x, "gray", js.Array(value*))
      
      inline def setGreen(value: js.Array[String]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setGreenVarargs(value: String*): Self = StObject.set(x, "green", js.Array(value*))
      
      inline def setIndigo(value: js.Array[String]): Self = StObject.set(x, "indigo", value.asInstanceOf[js.Any])
      
      inline def setIndigoVarargs(value: String*): Self = StObject.set(x, "indigo", js.Array(value*))
      
      inline def setLime(value: js.Array[String]): Self = StObject.set(x, "lime", value.asInstanceOf[js.Any])
      
      inline def setLimeVarargs(value: String*): Self = StObject.set(x, "lime", js.Array(value*))
      
      inline def setOrange(value: js.Array[String]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
      
      inline def setOrangeVarargs(value: String*): Self = StObject.set(x, "orange", js.Array(value*))
      
      inline def setPink(value: js.Array[String]): Self = StObject.set(x, "pink", value.asInstanceOf[js.Any])
      
      inline def setPinkVarargs(value: String*): Self = StObject.set(x, "pink", js.Array(value*))
      
      inline def setRed(value: js.Array[String]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setRedVarargs(value: String*): Self = StObject.set(x, "red", js.Array(value*))
      
      inline def setTeal(value: js.Array[String]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
      
      inline def setTealVarargs(value: String*): Self = StObject.set(x, "teal", js.Array(value*))
      
      inline def setViolet(value: js.Array[String]): Self = StObject.set(x, "violet", value.asInstanceOf[js.Any])
      
      inline def setVioletVarargs(value: String*): Self = StObject.set(x, "violet", js.Array(value*))
      
      inline def setYellow(value: js.Array[String]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
      
      inline def setYellowVarargs(value: String*): Self = StObject.set(x, "yellow", js.Array(value*))
    }
  }
}
