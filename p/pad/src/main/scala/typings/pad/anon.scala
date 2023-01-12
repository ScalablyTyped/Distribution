package typings.pad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Char extends StObject {
    
    var char: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var strip: js.UndefOr[Boolean] = js.undefined
  }
  object Char {
    
    inline def apply(): Char = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Char]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Char] (val x: Self) extends AnyVal {
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    }
  }
}
