package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorInfo
  extends StObject
     with IStyleInfo {
  
  var value: String
}
object IColorInfo {
  
  inline def apply(value: String): IColorInfo = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColorInfo] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
