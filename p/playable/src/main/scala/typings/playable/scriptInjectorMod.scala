package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptInjectorMod {
  
  @JSImport("playable/dist/src/utils/script-injector", JSImport.Default)
  @js.native
  def default(src: String): Unit = js.native
  @JSImport("playable/dist/src/utils/script-injector", JSImport.Default)
  @js.native
  def default(src: String, props: IScriptAttributes): Unit = js.native
  
  @js.native
  trait IScriptAttributes extends StObject {
    
    var async: Boolean = js.native
    
    var crossOrigin: String | Null = js.native
    
    var text: String = js.native
    
    var `type`: String = js.native
  }
  object IScriptAttributes {
    
    @scala.inline
    def apply(async: Boolean, text: String, `type`: String): IScriptAttributes = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScriptAttributes]
    }
    
    @scala.inline
    implicit class IScriptAttributesMutableBuilder[Self <: IScriptAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
