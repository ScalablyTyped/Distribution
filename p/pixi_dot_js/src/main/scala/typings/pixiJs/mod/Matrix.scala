package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The PixiJS Matrix as a class makes it a lot faster.
  *
  * Here is a representation of it:
  * ```js
  * | a | c | tx|
  * | b | d | ty|
  * | 0 | 0 | 1 |
  * ```
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Matrix")
@js.native
class Matrix protected ()
  extends typings.pixiJs.PIXI.Matrix {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
}
object Matrix {
  
  @JSImport("pixi.js", "Matrix")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A default (identity) matrix
    *
    * @static
    * @const
    * @member {PIXI.Matrix}
    */
  /* static member */
  @JSImport("pixi.js", "Matrix.IDENTITY")
  @js.native
  def IDENTITY: typings.pixiJs.PIXI.Matrix = js.native
  @scala.inline
  def IDENTITY_=(x: typings.pixiJs.PIXI.Matrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTITY")(x.asInstanceOf[js.Any])
  
  /**
    * A temp matrix
    *
    * @static
    * @const
    * @member {PIXI.Matrix}
    */
  /* static member */
  @JSImport("pixi.js", "Matrix.TEMP_MATRIX")
  @js.native
  def TEMP_MATRIX: typings.pixiJs.PIXI.Matrix = js.native
  @scala.inline
  def TEMP_MATRIX_=(x: typings.pixiJs.PIXI.Matrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMP_MATRIX")(x.asInstanceOf[js.Any])
}
