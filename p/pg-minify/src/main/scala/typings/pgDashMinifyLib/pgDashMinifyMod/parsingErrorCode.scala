package typings
package pgDashMinifyLib.pgDashMinifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait parsingErrorCode extends js.Object

@JSImport("pg-minify", "parsingErrorCode")
@js.native
object parsingErrorCode extends js.Object {
      // Multi-line quoted identifiers are not supported.
  @js.native
  sealed trait multiLineQI
    extends pgDashMinifyLib.pgDashMinifyMod.parsingErrorCode
  
  @js.native
  sealed trait nestedMLC
    extends pgDashMinifyLib.pgDashMinifyMod.parsingErrorCode
  
      // Unclosed multi-line comment.
  @js.native
  sealed trait unclosedMLC
    extends pgDashMinifyLib.pgDashMinifyMod.parsingErrorCode
  
       // Unclosed quoted identifier.
  @js.native
  sealed trait unclosedQI
    extends pgDashMinifyLib.pgDashMinifyMod.parsingErrorCode
  
     // Unclosed text block.
  @js.native
  sealed trait unclosedText
    extends pgDashMinifyLib.pgDashMinifyMod.parsingErrorCode
  
  /* 3 */ val multiLineQI: multiLineQI with scala.Double = js.native
  /* 4 */ val nestedMLC: nestedMLC with scala.Double = js.native
  /* 0 */ val unclosedMLC: unclosedMLC with scala.Double = js.native
  /* 2 */ val unclosedQI: unclosedQI with scala.Double = js.native
  /* 1 */ val unclosedText: unclosedText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pgDashMinifyLib.pgDashMinifyMod.parsingErrorCode with scala.Double] = js.native
}

