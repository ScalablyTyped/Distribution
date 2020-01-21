package typings.nuxtjsAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nuxt/vue-app", JSImport.Namespace)
@js.native
object nuxtVueAppAugmentingMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    @JSName("$auth")
    var $auth: Auth[_] = js.native
  }
  
}

