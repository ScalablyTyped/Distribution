package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthHeight extends StObject {
  
  /**
    * The height.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object WidthHeight {
  
  inline def apply(): WidthHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidthHeight] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
