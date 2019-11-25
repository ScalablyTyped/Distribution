package typings.p2

import typings.p2.p2Mod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: Body
  var `type`: String
}

object Anon_Body {
  @scala.inline
  def apply(body: Body, `type`: String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

