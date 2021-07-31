package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerDataPushSink extends StObject {
  
  def OnServerDataPush(RequestID: Double, JsonDataContent: String): Unit
}
object IServerDataPushSink {
  
  @scala.inline
  def apply(OnServerDataPush: (Double, String) => Unit): IServerDataPushSink = {
    val __obj = js.Dynamic.literal(OnServerDataPush = js.Any.fromFunction2(OnServerDataPush))
    __obj.asInstanceOf[IServerDataPushSink]
  }
  
  @scala.inline
  implicit class IServerDataPushSinkMutableBuilder[Self <: IServerDataPushSink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnServerDataPush(value: (Double, String) => Unit): Self = StObject.set(x, "OnServerDataPush", js.Any.fromFunction2(value))
  }
}
