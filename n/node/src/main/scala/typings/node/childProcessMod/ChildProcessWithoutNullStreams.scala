package typings.node.childProcessMod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// return this object when stdio option is undefined or not specified
@js.native
trait ChildProcessWithoutNullStreams extends ChildProcess {
  
  @JSName("stderr")
  var stderr_ChildProcessWithoutNullStreams: Readable = js.native
  
  @JSName("stdin")
  var stdin_ChildProcessWithoutNullStreams: Writable = js.native
  
  @JSName("stdio")
  val stdio_ChildProcessWithoutNullStreams: js.Tuple5[
    Writable, 
    // stdin
  Readable, 
    // stdout
  Readable, 
    js.UndefOr[(// stderr
  Readable) | Writable | Null], 
    js.UndefOr[(// extra, no modification
  Readable) | Writable | Null]
  ] = js.native
  
  @JSName("stdout")
  var stdout_ChildProcessWithoutNullStreams: Readable = js.native
}
