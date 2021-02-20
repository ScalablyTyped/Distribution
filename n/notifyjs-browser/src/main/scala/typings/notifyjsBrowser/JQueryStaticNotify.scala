package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStaticNotify extends StObject {
  
  /**
    * notify user
    * @param element a jquery element
    * @param notificationdata global notification data
    * @param options notification options
    */
  def apply(): JQueryStatic = js.native
  def apply(
    element: js.UndefOr[scala.Nothing],
    notificationdata: js.UndefOr[scala.Nothing],
    options: NotificationOptions
  ): JQueryStatic = js.native
  def apply(element: js.UndefOr[scala.Nothing], notificationdata: js.Any): JQueryStatic = js.native
  def apply(element: js.UndefOr[scala.Nothing], notificationdata: js.Any, options: NotificationOptions): JQueryStatic = js.native
  def apply(element: js.Any): JQueryStatic = js.native
  def apply(element: js.Any, notificationdata: js.UndefOr[scala.Nothing], options: NotificationOptions): JQueryStatic = js.native
  def apply(element: js.Any, notificationdata: js.Any): JQueryStatic = js.native
  def apply(element: js.Any, notificationdata: js.Any, options: NotificationOptions): JQueryStatic = js.native
  
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
