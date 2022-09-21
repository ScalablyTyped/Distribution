package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ScreenDisplay")
@js.native
/* protected */ open class ScreenDisplay () extends StObject {
  
  /**
    * @remarks
    * Clears the title and subtitle, if currently displayed.
    * @throws This function can throw errors.
    */
  def clearTitle(): Unit = js.native
  
  /**
    * @remarks
    * Set the action bar text - a piece of text that displays
    * beneath the title and above the hot-bar.
    * @param text
    * @throws This function can throw errors.
    */
  def setActionBar(text: String): Unit = js.native
  
  /**
    * @remarks
    * Will cause a title to show up on the player's on screen
    * display. You can optionally specify an additional subtitle
    * as well as fade in, stay and fade out times.
    * @param title
    * @param options
    * @throws This function can throw errors.
    */
  def setTitle(title: String): Unit = js.native
  def setTitle(title: String, options: TitleDisplayOptions): Unit = js.native
  
  /**
    * @remarks
    * Updates the subtitle if the subtitle was previously
    * displayed via the setTitle method.
    * @param subtitle
    * @throws This function can throw errors.
    */
  def updateSubtitle(subtitle: String): Unit = js.native
}
