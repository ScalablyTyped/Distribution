package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecorationGlyphMarginOptions extends StObject {
  
  /**
    * The position in the glyph margin.
    */
  var position: GlyphMarginLane
}
object IModelDecorationGlyphMarginOptions {
  
  inline def apply(position: GlyphMarginLane): IModelDecorationGlyphMarginOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationGlyphMarginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModelDecorationGlyphMarginOptions] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: GlyphMarginLane): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
