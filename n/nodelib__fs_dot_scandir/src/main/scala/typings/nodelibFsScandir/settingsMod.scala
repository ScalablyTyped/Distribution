package typings.nodelibFsScandir

import typings.nodelibFsScandir.anon.PartialFileSystemAdapter
import typings.nodelibFsScandir.fsMod.FileSystemAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@nodelib/fs.scandir/out/settings", JSImport.Default)
  @js.native
  class default () extends Settings {
    def this(_options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.native
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
    
    var pathSegmentSeparator: js.UndefOr[String] = js.native
    
    var stats: js.UndefOr[Boolean] = js.native
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait Settings extends StObject {
    
    var _getValue: js.Any = js.native
    
    val _options: js.Any = js.native
    
    val followSymbolicLinks: Boolean = js.native
    
    val fs: FileSystemAdapter = js.native
    
    val fsStatSettings: typings.nodelibFsStat.mod.Settings = js.native
    
    val pathSegmentSeparator: String = js.native
    
    val stats: Boolean = js.native
    
    val throwErrorOnBrokenSymbolicLink: Boolean = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(
      _getValue: js.Any,
      _options: js.Any,
      followSymbolicLinks: Boolean,
      fs: FileSystemAdapter,
      fsStatSettings: typings.nodelibFsStat.mod.Settings,
      pathSegmentSeparator: String,
      stats: Boolean,
      throwErrorOnBrokenSymbolicLink: Boolean
    ): Settings = {
      val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], followSymbolicLinks = followSymbolicLinks.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], fsStatSettings = fsStatSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsStatSettings(value: typings.nodelibFsStat.mod.Settings): Self = StObject.set(x, "fsStatSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathSegmentSeparator(value: String): Self = StObject.set(x, "pathSegmentSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getValue(value: js.Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
