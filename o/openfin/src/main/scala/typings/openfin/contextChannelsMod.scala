package typings.openfin

import typings.openfin.contextMod.Context
import typings.openfin.identityMod.Identity
import typings.openfin.mainMod.ContextListener
import typings.openfin.openfinStrings.`channel-changed`
import typings.openfin.openfinStrings.`window-added`
import typings.openfin.openfinStrings.`window-removed`
import typings.openfin.openfinStrings.app
import typings.openfin.openfinStrings.default
import typings.openfin.openfinStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextChannelsMod {
  
  @JSImport("openfin/_v2/fdc3/contextChannels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openfin/_v2/fdc3/contextChannels", "AppChannel")
  @js.native
  open class AppChannel protected ()
    extends ChannelBase
       with Channel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: AppChannelTransport) = this()
    
    /**
      * The name of this channel. This is the same string as is passed to [[getOrCreateAppChannel]].
      */
    val name: String = js.native
    
    @JSName("type")
    val type_AppChannel: app = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/contextChannels", "ChannelBase")
  @js.native
  abstract class ChannelBase protected () extends StObject {
    /* protected */ def this(id: String, `type`: String) = this()
    
    /**
      * Event that is fired whenever a window broadcasts on this channel.
      *
      * This can be triggered by a window belonging to the channel calling the top-level FDC3 `broadcast` function, or by
      * any window calling this channel's {@link broadcast} method.
      *
      * @param handler Function that should be called whenever a context is broadcast on this channel.
      */
    def addContextListener(handler: js.Function1[/* context */ Context, Unit]): ChannelContextListener = js.native
    
    /**
      * Event that is fired whenever a window joins this channel. This includes switching to/from the default
      * channel.
      *
      * The event also includes which channel the window was in previously. The `channel` property within the
      * event will always be this channel instance.
      */
    @JSName("addEventListener")
    def addEventListener_windowadded(eventType: `window-added`, handler: js.Function1[/* event */ ChannelWindowAddedEvent, Unit]): Unit = js.native
    /**
      * Event that is fired whenever a window leaves this channel. This includes switching to/from the default
      * channel.
      *
      * The event also includes which channel the window is being added to. The `previousChannel` property within the
      * event will always be this channel instance.
      */
    @JSName("addEventListener")
    def addEventListener_windowremoved(eventType: `window-removed`, handler: js.Function1[/* event */ ChannelWindowRemovedEvent, Unit]): Unit = js.native
    
    /**
      * Broadcasts the given context on this channel.
      *
      * Note that this function can be used without first joining the channel, allowing applications to broadcast on
      * channels that they aren't a member of.
      *
      * This broadcast will be received by all windows that are members of this channel, *except* for the window that
      * makes the broadcast. This matches the behavior of the top-level FDC3 `broadcast` function.
      *
      * @param context The context to broadcast to all windows on this channel.
      * @throws `TypeError` if `context` is not a valid [[Context]].
      */
    def broadcast(context: Context): js.Promise[Unit] = js.native
    
    /**
      * Returns the last context that was broadcast on this channel. All channels initially have no context, until a
      * window is added to the channel and then broadcasts. If there is not yet any context on the channel, this method
      * will return `null`. The context is also reset back into its initial context-less state whenever a channel is
      * cleared of all windows.
      *
      * The context of a channel will be captured regardless of how the context is broadcasted on this channel - whether
      * using the top-level FDC3 `broadcast` function, or using the channel-level {@link broadcast} function on this
      * object.
      *
      * NOTE: Only non-default channels are stateful, for the default channel this method will always return `null`.
      */
    def getCurrentContext(): js.Promise[Context | Null] = js.native
    
    /**
      * Returns a list of all windows belonging to the specified channel.
      *
      * If the window making the call is a member of this channel, it will be included in the results. If there are no
      * windows on this channel, an empty array is returned.
      */
    def getMembers(): js.Promise[js.Array[Identity]] = js.native
    
    /**
      * Constant that uniquely identifies this channel. Will be generated by the service, and guaranteed to be unique
      * within the set of channels registered with the service.
      *
      * In the case of `system` channels (see {@link SystemChannel}), these IDs _should_ persist across sessions. The
      * channel list is defined by the service, but can be overridden by a desktop owner. If the desktop owner keeps
      * this list static (which is recommended), then IDs will also persist across sessions.
      */
    val id: ChannelId = js.native
    
    /**
      * Adds the given window to this channel. If no identity is provided, the window making the call will be the window
      * added to the channel.
      *
      * If the channel has a current context (see {@link getCurrentContext}) then that context will be immediately passed to
      * the given window upon joining the channel, via its context listener(s).
      *
      * Note that all windows will always belong to exactly one channel at all times. If you wish to leave a channel,
      * the only way to do so is to join another channel. A window may rejoin the default channel by calling `channels.defaultChannel.join()`.
      *
      * @param identity The window that should be added to this channel. If omitted, will use the window that calls this method.
      * @throws If `identity` is passed, [[FDC3Error]] with an [[ConnectionError]] code.
      * @throws If `identity` is passed, `TypeError` if `identity` is not a valid
      * {@link https://developer.openfin.co/docs/javascript/stable/global.html#Identity | Identity}.
      */
    def join(): js.Promise[Unit] = js.native
    def join(identity: Identity): js.Promise[Unit] = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_windowadded(eventType: `window-added`, handler: js.Function1[/* event */ ChannelWindowAddedEvent, Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_windowremoved(eventType: `window-removed`, handler: js.Function1[/* event */ ChannelWindowRemovedEvent, Unit]): Unit = js.native
    
    /**
      * Uniquely defines each channel type.
      *
      * See overrides of this class for list of allowed values.
      */
    val `type`: String = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/contextChannels", "DefaultChannel")
  @js.native
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  open class DefaultChannel_ ()
    extends ChannelBase
       with Channel {
    
    @JSName("type")
    val type_DefaultChannel_ : default = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/contextChannels", "SystemChannel")
  @js.native
  open class SystemChannel protected ()
    extends ChannelBase
       with Channel {
    /**
      * @hidden
      *
      * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
      */
    def this(transport: SystemChannelTransport) = this()
    
    @JSName("type")
    val type_SystemChannel: system = js.native
    
    /**
      * How a client application should present this channel in any UI.
      */
    val visualIdentity: DisplayMetadata = js.native
  }
  
  @JSImport("openfin/_v2/fdc3/contextChannels", "defaultChannel")
  @js.native
  val defaultChannel: DefaultChannel_ = js.native
  
  inline def getChannelById(channelId: ChannelId): js.Promise[Channel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChannelById")(channelId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Channel]]
  
  inline def getCurrentChannel(): js.Promise[Channel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentChannel")().asInstanceOf[js.Promise[Channel]]
  inline def getCurrentChannel(identity: Identity): js.Promise[Channel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentChannel")(identity.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Channel]]
  
  inline def getOrCreateAppChannel(name: String): js.Promise[AppChannel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateAppChannel")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppChannel]]
  
  inline def getSystemChannels(): js.Promise[js.Array[SystemChannel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemChannels")().asInstanceOf[js.Promise[js.Array[SystemChannel]]]
  
  trait AppChannelTransport
    extends StObject
       with ChannelTransport {
    
    var name: String
    
    @JSName("type")
    var type_AppChannelTransport: app
  }
  object AppChannelTransport {
    
    inline def apply(id: ChannelId, name: String): AppChannelTransport = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("app")
      __obj.asInstanceOf[AppChannelTransport]
    }
    
    extension [Self <: AppChannelTransport](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.contextChannelsMod.DefaultChannel_
    - typings.openfin.contextChannelsMod.SystemChannel
    - typings.openfin.contextChannelsMod.AppChannel
  */
  trait Channel extends StObject
  
  trait ChannelChangedEvent extends StObject {
    
    /**
      * The channel that the window now belongs to.
      *
      * Will be `null` if the window has just been closed, and so is being removed from a channel without being added to
      * another.
      */
    var channel: Channel | Null
    
    /**
      * The window that has switched channel.
      */
    var identity: Identity
    
    /**
      * The previous channel that the window belonged to.
      *
      * Will be `null` if the window has just been created, and so doesn't have a previous channel.
      */
    var previousChannel: Channel | Null
    
    var `type`: `channel-changed`
  }
  object ChannelChangedEvent {
    
    inline def apply(identity: Identity): ChannelChangedEvent = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], channel = null, previousChannel = null)
      __obj.updateDynamic("type")("channel-changed")
      __obj.asInstanceOf[ChannelChangedEvent]
    }
    
    extension [Self <: ChannelChangedEvent](x: Self) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setPreviousChannel(value: Channel): Self = StObject.set(x, "previousChannel", value.asInstanceOf[js.Any])
      
      inline def setPreviousChannelNull: Self = StObject.set(x, "previousChannel", null)
      
      inline def setType(value: `channel-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.openfin.mainMod.Listener because Already inherited */ trait ChannelContextListener
    extends StObject
       with ContextListener {
    
    /**
      * The channel that this listener is observing.
      *
      * Listener will trigger whenever a context is broadcast on this channel.
      */
    var channel: Channel
  }
  object ChannelContextListener {
    
    inline def apply(channel: Channel, handler: Context => Unit, unsubscribe: () => Unit): ChannelContextListener = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[ChannelContextListener]
    }
    
    extension [Self <: ChannelContextListener](x: Self) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  type ChannelId = String
  
  trait ChannelTransport extends StObject {
    
    var id: ChannelId
    
    var `type`: String
  }
  object ChannelTransport {
    
    inline def apply(id: ChannelId, `type`: String): ChannelTransport = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelTransport]
    }
    
    extension [Self <: ChannelTransport](x: Self) {
      
      inline def setId(value: ChannelId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelWindowAddedEvent extends StObject {
    
    /**
      * The channel that window now belongs to. Will always be the channel object that {@link ChannelBase.addEventListener} was
      * called on.
      */
    var channel: Channel
    
    /**
      * The window that has just been added to the channel.
      */
    var identity: Identity
    
    /**
      * The channel that the window belonged to previously.
      *
      * Will be `null` if this event is being fired on a newly-created window.
      */
    var previousChannel: Channel | Null
    
    var `type`: `window-added`
  }
  object ChannelWindowAddedEvent {
    
    inline def apply(channel: Channel, identity: Identity): ChannelWindowAddedEvent = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], previousChannel = null)
      __obj.updateDynamic("type")("window-added")
      __obj.asInstanceOf[ChannelWindowAddedEvent]
    }
    
    extension [Self <: ChannelWindowAddedEvent](x: Self) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setPreviousChannel(value: Channel): Self = StObject.set(x, "previousChannel", value.asInstanceOf[js.Any])
      
      inline def setPreviousChannelNull: Self = StObject.set(x, "previousChannel", null)
      
      inline def setType(value: `window-added`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelWindowRemovedEvent extends StObject {
    
    /**
      * The channel that the window now belongs to.
      *
      * Will be `null` if the window is leaving the channel due to it being closed.
      */
    var channel: Channel | Null
    
    /**
      * The window that has just been removed from the channel.
      */
    var identity: Identity
    
    /**
      * The channel that the window belonged to previously. Will always be the channel object that {@link ChannelBase.addEventListener} was
      * called on.
      */
    var previousChannel: Channel
    
    var `type`: `window-removed`
  }
  object ChannelWindowRemovedEvent {
    
    inline def apply(identity: Identity, previousChannel: Channel): ChannelWindowRemovedEvent = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], previousChannel = previousChannel.asInstanceOf[js.Any], channel = null)
      __obj.updateDynamic("type")("window-removed")
      __obj.asInstanceOf[ChannelWindowRemovedEvent]
    }
    
    extension [Self <: ChannelWindowRemovedEvent](x: Self) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelNull: Self = StObject.set(x, "channel", null)
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setPreviousChannel(value: Channel): Self = StObject.set(x, "previousChannel", value.asInstanceOf[js.Any])
      
      inline def setType(value: `window-removed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayMetadata extends StObject {
    
    /**
      * The color that should be associated with this channel when displaying this channel in a UI, e.g. `#FF0000`.
      */
    var color: String
    
    /**
      * A URL of an image that can be used to display this channel
      */
    var glyph: String
    
    /**
      * A user-readable name for this channel, e.g. `"Red"`
      */
    var name: String
  }
  object DisplayMetadata {
    
    inline def apply(color: String, glyph: String, name: String): DisplayMetadata = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayMetadata]
    }
    
    extension [Self <: DisplayMetadata](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SystemChannelTransport
    extends StObject
       with ChannelTransport {
    
    @JSName("type")
    var type_SystemChannelTransport: system
    
    var visualIdentity: DisplayMetadata
  }
  object SystemChannelTransport {
    
    inline def apply(id: ChannelId, visualIdentity: DisplayMetadata): SystemChannelTransport = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visualIdentity = visualIdentity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("system")
      __obj.asInstanceOf[SystemChannelTransport]
    }
    
    extension [Self <: SystemChannelTransport](x: Self) {
      
      inline def setType(value: system): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisualIdentity(value: DisplayMetadata): Self = StObject.set(x, "visualIdentity", value.asInstanceOf[js.Any])
    }
  }
}
