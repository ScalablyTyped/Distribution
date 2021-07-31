package typings.mutexify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Lock = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Lock]
  
  @JSImport("mutexify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Lock extends StObject {
    
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
