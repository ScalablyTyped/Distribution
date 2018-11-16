package typings
package nodegitLib.referenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/reference", "Reference")
@js.native
object ReferenceNs extends js.Object {
  @js.native
  sealed trait NORMALIZE extends js.Object
  
  @js.native
  sealed trait TYPE extends js.Object
  
  @js.native
  object NORMALIZE extends js.Object {
    @js.native
    sealed trait REF_FORMAT_ALLOW_ONELEVEL
      extends nodegitLib.referenceMod.ReferenceNs.NORMALIZE
    
    @js.native
    sealed trait REF_FORMAT_NORMAL
      extends nodegitLib.referenceMod.ReferenceNs.NORMALIZE
    
    @js.native
    sealed trait REF_FORMAT_REFSPEC_PATTERN
      extends nodegitLib.referenceMod.ReferenceNs.NORMALIZE
    
    @js.native
    sealed trait REF_FORMAT_REFSPEC_SHORTHAND
      extends nodegitLib.referenceMod.ReferenceNs.NORMALIZE
    
    /* 1 */ val REF_FORMAT_ALLOW_ONELEVEL: REF_FORMAT_ALLOW_ONELEVEL with scala.Double = js.native
    /* 0 */ val REF_FORMAT_NORMAL: REF_FORMAT_NORMAL with scala.Double = js.native
    /* 2 */ val REF_FORMAT_REFSPEC_PATTERN: REF_FORMAT_REFSPEC_PATTERN with scala.Double = js.native
    /* 4 */ val REF_FORMAT_REFSPEC_SHORTHAND: REF_FORMAT_REFSPEC_SHORTHAND with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.referenceMod.ReferenceNs.NORMALIZE with scala.Double] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    @js.native
    sealed trait INVALID
      extends nodegitLib.referenceMod.ReferenceNs.TYPE
    
    @js.native
    sealed trait LISTALL
      extends nodegitLib.referenceMod.ReferenceNs.TYPE
    
    @js.native
    sealed trait OID
      extends nodegitLib.referenceMod.ReferenceNs.TYPE
    
    @js.native
    sealed trait SYMBOLIC
      extends nodegitLib.referenceMod.ReferenceNs.TYPE
    
    /* 0 */ val INVALID: INVALID with scala.Double = js.native
    /* 3 */ val LISTALL: LISTALL with scala.Double = js.native
    /* 1 */ val OID: OID with scala.Double = js.native
    /* 2 */ val SYMBOLIC: SYMBOLIC with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.referenceMod.ReferenceNs.TYPE with scala.Double] = js.native
  }
  
}

