package typings.ol

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillMod {
  
  @JSImport("ol/style/Fill", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Fill {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Fill extends StObject {
    
    /**
      * Get the fill color.
      */
    def getColor(): Color | ColorLike = js.native
    
    /**
      * Set the color.
      */
    def setColor(color: Color): Unit = js.native
    def setColor(color: ColorLike): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var color: js.UndefOr[Color | ColorLike] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color | ColorLike): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    }
  }
}
