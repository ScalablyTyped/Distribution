package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* =================== USAGE ===================
    import orientjs = require('orientjs');
    let dbserver = orientjs({
    host: 'localhost',
    port: 2424,
    username: 'root',
    password: 'root'
    });
    let db = dbserver.use({
    name: 'mytestdb',
    username: 'root',
    password: 'root'
    });
    =============================================== */
  /**
    * A lightweight definiton for orientjs module, Official node.js driver for OrientDB.
    *
    * @description Official node.js driver for OrientDB. Fast, lightweight, uses the binary protocol.
    *
    * @author Saeed Tabrizi (saeed a_t nowcando.com)
    * @version 3.0.1
    */
  /**
    * Make a orientdb server client in binary protocol  .
    * @param config The configuration for server connection.
    */
  def apply(config: ServerConfig): Server = js.native
}

