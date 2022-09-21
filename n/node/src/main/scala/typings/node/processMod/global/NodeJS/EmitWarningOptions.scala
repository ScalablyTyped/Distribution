package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitWarningOptions extends StObject {
  
  /**
    * A unique identifier for the warning instance being emitted.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * When `warning` is a `string`, `ctor` is an optional function used to limit the generated stack trace.
    *
    * @default process.emitWarning
    */
  var ctor: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Additional text to include with the error.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * When `warning` is a `string`, `type` is the name to use for the _type_ of warning being emitted.
    *
    * @default 'Warning'
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object EmitWarningOptions {
  
  inline def apply(): EmitWarningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitWarningOptions]
  }
  
  extension [Self <: EmitWarningOptions](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCtor(value: js.Function): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
    
    inline def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
