package typings.node.vmMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunningCodeInNewContextOptions
  extends StObject
     with RunningScriptInNewContextOptions {
  
  var cachedData: js.UndefOr[Buffer | ArrayBufferView] = js.undefined
  
  var importModuleDynamically: js.UndefOr[
    js.Function3[/* specifier */ String, /* script */ Script, /* importAssertions */ js.Object, Module]
  ] = js.undefined
}
object RunningCodeInNewContextOptions {
  
  inline def apply(): RunningCodeInNewContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunningCodeInNewContextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunningCodeInNewContextOptions] (val x: Self) extends AnyVal {
    
    inline def setCachedData(value: Buffer | ArrayBufferView): Self = StObject.set(x, "cachedData", value.asInstanceOf[js.Any])
    
    inline def setCachedDataUndefined: Self = StObject.set(x, "cachedData", js.undefined)
    
    inline def setImportModuleDynamically(value: (/* specifier */ String, /* script */ Script, /* importAssertions */ js.Object) => Module): Self = StObject.set(x, "importModuleDynamically", js.Any.fromFunction3(value))
    
    inline def setImportModuleDynamicallyUndefined: Self = StObject.set(x, "importModuleDynamically", js.undefined)
  }
}
