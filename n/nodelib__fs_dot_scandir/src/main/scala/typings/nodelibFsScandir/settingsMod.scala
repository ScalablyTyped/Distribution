package typings.nodelibFsScandir

import typings.nodelibFsScandir.anon.PartialFileSystemAdapter
import typings.nodelibFsScandir.fsMod.FileSystemAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@nodelib/fs.scandir/out/settings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Settings {
    def this(_options: Options) = this()
    
    /* private */ /* CompleteClass */
    var _getValue: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _options: js.Any = js.native
    
    /* CompleteClass */
    override val followSymbolicLinks: Boolean = js.native
    
    /* CompleteClass */
    override val fs: FileSystemAdapter = js.native
    
    /* CompleteClass */
    override val fsStatSettings: typings.nodelibFsStat.mod.Settings = js.native
    
    /* CompleteClass */
    override val pathSegmentSeparator: String = js.native
    
    /* CompleteClass */
    override val stats: Boolean = js.native
    
    /* CompleteClass */
    override val throwErrorOnBrokenSymbolicLink: Boolean = js.native
  }
  
  trait Options extends StObject {
    
    var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    var pathSegmentSeparator: js.UndefOr[String] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinksUndefined: Self = StObject.set(x, "followSymbolicLinks", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setPathSegmentSeparator(value: String): Self = StObject.set(x, "pathSegmentSeparator", value.asInstanceOf[js.Any])
      
      inline def setPathSegmentSeparatorUndefined: Self = StObject.set(x, "pathSegmentSeparator", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /* private */ var _getValue: js.Any
    
    /* private */ val _options: js.Any
    
    val followSymbolicLinks: Boolean
    
    val fs: FileSystemAdapter
    
    val fsStatSettings: typings.nodelibFsStat.mod.Settings
    
    val pathSegmentSeparator: String
    
    val stats: Boolean
    
    val throwErrorOnBrokenSymbolicLink: Boolean
  }
  object Settings {
    
    inline def apply(
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
    
    extension [Self <: Settings](x: Self) {
      
      inline def setFollowSymbolicLinks(value: Boolean): Self = StObject.set(x, "followSymbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsStatSettings(value: typings.nodelibFsStat.mod.Settings): Self = StObject.set(x, "fsStatSettings", value.asInstanceOf[js.Any])
      
      inline def setPathSegmentSeparator(value: String): Self = StObject.set(x, "pathSegmentSeparator", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def set_getValue(value: js.Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      inline def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
