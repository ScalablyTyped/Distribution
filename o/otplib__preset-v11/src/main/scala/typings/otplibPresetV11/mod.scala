package typings.otplibPresetV11

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@otplib/preset-v11", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object authenticator
    extends TopLevel[typings.otplibPresetV11.Authenticator] {
    @js.native
    class Authenticator ()
      extends typings.otplibPresetV11.Authenticator
    
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.HOTP
    
    @js.native
    class TOTP ()
      extends typings.otplibPresetV11.TOTP
    
  }
  
  @js.native
  object hotp
    extends TopLevel[typings.otplibPresetV11.HOTP] {
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.HOTP
    
  }
  
  @js.native
  object totp
    extends TopLevel[typings.otplibPresetV11.TOTP] {
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.HOTP
    
    @js.native
    class TOTP ()
      extends typings.otplibPresetV11.TOTP
    
  }
  
}

