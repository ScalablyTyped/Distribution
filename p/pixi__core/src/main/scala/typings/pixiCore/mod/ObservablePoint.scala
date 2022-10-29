package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ObservablePoint")
@js.native
open class ObservablePoint[T] protected ()
  extends typings.pixiMath.mod.ObservablePoint[T] {
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
}
