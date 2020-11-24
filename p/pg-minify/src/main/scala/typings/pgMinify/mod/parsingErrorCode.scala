package typings.pgMinify.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait parsingErrorCode extends js.Object
@JSImport("pg-minify", "parsingErrorCode")
@js.native
object parsingErrorCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[parsingErrorCode with Double] = js.native
  
  @js.native
  sealed trait multiLineQI extends parsingErrorCode
  /* 3 */ @js.native
  object multiLineQI extends TopLevel[multiLineQI with Double]
  
      // Unclosed multi-line comment.
  @js.native
  sealed trait unclosedMLC extends parsingErrorCode
  /* 0 */ @js.native
  object unclosedMLC extends TopLevel[unclosedMLC with Double]
  
       // Unclosed quoted identifier.
  @js.native
  sealed trait unclosedQI extends parsingErrorCode
  /* 2 */ @js.native
  object unclosedQI extends TopLevel[unclosedQI with Double]
  
     // Unclosed text block.
  @js.native
  sealed trait unclosedText extends parsingErrorCode
  /* 1 */ @js.native
  object unclosedText extends TopLevel[unclosedText with Double]
}
