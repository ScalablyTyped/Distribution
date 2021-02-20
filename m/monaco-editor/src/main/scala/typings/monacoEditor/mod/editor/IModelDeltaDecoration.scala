package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDeltaDecoration extends StObject {
  
  /**
    * Options associated with this decoration.
    */
  var options: IModelDecorationOptions = js.native
  
  /**
    * Range that this decoration covers.
    */
  var range: IRange = js.native
}
object IModelDeltaDecoration {
  
  @scala.inline
  def apply(options: IModelDecorationOptions, range: IRange): IModelDeltaDecoration = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDeltaDecoration]
  }
  
  @scala.inline
  implicit class IModelDeltaDecorationMutableBuilder[Self <: IModelDeltaDecoration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IModelDecorationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
