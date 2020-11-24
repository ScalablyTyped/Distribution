package typings.mutexify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mutexify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Lock = js.native
  
  @js.native
  trait Lock extends js.Object {
    
    def apply(fn: Release): Double = js.native
    
    var locked: Boolean = js.native
  }
  
  type Release = js.Function3[
    /* cb */ js.Function2[/* err */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], js.Any], 
    /* err */ js.Any, 
    /* value */ js.Any, 
    Unit
  ]
}
