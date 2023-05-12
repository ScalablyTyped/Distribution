package typings.phaser.Phaser.Types.Tweens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaggerConfig extends StObject {
  
  /**
    * An ease to apply across the staggered values. Can either be a string, such as 'sine.inout', or a function.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * The index to start the stagger from. Can be the strings `first`, `last` or `center`, or an integer representing the stagger position.
    */
  var from: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Set the stagger to run across a grid by providing an array where element 0 is the width of the grid and element 1 is the height. Combine with the 'from' property to control direction.
    */
  var grid: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The value to start the stagger from. Can be used as a way to offset the stagger while still using a range for the value.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object StaggerConfig {
  
  inline def apply(): StaggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaggerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaggerConfig] (val x: Self) extends AnyVal {
    
    inline def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
