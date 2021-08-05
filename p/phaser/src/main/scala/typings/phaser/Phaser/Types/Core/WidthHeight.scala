package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthHeight extends StObject {
  
  /**
    * The height.
    */
  var height: js.UndefOr[integer] = js.undefined
  
  /**
    * The width.
    */
  var width: js.UndefOr[integer] = js.undefined
}
object WidthHeight {
  
  inline def apply(): WidthHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthHeight]
  }
  
  extension [Self <: WidthHeight](x: Self) {
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
