package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outlinecolor extends StObject {
  
  var outlinecolor: typings.plotlyJs.mod.Color
}
object Outlinecolor {
  
  inline def apply(outlinecolor: typings.plotlyJs.mod.Color): Outlinecolor = {
    val __obj = js.Dynamic.literal(outlinecolor = outlinecolor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outlinecolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outlinecolor] (val x: Self) extends AnyVal {
    
    inline def setOutlinecolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outlinecolor", value.asInstanceOf[js.Any])
    
    inline def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outlinecolor", js.Array(value*))
  }
}
