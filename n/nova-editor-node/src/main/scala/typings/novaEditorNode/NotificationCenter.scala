package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/notification-center/
@js.native
trait NotificationCenter extends StObject {
  
  def add(request: NotificationRequest): js.Promise[NotificationResponse] = js.native
  
  def cancel(identifier: String): Unit = js.native
}
object NotificationCenter {
  
  @scala.inline
  def apply(add: NotificationRequest => js.Promise[NotificationResponse], cancel: String => Unit): NotificationCenter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[NotificationCenter]
  }
  
  @scala.inline
  implicit class NotificationCenterMutableBuilder[Self <: NotificationCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: NotificationRequest => js.Promise[NotificationResponse]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancel(value: String => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
  }
}
