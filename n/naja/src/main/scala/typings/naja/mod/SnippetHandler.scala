package typings.naja.mod

import typings.naja.najaStrings.afterUpdate
import typings.naja.najaStrings.beforeUpdate
import typings.std.EventListenerOptions
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetHandler extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterUpdate(`type`: afterUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeUpdate(`type`: beforeUpdate, listener: SnippetUpdateListener, options: EventListenerOptions): Unit = js.native
}

