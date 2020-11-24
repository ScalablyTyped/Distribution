package typings.memfs.volumeMod

import org.scalablytyped.runtime.Instantiable2
import typings.node.fsMod.PathLike
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWriteStream
  extends Writable
     with Instantiable2[/* path */ PathLike, /* options */ IWriteStreamOptions, js.Any] {
  
  var bytesWritten: Double = js.native
  
  def close(): js.Any = js.native
  
  def open(): js.Any = js.native
  
  var path: String = js.native
}
