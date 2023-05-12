package typings.nodeWatch

import typings.nodeWatch.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeWatchStrings {
  
  @js.native
  sealed trait remove
    extends StObject
       with EventType
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait update
    extends StObject
       with EventType
  inline def update: update = "update".asInstanceOf[update]
}
