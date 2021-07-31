package typings.nodelibFsWalk

import typings.nodelibFsWalk.anon.PartialFileSystemAdapter
import typings.nodelibFsWalk.typesMod.Entry
import typings.nodelibFsWalk.typesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@nodelib/fs.walk/out/settings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Settings {
    def this(_options: Options) = this()
    
    /* CompleteClass */
    var _getValue: js.Any = js.native
    
    /* CompleteClass */
    override val _options: js.Any = js.native
    
    /* CompleteClass */
    override val concurrency: Double = js.native
    
    /* CompleteClass */
    override val deepFilter: DeepFilterFunction | Null = js.native
    
    /* CompleteClass */
    override val entryFilter: EntryFilterFunction | Null = js.native
    
    /* CompleteClass */
    override val errorFilter: ErrorFilterFunction | Null = js.native
    
    /* CompleteClass */
    override val fsScandirSettings: typings.nodelibFsScandir.mod.Settings = js.native
    
    /* CompleteClass */
    override val pathSegmentSeparator: String = js.native
  }
  
  type DeepFilterFunction = FilterFunction[Entry]
  
  type EntryFilterFunction = FilterFunction[Entry]
  
  type ErrorFilterFunction = FilterFunction[Errno]
  
  type FilterFunction[T] = js.Function1[/* value */ T, Boolean]
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var deepFilter: js.UndefOr[DeepFilterFunction] = js.undefined
    
    var entryFilter: js.UndefOr[EntryFilterFunction] = js.undefined
    
    var errorFilter: js.UndefOr[ErrorFilterFunction] = js.undefined
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    var pathSegmentSeparator: js.UndefOr[String] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setDeepFilter(value: Entry => Boolean): Self = StObject.set(x, "deepFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeepFilterUndefined: Self = StObject.set(x, "deepFilter", js.undefined)
      
      @scala.inline
      def setEntryFilter(value: Entry => Boolean): Self = StObject.set(x, "entryFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntryFilterUndefined: Self = StObject.set(x, "entryFilter", js.undefined)
      
      @scala.inline
      def setErrorFilter(value: Errno => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
      
      @scala.inline
      def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      @scala.inline
      def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setPathSegmentSeparator(value: String): Self = StObject.set(x, "pathSegmentSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSegmentSeparatorUndefined: Self = StObject.set(x, "pathSegmentSeparator", js.undefined)
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    var _getValue: js.Any
    
    val _options: js.Any
    
    val basePath: js.UndefOr[String] = js.undefined
    
    val concurrency: Double
    
    val deepFilter: DeepFilterFunction | Null
    
    val entryFilter: EntryFilterFunction | Null
    
    val errorFilter: ErrorFilterFunction | Null
    
    val fsScandirSettings: typings.nodelibFsScandir.mod.Settings
    
    val pathSegmentSeparator: String
  }
  object Settings {
    
    @scala.inline
    def apply(
      _getValue: js.Any,
      _options: js.Any,
      concurrency: Double,
      fsScandirSettings: typings.nodelibFsScandir.mod.Settings,
      pathSegmentSeparator: String
    ): Settings = {
      val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], concurrency = concurrency.asInstanceOf[js.Any], fsScandirSettings = fsScandirSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any], deepFilter = null, entryFilter = null, errorFilter = null)
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepFilter(value: Entry => Boolean): Self = StObject.set(x, "deepFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeepFilterNull: Self = StObject.set(x, "deepFilter", null)
      
      @scala.inline
      def setEntryFilter(value: Entry => Boolean): Self = StObject.set(x, "entryFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntryFilterNull: Self = StObject.set(x, "entryFilter", null)
      
      @scala.inline
      def setErrorFilter(value: Errno => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorFilterNull: Self = StObject.set(x, "errorFilter", null)
      
      @scala.inline
      def setFsScandirSettings(value: typings.nodelibFsScandir.mod.Settings): Self = StObject.set(x, "fsScandirSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSegmentSeparator(value: String): Self = StObject.set(x, "pathSegmentSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getValue(value: js.Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
