package typings.nextServer

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-server/dist/lib/data-manager", JSImport.Namespace)
@js.native
object dataManagerMod extends js.Object {
  
  @js.native
  class DataManager () extends js.Object {
    def this(data: js.Any) = this()
    
    var data: Map[String, _] = js.native
    
    def get(key: String): js.Any = js.native
    
    def getData(): Map[String, _] = js.native
    
    def overwrite(data: js.Any): Unit = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
  }
}
