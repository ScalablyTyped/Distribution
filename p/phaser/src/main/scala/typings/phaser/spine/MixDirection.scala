package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MixDirection extends StObject
@JSGlobal("spine.MixDirection")
@js.native
object MixDirection extends StObject {
  
  @js.native
  sealed trait mixIn
    extends StObject
       with MixDirection
  
  @js.native
  sealed trait mixOut
    extends StObject
       with MixDirection
}
