package typings.openfin.shapesPlatformMod

import typings.openfin.shapesLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceLayoutOpts extends StObject {
  
  var layout: Layout
}
object ReplaceLayoutOpts {
  
  inline def apply(layout: Layout): ReplaceLayoutOpts = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceLayoutOpts]
  }
  
  extension [Self <: ReplaceLayoutOpts](x: Self) {
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
