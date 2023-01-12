package typings.multiavatarMultiavatar

import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.A
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.B
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.C
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`00`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`01`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`02`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`03`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`04`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`05`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`06`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`07`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`08`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`09`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`10`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`11`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`12`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`13`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`14`
import typings.multiavatarMultiavatar.multiavatarMultiavatarStrings.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("@multiavatar/multiavatar/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param string The text string that will be converted into the avatar.
    * @param sansEnv If this is true, the script returns the final avatar without the circle background (environment part)
    * @param ver An optional object to force a specific initial version
    */
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, sansEnv: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(string: String, sansEnv: Boolean, ver: AvatarVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(string: String, sansEnv: Unit, ver: AvatarVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait AvatarVersion extends StObject {
    
    var part: js.UndefOr[
        `00` | `01` | `02` | `03` | `04` | `05` | `06` | `07` | `08` | `09` | `10` | `11` | `12` | `13` | `14` | `15`
      ] = js.undefined
    
    var theme: js.UndefOr[A | B | C] = js.undefined
  }
  object AvatarVersion {
    
    inline def apply(): AvatarVersion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarVersion] (val x: Self) extends AnyVal {
      
      inline def setPart(
        value: `00` | `01` | `02` | `03` | `04` | `05` | `06` | `07` | `08` | `09` | `10` | `11` | `12` | `13` | `14` | `15`
      ): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      inline def setTheme(value: A | B | C): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
