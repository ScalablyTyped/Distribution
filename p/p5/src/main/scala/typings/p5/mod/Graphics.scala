package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Work-around for p5.Graphics inheriting from both p5 and p5.Element
@js.native
trait Graphics
  extends StObject
     with _Graphics
     with p5 {
  
  /**
    *   Removes the element, stops all media streams, and
    *   deregisters all listeners.
    */
  /* InferMemberOverrides */
  override def remove(): Unit = js.native
}
