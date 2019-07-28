package typings.pgDashMinify.pgDashMinifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait parsingErrorCode extends js.Object

@JSImport("pg-minify", "parsingErrorCode")
@js.native
object parsingErrorCode extends js.Object {
  @js.native
  sealed trait multiLineQI extends parsingErrorCode
  
      // Unclosed multi-line comment.
  @js.native
  sealed trait unclosedMLC extends parsingErrorCode
  
       // Unclosed quoted identifier.
  @js.native
  sealed trait unclosedQI extends parsingErrorCode
  
     // Unclosed text block.
  @js.native
  sealed trait unclosedText extends parsingErrorCode
  
  /* 3 */ val multiLineQI: typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.multiLineQI with Double = js.native
  /* 0 */ val unclosedMLC: typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedMLC with Double = js.native
  /* 2 */ val unclosedQI: typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedQI with Double = js.native
  /* 1 */ val unclosedText: typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[parsingErrorCode with Double] = js.native
}

