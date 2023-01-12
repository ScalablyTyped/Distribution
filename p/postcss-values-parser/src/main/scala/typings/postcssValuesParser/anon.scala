package typings.postcssValuesParser

import typings.postcss.mod.SourceMapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Map extends StObject {
    
    var map: js.UndefOr[SourceMapOptions] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object Map {
    
    inline def apply(): Map = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setMap(value: SourceMapOptions): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
