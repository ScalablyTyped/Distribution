package typings.postcssCustomProperties

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssCustomProperties.distLibOptionsMod.ExportOptions
import typings.postcssCustomProperties.distLibOptionsMod.ImportCustomProperties
import typings.postcssCustomProperties.distLibOptionsMod.ImportFromSource
import typings.postcssCustomProperties.distLibOptionsMod.ImportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-custom-properties", JSImport.Default)
  @js.native
  val default: PluginCreator[PluginOptions] = js.native
  
  trait PluginOptions extends StObject {
    
    /** Do not emit warnings about "importFrom" and "exportTo" deprecations */
    var disableDeprecationNotice: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies destinations where Custom Properties can be exported to, which might be CSS, JS, and JSON files, functions, and directly passed objects. */
    var exportTo: js.UndefOr[ExportOptions | js.Array[ExportOptions]] = js.undefined
    
    /** Specifies sources where Custom Properties can be imported from, which might be CSS, JS, and JSON files, functions, and directly passed objects. */
    var importFrom: js.UndefOr[ImportOptions | js.Array[ImportOptions]] = js.undefined
    
    /** Specifies if `importFrom` properties or `:root` properties have priority. */
    var overrideImportFromWithRoot: js.UndefOr[Boolean] = js.undefined
    
    /** Determines whether Custom Properties and properties using custom properties should be preserved in their original form. */
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setDisableDeprecationNotice(value: Boolean): Self = StObject.set(x, "disableDeprecationNotice", value.asInstanceOf[js.Any])
      
      inline def setDisableDeprecationNoticeUndefined: Self = StObject.set(x, "disableDeprecationNotice", js.undefined)
      
      inline def setExportTo(value: ExportOptions | js.Array[ExportOptions]): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
      
      inline def setExportToFunction1(value: /* ExportCustomProperties */ Any => js.Promise[Unit] | Unit): Self = StObject.set(x, "exportTo", js.Any.fromFunction1(value))
      
      inline def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
      
      inline def setExportToVarargs(value: ExportOptions*): Self = StObject.set(x, "exportTo", js.Array(value*))
      
      inline def setImportFrom(value: ImportOptions | js.Array[ImportOptions]): Self = StObject.set(x, "importFrom", value.asInstanceOf[js.Any])
      
      inline def setImportFromFunction0(
        value: () => ImportCustomProperties | ImportFromSource | (js.Promise[ImportFromSource | ImportCustomProperties])
      ): Self = StObject.set(x, "importFrom", js.Any.fromFunction0(value))
      
      inline def setImportFromUndefined: Self = StObject.set(x, "importFrom", js.undefined)
      
      inline def setImportFromVarargs(value: ImportOptions*): Self = StObject.set(x, "importFrom", js.Array(value*))
      
      inline def setOverrideImportFromWithRoot(value: Boolean): Self = StObject.set(x, "overrideImportFromWithRoot", value.asInstanceOf[js.Any])
      
      inline def setOverrideImportFromWithRootUndefined: Self = StObject.set(x, "overrideImportFromWithRoot", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
  
  type _To = PluginCreator[PluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[PluginOptions] = default
}
