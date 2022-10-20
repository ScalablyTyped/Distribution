package typings.ngPackagr

import typings.ngPackagr.anon.CssUrl
import typings.ngPackagr.anon.FollowSymlinks
import typings.ngPackagr.ngPackagrStrings.css
import typings.ngPackagr.ngPackagrStrings.less
import typings.ngPackagr.ngPackagrStrings.sass
import typings.ngPackagr.ngPackagrStrings.scss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngPackageDotschemaMod {
  
  type AssetPattern = FollowSymlinks | String
  
  trait NgPackageConfig extends StObject {
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    /**
      * A list of dependencies that are allowed in the 'dependencies' and 'devDependencies' section of package.json. Values in the list are regular expressions matched against npm package names.
      */
    var allowedNonPeerDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of files which are simply copied into the package.
      */
    var assets: js.UndefOr[js.Array[AssetPattern]] = js.undefined
    
    /**
      * Delete output path before build.
      */
    var deleteDestPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Destination folder where distributable binaries of the Angular library are written (default: `dist`).
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * The stylesheet language to use for the library's inline component styles.
      */
    var inlineStyleLanguage: js.UndefOr[css | less | sass | scss] = js.undefined
    
    /**
      * Enable this to keep the 'scripts' section in package.json. Read the NPM Blog on 'Package install scripts vulnerability' – http://blog.npmjs.org/post/141702881055/package-install-scripts-vulnerability
      */
    var keepLifecycleScripts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Description of the library's entry point.
      */
    var lib: js.UndefOr[CssUrl] = js.undefined
  }
  object NgPackageConfig {
    
    inline def apply(): NgPackageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgPackageConfig]
    }
    
    extension [Self <: NgPackageConfig](x: Self) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAllowedNonPeerDependencies(value: js.Array[String]): Self = StObject.set(x, "allowedNonPeerDependencies", value.asInstanceOf[js.Any])
      
      inline def setAllowedNonPeerDependenciesUndefined: Self = StObject.set(x, "allowedNonPeerDependencies", js.undefined)
      
      inline def setAllowedNonPeerDependenciesVarargs(value: String*): Self = StObject.set(x, "allowedNonPeerDependencies", js.Array(value*))
      
      inline def setAssets(value: js.Array[AssetPattern]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      inline def setAssetsVarargs(value: AssetPattern*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setDeleteDestPath(value: Boolean): Self = StObject.set(x, "deleteDestPath", value.asInstanceOf[js.Any])
      
      inline def setDeleteDestPathUndefined: Self = StObject.set(x, "deleteDestPath", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setInlineStyleLanguage(value: css | less | sass | scss): Self = StObject.set(x, "inlineStyleLanguage", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleLanguageUndefined: Self = StObject.set(x, "inlineStyleLanguage", js.undefined)
      
      inline def setKeepLifecycleScripts(value: Boolean): Self = StObject.set(x, "keepLifecycleScripts", value.asInstanceOf[js.Any])
      
      inline def setKeepLifecycleScriptsUndefined: Self = StObject.set(x, "keepLifecycleScripts", js.undefined)
      
      inline def setLib(value: CssUrl): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
    }
  }
}
