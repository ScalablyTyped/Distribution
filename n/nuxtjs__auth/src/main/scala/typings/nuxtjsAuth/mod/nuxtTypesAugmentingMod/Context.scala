package typings.nuxtjsAuth.mod.nuxtTypesAugmentingMod

import typings.nuxtjsAuth.mod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  @JSName("$auth")
  var $auth: Auth[_]
}

object Context {
  @scala.inline
  def apply($auth: Auth[_]): Context = {
    val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

