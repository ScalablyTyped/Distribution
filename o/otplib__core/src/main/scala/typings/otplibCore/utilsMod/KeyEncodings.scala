package typings.otplibCore.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyEncodings extends js.Object

@JSImport("@otplib/core/utils", "KeyEncodings")
@js.native
object KeyEncodings extends js.Object {
  @js.native
  sealed trait ASCII extends KeyEncodings
  
  @js.native
  sealed trait BASE64 extends KeyEncodings
  
  @js.native
  sealed trait HEX extends KeyEncodings
  
  @js.native
  sealed trait LATIN1 extends KeyEncodings
  
  @js.native
  sealed trait UTF8 extends KeyEncodings
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KeyEncodings with String] = js.native
  /* "ascii" */ @js.native
  object ASCII extends TopLevel[ASCII with String]
  
  /* "base64" */ @js.native
  object BASE64 extends TopLevel[BASE64 with String]
  
  /* "hex" */ @js.native
  object HEX extends TopLevel[HEX with String]
  
  /* "latin1" */ @js.native
  object LATIN1 extends TopLevel[LATIN1 with String]
  
  /* "utf8" */ @js.native
  object UTF8 extends TopLevel[UTF8 with String]
  
}

