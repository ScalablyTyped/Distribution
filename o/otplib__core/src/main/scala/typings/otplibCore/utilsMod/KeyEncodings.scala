package typings.otplibCore.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyEncodings extends js.Object
@JSImport("@otplib/core/utils", "KeyEncodings")
@js.native
object KeyEncodings extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KeyEncodings with String] = js.native
  
  @js.native
  sealed trait ASCII extends KeyEncodings
  /* "ascii" */ @js.native
  object ASCII extends TopLevel[ASCII with String]
  
  @js.native
  sealed trait BASE64 extends KeyEncodings
  /* "base64" */ @js.native
  object BASE64 extends TopLevel[BASE64 with String]
  
  @js.native
  sealed trait HEX extends KeyEncodings
  /* "hex" */ @js.native
  object HEX extends TopLevel[HEX with String]
  
  @js.native
  sealed trait LATIN1 extends KeyEncodings
  /* "latin1" */ @js.native
  object LATIN1 extends TopLevel[LATIN1 with String]
  
  @js.native
  sealed trait UTF8 extends KeyEncodings
  /* "utf8" */ @js.native
  object UTF8 extends TopLevel[UTF8 with String]
}
