package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PathKind extends StObject
@JSImport("photoshop/dom/Constants", "PathKind")
@js.native
object PathKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PathKind & String] = js.native
  
  @js.native
  sealed trait CLIPPINGPATH
    extends StObject
       with PathKind
  /* "clippingPathEPS" */ val CLIPPINGPATH: typings.photoshop.domConstantsMod.PathKind.CLIPPINGPATH & String = js.native
  
  @js.native
  sealed trait DUPLICATE
    extends StObject
       with PathKind
  /* "duplicate" */ val DUPLICATE: typings.photoshop.domConstantsMod.PathKind.DUPLICATE & String = js.native
  
  @js.native
  sealed trait INTERPOLATE
    extends StObject
       with PathKind
  /* "interpolate" */ val INTERPOLATE: typings.photoshop.domConstantsMod.PathKind.INTERPOLATE & String = js.native
  
  @js.native
  sealed trait NORMALPATH
    extends StObject
       with PathKind
  /* "normalPath" */ val NORMALPATH: typings.photoshop.domConstantsMod.PathKind.NORMALPATH & String = js.native
  
  @js.native
  sealed trait TEXTMASK
    extends StObject
       with PathKind
  /* "textShape" */ val TEXTMASK: typings.photoshop.domConstantsMod.PathKind.TEXTMASK & String = js.native
  
  @js.native
  sealed trait VECTORMASK
    extends StObject
       with PathKind
  /* "vectorMask" */ val VECTORMASK: typings.photoshop.domConstantsMod.PathKind.VECTORMASK & String = js.native
  
  @js.native
  sealed trait WORKPATH
    extends StObject
       with PathKind
  /* "workPathIndex" */ val WORKPATH: typings.photoshop.domConstantsMod.PathKind.WORKPATH & String = js.native
}
