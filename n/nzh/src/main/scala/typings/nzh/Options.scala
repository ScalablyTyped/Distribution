package typings.nzh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /*
  	 *  十的口语化开关, 默认值为 false
  	 *	注: Nzh.cn和Nzh.hk中的encodeS方法默认 true
  	 * */
  var tenMin: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * "万万"化开关, 默认值为 true
  	 * */
  var ww: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setTenMin(value: Boolean): Self = StObject.set(x, "tenMin", value.asInstanceOf[js.Any])
    
    inline def setTenMinUndefined: Self = StObject.set(x, "tenMin", js.undefined)
    
    inline def setWw(value: Boolean): Self = StObject.set(x, "ww", value.asInstanceOf[js.Any])
    
    inline def setWwUndefined: Self = StObject.set(x, "ww", js.undefined)
  }
}
