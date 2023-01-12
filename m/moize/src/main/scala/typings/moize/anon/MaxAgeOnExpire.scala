package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAgeOnExpire[MaxAge /* <: Double */, ExpireOptions /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  onExpire :ExpireHandler} */ js.Any */, ExpireHandler /* <: typings.moize.mod.OnExpire */] extends StObject {
  
  var maxAge: MaxAge
  
  var onExpire: /* import warning: importer.ImportType#apply Failed type conversion: ExpireOptions['onExpire'] */ js.Any
}
object MaxAgeOnExpire {
  
  inline def apply[MaxAge /* <: Double */, ExpireOptions /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  onExpire :ExpireHandler} */ js.Any */, ExpireHandler /* <: typings.moize.mod.OnExpire */](
    maxAge: MaxAge,
    onExpire: /* import warning: importer.ImportType#apply Failed type conversion: ExpireOptions['onExpire'] */ js.Any
  ): MaxAgeOnExpire[MaxAge, ExpireOptions, ExpireHandler] = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], onExpire = onExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeOnExpire[MaxAge, ExpireOptions, ExpireHandler]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxAgeOnExpire[?, ?, ?], MaxAge /* <: Double */, ExpireOptions /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  onExpire :ExpireHandler} */ js.Any */, ExpireHandler /* <: typings.moize.mod.OnExpire */] (val x: Self & (MaxAgeOnExpire[MaxAge, ExpireOptions, ExpireHandler])) extends AnyVal {
    
    inline def setMaxAge(value: MaxAge): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setOnExpire(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ExpireOptions['onExpire'] */ js.Any
    ): Self = StObject.set(x, "onExpire", value.asInstanceOf[js.Any])
  }
}
