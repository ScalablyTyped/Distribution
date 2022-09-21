package typings.ndnJs.global.ndn

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.Blob")
@js.native
open class Blob ()
  extends typings.ndnJs.mod.Blob {
  def this(value: String) = this()
  def this(value: js.Array[Double]) = this()
  def this(value: typings.ndnJs.blobMod.Blob) = this()
  def this(value: Buffer) = this()
  def this(value: Buffer, copy: Boolean) = this()
}
