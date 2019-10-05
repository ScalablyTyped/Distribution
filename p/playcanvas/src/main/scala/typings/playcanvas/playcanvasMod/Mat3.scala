package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Mat3
  * @classdesc A 3x3 matrix.
  * @description Creates a new identity Mat3 object.
  * @property {Float32Array} data Matrix elements in the form of a flat array.
  */
@JSImport("playcanvas", "Mat3")
@js.native
class Mat3 ()
  extends typings.playcanvas.pc.Mat3

/* static members */
@JSImport("playcanvas", "Mat3")
@js.native
object Mat3 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat3
    * @name pc.Mat3.IDENTITY
    * @description A constant matrix set to the identity.
    */
  val IDENTITY: typings.playcanvas.pc.Mat3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat3
    * @name pc.Mat3.ZERO
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: typings.playcanvas.pc.Mat3 = js.native
}

