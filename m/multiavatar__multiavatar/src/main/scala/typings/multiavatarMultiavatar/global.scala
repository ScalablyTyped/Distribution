package typings.multiavatarMultiavatar

import typings.multiavatarMultiavatar.esmMod.AvatarVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    *
    * @param string The text string that will be converted into the avatar.
    * @param sansEnv If this is true, the script returns the final avatar without the circle background (environment part)
    * @param ver An optional object to force a specific initial version
    */
  inline def multiavatar(string: String): String = js.Dynamic.global.applyDynamic("multiavatar")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def multiavatar(string: String, sansEnv: Boolean): String = (js.Dynamic.global.applyDynamic("multiavatar")(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def multiavatar(string: String, sansEnv: Boolean, ver: AvatarVersion): String = (js.Dynamic.global.applyDynamic("multiavatar")(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def multiavatar(string: String, sansEnv: Unit, ver: AvatarVersion): String = (js.Dynamic.global.applyDynamic("multiavatar")(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[String]
}
