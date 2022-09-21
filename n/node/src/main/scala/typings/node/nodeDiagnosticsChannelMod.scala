package typings.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeDiagnosticsChannelMod {
  
  @JSImport("node:diagnostics_channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The class `Channel` represents an individual named channel within the data
    * pipeline. It is use to track subscribers and to publish messages when there
    * are subscribers present. It exists as a separate object to avoid channel
    * lookups at publish time, enabling very fast publish speeds and allowing
    * for heavy use while incurring very minimal cost. Channels are created with {@link channel}, constructing a channel directly
    * with `new Channel(name)` is not supported.
    * @since v15.1.0, v14.17.0
    */
  @JSImport("node:diagnostics_channel", "Channel")
  @js.native
  open class Channel_ protected ()
    extends typings.node.diagnosticsChannelMod.Channel_ {
    /* private */ def this(name: String) = this()
  }
  
  /**
    * This is the primary entry-point for anyone wanting to interact with a named
    * channel. It produces a channel object which is optimized to reduce overhead at
    * publish time as much as possible.
    *
    * ```js
    * import diagnostics_channel from 'diagnostics_channel';
    *
    * const channel = diagnostics_channel.channel('my-channel');
    * ```
    * @since v15.1.0, v14.17.0
    * @param name The channel name
    * @return The named channel object
    */
  inline def channel(name: String): typings.node.diagnosticsChannelMod.Channel_ = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(name.asInstanceOf[js.Any]).asInstanceOf[typings.node.diagnosticsChannelMod.Channel_]
  
  /**
    * Check if there are active subscribers to the named channel. This is helpful if
    * the message you want to send might be expensive to prepare.
    *
    * This API is optional but helpful when trying to publish messages from very
    * performance-sensitive code.
    *
    * ```js
    * import diagnostics_channel from 'diagnostics_channel';
    *
    * if (diagnostics_channel.hasSubscribers('my-channel')) {
    *   // There are subscribers, prepare and publish message
    * }
    * ```
    * @since v15.1.0, v14.17.0
    * @param name The channel name
    * @return If there are active subscribers
    */
  inline def hasSubscribers(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSubscribers")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
