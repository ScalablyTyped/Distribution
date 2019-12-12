package typings.pgDashMinify.pgDashMinifyMod

import org.scalablytyped.runtime.TopLevel
import typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.multiLineQI
import typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedMLC
import typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedQI
import typings.pgDashMinify.pgDashMinifyMod.parsingErrorCode.unclosedText
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[parsingErrorCode with Double] = js.native
  /* 3 */ @js.native
  object multiLineQI extends TopLevel[multiLineQI with Double]
  
  /* 0 */ @js.native
  object unclosedMLC extends TopLevel[unclosedMLC with Double]
  
  /* 2 */ @js.native
  object unclosedQI extends TopLevel[unclosedQI with Double]
  
  /* 1 */ @js.native
  object unclosedText extends TopLevel[unclosedText with Double]
  
}

