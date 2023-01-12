package typings.nodelibFsStat

import typings.nodelibFsStat.anon.PartialFileSystemAdapter
import typings.nodelibFsStat.outAdaptersFsMod.FileSystemAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSettingsMod {
  
  @JSImport("@nodelib/fs.stat/out/settings", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Settings {
    def this(_options: Options) = this()
    
    /* private */ /* CompleteClass */
    var _getValue: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _options: Any = js.native
    
    /* CompleteClass */
    override val followSymbolicLink: Boolean = js.native
    
    /* CompleteClass */
    override val fs: FileSystemAdapter = js.native
    
    /* CompleteClass */
    override val markSymbolicLink: Boolean = js.native
    
    /* CompleteClass */
    override val throwErrorOnBrokenSymbolicLink: Boolean = js.native
  }
  
  trait Options extends StObject {
    
    var followSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
    
    var markSymbolicLink: js.UndefOr[Boolean] = js.undefined
    
    var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFollowSymbolicLink(value: Boolean): Self = StObject.set(x, "followSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setFollowSymbolicLinkUndefined: Self = StObject.set(x, "followSymbolicLink", js.undefined)
      
      inline def setFs(value: PartialFileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMarkSymbolicLink(value: Boolean): Self = StObject.set(x, "markSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setMarkSymbolicLinkUndefined: Self = StObject.set(x, "markSymbolicLink", js.undefined)
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLinkUndefined: Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /* private */ var _getValue: Any
    
    /* private */ val _options: Any
    
    val followSymbolicLink: Boolean
    
    val fs: FileSystemAdapter
    
    val markSymbolicLink: Boolean
    
    val throwErrorOnBrokenSymbolicLink: Boolean
  }
  object Settings {
    
    inline def apply(
      _getValue: Any,
      _options: Any,
      followSymbolicLink: Boolean,
      fs: FileSystemAdapter,
      markSymbolicLink: Boolean,
      throwErrorOnBrokenSymbolicLink: Boolean
    ): Settings = {
      val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], followSymbolicLink = followSymbolicLink.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], markSymbolicLink = markSymbolicLink.asInstanceOf[js.Any], throwErrorOnBrokenSymbolicLink = throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setFollowSymbolicLink(value: Boolean): Self = StObject.set(x, "followSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setMarkSymbolicLink(value: Boolean): Self = StObject.set(x, "markSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorOnBrokenSymbolicLink(value: Boolean): Self = StObject.set(x, "throwErrorOnBrokenSymbolicLink", value.asInstanceOf[js.Any])
      
      inline def set_getValue(value: Any): Self = StObject.set(x, "_getValue", value.asInstanceOf[js.Any])
      
      inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
}
