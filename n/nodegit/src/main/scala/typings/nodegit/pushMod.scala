package typings.nodegit

import typings.nodegit.pushOptionsMod.PushOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/push", JSImport.Namespace)
@js.native
object pushMod extends js.Object {
  @js.native
  class Push () extends js.Object
  
  /* static members */
  @js.native
  object Push extends js.Object {
    def initOptions(opts: PushOptions, version: Double): Double = js.native
  }
  
}

