package typings.nodeHorseman

import typings.nodeHorseman.nodeHorsemanStrings.A3
import typings.nodeHorseman.nodeHorsemanStrings.A4
import typings.nodeHorseman.nodeHorsemanStrings.A5
import typings.nodeHorseman.nodeHorsemanStrings.Legal
import typings.nodeHorseman.nodeHorsemanStrings.Letter
import typings.nodeHorseman.nodeHorsemanStrings.Tabloid
import typings.nodeHorseman.nodeHorsemanStrings.landscape
import typings.nodeHorseman.nodeHorsemanStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Format extends StObject {
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
}
