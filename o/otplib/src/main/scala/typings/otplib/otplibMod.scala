package typings.otplib

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib", JSImport.Namespace)
@js.native
object otplibMod extends js.Object {
  @js.native
  object authenticator
    extends TopLevel[typings.otplib.Authenticator] {
    @js.native
    class Authenticator ()
      extends typings.otplib.Authenticator
    
    @js.native
    class HOTP ()
      extends typings.otplib.HOTP
    
    @js.native
    class TOTP ()
      extends typings.otplib.TOTP
    
  }
  
  @js.native
  object hotp
    extends TopLevel[typings.otplib.HOTP] {
    @js.native
    class HOTP ()
      extends typings.otplib.HOTP
    
  }
  
  @js.native
  object totp
    extends TopLevel[typings.otplib.TOTP] {
    @js.native
    class HOTP ()
      extends typings.otplib.HOTP
    
    @js.native
    class TOTP ()
      extends typings.otplib.TOTP
    
  }
  
}

