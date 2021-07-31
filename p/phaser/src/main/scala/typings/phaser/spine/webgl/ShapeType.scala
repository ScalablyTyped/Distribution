package typings.phaser.spine.webgl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeType extends StObject
@JSGlobal("spine.webgl.ShapeType")
@js.native
object ShapeType extends StObject {
  
  @js.native
  sealed trait Filled
    extends StObject
       with ShapeType
  
  @js.native
  sealed trait Line
    extends StObject
       with ShapeType
  
  @js.native
  sealed trait Point
    extends StObject
       with ShapeType
}
