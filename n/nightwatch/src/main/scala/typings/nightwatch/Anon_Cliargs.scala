package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cliargs extends js.Object {
  var cli_args: js.Array[String]
  var port: Double
  var server_path: String
  var start_process: Boolean
}

object Anon_Cliargs {
  @scala.inline
  def apply(cli_args: js.Array[String], port: Double, server_path: String, start_process: Boolean): Anon_Cliargs = {
    val __obj = js.Dynamic.literal(cli_args = cli_args, port = port, server_path = server_path, start_process = start_process)
  
    __obj.asInstanceOf[Anon_Cliargs]
  }
}

