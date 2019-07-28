package typings.opossum.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Event extends js.Object

@JSImport("opossum", "Event")
@js.native
object Event extends js.Object {
  @js.native
  sealed trait cacheHit extends Event
  
  @js.native
  sealed trait cacheMiss extends Event
  
  @js.native
  sealed trait close extends Event
  
  @js.native
  sealed trait failure extends Event
  
  @js.native
  sealed trait fallback extends Event
  
  @js.native
  sealed trait fire extends Event
  
  @js.native
  sealed trait halfOpen extends Event
  
  @js.native
  sealed trait healthCheckFailed extends Event
  
  @js.native
  sealed trait open extends Event
  
  @js.native
  sealed trait reject extends Event
  
  @js.native
  sealed trait semaphoreLocked extends Event
  
  @js.native
  sealed trait success extends Event
  
  @js.native
  sealed trait timeout extends Event
  
  /* "cacheHit" */ val cacheHit: typings.opossum.opossumMod.Event.cacheHit with String = js.native
  /* "cacheMiss" */ val cacheMiss: typings.opossum.opossumMod.Event.cacheMiss with String = js.native
  /* "close" */ val close: typings.opossum.opossumMod.Event.close with String = js.native
  /* "failure" */ val failure: typings.opossum.opossumMod.Event.failure with String = js.native
  /* "fallback" */ val fallback: typings.opossum.opossumMod.Event.fallback with String = js.native
  /* "fire" */ val fire: typings.opossum.opossumMod.Event.fire with String = js.native
  /* "halfOpen" */ val halfOpen: typings.opossum.opossumMod.Event.halfOpen with String = js.native
  /* "health-check-failed" */ val healthCheckFailed: typings.opossum.opossumMod.Event.healthCheckFailed with String = js.native
  /* "open" */ val open: typings.opossum.opossumMod.Event.open with String = js.native
  /* "reject" */ val reject: typings.opossum.opossumMod.Event.reject with String = js.native
  /* "semaphore-locked" */ val semaphoreLocked: typings.opossum.opossumMod.Event.semaphoreLocked with String = js.native
  /* "success" */ val success: typings.opossum.opossumMod.Event.success with String = js.native
  /* "timeout" */ val timeout: typings.opossum.opossumMod.Event.timeout with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Event with String] = js.native
}

