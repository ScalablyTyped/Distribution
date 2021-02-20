package typings.nodelibFsStat

import typings.nodelibFsStat.anon.PartialFileSystemAdapter
import typings.nodelibFsStat.fsMod.FileSystemAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@nodelib/fs.stat/out/settings", JSImport.Default)
  @js.native
  class default () extends Settings {
    def this(_options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var followSymbolicLink: js.UndefOr[Boolean] = js.native
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.native
    
    var markSymbolicLink: js.UndefOr[Boolean] = js.native
    
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
      def setFollowSymbolicLink(value: Boolean): Self = StObject.set(x, "followSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowSymbolicLinkUndefined: Self = StObject.set(x, "followSymbolicLink", js.undefined)
      
      @scala.inline
      def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMarkSymbolicLink(value: Boolean): Self = StObject.set(x, "markSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkSymbolicLinkUndefined: Self = StObject.set(x, "markSymbolicLink", js.undefined)
      
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
    
    val followSymbolicLink: Boolean = js.native
    
    val fs: FileSystemAdapter = js.native
    
    val markSymbolicLink: Boolean = js.native
    
    val throwErrorOnBrokenSymbolicLink: Boolean = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(
      _getValue: js.Any,
      _options: js.Any,
      followSymbolicLink: Boolean,
      fs: FileSystemAdapter,
      markSymbolicLink: Boolean,
      throwErrorOnBrokenSymbolicLink: Boolean
    ): Settings = {
      val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], followSymbolicLink = followSymbolicLink.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], markSymbolicLink = markSymbolicLink.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowSymbolicLink(value: Boolean): Self = StObject.set(x, "followSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkSymbolicLink(value: Boolean): Self = StObject.set(x, "markSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getValue(value: js.Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
