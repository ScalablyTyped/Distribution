package typings.mmdbLib.decoderMod

import typings.mmdbLib.typesMod.Cache
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mmdb-lib/lib/decoder", JSImport.Default)
@js.native
class default protected () extends Decoder {
  def this(db: Buffer) = this()
  def this(db: Buffer, baseOffset: Double) = this()
  def this(db: Buffer, baseOffset: js.UndefOr[scala.Nothing], cache: Cache) = this()
  def this(db: Buffer, baseOffset: Double, cache: Cache) = this()
}
