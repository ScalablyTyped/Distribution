package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecorationMinimapOptions
  extends StObject
     with IDecorationOptions {
  
  /**
    * The position in the overview ruler.
    */
  var position: MinimapPosition
}
object IModelDecorationMinimapOptions {
  
  @scala.inline
  def apply(position: MinimapPosition): IModelDecorationMinimapOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationMinimapOptions]
  }
  
  @scala.inline
  implicit class IModelDecorationMinimapOptionsMutableBuilder[Self <: IModelDecorationMinimapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: MinimapPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
