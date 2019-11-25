package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.secret
  - typings.node.nodeStrings.public
  - typings.node.nodeStrings.`private`
*/
trait KeyObjectType extends js.Object

object KeyObjectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.node.nodeStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.node.nodeStrings.public = this.cast("public")
  @scala.inline
  def secret: typings.node.nodeStrings.secret = this.cast("secret")
}

