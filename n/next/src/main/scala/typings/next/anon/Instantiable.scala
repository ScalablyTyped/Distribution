package typings.next.anon

import org.scalablytyped.runtime.Instantiable0
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof AbortSignal */ js.Any
    ] {
  
  /** Returns an AbortSignal instance whose abort reason is set to reason if not undefined; otherwise to an "AbortError" DOMException. */
  def abort(): AbortSignal = js.native
  def abort(reason: String): AbortSignal = js.native
  
  /** Returns an AbortSignal instance which will be aborted in milliseconds milliseconds. Its abort reason will be set to a "TimeoutError" DOMException. */
  def timeout(milliseconds: Double): AbortSignal = js.native
}
