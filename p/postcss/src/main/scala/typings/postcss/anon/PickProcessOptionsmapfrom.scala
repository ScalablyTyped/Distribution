package typings.postcss.anon

import typings.postcss.mod.SourceMapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<postcss.postcss.ProcessOptions, 'map' | 'from'> */
trait PickProcessOptionsmapfrom extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
}
object PickProcessOptionsmapfrom {
  
  inline def apply(): PickProcessOptionsmapfrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickProcessOptionsmapfrom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickProcessOptionsmapfrom] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
