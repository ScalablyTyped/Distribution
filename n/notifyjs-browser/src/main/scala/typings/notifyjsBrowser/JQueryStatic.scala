package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
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
object JQueryStatic {
  
  @scala.inline
  def apply(notify_ : JQueryStaticNotify): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotify_(value: JQueryStaticNotify): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
  }
}
