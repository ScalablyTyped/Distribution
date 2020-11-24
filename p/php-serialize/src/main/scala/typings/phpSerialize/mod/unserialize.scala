package typings.phpSerialize.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("php-serialize", "unserialize")
@js.native
object unserialize extends js.Object {
  
  def apply(item: String): js.Any = js.native
  def apply(item: String, scope: js.UndefOr[scala.Nothing], givenOptions: UnserializeOptions): js.Any = js.native
  def apply(item: String, scope: js.Any): js.Any = js.native
  def apply(item: String, scope: js.Any, givenOptions: UnserializeOptions): js.Any = js.native
  def apply(item: Buffer): js.Any = js.native
  def apply(item: Buffer, scope: js.UndefOr[scala.Nothing], givenOptions: UnserializeOptions): js.Any = js.native
  def apply(item: Buffer, scope: js.Any): js.Any = js.native
  def apply(item: Buffer, scope: js.Any, givenOptions: UnserializeOptions): js.Any = js.native
}
