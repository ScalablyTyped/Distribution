package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureType extends StObject
@JSImport("photoshop/dom/Constants", "TextureType")
@js.native
object TextureType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextureType & String] = js.native
  
  @js.native
  sealed trait BLOCKS
    extends StObject
       with TextureType
  /* "texTypeBlocks" */ val BLOCKS: typings.photoshop.domConstantsMod.TextureType.BLOCKS & String = js.native
  
  @js.native
  sealed trait CANVAS
    extends StObject
       with TextureType
  /* "texTypeCanvas" */ val CANVAS: typings.photoshop.domConstantsMod.TextureType.CANVAS & String = js.native
  
  @js.native
  sealed trait FROSTED
    extends StObject
       with TextureType
  /* "texTypeFrosted" */ val FROSTED: typings.photoshop.domConstantsMod.TextureType.FROSTED & String = js.native
  
  @js.native
  sealed trait TINYLENS
    extends StObject
       with TextureType
  /* "texTypeTinyLens" */ val TINYLENS: typings.photoshop.domConstantsMod.TextureType.TINYLENS & String = js.native
}
