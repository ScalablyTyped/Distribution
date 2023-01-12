package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Async parsing local file can specify encoding
trait ParseLocalConfigBase[T, TInput]
  extends StObject
     with ParseAsyncConfigBase[T, TInput] {
  
  /** The encoding to use when opening local files. If specified, it must be a value supported by the FileReader API. */
  var encoding: js.UndefOr[String] = js.undefined
}
object ParseLocalConfigBase {
  
  inline def apply[T, TInput](): ParseLocalConfigBase[T, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseLocalConfigBase[T, TInput]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseLocalConfigBase[?, ?], T, TInput] (val x: Self & (ParseLocalConfigBase[T, TInput])) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
