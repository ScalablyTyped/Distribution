package typings.otplib

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v11Mod {
  
  object authenticator extends Shortcut {
    
    @JSImport("otplib/v11", "authenticator")
    @js.native
    val ^ : typings.otplibPresetV11.Authenticator = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "authenticator.Authenticator")
    @js.native
    class Authenticator ()
      extends typings.otplibPresetV11.mod.authenticator.Authenticator
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("otplib/v11", "authenticator.Authenticator")
    @js.native
    class AuthenticatorCls ()
      extends typings.otplibPresetV11.Authenticator
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "authenticator.HOTP")
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.mod.authenticator.HOTP
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("otplib/v11", "authenticator.HOTP")
    @js.native
    class HOTPCls ()
      extends typings.otplibPresetV11.HOTP
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "authenticator.TOTP")
    @js.native
    class TOTP ()
      extends typings.otplibPresetV11.mod.authenticator.TOTP
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("otplib/v11", "authenticator.TOTP")
    @js.native
    class TOTPCls ()
      extends typings.otplibPresetV11.TOTP
    
    type _To = typings.otplibPresetV11.Authenticator
    
    /* This means you don't have to write `^`, but can instead just say `authenticator.foo` */
    override def _to: typings.otplibPresetV11.Authenticator = ^
  }
  
  object hotp extends Shortcut {
    
    @JSImport("otplib/v11", "hotp")
    @js.native
    val ^ : typings.otplibPresetV11.HOTP = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "hotp.HOTP")
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.mod.hotp.HOTP
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("otplib/v11", "hotp.HOTP")
    @js.native
    class HOTPCls ()
      extends typings.otplibPresetV11.HOTP
    
    type _To = typings.otplibPresetV11.HOTP
    
    /* This means you don't have to write `^`, but can instead just say `hotp.foo` */
    override def _to: typings.otplibPresetV11.HOTP = ^
  }
  
  object totp extends Shortcut {
    
    @JSImport("otplib/v11", "totp")
    @js.native
    val ^ : typings.otplibPresetV11.TOTP = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "totp.HOTP")
    @js.native
    class HOTP ()
      extends typings.otplibPresetV11.mod.totp.HOTP
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("otplib/v11", "totp.HOTP")
    @js.native
    class HOTPCls ()
      extends typings.otplibPresetV11.HOTP
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "totp.TOTP")
    @js.native
    class TOTP ()
      extends typings.otplibPresetV11.mod.totp.TOTP
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("otplib/v11", "totp.TOTP")
    @js.native
    class TOTPCls ()
      extends typings.otplibPresetV11.TOTP
    
    type _To = typings.otplibPresetV11.TOTP
    
    /* This means you don't have to write `^`, but can instead just say `totp.foo` */
    override def _to: typings.otplibPresetV11.TOTP = ^
  }
}
