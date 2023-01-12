package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/color-presentation-context/
trait ColorPresentationContext extends StObject {
  
  val range: Range
}
object ColorPresentationContext {
  
  inline def apply(range: Range): ColorPresentationContext = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPresentationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorPresentationContext] (val x: Self) extends AnyVal {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
