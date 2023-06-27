package typings.mjContextMenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsPostableMod {
  
  @js.native
  trait Postable extends StObject {
    
    def isPosted(): Boolean = js.native
    
    def post(): Unit = js.native
    def post(x: Double): Unit = js.native
    def post(x: Double, y: Double): Unit = js.native
    def post(x: Unit, y: Double): Unit = js.native
    
    def unpost(): Unit = js.native
  }
}
