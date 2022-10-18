package typings.next

import typings.next.anon.EslintConfig
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEslintHasEslintConfigurationMod {
  
  @JSImport("next/dist/lib/eslint/hasEslintConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasEslintConfiguration(): js.Promise[ConfigAvailable] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEslintConfiguration")().asInstanceOf[js.Promise[ConfigAvailable]]
  inline def hasEslintConfiguration(eslintrcFile: String): js.Promise[ConfigAvailable] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEslintConfiguration")(eslintrcFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConfigAvailable]]
  inline def hasEslintConfiguration(eslintrcFile: String, packageJsonConfig: EslintConfig): js.Promise[ConfigAvailable] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasEslintConfiguration")(eslintrcFile.asInstanceOf[js.Any], packageJsonConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigAvailable]]
  inline def hasEslintConfiguration(eslintrcFile: Null, packageJsonConfig: EslintConfig): js.Promise[ConfigAvailable] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasEslintConfiguration")(eslintrcFile.asInstanceOf[js.Any], packageJsonConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigAvailable]]
  
  trait ConfigAvailable extends StObject {
    
    var emptyEslintrc: js.UndefOr[Boolean] = js.undefined
    
    var emptyPkgJsonConfig: js.UndefOr[Boolean] = js.undefined
    
    var exists: Boolean
    
    var firstTimeSetup: js.UndefOr[`true`] = js.undefined
  }
  object ConfigAvailable {
    
    inline def apply(exists: Boolean): ConfigAvailable = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigAvailable]
    }
    
    extension [Self <: ConfigAvailable](x: Self) {
      
      inline def setEmptyEslintrc(value: Boolean): Self = StObject.set(x, "emptyEslintrc", value.asInstanceOf[js.Any])
      
      inline def setEmptyEslintrcUndefined: Self = StObject.set(x, "emptyEslintrc", js.undefined)
      
      inline def setEmptyPkgJsonConfig(value: Boolean): Self = StObject.set(x, "emptyPkgJsonConfig", value.asInstanceOf[js.Any])
      
      inline def setEmptyPkgJsonConfigUndefined: Self = StObject.set(x, "emptyPkgJsonConfig", js.undefined)
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setFirstTimeSetup(value: `true`): Self = StObject.set(x, "firstTimeSetup", value.asInstanceOf[js.Any])
      
      inline def setFirstTimeSetupUndefined: Self = StObject.set(x, "firstTimeSetup", js.undefined)
    }
  }
}
