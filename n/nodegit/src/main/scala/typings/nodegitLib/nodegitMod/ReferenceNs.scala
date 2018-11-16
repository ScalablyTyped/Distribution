package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reference")
@js.native
object ReferenceNs extends js.Object {
  @js.native
  object NORMALIZE extends js.Object {
    /* 1 */ val REF_FORMAT_ALLOW_ONELEVEL: nodegitLib.referenceMod.ReferenceNs.NORMALIZE.REF_FORMAT_ALLOW_ONELEVEL with scala.Double = js.native
    /* 0 */ val REF_FORMAT_NORMAL: nodegitLib.referenceMod.ReferenceNs.NORMALIZE.REF_FORMAT_NORMAL with scala.Double = js.native
    /* 2 */ val REF_FORMAT_REFSPEC_PATTERN: nodegitLib.referenceMod.ReferenceNs.NORMALIZE.REF_FORMAT_REFSPEC_PATTERN with scala.Double = js.native
    /* 4 */ val REF_FORMAT_REFSPEC_SHORTHAND: nodegitLib.referenceMod.ReferenceNs.NORMALIZE.REF_FORMAT_REFSPEC_SHORTHAND with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.referenceMod.ReferenceNs.NORMALIZE with scala.Double] = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 0 */ val INVALID: nodegitLib.referenceMod.ReferenceNs.TYPE.INVALID with scala.Double = js.native
    /* 3 */ val LISTALL: nodegitLib.referenceMod.ReferenceNs.TYPE.LISTALL with scala.Double = js.native
    /* 1 */ val OID: nodegitLib.referenceMod.ReferenceNs.TYPE.OID with scala.Double = js.native
    /* 2 */ val SYMBOLIC: nodegitLib.referenceMod.ReferenceNs.TYPE.SYMBOLIC with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.referenceMod.ReferenceNs.TYPE with scala.Double] = js.native
  }
  
  type NORMALIZE = nodegitLib.referenceMod.ReferenceNs.NORMALIZE
  type TYPE = nodegitLib.referenceMod.ReferenceNs.TYPE
}

