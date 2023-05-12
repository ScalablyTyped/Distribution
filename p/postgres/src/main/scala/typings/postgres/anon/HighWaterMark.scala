package typings.postgres.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighWaterMark extends StObject {
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object HighWaterMark {
  
  inline def apply(): HighWaterMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighWaterMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighWaterMark] (val x: Self) extends AnyVal {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
