package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cliargs extends js.Object {
  var cli_args: js.Array[String]
  var port: Double
  var server_path: String
  var start_process: Boolean
}

object Cliargs {
  @scala.inline
  def apply(cli_args: js.Array[String], port: Double, server_path: String, start_process: Boolean): Cliargs = {
    val __obj = js.Dynamic.literal(cli_args = cli_args.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cliargs]
  }
}

