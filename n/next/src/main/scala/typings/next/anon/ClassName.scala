package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var styles: typings.react.mod.global.JSX.Element
}
object ClassName {
  
  inline def apply(className: String, styles: typings.react.mod.global.JSX.Element): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
