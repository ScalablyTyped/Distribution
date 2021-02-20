package typings.openfin.mod

import typings.openfin.contextChannelsMod.AppChannelTransport
import typings.openfin.contextChannelsMod.SystemChannelTransport
import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`channel-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When running within the OpenFin Runtime, and the `fdc3Api` flag in your manifest is set, your web applications will
  * have access to the "fdc3" namespace without the need to include additional source files. You can treat the "fdc3"
  * namespace as you would the "window", "navigator" or "document" objects.
  */
/* was `typeof imported_main` */
object fdc3 {
  
  @JSImport("openfin", "fdc3.AppChannel")
  @js.native
  class AppChannel protected ()
    extends typings.openfin.mainMod.AppChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: AppChannelTransport) = this()
  }
  
  @JSImport("openfin", "fdc3.ApplicationError")
  @js.native
  object ApplicationError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ApplicationError with String] = js.native
    
    /* "ApplicationError:LaunchError" */ val LaunchError: typings.openfin.errorsMod.ApplicationError.LaunchError with String = js.native
    
    /* "ApplicationError:LaunchTimeout" */ val LaunchTimeout: typings.openfin.errorsMod.ApplicationError.LaunchTimeout with String = js.native
    
    /* "ApplicationError:NotFound" */ val NotFound: typings.openfin.errorsMod.ApplicationError.NotFound with String = js.native
  }
  type ApplicationError = typings.openfin.errorsMod.ApplicationError
  
  @JSImport("openfin", "fdc3.ChannelBase")
  @js.native
  abstract class ChannelBase protected ()
    extends typings.openfin.mainMod.ChannelBase {
    protected def this(id: String, `type`: String) = this()
  }
  
  @JSImport("openfin", "fdc3.ChannelError")
  @js.native
  object ChannelError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ChannelError with String] = js.native
    
    /* "ChannelError:ChannelWithIdDoesNotExist" */ val ChannelWithIdDoesNotExist: typings.openfin.errorsMod.ChannelError.ChannelWithIdDoesNotExist with String = js.native
  }
  type ChannelError = typings.openfin.errorsMod.ChannelError
  
  @JSImport("openfin", "fdc3.ConnectionError")
  @js.native
  object ConnectionError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ConnectionError with String] = js.native
    
    /* "ConnectionError:WindowWithIdentityNotFound" */ val WindowWithIdentityNotFound: typings.openfin.errorsMod.ConnectionError.WindowWithIdentityNotFound with String = js.native
  }
  type ConnectionError = typings.openfin.errorsMod.ConnectionError
  
  @JSImport("openfin", "fdc3.DefaultChannel")
  @js.native
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  class DefaultChannel_ ()
    extends typings.openfin.mainMod.DefaultChannel_
  
  @JSImport("openfin", "fdc3.FDC3Error")
  @js.native
  class FDC3Error protected ()
    extends typings.openfin.mainMod.FDC3Error {
    def this(code: String, message: String) = this()
  }
  
  @JSImport("openfin", "fdc3.Intents")
  @js.native
  object Intents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.intentsMod.Intents with String] = js.native
    
    /* "DialCall" */ val DIAL_CALL: typings.openfin.intentsMod.Intents.DIAL_CALL with String = js.native
    
    /* "SaveContact" */ val SAVE_CONTACT: typings.openfin.intentsMod.Intents.SAVE_CONTACT with String = js.native
    
    /* "SaveInstrument" */ val SAVE_INSTRUMENT: typings.openfin.intentsMod.Intents.SAVE_INSTRUMENT with String = js.native
    
    /* "ShareContext" */ val SHARE_CONTEXT: typings.openfin.intentsMod.Intents.SHARE_CONTEXT with String = js.native
    
    /* "StartCall" */ val START_CALL: typings.openfin.intentsMod.Intents.START_CALL with String = js.native
    
    /* "StartChat" */ val START_CHAT: typings.openfin.intentsMod.Intents.START_CHAT with String = js.native
    
    /* "ViewChart" */ val VIEW_CHART: typings.openfin.intentsMod.Intents.VIEW_CHART with String = js.native
    
    /* "ViewContact" */ val VIEW_CONTACT: typings.openfin.intentsMod.Intents.VIEW_CONTACT with String = js.native
    
    /* "ViewNews" */ val VIEW_NEWS: typings.openfin.intentsMod.Intents.VIEW_NEWS with String = js.native
    
    /* "ViewQuote" */ val VIEW_QUOTE: typings.openfin.intentsMod.Intents.VIEW_QUOTE with String = js.native
  }
  type Intents = typings.openfin.intentsMod.Intents
  
  @JSImport("openfin", "fdc3.ResolveError")
  @js.native
  object ResolveError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.ResolveError with String] = js.native
    
    /* "ResolveError:AppDoesNotHandleIntent" */ val AppDoesNotHandleIntent: typings.openfin.errorsMod.ResolveError.AppDoesNotHandleIntent with String = js.native
    
    /* "ResolveError:NoAppsFound" */ val NoAppsFound: typings.openfin.errorsMod.ResolveError.NoAppsFound with String = js.native
    
    /* "ResolveError:ResolverClosedOrCancelled" */ val ResolverClosedOrCancelled: typings.openfin.errorsMod.ResolveError.ResolverClosedOrCancelled with String = js.native
  }
  type ResolveError = typings.openfin.errorsMod.ResolveError
  
  @JSImport("openfin", "fdc3.SendContextError")
  @js.native
  object SendContextError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.openfin.errorsMod.SendContextError with String] = js.native
    
    /* "SendContextError:HandlerError" */ val HandlerError: typings.openfin.errorsMod.SendContextError.HandlerError with String = js.native
    
    /* "SendContextError:SendIntentTimeout" */ val HandlerTimeout: typings.openfin.errorsMod.SendContextError.HandlerTimeout with String = js.native
    
    /* "SendContextError:NoHandler" */ val NoHandler: typings.openfin.errorsMod.SendContextError.NoHandler with String = js.native
  }
  type SendContextError = typings.openfin.errorsMod.SendContextError
  
  @JSImport("openfin", "fdc3.SystemChannel")
  @js.native
  class SystemChannel protected ()
    extends typings.openfin.mainMod.SystemChannel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: SystemChannelTransport) = this()
  }
  
  @JSImport("openfin", "fdc3.addContextListener")
  @js.native
  def addContextListener(handler: js.Function1[/* context */ typings.openfin.contextMod.Context, Unit]): typings.openfin.mainMod.ContextListener = js.native
  
  @JSImport("openfin", "fdc3.addEventListener")
  @js.native
  def addEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typings.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
  
  @JSImport("openfin", "fdc3.addIntentListener")
  @js.native
  def addIntentListener(intent: String, handler: js.Function1[/* context */ typings.openfin.contextMod.Context, _]): typings.openfin.mainMod.IntentListener = js.native
  
  @JSImport("openfin", "fdc3.broadcast")
  @js.native
  def broadcast(context: typings.openfin.contextMod.Context): js.Promise[Unit] = js.native
  
  @JSImport("openfin", "fdc3.defaultChannel")
  @js.native
  val defaultChannel: typings.openfin.contextChannelsMod.DefaultChannel_ = js.native
  
  @JSImport("openfin", "fdc3.findIntent")
  @js.native
  def findIntent(intent: String): js.Promise[typings.openfin.mainMod.AppIntent] = js.native
  @JSImport("openfin", "fdc3.findIntent")
  @js.native
  def findIntent(intent: String, context: typings.openfin.contextMod.Context): js.Promise[typings.openfin.mainMod.AppIntent] = js.native
  
  @JSImport("openfin", "fdc3.findIntentsByContext")
  @js.native
  def findIntentsByContext(context: typings.openfin.contextMod.Context): js.Promise[js.Array[typings.openfin.mainMod.AppIntent]] = js.native
  
  @JSImport("openfin", "fdc3.getChannelById")
  @js.native
  def getChannelById(channelId: typings.openfin.contextChannelsMod.ChannelId): js.Promise[typings.openfin.contextChannelsMod.Channel] = js.native
  
  @JSImport("openfin", "fdc3.getCurrentChannel")
  @js.native
  def getCurrentChannel(): js.Promise[typings.openfin.contextChannelsMod.Channel] = js.native
  @JSImport("openfin", "fdc3.getCurrentChannel")
  @js.native
  def getCurrentChannel(identity: Identity): js.Promise[typings.openfin.contextChannelsMod.Channel] = js.native
  
  @JSImport("openfin", "fdc3.getOrCreateAppChannel")
  @js.native
  def getOrCreateAppChannel(name: String): js.Promise[typings.openfin.contextChannelsMod.AppChannel] = js.native
  
  @JSImport("openfin", "fdc3.getSystemChannels")
  @js.native
  def getSystemChannels(): js.Promise[js.Array[typings.openfin.contextChannelsMod.SystemChannel]] = js.native
  
  @JSImport("openfin", "fdc3.open")
  @js.native
  def open(name: typings.openfin.directoryMod.AppName): js.Promise[Unit] = js.native
  @JSImport("openfin", "fdc3.open")
  @js.native
  def open(name: typings.openfin.directoryMod.AppName, context: typings.openfin.contextMod.Context): js.Promise[Unit] = js.native
  
  @JSImport("openfin", "fdc3.raiseIntent")
  @js.native
  def raiseIntent(intent: String, context: typings.openfin.contextMod.Context): js.Promise[typings.openfin.mainMod.IntentResolution] = js.native
  @JSImport("openfin", "fdc3.raiseIntent")
  @js.native
  def raiseIntent(
    intent: String,
    context: typings.openfin.contextMod.Context,
    target: typings.openfin.directoryMod.AppName
  ): js.Promise[typings.openfin.mainMod.IntentResolution] = js.native
  
  @JSImport("openfin", "fdc3.removeEventListener")
  @js.native
  def removeEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typings.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
  
  type AppDirIntent = typings.openfin.directoryMod.AppDirIntent
  
  type AppId = typings.openfin.directoryMod.AppId
  
  type AppImage = typings.openfin.directoryMod.AppImage
  
  type AppIntent = typings.openfin.mainMod.AppIntent
  
  type AppName = typings.openfin.directoryMod.AppName
  
  type Application = typings.openfin.directoryMod.Application
  
  type Channel = typings.openfin.contextChannelsMod.Channel
  
  type ChannelChangedEvent = typings.openfin.contextChannelsMod.ChannelChangedEvent
  
  type ChannelContextListener = typings.openfin.contextChannelsMod.ChannelContextListener
  
  type ChannelId = typings.openfin.contextChannelsMod.ChannelId
  
  type ChannelWindowAddedEvent = typings.openfin.contextChannelsMod.ChannelWindowAddedEvent
  
  type ChannelWindowRemovedEvent = typings.openfin.contextChannelsMod.ChannelWindowRemovedEvent
  
  type ContactContext = typings.openfin.contextMod.ContactContext
  
  type Context = typings.openfin.contextMod.Context
  
  type ContextListener = typings.openfin.mainMod.ContextListener
  
  type DefaultChannel = typings.openfin.mainMod.DefaultChannel_
  
  type DisplayMetadata = typings.openfin.contextChannelsMod.DisplayMetadata
  
  type Icon = typings.openfin.directoryMod.Icon
  
  type InstrumentContext = typings.openfin.contextMod.InstrumentContext
  
  type IntentListener = typings.openfin.mainMod.IntentListener
  
  type IntentMetadata = typings.openfin.mainMod.IntentMetadata
  
  type IntentResolution = typings.openfin.mainMod.IntentResolution
  
  type Listener = typings.openfin.mainMod.Listener
  
  type NameValuePair = typings.openfin.directoryMod.NameValuePair
  
  type OrganizationContext = typings.openfin.contextMod.OrganizationContext
}
