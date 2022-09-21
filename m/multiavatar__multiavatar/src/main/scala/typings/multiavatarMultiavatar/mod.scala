package typings.multiavatarMultiavatar

import typings.multiavatarMultiavatar.esmMod.AvatarVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * @param string The text string that will be converted into the avatar.
    * @param sansEnv If this is true, the script returns the final avatar without the circle background (environment part)
    * @param ver An optional object to force a specific initial version
    */
  inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(string: String, sansEnv: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(string: String, sansEnv: Boolean, ver: AvatarVersion): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(string: String, sansEnv: Unit, ver: AvatarVersion): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], sansEnv.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@multiavatar/multiavatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
