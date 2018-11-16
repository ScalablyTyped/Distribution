package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextOptions extends js.Object {
  /**
               * Boolean that indicates if the canvas contains an alpha buffer.
               */
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Boolean that indicates whether or not to perform anti-aliasing.
               */
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Boolean that indicates that the drawing buffer has a depth buffer of at least 16 bits.
               */
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *  Boolean that indicates if a context will be created if the system performance is low.
               */
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Boolean that indicates that the page compositor will assume the drawing buffer contains colors with pre-multiplied alpha.
               */
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * If the value is true the buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
               */
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Boolean that indicates that the drawing buffer has a stencil buffer of at least 8 bits.
               */
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}

