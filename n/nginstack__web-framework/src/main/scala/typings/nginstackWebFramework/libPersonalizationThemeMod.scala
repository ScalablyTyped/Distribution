package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationThemeMod {
  
  inline def apply(themeKey: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(themeKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/Theme", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Theme {
    def this(themeKey: Any) = this()
    
    /* CompleteClass */
    var directory: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var environmentCssFileKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var favIconFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var highchartsOptionsFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^] = js.native
    
    /* CompleteClass */
    var key: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var simpleLayoutCssFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^] = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/Theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrent(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[Theme]
  
  inline def getDirectories(): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectories")().asInstanceOf[js.Array[Value]]
  
  inline def getInstance(userAgent: Double, userKey: Double): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  trait Theme extends StObject {
    
    var directory: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var environmentCssFileKeys: js.Array[Any]
    
    var favIconFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var highchartsOptionsFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]
    
    var key: typings.nginstackEngine.libDbkeyDbkeyMod.^
    
    var simpleLayoutCssFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]
  }
  object Theme {
    
    inline def apply(
      directory: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      environmentCssFileKeys: js.Array[Any],
      favIconFileKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      highchartsOptionsFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^],
      key: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      simpleLayoutCssFileKeys: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]
    ): Theme = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], environmentCssFileKeys = environmentCssFileKeys.asInstanceOf[js.Any], favIconFileKey = favIconFileKey.asInstanceOf[js.Any], highchartsOptionsFileKeys = highchartsOptionsFileKeys.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], simpleLayoutCssFileKeys = simpleLayoutCssFileKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      inline def setDirectory(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentCssFileKeys(value: js.Array[Any]): Self = StObject.set(x, "environmentCssFileKeys", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentCssFileKeysVarargs(value: Any*): Self = StObject.set(x, "environmentCssFileKeys", js.Array(value*))
      
      inline def setFavIconFileKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "favIconFileKey", value.asInstanceOf[js.Any])
      
      inline def setHighchartsOptionsFileKeys(value: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]): Self = StObject.set(x, "highchartsOptionsFileKeys", value.asInstanceOf[js.Any])
      
      inline def setHighchartsOptionsFileKeysVarargs(value: typings.nginstackEngine.libDbkeyDbkeyMod.^ *): Self = StObject.set(x, "highchartsOptionsFileKeys", js.Array(value*))
      
      inline def setKey(value: typings.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutCssFileKeys(value: js.Array[typings.nginstackEngine.libDbkeyDbkeyMod.^]): Self = StObject.set(x, "simpleLayoutCssFileKeys", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutCssFileKeysVarargs(value: typings.nginstackEngine.libDbkeyDbkeyMod.^ *): Self = StObject.set(x, "simpleLayoutCssFileKeys", js.Array(value*))
    }
  }
}
