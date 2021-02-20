package typings.palx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("palx", JSImport.Namespace)
  @js.native
  def apply(hex: String): PalxPalette = js.native
  @JSImport("palx", JSImport.Namespace)
  @js.native
  def apply(hex: String, options: js.Object): PalxPalette = js.native
  
  @js.native
  trait PalxPalette
    extends /* name */ StringDictionary[String | js.Array[String]] {
    
    var base: String = js.native
    
    var black: String = js.native
    
    var blue: js.Array[String] = js.native
    
    var cyan: js.Array[String] = js.native
    
    var fuschia: js.Array[String] = js.native
    
    var gray: js.Array[String] = js.native
    
    var green: js.Array[String] = js.native
    
    var indigo: js.Array[String] = js.native
    
    var lime: js.Array[String] = js.native
    
    var orange: js.Array[String] = js.native
    
    var pink: js.Array[String] = js.native
    
    var red: js.Array[String] = js.native
    
    var teal: js.Array[String] = js.native
    
    var violet: js.Array[String] = js.native
    
    var yellow: js.Array[String] = js.native
  }
  object PalxPalette {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PalxPaletteMutableBuilder[Self <: PalxPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue(value: js.Array[String]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueVarargs(value: String*): Self = StObject.set(x, "blue", js.Array(value :_*))
      
      @scala.inline
      def setCyan(value: js.Array[String]): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyanVarargs(value: String*): Self = StObject.set(x, "cyan", js.Array(value :_*))
      
      @scala.inline
      def setFuschia(value: js.Array[String]): Self = StObject.set(x, "fuschia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuschiaVarargs(value: String*): Self = StObject.set(x, "fuschia", js.Array(value :_*))
      
      @scala.inline
      def setGray(value: js.Array[String]): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayVarargs(value: String*): Self = StObject.set(x, "gray", js.Array(value :_*))
      
      @scala.inline
      def setGreen(value: js.Array[String]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenVarargs(value: String*): Self = StObject.set(x, "green", js.Array(value :_*))
      
      @scala.inline
      def setIndigo(value: js.Array[String]): Self = StObject.set(x, "indigo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndigoVarargs(value: String*): Self = StObject.set(x, "indigo", js.Array(value :_*))
      
      @scala.inline
      def setLime(value: js.Array[String]): Self = StObject.set(x, "lime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimeVarargs(value: String*): Self = StObject.set(x, "lime", js.Array(value :_*))
      
      @scala.inline
      def setOrange(value: js.Array[String]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrangeVarargs(value: String*): Self = StObject.set(x, "orange", js.Array(value :_*))
      
      @scala.inline
      def setPink(value: js.Array[String]): Self = StObject.set(x, "pink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinkVarargs(value: String*): Self = StObject.set(x, "pink", js.Array(value :_*))
      
      @scala.inline
      def setRed(value: js.Array[String]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedVarargs(value: String*): Self = StObject.set(x, "red", js.Array(value :_*))
      
      @scala.inline
      def setTeal(value: js.Array[String]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTealVarargs(value: String*): Self = StObject.set(x, "teal", js.Array(value :_*))
      
      @scala.inline
      def setViolet(value: js.Array[String]): Self = StObject.set(x, "violet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVioletVarargs(value: String*): Self = StObject.set(x, "violet", js.Array(value :_*))
      
      @scala.inline
      def setYellow(value: js.Array[String]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYellowVarargs(value: String*): Self = StObject.set(x, "yellow", js.Array(value :_*))
    }
  }
}
