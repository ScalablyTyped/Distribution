package typings.node.childProcessMod

import typings.node.nodeColonstreamMod.Readable
import typings.node.nodeColonstreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// return this object when stdio option is undefined or not specified
@js.native
trait ChildProcessWithoutNullStreams extends StObject {
  
  var stderr: Readable = js.native
  
  var stdin: Writable = js.native
  
  val stdio: js.Tuple5[
    Writable, 
    Readable, 
    Readable, 
    js.UndefOr[(// stderr
  Readable) | Writable | Null], 
    js.UndefOr[(// extra, no modification
  Readable) | Writable | Null]
  ] = js.native
  
  var stdout: Readable = js.native
}
