package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * A lightweight definiton for orientjs module, Official node.js driver for OrientDB.
    *
    * @param {orientjs.ServerConfig} config
    * @returns {orientjs.OServer}
    */
  def apply(config: ServerConfig): OServer = js.native
}
