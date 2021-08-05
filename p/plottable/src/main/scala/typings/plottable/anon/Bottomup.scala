package typings.plottable.anon

import typings.plottable.plottableStrings.bottomup
import typings.plottable.plottableStrings.topdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottomup extends StObject {
  
  var bottomup: typings.plottable.plottableStrings.bottomup
  
  var topdown: typings.plottable.plottableStrings.topdown
}
object Bottomup {
  
  inline def apply(): Bottomup = {
    val __obj = js.Dynamic.literal(bottomup = "bottomup", topdown = "topdown")
    __obj.asInstanceOf[Bottomup]
  }
  
  extension [Self <: Bottomup](x: Self) {
    
    inline def setBottomup(value: bottomup): Self = StObject.set(x, "bottomup", value.asInstanceOf[js.Any])
    
    inline def setTopdown(value: topdown): Self = StObject.set(x, "topdown", value.asInstanceOf[js.Any])
  }
}
