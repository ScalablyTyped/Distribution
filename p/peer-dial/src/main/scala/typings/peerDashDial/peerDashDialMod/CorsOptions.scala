package typings.peerDashDial.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorsOptions extends js.Object {
  var exposedHeaders: js.Array[String]
  var methods: js.Array[String]
  var origin: Boolean
}

object CorsOptions {
  @scala.inline
  def apply(exposedHeaders: js.Array[String], methods: js.Array[String], origin: Boolean): CorsOptions = {
    val __obj = js.Dynamic.literal(exposedHeaders = exposedHeaders, methods = methods, origin = origin)
  
    __obj.asInstanceOf[CorsOptions]
  }
}

