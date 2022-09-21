package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHasTextureRegion extends StObject {
  
  /** Updates any values the attachment calculates using the {@link #getRegion()}. Must be called after setting the
    * {@link #getRegion()} or if the region's properties are changed. */
  /** The color to tint the attachment. */
  var color: Color
  
  /** The name used to find the {@link #region()}. */
  var path: String
  
  /** The region used to draw the attachment. After setting the region or if the region's properties are changed,
    * {@link #updateRegion()} must be called. */
  var region: TextureRegion | Null
  
  val sequence: ISequence | Null
}
object IHasTextureRegion {
  
  inline def apply(color: Color, path: String): IHasTextureRegion = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = null, sequence = null)
    __obj.asInstanceOf[IHasTextureRegion]
  }
  
  extension [Self <: IHasTextureRegion](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setSequence(value: ISequence): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceNull: Self = StObject.set(x, "sequence", null)
  }
}
