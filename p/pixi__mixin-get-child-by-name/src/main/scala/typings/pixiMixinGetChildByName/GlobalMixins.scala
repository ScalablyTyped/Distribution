package typings.pixiMixinGetChildByName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  @js.native
  trait Container extends StObject {
    
    def getChildByName[T /* <: typings.pixiDisplay.mod.DisplayObject */](name: String): T = js.native
    def getChildByName[T /* <: typings.pixiDisplay.mod.DisplayObject */](name: String, deep: Boolean): T = js.native
  }
  
  trait DisplayObject extends StObject {
    
    var name: String
  }
  object DisplayObject {
    
    inline def apply(name: String): DisplayObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayObject]
    }
    
    extension [Self <: DisplayObject](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
