package typings.nodelibFsWalk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/reader", JSImport.Default)
  @js.native
  class default protected () extends Reader {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  trait Reader extends StObject {
    
    val _root: String = js.native
    
    val _settings: typings.nodelibFsWalk.settingsMod.default = js.native
  }
  object Reader {
    
    @scala.inline
    def apply(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default): Reader = {
      val __obj = js.Dynamic.literal(_root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reader]
    }
    
    @scala.inline
    implicit class ReaderMutableBuilder[Self <: Reader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_root(value: String): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: typings.nodelibFsWalk.settingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
