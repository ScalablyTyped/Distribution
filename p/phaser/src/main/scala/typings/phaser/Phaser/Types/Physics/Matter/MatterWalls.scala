package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterWalls extends StObject {
  
  /**
    * The bottom wall for the Matter World.
    */
  var bottom: js.UndefOr[BodyType] = js.undefined
  
  /**
    * The left wall for the Matter World.
    */
  var left: js.UndefOr[BodyType] = js.undefined
  
  /**
    * The right wall for the Matter World.
    */
  var right: js.UndefOr[BodyType] = js.undefined
  
  /**
    * The top wall for the Matter World.
    */
  var top: js.UndefOr[BodyType] = js.undefined
}
object MatterWalls {
  
  inline def apply(): MatterWalls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterWalls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterWalls] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: BodyType): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: BodyType): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: BodyType): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: BodyType): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
