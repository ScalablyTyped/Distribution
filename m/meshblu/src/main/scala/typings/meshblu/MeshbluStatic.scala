package typings.meshblu

import typings.meshblu.Meshblu.Connection
import typings.meshblu.Meshblu.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshbluStatic extends js.Object {
  
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
  implicit class MeshbluStaticOps[Self <: MeshbluStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateConnection(value: ConnectionOptions => Connection): Self = this.set("createConnection", js.Any.fromFunction1(value))
  }
}
