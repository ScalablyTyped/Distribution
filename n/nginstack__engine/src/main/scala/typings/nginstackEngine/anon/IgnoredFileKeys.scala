package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoredFileKeys extends StObject {
  
  var ignoredFileKeys: js.Array[Double]
}
object IgnoredFileKeys {
  
  inline def apply(ignoredFileKeys: js.Array[Double]): IgnoredFileKeys = {
    val __obj = js.Dynamic.literal(ignoredFileKeys = ignoredFileKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredFileKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoredFileKeys] (val x: Self) extends AnyVal {
    
    inline def setIgnoredFileKeys(value: js.Array[Double]): Self = StObject.set(x, "ignoredFileKeys", value.asInstanceOf[js.Any])
    
    inline def setIgnoredFileKeysVarargs(value: Double*): Self = StObject.set(x, "ignoredFileKeys", js.Array(value*))
  }
}
