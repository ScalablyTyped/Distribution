package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDeltaDecoration extends StObject {
  
  /**
    * Options associated with this decoration.
    */
  var options: IModelDecorationOptions
  
  /**
    * Range that this decoration covers.
    */
  var range: IRange
}
object IModelDeltaDecoration {
  
  inline def apply(options: IModelDecorationOptions, range: IRange): IModelDeltaDecoration = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDeltaDecoration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModelDeltaDecoration] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: IModelDecorationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
