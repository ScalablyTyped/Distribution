package typings.mobxRemotedev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-remotedev", JSImport.Default)
  @js.native
  def default[T](): js.Function2[/* component */ js.Any, /* config */ js.UndefOr[RemoteDevConfig], Unit] = js.native
  @JSImport("mobx-remotedev", JSImport.Default)
  @js.native
  def default[T](config: RemoteDevConfig): js.Function2[/* component */ js.Any, /* config */ js.UndefOr[RemoteDevConfig], Unit] = js.native
  @JSImport("mobx-remotedev", JSImport.Default)
  @js.native
  def default[T](store: T): T = js.native
  @JSImport("mobx-remotedev", JSImport.Default)
  @js.native
  def default[T](store: T, config: RemoteDevConfig): T = js.native
  
  @js.native
  trait RemoteDevConfig extends StObject {
    
    /**map of arrays named whitelist or blacklist to filter action types. You can also set it globally in the extension settings.
      */
    var filters: js.UndefOr[js.Object] = js.native
    
    /**set it to true in order to assign dispatching of all unhandled actions to this store. Useful for nested classes /
      *  observables or when having async actions without specifying the scope explicitly. */
    var global: js.UndefOr[Boolean] = js.native
    
    /**use to specify host for remotedev-server. If port is specified, default value is localhost. */
    var hostname: js.UndefOr[String] = js.native
    
    /**the instance name to be showed on the monitor page. Default value is document.title. */
    var name: js.UndefOr[String] = js.native
    
    /**set it to true to have a clear log only with actions. If MobX is in strict mode, it is true by default. Don't forget about async actions. */
    var onlyActions: js.UndefOr[Boolean] = js.native
    
    /**use to specify host's port for remotedev-server. */
    var port: js.UndefOr[Double] = js.native
    
    /** set it to true to have remote monitoring via the local or remotedev.io server. remote: false is used for the extension or react-native-debugger */
    var remote: js.UndefOr[Boolean] = js.native
  }
  object RemoteDevConfig {
    
    @scala.inline
    def apply(): RemoteDevConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteDevConfig]
    }
    
    @scala.inline
    implicit class RemoteDevConfigMutableBuilder[Self <: RemoteDevConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Object): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnlyActions(value: Boolean): Self = StObject.set(x, "onlyActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyActionsUndefined: Self = StObject.set(x, "onlyActions", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    }
  }
}
