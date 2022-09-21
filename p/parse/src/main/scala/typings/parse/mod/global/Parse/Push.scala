package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions to deal with Push in Parse
  */
object Push {
  
  @JSGlobal("Parse.Push")
  @js.native
  val ^ : js.Any = js.native
  
  inline def send[T](data: PushData): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def send[T](data: PushData, options: SendOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait PushData extends StObject {
    
    var alert: js.UndefOr[String] = js.undefined
    
    var badge: js.UndefOr[String] = js.undefined
    
    var channels: js.UndefOr[js.Array[String]] = js.undefined
    
    var content_available: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var expiration_interval: js.UndefOr[Double] = js.undefined
    
    var expiration_time: js.UndefOr[js.Date] = js.undefined
    
    var notification: js.UndefOr[Any] = js.undefined
    
    var push_time: js.UndefOr[js.Date] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var where: js.UndefOr[Query[Installation[Attributes]]] = js.undefined
  }
  object PushData {
    
    inline def apply(): PushData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushData]
    }
    
    extension [Self <: PushData](x: Self) {
      
      inline def setAlert(value: String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setContent_available(value: Any): Self = StObject.set(x, "content_available", value.asInstanceOf[js.Any])
      
      inline def setContent_availableUndefined: Self = StObject.set(x, "content_available", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExpiration_interval(value: Double): Self = StObject.set(x, "expiration_interval", value.asInstanceOf[js.Any])
      
      inline def setExpiration_intervalUndefined: Self = StObject.set(x, "expiration_interval", js.undefined)
      
      inline def setExpiration_time(value: js.Date): Self = StObject.set(x, "expiration_time", value.asInstanceOf[js.Any])
      
      inline def setExpiration_timeUndefined: Self = StObject.set(x, "expiration_time", js.undefined)
      
      inline def setNotification(value: Any): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      inline def setPush_time(value: js.Date): Self = StObject.set(x, "push_time", value.asInstanceOf[js.Any])
      
      inline def setPush_timeUndefined: Self = StObject.set(x, "push_time", js.undefined)
      
      inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWhere(value: Query[Installation[Attributes]]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
  
  trait SendOptions
    extends StObject
       with UseMasterKeyOption {
    
    var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SendOptions {
    
    inline def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    extension [Self <: SendOptions](x: Self) {
      
      inline def setError(value: /* error */ Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
