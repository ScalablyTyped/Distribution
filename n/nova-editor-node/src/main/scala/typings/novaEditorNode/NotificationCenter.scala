package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/notification-center/
trait NotificationCenter extends StObject {
  
  def add(request: NotificationRequest): js.Promise[NotificationResponse]
  
  def cancel(identifier: String): Unit
}
object NotificationCenter {
  
  inline def apply(add: NotificationRequest => js.Promise[NotificationResponse], cancel: String => Unit): NotificationCenter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[NotificationCenter]
  }
  
  extension [Self <: NotificationCenter](x: Self) {
    
    inline def setAdd(value: NotificationRequest => js.Promise[NotificationResponse]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setCancel(value: String => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
  }
}
