package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogBucket extends StObject {
  
  /** The destination bucket where the current bucket's logs should be placed. */
  var logBucket: js.UndefOr[String] = js.undefined
  
  /** A prefix for log object names. */
  var logObjectPrefix: js.UndefOr[String] = js.undefined
}
object LogBucket {
  
  inline def apply(): LogBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogBucket] (val x: Self) extends AnyVal {
    
    inline def setLogBucket(value: String): Self = StObject.set(x, "logBucket", value.asInstanceOf[js.Any])
    
    inline def setLogBucketUndefined: Self = StObject.set(x, "logBucket", js.undefined)
    
    inline def setLogObjectPrefix(value: String): Self = StObject.set(x, "logObjectPrefix", value.asInstanceOf[js.Any])
    
    inline def setLogObjectPrefixUndefined: Self = StObject.set(x, "logObjectPrefix", js.undefined)
  }
}
