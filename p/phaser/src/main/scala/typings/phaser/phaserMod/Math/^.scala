package typings.phaser.phaserMod.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Math")
@js.native
object ^ extends js.Object {
  /**
    * For converting degrees to radians (PI / 180)
    */
  var DEG_TO_RAD: Double = js.native
  /**
    * An epsilon value (1.0e-6)
    */
  var EPSILON: Double = js.native
  /**
    * The maximum safe integer this browser supports.
    * We use a const for backward compatibility with Internet Explorer.
    */
  var MAX_SAFE_INTEGER: Double = js.native
  /**
    * The minimum safe integer this browser supports.
    * We use a const for backward compatibility with Internet Explorer.
    */
  var MIN_SAFE_INTEGER: Double = js.native
  /**
    * The value of PI * 2.
    */
  var PI2: Double = js.native
  /**
    * For converting radians to degrees (180 / PI)
    */
  var RAD_TO_DEG: Double = js.native
  /**
    * An instance of the Random Number Generator.
    * This is not set until the Game boots.
    */
  var RND: typings.phaser.Phaser.Math.RandomDataGenerator = js.native
  /**
    * The value of PI * 0.5.
    */
  var TAU: Double = js.native
}

