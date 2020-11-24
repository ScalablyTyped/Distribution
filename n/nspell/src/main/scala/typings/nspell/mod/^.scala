package typings.nspell.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes instance of NSpell, which is returned by the default factory function.
  */
@JSImport("nspell", JSImport.Namespace)
@js.native
class ^ protected () extends NSpell {
  def this(aff: String) = this()
  def this(aff: Buffer) = this()
  def this(dictionary: js.Array[Dictionary]) = this()
  def this(dictionary: Dictionary) = this()
  def this(aff: String, dic: String) = this()
  def this(aff: String, dic: Buffer) = this()
  def this(aff: Buffer, dic: String) = this()
  def this(aff: Buffer, dic: Buffer) = this()
}
@JSImport("nspell", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(aff: String): NSpell = js.native
  def apply(aff: String, dic: String): NSpell = js.native
  def apply(aff: String, dic: Buffer): NSpell = js.native
  def apply(aff: Buffer): NSpell = js.native
  def apply(aff: Buffer, dic: String): NSpell = js.native
  def apply(aff: Buffer, dic: Buffer): NSpell = js.native
  def apply(dictionary: js.Array[Dictionary]): NSpell = js.native
  def apply(dictionary: Dictionary): NSpell = js.native
}
