package typings.playable.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.playable.configMod.IPlayerConfig
import typings.playable.playerFactoryMod.IPlayerInstance
import typings.playable.themeTypesMod.IThemeConfig
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable", JSImport.Default)
@js.native
object ^ extends js.Object {
  
  var CROSS_ORIGIN_VALUES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CROSS_ORIGIN_VALUES */ js.Any = js.native
  
  var DefaultModules: StringDictionary[js.Any] = js.native
  
  var ENGINE_STATES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ENGINE_STATES */ js.Any = js.native
  
  var ERRORS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ERRORS */ js.Any = js.native
  
  var LIVE_STATES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LIVE_STATES */ js.Any = js.native
  
  var MEDIA_STREAM_DELIVERY_PRIORITY: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MEDIA_STREAM_DELIVERY_PRIORITY */ js.Any = js.native
  
  var MEDIA_STREAM_TYPES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MEDIA_STREAM_TYPES */ js.Any = js.native
  
  var PRELOAD_TYPES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PRELOAD_TYPES */ js.Any = js.native
  
  var TEXT_LABELS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TEXT_LABELS */ js.Any = js.native
  
  var Tooltip: Instantiable0[typings.playable.tooltipMod.Tooltip] = js.native
  
  var UI_EVENTS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UI_EVENTS */ js.Any = js.native
  
  var VIDEO_EVENTS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VIDEO_EVENTS */ js.Any = js.native
  
  var VIDEO_VIEW_MODES: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VIDEO_VIEW_MODES */ js.Any = js.native
  
  def clearAdditionalModules(): Unit = js.native
  @JSName("clearAdditionalModules")
  var clearAdditionalModules_Original: js.Function0[Unit] = js.native
  
  def clearPlaybackAdapters(): Unit = js.native
  @JSName("clearPlaybackAdapters")
  var clearPlaybackAdapters_Original: js.Function0[Unit] = js.native
  
  def create(): IPlayerInstance = js.native
  def create(params: js.UndefOr[scala.Nothing], themeConfig: IThemeConfig): IPlayerInstance = js.native
  def create(params: IPlayerConfig): IPlayerInstance = js.native
  def create(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = js.native
  @JSName("create")
  var create_Original: js.Function2[
    /* params */ js.UndefOr[IPlayerConfig], 
    /* themeConfig */ js.UndefOr[IThemeConfig], 
    IPlayerInstance
  ] = js.native
  
  def playerAPIDecorator(): js.Function3[/* target */ js.Any, /* property */ String, /* descriptor */ PropertyDescriptor, Unit] = js.native
  def playerAPIDecorator(name: String): js.Function3[/* target */ js.Any, /* property */ String, /* descriptor */ PropertyDescriptor, Unit] = js.native
  
  def registerModule(id: String, module: js.Any): Unit = js.native
  @JSName("registerModule")
  var registerModule_Original: js.Function2[/* id */ String, /* module */ js.Any, Unit] = js.native
  
  def registerPlaybackAdapter(adapter: js.Any): Unit = js.native
  @JSName("registerPlaybackAdapter")
  var registerPlaybackAdapter_Original: js.Function1[/* adapter */ js.Any, Unit] = js.native
}
