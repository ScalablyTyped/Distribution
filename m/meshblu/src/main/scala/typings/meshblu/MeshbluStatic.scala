package typings.meshblu

import typings.meshblu.Meshblu.Connection
import typings.meshblu.Meshblu.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshbluStatic extends StObject {
  
  /**
    * Establish a secure socket.io connection to Meshblu.
    * @param opt
    * @returns A Meshblu Connection.
    */
  def createConnection(opt: ConnectionOptions): Connection = js.native
}
object MeshbluStatic {
  
  @scala.inline
  def apply(createConnection: ConnectionOptions => Connection): MeshbluStatic = {
    val __obj = js.Dynamic.literal(createConnection = js.Any.fromFunction1(createConnection))
    __obj.asInstanceOf[MeshbluStatic]
  }
  
  @scala.inline
  implicit class MeshbluStaticMutableBuilder[Self <: MeshbluStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateConnection(value: ConnectionOptions => Connection): Self = StObject.set(x, "createConnection", js.Any.fromFunction1(value))
  }
}
