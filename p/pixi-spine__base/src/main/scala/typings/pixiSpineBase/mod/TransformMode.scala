package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransformMode extends StObject
@JSImport("@pixi-spine/base", "TransformMode")
@js.native
object TransformMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransformMode & Double] = js.native
  
  @js.native
  sealed trait NoRotationOrReflection
    extends StObject
       with TransformMode
  /* 2 */ val NoRotationOrReflection: typings.pixiSpineBase.mod.TransformMode.NoRotationOrReflection & Double = js.native
  
  @js.native
  sealed trait NoScale
    extends StObject
       with TransformMode
  /* 3 */ val NoScale: typings.pixiSpineBase.mod.TransformMode.NoScale & Double = js.native
  
  @js.native
  sealed trait NoScaleOrReflection
    extends StObject
       with TransformMode
  /* 4 */ val NoScaleOrReflection: typings.pixiSpineBase.mod.TransformMode.NoScaleOrReflection & Double = js.native
  
  @js.native
  sealed trait Normal
    extends StObject
       with TransformMode
  /* 0 */ val Normal: typings.pixiSpineBase.mod.TransformMode.Normal & Double = js.native
  
  @js.native
  sealed trait OnlyTranslation
    extends StObject
       with TransformMode
  /* 1 */ val OnlyTranslation: typings.pixiSpineBase.mod.TransformMode.OnlyTranslation & Double = js.native
}
