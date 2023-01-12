package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterBodyTileOptions extends StObject {
  
  /**
    * Whether or not to add the newly created body (or existing body if options.body is used) to the Matter world.
    */
  var addToWorld: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not the newly created body should be made static. This defaults to true since typically tiles should not be moved.
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
}
object MatterBodyTileOptions {
  
  inline def apply(): MatterBodyTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyTileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterBodyTileOptions] (val x: Self) extends AnyVal {
    
    inline def setAddToWorld(value: Boolean): Self = StObject.set(x, "addToWorld", value.asInstanceOf[js.Any])
    
    inline def setAddToWorldUndefined: Self = StObject.set(x, "addToWorld", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
  }
}
