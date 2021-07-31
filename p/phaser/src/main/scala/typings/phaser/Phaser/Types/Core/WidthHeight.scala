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
  
  @scala.inline
  def apply(): WidthHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthHeight]
  }
  
  @scala.inline
  implicit class WidthHeightMutableBuilder[Self <: WidthHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
