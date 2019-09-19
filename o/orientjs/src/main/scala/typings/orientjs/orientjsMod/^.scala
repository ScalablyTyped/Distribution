package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

