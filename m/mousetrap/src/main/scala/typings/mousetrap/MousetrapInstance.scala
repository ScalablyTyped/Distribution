package typings.mousetrap

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousetrapInstance extends js.Object {
  def bind(keys: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]): this.type = js.native
  def bind(
    keys: String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
    action: String
  ): this.type = js.native
  def bind(
    keys: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]
  ): this.type = js.native
  def bind(
    keys: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
    action: String
  ): this.type = js.native
  def handleKey(character: String, modifiers: js.Array[String], e: ExtendedKeyboardEvent): Unit = js.native
  def reset(): this.type = js.native
  def stopCallback(e: ExtendedKeyboardEvent, element: Element, combo: String): Boolean = js.native
  def trigger(keys: String): this.type = js.native
  def trigger(keys: String, action: String): this.type = js.native
  def unbind(keys: String): this.type = js.native
  def unbind(keys: String, action: String): this.type = js.native
  def unbind(keys: js.Array[String]): this.type = js.native
  def unbind(keys: js.Array[String], action: String): this.type = js.native
}

