package typings
package pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait parsingErrorCode extends js.Object

@JSImport("pg-minify/pgMinify", "parsingErrorCode")
@js.native
object parsingErrorCode extends js.Object {
      // Multi-line quoted identifiers are not supported.
  @js.native
  sealed trait multiLineQI
    extends pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs.parsingErrorCode
  
  @js.native
  sealed trait nestedMLC
    extends pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs.parsingErrorCode
  
      // Unclosed multi-line comment.
  @js.native
  sealed trait unclosedMLC
    extends pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs.parsingErrorCode
  
       // Unclosed quoted identifier.
  @js.native
  sealed trait unclosedQI
    extends pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs.parsingErrorCode
  
     // Unclosed text block.
  @js.native
  sealed trait unclosedText
    extends pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs.parsingErrorCode
  
}

