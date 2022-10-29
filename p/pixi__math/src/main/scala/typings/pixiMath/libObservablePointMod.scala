package typings.pixiMath

import typings.pixiMath.libIpointMod.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservablePointMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Point * / any */ @JSImport("@pixi/math/lib/ObservablePoint", "ObservablePoint")
  @js.native
  open class ObservablePoint[T] protected ()
    extends StObject
       with IPoint {
    /**
      * Creates a new `ObservablePoint`
      * @param cb - callback function triggered when `x` and/or `y` are changed
      * @param scope - owner of callback
      * @param {number} [x=0] - position of the point on the x axis
      * @param {number} [y=0] - position of the point on the y axis
      */
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T) = this()
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T, x: Double) = this()
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T, x: Double, y: Double) = this()
    def this(cb: js.ThisFunction0[/* this */ T, Any], scope: T, x: Unit, y: Double) = this()
    
    var _x: Double = js.native
    
    var _y: Double = js.native
    
    /** The callback function triggered when `x` and/or `y` are changed */
    def cb(): Any = js.native
    
    def clone(cb: js.ThisFunction0[/* this */ T, Any]): ObservablePoint[Any] = js.native
    def clone(cb: js.ThisFunction0[/* this */ T, Any], scope: Any): ObservablePoint[Any] = js.native
    def clone(cb: Unit, scope: Any): ObservablePoint[Any] = js.native
    
    /** The owner of the callback */
    var scope: Any = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    /** Position of the observable point on the x axis. */
    @JSName("x")
    def x_MObservablePoint: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    /** Position of the observable point on the y axis. */
    @JSName("y")
    def y_MObservablePoint: Double = js.native
  }
}
