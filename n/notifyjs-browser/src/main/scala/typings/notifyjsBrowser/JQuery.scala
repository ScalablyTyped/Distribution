package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def notify(element: Any): JQueryStatic
  def notify(element: Any, notificationdata: Any): JQueryStatic
  def notify(element: Any, notificationdata: Any, options: NotificationOptions): JQueryStatic
  def notify(element: Any, notificationdata: Unit, options: NotificationOptions): JQueryStatic
  def notify(element: Unit, notificationdata: Any): JQueryStatic
  def notify(element: Unit, notificationdata: Any, options: NotificationOptions): JQueryStatic
  def notify(element: Unit, notificationdata: Unit, options: NotificationOptions): JQueryStatic
  @JSName("notify")
  var notify_Original: JQueryStaticNotify
}
object JQuery {
  
  inline def apply(notify_ : JQueryStaticNotify): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setNotify_(value: JQueryStaticNotify): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
  }
}
