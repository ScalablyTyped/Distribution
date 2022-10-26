package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitFontFile extends StObject {
  
  var config: Any
  
  var data: js.Array[Any]
  
  def emitFontFile(content: typings.node.bufferMod.global.Buffer, ext: String, preload: Boolean): String
  
  var fs: Any
  
  var functionName: String
  
  var isServer: Boolean
  
  def resolve(src: String): String
}
object EmitFontFile {
  
  inline def apply(
    config: Any,
    data: js.Array[Any],
    emitFontFile: (typings.node.bufferMod.global.Buffer, String, Boolean) => String,
    fs: Any,
    functionName: String,
    isServer: Boolean,
    resolve: String => String
  ): EmitFontFile = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], emitFontFile = js.Any.fromFunction3(emitFontFile), fs = fs.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[EmitFontFile]
  }
  
  extension [Self <: EmitFontFile](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEmitFontFile(value: (typings.node.bufferMod.global.Buffer, String, Boolean) => String): Self = StObject.set(x, "emitFontFile", js.Any.fromFunction3(value))
    
    inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: String => String): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
