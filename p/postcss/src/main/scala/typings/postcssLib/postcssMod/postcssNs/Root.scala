package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a CSS file and contains all its parsed nodes.
     */
@js.native
trait Root extends Container {
  /**
           * Deprecated. Use Root#removeChild.
           */
  def remove(child: Node): this.type = js.native
  /**
           * Deprecated. Use Root#removeChild.
           */
  def remove(child: scala.Double): this.type = js.native
  /**
           * @returns A Result instance representing the root's CSS.
           */
  def toResult(): Result = js.native
  /**
           * @returns A Result instance representing the root's CSS.
           */
  def toResult(options: postcssLib.Anon_To): Result = js.native
}

