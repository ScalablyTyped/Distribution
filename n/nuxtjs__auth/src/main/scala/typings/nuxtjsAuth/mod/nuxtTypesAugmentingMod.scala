package typings.nuxtjsAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nuxt/types", JSImport.Namespace)
@js.native
object nuxtTypesAugmentingMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    @JSName("$auth")
    var $auth: Auth[_] = js.native
  }
  
}

