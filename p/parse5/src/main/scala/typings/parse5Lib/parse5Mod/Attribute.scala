package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var name: java.lang.String
  /**
    * The namespace of the attribute.
    */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The namespace-related prefix of the attribute.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of the attribute.
    */
  var value: java.lang.String
}

object Attribute {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    namespace: java.lang.String = null,
    prefix: java.lang.String = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Attribute]
  }
}

