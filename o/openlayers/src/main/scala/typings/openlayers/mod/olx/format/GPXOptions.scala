package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Feature
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPXOptions extends StObject {
  
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, js.Any]] = js.undefined
}
object GPXOptions {
  
  inline def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  
  extension [Self <: GPXOptions](x: Self) {
    
    inline def setReadExtensions(value: (/* feature */ Feature, /* node */ Node) => js.Any): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2(value))
    
    inline def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
  }
}
