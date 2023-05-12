package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RasterizeType extends StObject
@JSImport("photoshop/dom/Constants", "RasterizeType")
@js.native
object RasterizeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RasterizeType & String] = js.native
  
  @js.native
  sealed trait ENTIRELAYER
    extends StObject
       with RasterizeType
  /* "entire" */ val ENTIRELAYER: typings.photoshop.domConstantsMod.RasterizeType.ENTIRELAYER & String = js.native
  
  @js.native
  sealed trait FILLCONTENT
    extends StObject
       with RasterizeType
  /* "content" */ val FILLCONTENT: typings.photoshop.domConstantsMod.RasterizeType.FILLCONTENT & String = js.native
  
  @js.native
  sealed trait LAYERCLIPPINGPATH
    extends StObject
       with RasterizeType
  /* "clippingPath" */ val LAYERCLIPPINGPATH: typings.photoshop.domConstantsMod.RasterizeType.LAYERCLIPPINGPATH & String = js.native
  
  @js.native
  sealed trait LAYERSTYLE
    extends StObject
       with RasterizeType
  /* "layerStyle" */ val LAYERSTYLE: typings.photoshop.domConstantsMod.RasterizeType.LAYERSTYLE & String = js.native
  
  @js.native
  sealed trait LINKEDLAYERS
    extends StObject
       with RasterizeType
  /* "linked" */ val LINKEDLAYERS: typings.photoshop.domConstantsMod.RasterizeType.LINKEDLAYERS & String = js.native
  
  @js.native
  sealed trait PLACED
    extends StObject
       with RasterizeType
  /* "placed" */ val PLACED: typings.photoshop.domConstantsMod.RasterizeType.PLACED & String = js.native
  
  @js.native
  sealed trait SHAPE
    extends StObject
       with RasterizeType
  /* "shape" */ val SHAPE: typings.photoshop.domConstantsMod.RasterizeType.SHAPE & String = js.native
  
  @js.native
  sealed trait TEXTCONTENTS
    extends StObject
       with RasterizeType
  /* "type" */ val TEXTCONTENTS: typings.photoshop.domConstantsMod.RasterizeType.TEXTCONTENTS & String = js.native
  
  @js.native
  sealed trait VECTORMASK
    extends StObject
       with RasterizeType
  /* "vectorMask" */ val VECTORMASK: typings.photoshop.domConstantsMod.RasterizeType.VECTORMASK & String = js.native
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with RasterizeType
  /* "video" */ val VIDEO: typings.photoshop.domConstantsMod.RasterizeType.VIDEO & String = js.native
}
