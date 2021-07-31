package typings.openfin

import typings.openfin.contextChannelsMod.AppChannelTransport
import typings.openfin.contextChannelsMod.Channel
import typings.openfin.contextChannelsMod.ChannelChangedEvent
import typings.openfin.contextChannelsMod.ChannelId
import typings.openfin.contextChannelsMod.SystemChannelTransport
import typings.openfin.contextMod.Context
import typings.openfin.directoryMod.AppName
import typings.openfin.directoryMod.Application
import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`channel-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  @JSImport("openfin/_v2/fdc3/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openfin/_v2/fdc3/main", "AppChannel")
  @js.native
  class AppChannel protected ()
    extends typings.openfin.contextChannelsMod.AppChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: AppChannelTransport) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ApplicationError")
  @js.native
  object ApplicationError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ApplicationError & String] = js.native
    
    /* "ApplicationError:LaunchError" */ val LaunchError: typings.openfin.errorsMod.ApplicationError.LaunchError & String = js.native
    
    /* "ApplicationError:LaunchTimeout" */ val LaunchTimeout: typings.openfin.errorsMod.ApplicationError.LaunchTimeout & String = js.native
    
    /* "ApplicationError:NotFound" */ val NotFound: typings.openfin.errorsMod.ApplicationError.NotFound & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ChannelBase")
  @js.native
  abstract class ChannelBase protected ()
    extends typings.openfin.contextChannelsMod.ChannelBase {
    protected def this(id: String, `type`: String) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ChannelError")
  @js.native
  object ChannelError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ChannelError & String] = js.native
    
    /* "ChannelError:ChannelWithIdDoesNotExist" */ val ChannelWithIdDoesNotExist: typings.openfin.errorsMod.ChannelError.ChannelWithIdDoesNotExist & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ConnectionError")
  @js.native
  object ConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ConnectionError & String] = js.native
    
    /* "ConnectionError:WindowWithIdentityNotFound" */ val WindowWithIdentityNotFound: typings.openfin.errorsMod.ConnectionError.WindowWithIdentityNotFound & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "DefaultChannel")
  @js.native
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  class DefaultChannel_ ()
    extends typings.openfin.contextChannelsMod.DefaultChannel_
  
  @JSImport("openfin/_v2/fdc3/main", "FDC3Error")
  @js.native
  class FDC3Error protected ()
    extends typings.openfin.errorsMod.FDC3Error {
    def this(code: String, message: String) = this()
  }
  
  @JSImport("openfin/_v2/fdc3/main", "Intents")
  @js.native
  object Intents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.intentsMod.Intents & String] = js.native
    
    /* "DialCall" */ val DIAL_CALL: typings.openfin.intentsMod.Intents.DIAL_CALL & String = js.native
    
    /* "SaveContact" */ val SAVE_CONTACT: typings.openfin.intentsMod.Intents.SAVE_CONTACT & String = js.native
    
    /* "SaveInstrument" */ val SAVE_INSTRUMENT: typings.openfin.intentsMod.Intents.SAVE_INSTRUMENT & String = js.native
    
    /* "ShareContext" */ val SHARE_CONTEXT: typings.openfin.intentsMod.Intents.SHARE_CONTEXT & String = js.native
    
    /* "StartCall" */ val START_CALL: typings.openfin.intentsMod.Intents.START_CALL & String = js.native
    
    /* "StartChat" */ val START_CHAT: typings.openfin.intentsMod.Intents.START_CHAT & String = js.native
    
    /* "ViewChart" */ val VIEW_CHART: typings.openfin.intentsMod.Intents.VIEW_CHART & String = js.native
    
    /* "ViewContact" */ val VIEW_CONTACT: typings.openfin.intentsMod.Intents.VIEW_CONTACT & String = js.native
    
    /* "ViewNews" */ val VIEW_NEWS: typings.openfin.intentsMod.Intents.VIEW_NEWS & String = js.native
    
    /* "ViewQuote" */ val VIEW_QUOTE: typings.openfin.intentsMod.Intents.VIEW_QUOTE & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "ResolveError")
  @js.native
  object ResolveError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ResolveError & String] = js.native
    
    /* "ResolveError:AppDoesNotHandleIntent" */ val AppDoesNotHandleIntent: typings.openfin.errorsMod.ResolveError.AppDoesNotHandleIntent & String = js.native
    
    /* "ResolveError:NoAppsFound" */ val NoAppsFound: typings.openfin.errorsMod.ResolveError.NoAppsFound & String = js.native
    
    /* "ResolveError:ResolverClosedOrCancelled" */ val ResolverClosedOrCancelled: typings.openfin.errorsMod.ResolveError.ResolverClosedOrCancelled & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "SendContextError")
  @js.native
  object SendContextError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.SendContextError & String] = js.native
    
    /* "SendContextError:HandlerError" */ val HandlerError: typings.openfin.errorsMod.SendContextError.HandlerError & String = js.native
    
    /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typings.openfin.errorsMod.SendContextError.HandlerTimeout & String = js.native
    
    /* "SendContextError:NoHandler" */ val NoHandler: typings.openfin.errorsMod.SendContextError.NoHandler & String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/main", "SystemChannel")
  @js.native
  class SystemChannel protected ()
    extends typings.openfin.contextChannelsMod.SystemChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: SystemChannelTransport) = this()
  }
  
  @scala.inline
  def addContextListener(handler: js.Function1[/* context */ Context, Unit]): ContextListener = ^.asInstanceOf[js.Dynamic].applyDynamic("addContextListener")(handler.asInstanceOf[js.Any]).asInstanceOf[ContextListener]
  
  @scala.inline
  def addEventListener_channelchanged(eventType: `channel-changed`, handler: js.Function1[/* event */ ChannelChangedEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addIntentListener(intent: String, handler: js.Function1[/* context */ Context, js.Any]): IntentListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addIntentListener")(intent.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IntentListener]
  
  @scala.inline
  def broadcast(context: Context): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("openfin/_v2/fdc3/main", "defaultChannel")
  @js.native
  val defaultChannel: typings.openfin.contextChannelsMod.DefaultChannel_ = js.native
  
  @scala.inline
  def findIntent(intent: String): js.Promise[AppIntent] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIntent")(intent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppIntent]]
  @scala.inline
  def findIntent(intent: String, context: Context): js.Promise[AppIntent] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIntent")(intent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppIntent]]
  
  @scala.inline
  def findIntentsByContext(context: Context): js.Promise[js.Array[AppIntent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIntentsByContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AppIntent]]]
  
  @scala.inline
  def getChannelById(channelId: ChannelId): js.Promise[Channel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelById")(channelId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Channel]]
  
  @scala.inline
  def getCurrentChannel(): js.Promise[Channel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentChannel")().asInstanceOf[js.Promise[Channel]]
  @scala.inline
  def getCurrentChannel(identity: Identity): js.Promise[Channel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentChannel")(identity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Channel]]
  
  @scala.inline
  def getOrCreateAppChannel(name: String): js.Promise[typings.openfin.contextChannelsMod.AppChannel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateAppChannel")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.openfin.contextChannelsMod.AppChannel]]
  
  @scala.inline
  def getSystemChannels(): js.Promise[js.Array[typings.openfin.contextChannelsMod.SystemChannel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemChannels")().asInstanceOf[js.Promise[js.Array[typings.openfin.contextChannelsMod.SystemChannel]]]
  
  @scala.inline
  def open(name: AppName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def open(name: AppName, context: Context): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def raiseIntent(intent: String, context: Context): js.Promise[IntentResolution] = (^.asInstanceOf[js.Dynamic].applyDynamic("raiseIntent")(intent.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IntentResolution]]
  @scala.inline
  def raiseIntent(intent: String, context: Context, target: AppName): js.Promise[IntentResolution] = (^.asInstanceOf[js.Dynamic].applyDynamic("raiseIntent")(intent.asInstanceOf[js.Any], context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IntentResolution]]
  
  @scala.inline
  def removeEventListener_channelchanged(eventType: `channel-changed`, handler: js.Function1[/* event */ ChannelChangedEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AppIntent extends StObject {
    
    /**
      * An array of applications that are associated with this intent.
      */
    var apps: js.Array[Application]
    
    /**
      * Descriptor of this intent.
      */
    var intent: IntentMetadata
  }
  object AppIntent {
    
    @scala.inline
    def apply(apps: js.Array[Application], intent: IntentMetadata): AppIntent = {
      val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppIntent]
    }
    
    @scala.inline
    implicit class AppIntentMutableBuilder[Self <: AppIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApps(value: js.Array[Application]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppsVarargs(value: Application*): Self = StObject.set(x, "apps", js.Array(value :_*))
      
      @scala.inline
      def setIntent(value: IntentMetadata): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextListener
    extends StObject
       with Listener {
    
    /**
      * The handler for when this listener receives a context broadcast.
      */
    def handler(context: Context): Unit
    
    /**
      * Unsubscribe the listener object. We will no longer receive context messages on this handler.
      *
      * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
      * [[addContextListener]] again to create a new listener object.
      */
    def unsubscribe(): Unit
  }
  object ContextListener {
    
    @scala.inline
    def apply(handler: Context => Unit, unsubscribe: () => Unit): ContextListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ContextListener]
    }
    
    @scala.inline
    implicit class ContextListenerMutableBuilder[Self <: ContextListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Context => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait IntentListener
    extends StObject
       with Listener {
    
    /**
      * The handler for when this listener receives an intent.
      */
    def handler(context: Context): js.Any | js.Promise[js.Any]
    
    /**
      * The intent name that we are listening to. Is whatever is passed into [[addIntentListener]].
      */
    var intent: String
    
    /**
      * Unsubscribe the listener object. We will no longer receive intent messages on this handler.
      *
      * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
      * [[addIntentListener]] again to create a new listener object.
      */
    def unsubscribe(): Unit
  }
  object IntentListener {
    
    @scala.inline
    def apply(handler: Context => js.Any | js.Promise[js.Any], intent: String, unsubscribe: () => Unit): IntentListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[IntentListener]
    }
    
    @scala.inline
    implicit class IntentListenerMutableBuilder[Self <: IntentListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Context => js.Any | js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait IntentMetadata extends StObject {
    
    /**
      * The human-readable name of the intent.
      */
    var displayName: String
    
    /**
      * The machine readable name of the intent.
      */
    var name: String
  }
  object IntentMetadata {
    
    @scala.inline
    def apply(displayName: String, name: String): IntentMetadata = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentMetadata]
    }
    
    @scala.inline
    implicit class IntentMetadataMutableBuilder[Self <: IntentMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntentResolution extends StObject {
    
    /**
      * Any data returned by the target application's intent listener.
      *
      * If the target application registered multiple listeners, this will be the first non-`undefined` value returned
      * by a listener.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The machine-readable name of the app that resolved this intent.
      */
    var source: AppName
    
    /**
      * For future use. Right now always the string `'1.0.0'`.
      */
    var version: String
  }
  object IntentResolution {
    
    @scala.inline
    def apply(source: AppName, version: String): IntentResolution = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentResolution]
    }
    
    @scala.inline
    implicit class IntentResolutionMutableBuilder[Self <: IntentResolution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setSource(value: AppName): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.mainMod.ContextListener
    - typings.openfin.mainMod.IntentListener
    - typings.openfin.contextChannelsMod.ChannelContextListener
  */
  trait Listener extends StObject
  object Listener {
    
    @scala.inline
    def ChannelContextListener(channel: Channel, handler: Context => Unit, unsubscribe: () => Unit): typings.openfin.contextChannelsMod.ChannelContextListener = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[typings.openfin.contextChannelsMod.ChannelContextListener]
    }
    
    @scala.inline
    def ContextListener(handler: Context => Unit, unsubscribe: () => Unit): typings.openfin.mainMod.ContextListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[typings.openfin.mainMod.ContextListener]
    }
    
    @scala.inline
    def IntentListener(handler: Context => js.Any | js.Promise[js.Any], intent: String, unsubscribe: () => Unit): typings.openfin.mainMod.IntentListener = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[typings.openfin.mainMod.IntentListener]
    }
  }
}
