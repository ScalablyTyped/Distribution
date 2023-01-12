package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbStatsOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Divide the returned sizes by scale value. */
  var scale: js.UndefOr[scala.Double] = js.undefined
}
object DbStatsOptions {
  
  inline def apply(): DbStatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbStatsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DbStatsOptions] (val x: Self) extends AnyVal {
    
    inline def setScale(value: scala.Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
