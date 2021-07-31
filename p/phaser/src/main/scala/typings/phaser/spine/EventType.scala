package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSGlobal("spine.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait complete
    extends StObject
       with EventType
  
  @js.native
  sealed trait dispose
    extends StObject
       with EventType
  
  @js.native
  sealed trait end
    extends StObject
       with EventType
  
  @js.native
  sealed trait event
    extends StObject
       with EventType
  
  @js.native
  sealed trait interrupt
    extends StObject
       with EventType
  
  @js.native
  sealed trait start
    extends StObject
       with EventType
}
