package typings.mutexify

import typings.mutexify.mutexifyMod.Lock
import typings.mutexify.mutexifyMod.Release
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mutexify", JSImport.Namespace)
@js.native
object mutexifyMod extends js.Object {
  @js.native
  trait Lock extends js.Object {
    var locked: Boolean = js.native
    def apply(fn: Release): Double = js.native
  }
  
  def apply(): Lock = js.native
  type Release = js.Function3[
    /* cb */ js.Function2[/* err */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], js.Any], 
    /* err */ js.Any, 
    /* value */ js.Any, 
    Unit
  ]
}

