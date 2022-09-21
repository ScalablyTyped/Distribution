package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
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
object JQueryStatic {
  
  inline def apply(notify_ : JQueryStaticNotify): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setNotify_(value: JQueryStaticNotify): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
  }
}
