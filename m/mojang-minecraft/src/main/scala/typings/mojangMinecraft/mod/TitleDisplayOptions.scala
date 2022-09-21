package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "TitleDisplayOptions")
@js.native
open class TitleDisplayOptions () extends StObject {
  
  /**
    * Fade-in time for the title and subtitle, in seconds.
    */
  var fadeInSeconds: Double = js.native
  
  /**
    * Fade-out time for the title and subtitle, in seconds.
    */
  var fadeOutSeconds: Double = js.native
  
  /**
    * Amount of time for the title and subtitle to stay in place.
    */
  var staySeconds: Double = js.native
  
  /**
    * Optional subtitle text.
    */
  var subtitle: js.UndefOr[String] = js.native
}
