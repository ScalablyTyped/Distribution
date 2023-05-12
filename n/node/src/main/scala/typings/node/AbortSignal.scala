package typings.node

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
@js.native
trait AbortSignal
  extends StObject
     with EventTarget {
  
  /**
    * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
    */
  val aborted: Boolean = js.native
  
  var onabort: Null | (js.ThisFunction1[/* this */ this.type, /* event */ Event, Any]) = js.native
  
  val reason: Any = js.native
}
