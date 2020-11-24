package typings.maxmind.mod

import typings.mmdbLib.responseMod.Response
import typings.mmdbLib.typesMod.ReaderOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: Response */] protected ()
  extends typings.mmdbLib.mod.default[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: ReaderOptions) = this()
}
