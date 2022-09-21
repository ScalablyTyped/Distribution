package typings.paradisebotsapiJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("paradisebotsapi.js", "get")
  @js.native
  open class get protected () extends StObject {
    def this(id: String, auth: String) = this()
    
    def post(server_count: Double, shard_count: Double): js.Promise[Unit] = js.native
  }
}
