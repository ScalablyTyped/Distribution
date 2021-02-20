package typings.parse.mod.global.Parse

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions to deal with Push in Parse
  */
object Push {
  
  @JSGlobal("Parse.Push.send")
  @js.native
  def send[T](data: PushData): js.Promise[T] = js.native
  @JSGlobal("Parse.Push.send")
  @js.native
  def send[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
  
  @js.native
  trait PushData extends StObject {
    
    var alert: js.UndefOr[String] = js.native
    
    var badge: js.UndefOr[String] = js.native
    
    var channels: js.UndefOr[js.Array[String]] = js.native
    
    var content_available: js.UndefOr[js.Any] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var expiration_interval: js.UndefOr[Double] = js.native
    
    var expiration_time: js.UndefOr[Date] = js.native
    
    var notification: js.UndefOr[js.Any] = js.native
    
    var push_time: js.UndefOr[Date] = js.native
    
    var sound: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var where: js.UndefOr[Query[typings.parse.mod.global.Parse.Installation[Attributes]]] = js.native
  }
  object PushData {
    
    @scala.inline
    def apply(): PushData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushData]
    }
    
    @scala.inline
    implicit class PushDataMutableBuilder[Self <: PushData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
      
      @scala.inline
      def setContent_available(value: js.Any): Self = StObject.set(x, "content_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_availableUndefined: Self = StObject.set(x, "content_available", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setExpiration_interval(value: Double): Self = StObject.set(x, "expiration_interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiration_intervalUndefined: Self = StObject.set(x, "expiration_interval", js.undefined)
      
      @scala.inline
      def setExpiration_time(value: Date): Self = StObject.set(x, "expiration_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiration_timeUndefined: Self = StObject.set(x, "expiration_time", js.undefined)
      
      @scala.inline
      def setNotification(value: js.Any): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      @scala.inline
      def setPush_time(value: Date): Self = StObject.set(x, "push_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush_timeUndefined: Self = StObject.set(x, "push_time", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWhere(value: Query[typings.parse.mod.global.Parse.Installation[Attributes]]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
  
  @js.native
  trait SendOptions extends UseMasterKeyOption {
    
    var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    var success: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object SendOptions {
    
    @scala.inline
    def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* error */ Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
