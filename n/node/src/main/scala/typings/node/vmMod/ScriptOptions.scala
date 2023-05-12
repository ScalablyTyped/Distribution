package typings.node.vmMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptOptions
  extends StObject
     with BaseOptions {
  
  /**
    * V8's code cache data for the supplied source.
    */
  var cachedData: js.UndefOr[Buffer | ArrayBufferView] = js.undefined
  
  /**
    * Called during evaluation of this module when `import()` is called.
    * If this option is not specified, calls to `import()` will reject with `ERR_VM_DYNAMIC_IMPORT_CALLBACK_MISSING`.
    */
  var importModuleDynamically: js.UndefOr[
    js.Function3[/* specifier */ String, /* script */ Script, /* importAssertions */ js.Object, Module]
  ] = js.undefined
  
  /** @deprecated in favor of `script.createCachedData()` */
  var produceCachedData: js.UndefOr[Boolean] = js.undefined
}
object ScriptOptions {
  
  inline def apply(): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptOptions] (val x: Self) extends AnyVal {
    
    inline def setCachedData(value: Buffer | ArrayBufferView): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
    
    inline def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
    
    inline def setImportModuleDynamically(value: (/* specifier */ String, /* script */ Script, /* importAssertions */ js.Object) => Module): Self = StObject.set(x, "importModuleDynamically", js.Any.fromFunction3(value))
    
    inline def setImportModuleDynamicallyUndefined: Self = StObject.set(x, "importModuleDynamically", js.undefined)
    
    inline def setProduceCachedData(value: Boolean): Self = StObject.set(x, "produceCachedData", value.asInstanceOf[js.Any])
    
    inline def setProduceCachedDataUndefined: Self = StObject.set(x, "produceCachedData", js.undefined)
  }
}
