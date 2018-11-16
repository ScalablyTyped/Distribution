package typings
package nodegitLib.attrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/attr", "Attr")
@js.native
object AttrNs extends js.Object {
  @js.native
  sealed trait STATES extends js.Object
  
  @js.native
  object STATES extends js.Object {
    @js.native
    sealed trait FALSE_T
      extends nodegitLib.attrMod.AttrNs.STATES
    
    @js.native
    sealed trait TRUE_T
      extends nodegitLib.attrMod.AttrNs.STATES
    
    @js.native
    sealed trait UNSPECIFIED_T
      extends nodegitLib.attrMod.AttrNs.STATES
    
    @js.native
    sealed trait VALUE_T
      extends nodegitLib.attrMod.AttrNs.STATES
    
    /* 2 */ val FALSE_T: FALSE_T with scala.Double = js.native
    /* 1 */ val TRUE_T: TRUE_T with scala.Double = js.native
    /* 0 */ val UNSPECIFIED_T: UNSPECIFIED_T with scala.Double = js.native
    /* 3 */ val VALUE_T: VALUE_T with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.attrMod.AttrNs.STATES with scala.Double] = js.native
  }
  
}

