package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stringifier extends js.Object {
  @JSName("builder")
  var builder_Original: postcssLib.postcssMod.postcssNs.StringifierNs.Builder = js.native
  def apply(node: Node, builder: Builder): scala.Unit = js.native
  def atrule(node: js.Any, semicolon: js.Any): scala.Unit = js.native
  def beforeAfter(node: js.Any, detect: js.Any): js.Any = js.native
  def block(node: js.Any, start: js.Any): scala.Unit = js.native
  def body(node: js.Any): scala.Unit = js.native
  def builder(str: java.lang.String): scala.Unit = js.native
  def builder(str: java.lang.String, node: Node): scala.Unit = js.native
  def builder(str: java.lang.String, node: Node, str2: java.lang.String): scala.Unit = js.native
  def comment(node: js.Any): scala.Unit = js.native
  def decl(node: js.Any, semicolon: js.Any): scala.Unit = js.native
  def raw(node: Node, own: java.lang.String): js.Any = js.native
  def raw(node: Node, own: java.lang.String, detect: java.lang.String): js.Any = js.native
  def rawBeforeClose(root: js.Any): js.Any = js.native
  def rawBeforeComment(root: js.Any, node: js.Any): js.Any = js.native
  def rawBeforeDecl(root: js.Any, node: js.Any): js.Any = js.native
  def rawBeforeOpen(root: js.Any): js.Any = js.native
  def rawBeforeRule(root: js.Any): js.Any = js.native
  def rawColon(root: js.Any): js.Any = js.native
  def rawEmptyBody(root: js.Any): js.Any = js.native
  def rawIndent(root: js.Any): js.Any = js.native
  def rawSemicolon(root: js.Any): js.Any = js.native
  def rawValue(node: js.Any, prop: js.Any): js.Any = js.native
  def root(node: js.Any): scala.Unit = js.native
  def rule(node: js.Any): scala.Unit = js.native
  def stringify(node: Node): scala.Unit = js.native
  def stringify(node: Node, semicolon: scala.Boolean): scala.Unit = js.native
}

