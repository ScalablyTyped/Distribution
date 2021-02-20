package typings.postcssCustomProperties

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Plugin_
import typings.postcssCustomProperties.anon.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-custom-properties", JSImport.Namespace)
  @js.native
  val ^ : CustomPropertiesPlugin = js.native
  
  @js.native
  trait CustomPropertiesObject extends StObject {
    
    var `custom-properties`: js.UndefOr[StringDictionary[String]] = js.native
    
    var customProperties: js.UndefOr[StringDictionary[String]] = js.native
  }
  object CustomPropertiesObject {
    
    @scala.inline
    def apply(): CustomPropertiesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomPropertiesObject]
    }
    
    @scala.inline
    implicit class CustomPropertiesObjectMutableBuilder[Self <: CustomPropertiesObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setCustom-properties`(value: StringDictionary[String]): Self = StObject.set(x, "custom-properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCustom-propertiesUndefined`: Self = StObject.set(x, "custom-properties", js.undefined)
      
      @scala.inline
      def setCustomProperties(value: StringDictionary[String]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    }
  }
  
  type CustomPropertiesPlugin = Plugin_[Options] with Process
  
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
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The exportTo option specifies destinations where Custom Properties can be exported to,
      * which might be CSS, JS, and JSON files, functions, and directly passed objects.
      * Multiple destinations can be passed into this option, and they will be parsed in the order they are received.
      * JavaScript files, JSON files, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
      * @see {@link https://github.com/postcss/postcss-custom-properties#exportto}
      */
    var exportTo: js.UndefOr[ExportSources | js.Array[ExportSources]] = js.native
    
    /**
      * The importFrom option specifies sources where Custom Properties can be imported from,
      * which might be CSS, JS, and JSON files, functions, and directly passed objects.
      * Multiple sources can be passed into this option, and they will be parsed in the order they are received.
      * JavaScript files, JSON files, functions, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
      * @see {@link https://github.com/postcss/postcss-custom-properties#importfrom}
      */
    var importFrom: js.UndefOr[ImportSources | js.Array[ImportSources]] = js.native
    
    /**
      * The preserve option determines whether Custom Properties
      * and properties using custom properties should be preserved in their original form.
      * By default, both of these are preserved
      * @see {@link https://github.com/postcss/postcss-custom-properties#preserve}
      */
    var preserve: js.UndefOr[Boolean] = js.native
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
      def setExportTo(value: ExportSources | js.Array[ExportSources]): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportToFunction1(value: /* customProperties */ CustomPropertiesObject => js.Any): Self = StObject.set(x, "exportTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
      
      @scala.inline
      def setExportToVarargs(value: ExportSources*): Self = StObject.set(x, "exportTo", js.Array(value :_*))
      
      @scala.inline
      def setImportFrom(value: ImportSources | js.Array[ImportSources]): Self = StObject.set(x, "importFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportFromFunction0(value: () => CustomPropertiesObject): Self = StObject.set(x, "importFrom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImportFromUndefined: Self = StObject.set(x, "importFrom", js.undefined)
      
      @scala.inline
      def setImportFromVarargs(value: ImportSources*): Self = StObject.set(x, "importFrom", js.Array(value :_*))
      
      @scala.inline
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
  
  type _To = CustomPropertiesPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CustomPropertiesPlugin = ^
}
