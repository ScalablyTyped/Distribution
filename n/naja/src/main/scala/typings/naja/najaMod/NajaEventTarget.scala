package typings.naja.najaMod

import typings.naja.najaStrings.abort
import typings.naja.najaStrings.before
import typings.naja.najaStrings.complete
import typings.naja.najaStrings.error
import typings.naja.najaStrings.init
import typings.naja.najaStrings.interaction
import typings.naja.najaStrings.load
import typings.naja.najaStrings.start
import typings.naja.najaStrings.success
import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NajaEventTarget extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(
    `type`: before,
    listener: NajaEventListener[BeforeEvent[RequestData]],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: NajaEventListener[InitEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interaction(
    `type`: interaction,
    listener: NajaEventListener[InteractionEvent],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: NajaEventListener[Event]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: NajaEventListener[Event], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: NajaEventListener[Event], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: NajaEventListener[StartEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_type[T /* <: Event */](
    `type`: /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_type[T /* <: Event */](
    `type`: /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_type[T /* <: Event */](
    `type`: /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(
    `type`: before,
    listener: NajaEventListener[BeforeEvent[RequestData]],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: NajaEventListener[InitEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interaction(
    `type`: interaction,
    listener: NajaEventListener[InteractionEvent],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: NajaEventListener[Event]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: NajaEventListener[Event], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: NajaEventListener[Event], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: NajaEventListener[StartEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_type[T /* <: Event */](
    `type`: /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_type[T /* <: Event */](
    `type`: /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_type[T /* <: Event */](
    `type`: /* import warning: ImportType.apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: AddEventListenerOptions
  ): Unit = js.native
}

