package typings.parchment

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/class", JSImport.Namespace)
@js.native
object distSrcAttributorClassMod extends js.Object {
  @js.native
  trait ClassAttributor
    extends typings.parchment.distSrcAttributorAttributorMod.default
  
  @js.native
  class default () extends ClassAttributor
  
  /* static members */
  @js.native
  object default extends js.Object {
    def keys(node: HTMLElement): js.Array[String] = js.native
  }
  
}

