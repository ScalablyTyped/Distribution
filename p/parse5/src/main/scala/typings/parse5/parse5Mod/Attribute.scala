package typings.parse5.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var name: String
  /**
    * The namespace of the attribute.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * The namespace-related prefix of the attribute.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * The value of the attribute.
    */
  var value: String
}

object Attribute {
  @scala.inline
  def apply(name: String, value: String, namespace: String = null, prefix: String = null): Attribute = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Attribute]
  }
}

