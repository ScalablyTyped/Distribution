package typings.nodelibFsWalk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerMod {
  
  @JSImport("@nodelib/fs.walk/out/readers/reader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Reader {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _root: String = js.native
    
    /* protected */ /* CompleteClass */
    override val _settings: typings.nodelibFsWalk.settingsMod.default = js.native
  }
  
  trait Reader extends StObject {
    
    /* protected */ val _root: String
    
    /* protected */ val _settings: typings.nodelibFsWalk.settingsMod.default
  }
  object Reader {
    
    inline def apply(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default): Reader = {
      val __obj = js.Dynamic.literal(_root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reader]
    }
    
    extension [Self <: Reader](x: Self) {
      
      inline def set_root(value: String): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: typings.nodelibFsWalk.settingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
