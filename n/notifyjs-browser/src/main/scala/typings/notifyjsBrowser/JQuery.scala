package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def notify(element: js.Any): JQueryStatic
  def notify(element: js.Any, notificationdata: js.Any): JQueryStatic
  def notify(element: js.Any, notificationdata: js.Any, options: NotificationOptions): JQueryStatic
  def notify(element: js.Any, notificationdata: Unit, options: NotificationOptions): JQueryStatic
  def notify(element: Unit, notificationdata: js.Any): JQueryStatic
  def notify(element: Unit, notificationdata: js.Any, options: NotificationOptions): JQueryStatic
  def notify(element: Unit, notificationdata: Unit, options: NotificationOptions): JQueryStatic
  @JSName("notify")
  var notify_Original: JQueryStaticNotify
}
object JQuery {
  
  @scala.inline
  def apply(notify_ : JQueryStaticNotify): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotify_(value: JQueryStaticNotify): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
  }
}
