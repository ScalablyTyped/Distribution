package typings.nextServer

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataManagerMod {
  
  @JSImport("next-server/dist/lib/data-manager", "DataManager")
  @js.native
  class DataManager () extends StObject {
    def this(data: js.Any) = this()
    
    var data: Map[String, js.Any] = js.native
    
    def get(key: String): js.Any = js.native
    
    def getData(): Map[String, js.Any] = js.native
    
    def overwrite(data: js.Any): Unit = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
  }
}
