package typings.node.vmMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import typings.node.moduleMod.global.ImportMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTextModuleOptions extends StObject {
  
  var cachedData: js.UndefOr[Buffer | ArrayBufferView] = js.undefined
  
  var columnOffset: js.UndefOr[Double] = js.undefined
  
  var context: js.UndefOr[Context] = js.undefined
  
  /**
    * String used in stack traces.
    * @default 'vm:module(i)' where i is a context-specific ascending index.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  var importModuleDynamically: js.UndefOr[
    js.Function3[/* specifier */ String, /* script */ Script, /* importAssertions */ js.Object, Module]
  ] = js.undefined
  
  /**
    * Called during evaluation of this module to initialize the `import.meta`.
    */
  var initializeImportMeta: js.UndefOr[js.Function2[/* meta */ ImportMeta, /* module */ SourceTextModule, Unit]] = js.undefined
  
  var lineOffset: js.UndefOr[Double] = js.undefined
}
object SourceTextModuleOptions {
  
  inline def apply(): SourceTextModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceTextModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceTextModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setCachedData(value: Buffer | ArrayBufferView): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
    
    inline def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
    
    inline def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
    
    inline def setColumnOffsetUndefined: Self = StObject.set(x, "columnOffset", js.undefined)
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setImportModuleDynamically(value: (/* specifier */ String, /* script */ Script, /* importAssertions */ js.Object) => Module): Self = StObject.set(x, "importModuleDynamically", js.Any.fromFunction3(value))
    
    inline def setImportModuleDynamicallyUndefined: Self = StObject.set(x, "importModuleDynamically", js.undefined)
    
    inline def setInitializeImportMeta(value: (/* meta */ ImportMeta, /* module */ SourceTextModule) => Unit): Self = StObject.set(x, "initializeImportMeta", js.Any.fromFunction2(value))
    
    inline def setInitializeImportMetaUndefined: Self = StObject.set(x, "initializeImportMeta", js.undefined)
    
    inline def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
    
    inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
  }
}
