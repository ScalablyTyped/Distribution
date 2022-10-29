package typings.pixiMath

import typings.pixiMath.libIpointMod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPointMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Point * / any */ @JSImport("@pixi/math/lib/Point", "Point")
  @js.native
  /**
    * Creates a new `Point`
    * @param {number} [x=0] - position of the point on the x axis
    * @param {number} [y=0] - position of the point on the y axis
    */
  open class Point ()
    extends StObject
       with IPoint {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
}
