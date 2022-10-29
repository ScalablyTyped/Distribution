package typings.pixiMath

import typings.pixiMath.libIpointdataMod.IPointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIpointMod {
  
  @js.native
  trait IPoint
    extends StObject
       with IPointData {
    
    def copyFrom(p: IPointData): this.type = js.native
    
    def copyTo[T /* <: IPoint */](p: T): T = js.native
    
    def equals(p: IPointData): Boolean = js.native
    
    def set(): Unit = js.native
    def set(x: Double): Unit = js.native
    def set(x: Double, y: Double): Unit = js.native
    def set(x: Unit, y: Double): Unit = js.native
  }
}
