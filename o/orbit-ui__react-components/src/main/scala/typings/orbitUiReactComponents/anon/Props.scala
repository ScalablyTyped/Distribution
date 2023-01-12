package typings.orbitUiReactComponents.anon

import typings.react.mod.ReactElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  var content: ReactElement
  
  var props: Record[String, Any]
}
object Props {
  
  inline def apply(content: ReactElement, props: Record[String, Any]): Props = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
