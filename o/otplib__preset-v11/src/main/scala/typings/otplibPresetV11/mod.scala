package typings.otplibPresetV11

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object authenticator extends Shortcut {
    
    @JSImport("@otplib/preset-v11", "authenticator")
    @js.native
    val ^ : typings.otplibPresetV11.Authenticator = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@otplib/preset-v11", "authenticator.Authenticator")
    @js.native
    class Authenticator ()
      extends typings.otplibPresetV11.Authenticator
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@otplib/preset-v11", "authenticator.HOTP")
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.HOTP
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@otplib/preset-v11", "authenticator.TOTP")
    @js.native
    class TOTP ()
      extends typings.otplibPresetV11.TOTP
    
    type _To = typings.otplibPresetV11.Authenticator
    
    /* This means you don't have to write `^`, but can instead just say `authenticator.foo` */
    override def _to: typings.otplibPresetV11.Authenticator = ^
  }
  
  object hotp extends Shortcut {
    
    @JSImport("@otplib/preset-v11", "hotp")
    @js.native
    val ^ : typings.otplibPresetV11.HOTP = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@otplib/preset-v11", "hotp.HOTP")
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.HOTP
    
    type _To = typings.otplibPresetV11.HOTP
    
    /* This means you don't have to write `^`, but can instead just say `hotp.foo` */
    override def _to: typings.otplibPresetV11.HOTP = ^
  }
  
  object totp extends Shortcut {
    
    @JSImport("@otplib/preset-v11", "totp")
    @js.native
    val ^ : typings.otplibPresetV11.TOTP = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@otplib/preset-v11", "totp.HOTP")
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.HOTP
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@otplib/preset-v11", "totp.TOTP")
    @js.native
    class TOTP ()
      extends typings.otplibPresetV11.TOTP
    
    type _To = typings.otplibPresetV11.TOTP
    
    /* This means you don't have to write `^`, but can instead just say `totp.foo` */
    override def _to: typings.otplibPresetV11.TOTP = ^
  }
}
