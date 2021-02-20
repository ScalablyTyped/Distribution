package typings.pad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Char extends StObject {
    
    var char: js.UndefOr[String] = js.native
    
    var colors: js.UndefOr[Boolean] = js.native
    
    var strip: js.UndefOr[Boolean] = js.native
  }
  object Char {
    
    @scala.inline
    def apply(): Char = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Char]
    }
    
    @scala.inline
    implicit class CharMutableBuilder[Self <: Char] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    }
  }
}
