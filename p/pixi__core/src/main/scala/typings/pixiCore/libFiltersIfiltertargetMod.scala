package typings.pixiCore

import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFiltersIfiltertargetMod {
  
  @js.native
  trait IFilterTarget extends StObject {
    
    var filterArea: Rectangle = js.native
    
    def getBounds(): Rectangle = js.native
    def getBounds(skipUpdate: Boolean): Rectangle = js.native
  }
}
