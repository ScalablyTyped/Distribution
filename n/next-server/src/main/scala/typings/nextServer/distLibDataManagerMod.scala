package typings.nextServer

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDataManagerMod {
  
  @JSImport("next-server/dist/lib/data-manager", "DataManager")
  @js.native
  open class DataManager () extends StObject {
    def this(data: Any) = this()
    
    var data: Map[String, Any] = js.native
    
    def get(key: String): Any = js.native
    
    def getData(): Map[String, Any] = js.native
    
    def overwrite(data: Any): Unit = js.native
    
    def set(key: String, value: Any): Unit = js.native
  }
}
