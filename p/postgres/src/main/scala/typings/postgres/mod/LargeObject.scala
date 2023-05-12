package typings.postgres.mod

import typings.node.nodeColonstreamMod.Readable
import typings.node.nodeColonstreamMod.Writable
import typings.postgres.anon.Data
import typings.postgres.anon.End
import typings.postgres.anon.HighWaterMark
import typings.postgres.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LargeObject extends StObject {
  
  def close(): js.Promise[Unit] = js.native
  
  def read(size: Double): js.Promise[Unit] = js.native
  
  def readable(): js.Promise[Readable] = js.native
  def readable(options: End): js.Promise[Readable] = js.native
  
  def seek(offset: Double): js.Promise[Unit] = js.native
  def seek(offset: Double, whence: Double): js.Promise[Unit] = js.native
  
  def size(): js.Promise[js.Array[Position]] = js.native
  
  def tell(): js.Promise[Unit] = js.native
  
  def truncate(size: Double): js.Promise[Unit] = js.native
  
  def writable(): js.Promise[Writable] = js.native
  def writable(options: HighWaterMark): js.Promise[Writable] = js.native
  
  def write(buffer: js.typedarray.Uint8Array): js.Promise[js.Array[Data]] = js.native
}
