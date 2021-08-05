package typings.postcssCustomProperties

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.LazyResult
import typings.postcss.mod.Plugin_
import typings.postcss.mod.Result
import typings.postcssCustomProperties.anon.ToString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-custom-properties", JSImport.Namespace)
  @js.native
  val ^ : CustomPropertiesPlugin = js.native
  
  trait CustomPropertiesObject extends StObject {
    
    var `custom-properties`: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var customProperties: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object CustomPropertiesObject {
    
    inline def apply(): CustomPropertiesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomPropertiesObject]
    }
    
    extension [Self <: CustomPropertiesObject](x: Self) {
      
      inline def `setCustom-properties`(value: StringDictionary[String]): Self = StObject.set(x, "custom-properties", value.asInstanceOf[js.Any])
      
      inline def `setCustom-propertiesUndefined`: Self = StObject.set(x, "custom-properties", js.undefined)
      
      inline def setCustomProperties(value: StringDictionary[String]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
      
      inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    }
  }
  
  @js.native
  trait CustomPropertiesPlugin extends Plugin_[Options] {
    
    def process(css: String, opts: js.Any): LazyResult = js.native
    def process(css: String, opts: js.Any, pluginOptions: Options): LazyResult = js.native
    def process(css: Result, opts: js.Any): LazyResult = js.native
    def process(css: Result, opts: js.Any, pluginOptions: Options): LazyResult = js.native
    def process(css: ToString): LazyResult = js.native
    def process(css: ToString, opts: js.Any): LazyResult = js.native
    def process(css: ToString, opts: js.Any, pluginOptions: Options): LazyResult = js.native
    def process(css: ToString, opts: Unit, pluginOptions: Options): LazyResult = js.native
  }
  
  /**
    * Sources where Custom Properties can be imported from or export to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects
    */
  type ExportSources = String | CustomPropertiesObject | (js.Function1[/* customProperties */ CustomPropertiesObject, js.Any]) | js.Promise[CustomPropertiesObject]
  
  /**
    * Sources where Custom Properties can be imported from or export to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects
    */
  type ImportSources = String | js.Function0[CustomPropertiesObject] | CustomPropertiesObject | js.Promise[CustomPropertiesObject]
  
  trait Options extends StObject {
    
    /**
      * The exportTo option specifies destinations where Custom Properties can be exported to,
      * which might be CSS, JS, and JSON files, functions, and directly passed objects.
      * Multiple destinations can be passed into this option, and they will be parsed in the order they are received.
      * JavaScript files, JSON files, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
      * @see {@link https://github.com/postcss/postcss-custom-properties#exportto}
      */
    var exportTo: js.UndefOr[ExportSources | js.Array[ExportSources]] = js.undefined
    
    /**
      * The importFrom option specifies sources where Custom Properties can be imported from,
      * which might be CSS, JS, and JSON files, functions, and directly passed objects.
      * Multiple sources can be passed into this option, and they will be parsed in the order they are received.
      * JavaScript files, JSON files, functions, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
      * @see {@link https://github.com/postcss/postcss-custom-properties#importfrom}
      */
    var importFrom: js.UndefOr[ImportSources | js.Array[ImportSources]] = js.undefined
    
    /**
      * The preserve option determines whether Custom Properties
      * and properties using custom properties should be preserved in their original form.
      * By default, both of these are preserved
      * @see {@link https://github.com/postcss/postcss-custom-properties#preserve}
      */
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExportTo(value: ExportSources | js.Array[ExportSources]): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
      
      inline def setExportToFunction1(value: /* customProperties */ CustomPropertiesObject => js.Any): Self = StObject.set(x, "exportTo", js.Any.fromFunction1(value))
      
      inline def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
      
      inline def setExportToVarargs(value: ExportSources*): Self = StObject.set(x, "exportTo", js.Array(value :_*))
      
      inline def setImportFrom(value: ImportSources | js.Array[ImportSources]): Self = StObject.set(x, "importFrom", value.asInstanceOf[js.Any])
      
      inline def setImportFromFunction0(value: () => CustomPropertiesObject): Self = StObject.set(x, "importFrom", js.Any.fromFunction0(value))
      
      inline def setImportFromUndefined: Self = StObject.set(x, "importFrom", js.undefined)
      
      inline def setImportFromVarargs(value: ImportSources*): Self = StObject.set(x, "importFrom", js.Array(value :_*))
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
  
  type _To = CustomPropertiesPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CustomPropertiesPlugin = ^
}
