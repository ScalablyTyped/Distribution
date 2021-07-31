package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransformMode extends StObject
@JSGlobal("PIXI.spine.core.TransformMode")
@js.native
object TransformMode extends StObject {
  
  @js.native
  sealed trait NoRotationOrReflection
    extends StObject
       with TransformMode
  
  @js.native
  sealed trait NoScale
    extends StObject
       with TransformMode
  
  @js.native
  sealed trait NoScaleOrReflection
    extends StObject
       with TransformMode
  
  @js.native
  sealed trait Normal
    extends StObject
       with TransformMode
  
  @js.native
  sealed trait OnlyTranslation
    extends StObject
       with TransformMode
}
