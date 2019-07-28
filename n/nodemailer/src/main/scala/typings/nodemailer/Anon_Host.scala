package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var port: Double
  var secure: Boolean
}

object Anon_Host {
  @scala.inline
  def apply(host: String, port: Double, secure: Boolean): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, port = port, secure = secure)
  
    __obj.asInstanceOf[Anon_Host]
  }
}

