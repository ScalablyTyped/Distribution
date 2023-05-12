package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DepthMapSource extends StObject
@JSImport("photoshop/dom/Constants", "DepthMapSource")
@js.native
object DepthMapSource extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DepthMapSource & String] = js.native
  
  @js.native
  sealed trait IMAGEHIGHLIGHT
    extends StObject
       with DepthMapSource
  /* "imageHighlight" */ val IMAGEHIGHLIGHT: typings.photoshop.domConstantsMod.DepthMapSource.IMAGEHIGHLIGHT & String = js.native
  
  @js.native
  sealed trait LAYERMASK
    extends StObject
       with DepthMapSource
  /* "layerMask" */ val LAYERMASK: typings.photoshop.domConstantsMod.DepthMapSource.LAYERMASK & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with DepthMapSource
  /* "none" */ val NONE: typings.photoshop.domConstantsMod.DepthMapSource.NONE & String = js.native
  
  @js.native
  sealed trait TRANSPARENCYCHANNEL
    extends StObject
       with DepthMapSource
  /* "transparency" */ val TRANSPARENCYCHANNEL: typings.photoshop.domConstantsMod.DepthMapSource.TRANSPARENCYCHANNEL & String = js.native
}
