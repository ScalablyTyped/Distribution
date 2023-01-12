package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterTileOptions extends StObject {
  
  /**
    * Whether or not to add the newly created body (or existing body if options.body is used) to the Matter world.
    */
  var addToWorld: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An existing Matter body to be used instead of creating a new one.
    */
  var body: js.UndefOr[BodyType] = js.undefined
  
  /**
    * Whether or not the newly created body should be made static. This defaults to true since typically tiles should not be moved.
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
}
object MatterTileOptions {
  
  inline def apply(): MatterTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterTileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterTileOptions] (val x: Self) extends AnyVal {
    
    inline def setAddToWorld(value: Boolean): Self = StObject.set(x, "addToWorld", value.asInstanceOf[js.Any])
    
    inline def setAddToWorldUndefined: Self = StObject.set(x, "addToWorld", js.undefined)
    
    inline def setBody(value: BodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
  }
}
