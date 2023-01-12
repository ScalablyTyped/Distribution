package typings.phaser.Phaser.Types

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Actions {
  
  type CallCallback = js.Function1[/* item */ GameObject, Unit]
  
  trait GridAlignConfig extends StObject {
    
    /**
      * The height of the cell, in pixels, in which the item is positioned.
      */
    var cellHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the cell, in pixels, in which the item is positioned.
      */
    var cellWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The height of the grid in items (not pixels). -1 means lay all items out vertically, regardless of quantity.
      *                                   If both this value and `width` are set to -1 then `width` overrides it and this value is ignored.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The alignment position. One of the Phaser.Display.Align consts such as `TOP_LEFT` or `RIGHT_CENTER`.
      */
    var position: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the grid in items (not pixels). -1 means lay all items out horizontally, regardless of quantity.
      *                                  If both this value and height are set to -1 then this value overrides it and the `height` value is ignored.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Optionally place the top-left of the final grid at this coordinate.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * Optionally place the top-left of the final grid at this coordinate.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object GridAlignConfig {
    
    inline def apply(): GridAlignConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridAlignConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridAlignConfig] (val x: Self) extends AnyVal {
      
      inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
