package typings.pino.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.pino.pinoStrings.`level-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerExtras[Options] extends EventEmitter {
  
  @JSName("addListener")
  def addListener_levelchange[Opts](event: `level-change`, listener: typings.pino.mod.pino.LevelChangeEventListener[Opts]): this.type = js.native
  
  /**
    * Returns an object containing all the current bindings, cloned from the ones passed in via logger.child().
    */
  def bindings(): typings.pino.mod.pino.Bindings = js.native
  
  /**
    * Creates a child logger, setting all key-value pairs in `bindings` as properties in the log lines. All serializers will be applied to the given pair.
    * Child loggers use the same output stream as the parent and inherit the current log level of the parent at the time they are spawned.
    * From v2.x.x the log level of a child is mutable (whereas in v1.x.x it was immutable), and can be set independently of the parent.
    * If a `level` property is present in the object passed to `child` it will override the child logger level.
    *
    * @param bindings: an object of key-value pairs to include in log lines as properties.
    * @param options: an options object that will override child logger inherited options.
    * @returns a child logger instance.
    */
  def child[ChildOptions /* <: typings.pino.mod.pino.ChildLoggerOptions */](bindings: typings.pino.mod.pino.Bindings): typings.pino.mod.pino.Logger[Options & ChildOptions] = js.native
  def child[ChildOptions /* <: typings.pino.mod.pino.ChildLoggerOptions */](bindings: typings.pino.mod.pino.Bindings, options: ChildOptions): typings.pino.mod.pino.Logger[Options & ChildOptions] = js.native
  
  /**
    * Define additional logging levels.
    */
  var customLevels: StringDictionary[Double] = js.native
  
  /**
    * Flushes the content of the buffer when using pino.destination({ sync: false }).
    */
  def flush(): js.Function0[Unit] = js.native
  
  def isLevelEnabled(level: String): Boolean = js.native
  /**
    * A utility method for determining if a given log level will write to the destination.
    */
  def isLevelEnabled(level: typings.pino.mod.pino.LevelWithSilent): Boolean = js.native
  
  /**
    * Returns the integer value for the logger instance's logging level.
    */
  var levelVal: Double = js.native
  
  var levels: typings.pino.mod.pino.LevelMapping = js.native
  
  /**
    * This can be used to modify the callback function on creation of a new child.
    */
  def onChild[ChildOptions /* <: typings.pino.mod.pino.ChildLoggerOptions */](child: typings.pino.mod.pino.Logger[Options & ChildOptions]): Unit = js.native
  /**
    * This can be used to modify the callback function on creation of a new child.
    */
  @JSName("onChild")
  var onChild_Original: OnChildCallback[Options] = js.native
  
  /**
    * Registers a listener function that is triggered when the level is changed.
    * Note: When browserified, this functionality will only be available if the `events` module has been required elsewhere
    * (e.g. if you're using streams in the browser). This allows for a trade-off between bundle size and functionality.
    *
    * @param event: only ever fires the `'level-change'` event
    * @param listener: The listener is passed four arguments: `levelLabel`, `levelValue`, `previousLevelLabel`, `previousLevelValue`.
    */
  @JSName("on")
  def on_levelchange[Opts](event: `level-change`, listener: typings.pino.mod.pino.LevelChangeEventListener[Opts]): this.type = js.native
  
  @JSName("once")
  def once_levelchange[Opts](event: `level-change`, listener: typings.pino.mod.pino.LevelChangeEventListener[Opts]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_levelchange[Opts](event: `level-change`, listener: typings.pino.mod.pino.LevelChangeEventListener[Opts]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_levelchange[Opts](event: `level-change`, listener: typings.pino.mod.pino.LevelChangeEventListener[Opts]): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_levelchange[Opts](event: `level-change`, listener: typings.pino.mod.pino.LevelChangeEventListener[Opts]): this.type = js.native
  
  /**
    * Adds to the bindings of this logger instance.
    * Note: Does not overwrite bindings. Can potentially result in duplicate keys in log lines.
    *
    * @param bindings: an object of key-value pairs to include in log lines as properties.
    */
  def setBindings(bindings: typings.pino.mod.pino.Bindings): Unit = js.native
  
  /**
    * Outputs the level as a string instead of integer.
    */
  var useLevelLabels: Boolean = js.native
  
  /**
    * Use only defined `customLevels` and omit Pino's levels.
    */
  var useOnlyCustomLevels: Boolean = js.native
  
  /**
    * Exposes the Pino package version. Also available on the exported pino function.
    */
  val version: String = js.native
}
