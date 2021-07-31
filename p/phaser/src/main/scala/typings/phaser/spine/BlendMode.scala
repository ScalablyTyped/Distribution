package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendMode extends StObject
@JSGlobal("spine.BlendMode")
@js.native
object BlendMode extends StObject {
  
  @js.native
  sealed trait Additive
    extends StObject
       with BlendMode
  
  @js.native
  sealed trait Multiply
    extends StObject
       with BlendMode
  
  @js.native
  sealed trait Normal
    extends StObject
       with BlendMode
  
  @js.native
  sealed trait Screen
    extends StObject
       with BlendMode
}
