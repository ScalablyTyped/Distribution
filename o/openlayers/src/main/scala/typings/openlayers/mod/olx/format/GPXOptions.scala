package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Feature
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPXOptions extends StObject {
  
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, Any]] = js.undefined
}
object GPXOptions {
  
  inline def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPXOptions] (val x: Self) extends AnyVal {
    
    inline def setReadExtensions(value: (/* feature */ Feature, /* node */ Node) => Any): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2(value))
    
    inline def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
  }
}
