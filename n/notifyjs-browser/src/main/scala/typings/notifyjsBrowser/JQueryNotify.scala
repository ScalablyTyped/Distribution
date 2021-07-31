package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryNotify extends StObject {
  
  /**
    * notify user
    * @param element a jquery element
    * @param notificationdata global notification data
    * @param options notification options
    */
  def apply(): JQuery = js.native
  def apply(element: js.Any): JQuery = js.native
  def apply(element: js.Any, notificationdata: js.Any): JQuery = js.native
  def apply(element: js.Any, notificationdata: js.Any, options: NotificationOptions): JQuery = js.native
  def apply(element: js.Any, notificationdata: Unit, options: NotificationOptions): JQuery = js.native
  def apply(element: Unit, notificationdata: js.Any): JQuery = js.native
  def apply(element: Unit, notificationdata: js.Any, options: NotificationOptions): JQuery = js.native
  def apply(element: Unit, notificationdata: Unit, options: NotificationOptions): JQuery = js.native
  
  /**
    * Add style
    * @param styleName style name
    * @param styleDefinition style definition object
    */
  def addStyle(styleName: String, styleDefinition: js.Any): js.Any = js.native
  
  /**
    * Set defaults for notifications
    * @param options notification iptions
    */
  def defaults(options: NotificationOptions): js.Any = js.native
  
  /**
    * Get style
    * @param styleName style name
    */
  def getStyle(styleName: String): js.Any = js.native
  
  /**
    * Insert css
    * @param cssText css text to insert
    */
  def insertCSS(cssText: String): js.Any = js.native
  
  /**
    * Remove style
    * @param styleName style name
    */
  def removeStyle(styleName: String): js.Any = js.native
}
