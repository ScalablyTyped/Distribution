package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a CSS declaration.
     */
@js.native
trait Declaration extends Node {
  /**
           * True if the declaration has an !important annotation.
           */
  var important: scala.Boolean = js.native
  /**
           * The declaration's property name.
           */
  var prop: java.lang.String = js.native
  /**
           * The declaration's value. This value will be cleaned of comments. If the
           * source value contained comments, those comments will be available in the
           * _value.raws property. If you have not changed the value, the result of
           * decl.toString() will include the original raws value (comments and all).
           */
  var value: java.lang.String = js.native
}

