package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Event extends js.Object

@JSImport("opossum", "Event")
@js.native
object Event extends js.Object {
  @js.native
  sealed trait cacheHit
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait cacheMiss
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait close
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait failure
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait fallback
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait fire
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait halfOpen
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait healthCheckFailed
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait open
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait reject
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait semaphoreLocked
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait success
    extends opossumLib.opossumMod.Event
  
  @js.native
  sealed trait timeout
    extends opossumLib.opossumMod.Event
  
  /* "cacheHit" */ val cacheHit: cacheHit with java.lang.String = js.native
  /* "cacheMiss" */ val cacheMiss: cacheMiss with java.lang.String = js.native
  /* "close" */ val close: close with java.lang.String = js.native
  /* "failure" */ val failure: failure with java.lang.String = js.native
  /* "fallback" */ val fallback: fallback with java.lang.String = js.native
  /* "fire" */ val fire: fire with java.lang.String = js.native
  /* "halfOpen" */ val halfOpen: halfOpen with java.lang.String = js.native
  /* "health-check-failed" */ val healthCheckFailed: healthCheckFailed with java.lang.String = js.native
  /* "open" */ val open: open with java.lang.String = js.native
  /* "reject" */ val reject: reject with java.lang.String = js.native
  /* "semaphore-locked" */ val semaphoreLocked: semaphoreLocked with java.lang.String = js.native
  /* "success" */ val success: success with java.lang.String = js.native
  /* "timeout" */ val timeout: timeout with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[opossumLib.opossumMod.Event with java.lang.String] = js.native
}

