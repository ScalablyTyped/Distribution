package typings.maxmind

import typings.maxmind.anon.Max
import typings.mmdbLib.mod.default
import typings.mmdbLib.responseMod.Response
import typings.mmdbLib.typesMod.ReaderOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("maxmind", "default.init")
    @js.native
    def init(): scala.Nothing = js.native
    
    @JSImport("maxmind", "default.open")
    @js.native
    def open[T](filepath: String): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
    @JSImport("maxmind", "default.open")
    @js.native
    def open[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
    @JSImport("maxmind", "default.open")
    @js.native
    def open[T](filepath: String, opts: OpenOpts): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
    @JSImport("maxmind", "default.open")
    @js.native
    def open[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[typings.mmdbLib.mod.default[T]] = js.native
    
    @JSImport("maxmind", "default.openSync")
    @js.native
    def openSync(): scala.Nothing = js.native
    
    @JSImport("maxmind", "default.validate")
    @js.native
    def validate(ip: String): Boolean = js.native
  }
  
  @JSImport("maxmind", "Reader")
  @js.native
  class Reader[T /* <: Response */] protected () extends default[T] {
    def this(db: Buffer) = this()
    def this(db: Buffer, opts: ReaderOptions) = this()
  }
  
  @JSImport("maxmind", "init")
  @js.native
  def init(): scala.Nothing = js.native
  
  @JSImport("maxmind", "open")
  @js.native
  def open[T](filepath: String): js.Promise[default[T]] = js.native
  @JSImport("maxmind", "open")
  @js.native
  def open[T](filepath: String, opts: js.UndefOr[scala.Nothing], cb: Callback): js.Promise[default[T]] = js.native
  @JSImport("maxmind", "open")
  @js.native
  def open[T](filepath: String, opts: OpenOpts): js.Promise[default[T]] = js.native
  @JSImport("maxmind", "open")
  @js.native
  def open[T](filepath: String, opts: OpenOpts, cb: Callback): js.Promise[default[T]] = js.native
  
  @JSImport("maxmind", "openSync")
  @js.native
  def openSync(): scala.Nothing = js.native
  
  @JSImport("maxmind", "validate")
  @js.native
  def validate(ip: String): Boolean = js.native
  
  type Callback = js.Function0[Unit]
  
  @js.native
  trait OpenOpts extends StObject {
    
    var cache: js.UndefOr[Max] = js.native
    
    var watchForUpdates: js.UndefOr[Boolean] = js.native
    
    var watchForUpdatesHook: js.UndefOr[Callback] = js.native
    
    var watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.native
  }
  object OpenOpts {
    
    @scala.inline
    def apply(): OpenOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOpts]
    }
    
    @scala.inline
    implicit class OpenOptsMutableBuilder[Self <: OpenOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Max): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setWatchForUpdates(value: Boolean): Self = StObject.set(x, "watchForUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchForUpdatesHook(value: () => Unit): Self = StObject.set(x, "watchForUpdatesHook", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWatchForUpdatesHookUndefined: Self = StObject.set(x, "watchForUpdatesHook", js.undefined)
      
      @scala.inline
      def setWatchForUpdatesNonPersistent(value: Boolean): Self = StObject.set(x, "watchForUpdatesNonPersistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchForUpdatesNonPersistentUndefined: Self = StObject.set(x, "watchForUpdatesNonPersistent", js.undefined)
      
      @scala.inline
      def setWatchForUpdatesUndefined: Self = StObject.set(x, "watchForUpdates", js.undefined)
    }
  }
}
