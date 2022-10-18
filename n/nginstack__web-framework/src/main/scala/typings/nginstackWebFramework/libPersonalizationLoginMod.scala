package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationLoginMod {
  
  inline def apply(loginKey: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(loginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/Login", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Login {
    def this(loginKey: Any) = this()
    
    /* CompleteClass */
    var cssFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var cssFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^] = js.native
    
    /* CompleteClass */
    var directory: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var favIconFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var indexFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var key: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var loginFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var titleLogoff: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/Login", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDirectories(): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectories")().asInstanceOf[js.Array[Value]]
  
  inline def getInstance(userAgent: Double): Login = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Login]
  inline def getInstance(userAgent: typings.nginstackEngine.libDbkeyDbkeyMod.^): Login = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Login]
  
  trait Login extends StObject {
    
    var cssFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var cssFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]
    
    var directory: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var favIconFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var indexFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var key: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var loginFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var titleLogoff: String
  }
  object Login {
    
    inline def apply(
      cssFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      cssFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^],
      directory: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      favIconFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      indexFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      key: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      loginFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      titleLogoff: String
    ): Login = {
      val __obj = js.Dynamic.literal(cssFileKey = cssFileKey.asInstanceOf[js.Any], cssFileKeys = cssFileKeys.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], favIconFileKey = favIconFileKey.asInstanceOf[js.Any], indexFileKey = indexFileKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loginFileKey = loginFileKey.asInstanceOf[js.Any], titleLogoff = titleLogoff.asInstanceOf[js.Any])
      __obj.asInstanceOf[Login]
    }
    
    extension [Self <: Login](x: Self) {
      
      inline def setCssFileKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "cssFileKey", value.asInstanceOf[js.Any])
      
      inline def setCssFileKeys(value: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]): Self = StObject.set(x, "cssFileKeys", value.asInstanceOf[js.Any])
      
      inline def setCssFileKeysVarargs(value: typings.nginstackEngine.libDbkeyDbkeyMod.^ *): Self = StObject.set(x, "cssFileKeys", js.Array(value*))
      
      inline def setDirectory(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFavIconFileKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "favIconFileKey", value.asInstanceOf[js.Any])
      
      inline def setIndexFileKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "indexFileKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLoginFileKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "loginFileKey", value.asInstanceOf[js.Any])
      
      inline def setTitleLogoff(value: String): Self = StObject.set(x, "titleLogoff", value.asInstanceOf[js.Any])
    }
  }
}
