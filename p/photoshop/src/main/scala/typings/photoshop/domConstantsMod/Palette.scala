package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Palette extends StObject
@JSImport("photoshop/dom/Constants", "Palette")
@js.native
object Palette extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Palette & String] = js.native
  
  @js.native
  sealed trait EXACT
    extends StObject
       with Palette
  /* "exact" */ val EXACT: typings.photoshop.domConstantsMod.Palette.EXACT & String = js.native
  
  @js.native
  sealed trait LOCALADAPTIVE
    extends StObject
       with Palette
  /* "adaptive" */ val LOCALADAPTIVE: typings.photoshop.domConstantsMod.Palette.LOCALADAPTIVE & String = js.native
  
  @js.native
  sealed trait LOCALPERCEPTUAL
    extends StObject
       with Palette
  /* "perceptual" */ val LOCALPERCEPTUAL: typings.photoshop.domConstantsMod.Palette.LOCALPERCEPTUAL & String = js.native
  
  @js.native
  sealed trait LOCALSELECTIVE
    extends StObject
       with Palette
  /* "selective" */ val LOCALSELECTIVE: typings.photoshop.domConstantsMod.Palette.LOCALSELECTIVE & String = js.native
  
  @js.native
  sealed trait MACOSPALETTE
    extends StObject
       with Palette
  /* "macintoshSystem" */ val MACOSPALETTE: typings.photoshop.domConstantsMod.Palette.MACOSPALETTE & String = js.native
  
  @js.native
  sealed trait MASTERADAPTIVE
    extends StObject
       with Palette
  /* "masterAdaptive" */ val MASTERADAPTIVE: typings.photoshop.domConstantsMod.Palette.MASTERADAPTIVE & String = js.native
  
  @js.native
  sealed trait MASTERPERCEPTUAL
    extends StObject
       with Palette
  /* "masterPerceptual" */ val MASTERPERCEPTUAL: typings.photoshop.domConstantsMod.Palette.MASTERPERCEPTUAL & String = js.native
  
  @js.native
  sealed trait MASTERSELECTIVE
    extends StObject
       with Palette
  /* "masterSelective" */ val MASTERSELECTIVE: typings.photoshop.domConstantsMod.Palette.MASTERSELECTIVE & String = js.native
  
  @js.native
  sealed trait PREVIOUSPALETTE
    extends StObject
       with Palette
  /* "previous" */ val PREVIOUSPALETTE: typings.photoshop.domConstantsMod.Palette.PREVIOUSPALETTE & String = js.native
  
  @js.native
  sealed trait UNIFORM
    extends StObject
       with Palette
  /* "uniform" */ val UNIFORM: typings.photoshop.domConstantsMod.Palette.UNIFORM & String = js.native
  
  @js.native
  sealed trait WEBPALETTE
    extends StObject
       with Palette
  /* "web" */ val WEBPALETTE: typings.photoshop.domConstantsMod.Palette.WEBPALETTE & String = js.native
  
  @js.native
  sealed trait WINDOWSPALETTE
    extends StObject
       with Palette
  /* "windowsSystem" */ val WINDOWSPALETTE: typings.photoshop.domConstantsMod.Palette.WINDOWSPALETTE & String = js.native
}
