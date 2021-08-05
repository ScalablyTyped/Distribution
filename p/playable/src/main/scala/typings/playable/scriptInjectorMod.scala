package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptInjectorMod {
  
  @JSImport("playable/dist/src/utils/script-injector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(src: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(src: String, props: IScriptAttributes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IScriptAttributes extends StObject {
    
    var async: Boolean
    
    var crossOrigin: String | Null
    
    var text: String
    
    var `type`: String
  }
  object IScriptAttributes {
    
    inline def apply(async: Boolean, text: String, `type`: String): IScriptAttributes = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], crossOrigin = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScriptAttributes]
    }
    
    extension [Self <: IScriptAttributes](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
