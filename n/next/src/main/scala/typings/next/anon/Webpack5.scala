package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webpack5 extends StObject {
  
  /**
    * @deprecated This option has been removed as webpack 5 is now default
    */
  var webpack5: js.UndefOr[`false`] = js.undefined
}
object Webpack5 {
  
  inline def apply(): Webpack5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Webpack5]
  }
  
  extension [Self <: Webpack5](x: Self) {
    
    inline def setWebpack5(value: `false`): Self = StObject.set(x, "webpack5", value.asInstanceOf[js.Any])
    
    inline def setWebpack5Undefined: Self = StObject.set(x, "webpack5", js.undefined)
  }
}
