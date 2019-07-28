package typings.nodeDashVault

import typings.nodeDashVault.nodeDashVaultMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Any
  var request: Option
  var statusCode: Double
}

object Anon_Body {
  @scala.inline
  def apply(body: js.Any, request: Option, statusCode: Double): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, request = request, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

