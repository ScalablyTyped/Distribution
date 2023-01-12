package typings.popoto.anon

import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToolbar extends StObject {
  
  var TOOL_CENTER: String
  
  var TOOL_FIT_TEXT: String
  
  var TOOL_FULL_SCREEN: String
  
  var TOOL_RELATION: String
  
  var TOOL_RESET: String
  
  var TOOL_SAVE: String
  
  var TOOL_TAXONOMY: String
  
  def render(container: SVGGElement): Unit
}
object TypeofToolbar {
  
  inline def apply(
    TOOL_CENTER: String,
    TOOL_FIT_TEXT: String,
    TOOL_FULL_SCREEN: String,
    TOOL_RELATION: String,
    TOOL_RESET: String,
    TOOL_SAVE: String,
    TOOL_TAXONOMY: String,
    render: SVGGElement => Unit
  ): TypeofToolbar = {
    val __obj = js.Dynamic.literal(TOOL_CENTER = TOOL_CENTER.asInstanceOf[js.Any], TOOL_FIT_TEXT = TOOL_FIT_TEXT.asInstanceOf[js.Any], TOOL_FULL_SCREEN = TOOL_FULL_SCREEN.asInstanceOf[js.Any], TOOL_RELATION = TOOL_RELATION.asInstanceOf[js.Any], TOOL_RESET = TOOL_RESET.asInstanceOf[js.Any], TOOL_SAVE = TOOL_SAVE.asInstanceOf[js.Any], TOOL_TAXONOMY = TOOL_TAXONOMY.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[TypeofToolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofToolbar] (val x: Self) extends AnyVal {
    
    inline def setRender(value: SVGGElement => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setTOOL_CENTER(value: String): Self = StObject.set(x, "TOOL_CENTER", value.asInstanceOf[js.Any])
    
    inline def setTOOL_FIT_TEXT(value: String): Self = StObject.set(x, "TOOL_FIT_TEXT", value.asInstanceOf[js.Any])
    
    inline def setTOOL_FULL_SCREEN(value: String): Self = StObject.set(x, "TOOL_FULL_SCREEN", value.asInstanceOf[js.Any])
    
    inline def setTOOL_RELATION(value: String): Self = StObject.set(x, "TOOL_RELATION", value.asInstanceOf[js.Any])
    
    inline def setTOOL_RESET(value: String): Self = StObject.set(x, "TOOL_RESET", value.asInstanceOf[js.Any])
    
    inline def setTOOL_SAVE(value: String): Self = StObject.set(x, "TOOL_SAVE", value.asInstanceOf[js.Any])
    
    inline def setTOOL_TAXONOMY(value: String): Self = StObject.set(x, "TOOL_TAXONOMY", value.asInstanceOf[js.Any])
  }
}
