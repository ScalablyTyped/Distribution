package typings.pmmmwhReactRefreshWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderTypesMod {
  
  trait ESModuleOptions extends StObject {
    
    /**
      * Files to explicitly exclude from flagged as ES Modules.
      */
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * Files to explicitly include for flagged as ES Modules.
      */
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  }
  object ESModuleOptions {
    
    inline def apply(): ESModuleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESModuleOptions]
    }
    
    extension [Self <: ESModuleOptions](x: Self) {
      
      inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  /* Inlined type-fest.type-fest.SetRequired<@pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/loader/types.ReactRefreshLoaderOptions, 'const'> */
  trait NormalizedLoaderOptions extends StObject {
    
    var const: js.UndefOr[Boolean] = js.undefined
    
    var esModule: js.UndefOr[Boolean | ESModuleOptions] = js.undefined
  }
  object NormalizedLoaderOptions {
    
    inline def apply(): NormalizedLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizedLoaderOptions]
    }
    
    extension [Self <: NormalizedLoaderOptions](x: Self) {
      
      inline def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      inline def setEsModule(value: Boolean | ESModuleOptions): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
    }
  }
  
  trait ReactRefreshLoaderOptions extends StObject {
    
    /**
      * Enables usage of ES6 `const` and `let` in generated runtime code.
      */
    var const: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables strict ES Modules compatible runtime.
      */
    var esModule: js.UndefOr[Boolean | ESModuleOptions] = js.undefined
  }
  object ReactRefreshLoaderOptions {
    
    inline def apply(): ReactRefreshLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactRefreshLoaderOptions]
    }
    
    extension [Self <: ReactRefreshLoaderOptions](x: Self) {
      
      inline def setConst(value: Boolean): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      inline def setEsModule(value: Boolean | ESModuleOptions): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
    }
  }
}
