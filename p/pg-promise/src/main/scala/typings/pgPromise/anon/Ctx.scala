package typings.pgPromise.anon

import typings.pgPromise.mod.IEventContext
import typings.pgPromise.mod.IResultExt
import typings.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx[C /* <: IClient */] extends StObject {
  
  var ctx: IEventContext[C]
  
  var data: js.Array[Any]
  
  var result: IResultExt[Any] | Unit
}
object Ctx {
  
  inline def apply[C /* <: IClient */](ctx: IEventContext[C], data: js.Array[Any], result: IResultExt[Any] | Unit): Ctx[C] = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ctx[?], C /* <: IClient */] (val x: Self & Ctx[C]) extends AnyVal {
    
    inline def setCtx(value: IEventContext[C]): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setResult(value: IResultExt[Any] | Unit): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
