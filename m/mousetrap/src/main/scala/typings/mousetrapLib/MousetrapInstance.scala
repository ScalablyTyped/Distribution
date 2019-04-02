package typings
package mousetrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousetrapInstance extends js.Object {
  def bind(
    keys: java.lang.String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _]
  ): scala.Unit = js.native
  def bind(
    keys: java.lang.String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _],
    action: java.lang.String
  ): scala.Unit = js.native
  def bind(
    keys: js.Array[java.lang.String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _]
  ): scala.Unit = js.native
  def bind(
    keys: js.Array[java.lang.String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _],
    action: java.lang.String
  ): scala.Unit = js.native
  def handleKey(character: java.lang.String, modifiers: js.Array[java.lang.String], e: ExtendedKeyboardEvent): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def stopCallback(e: ExtendedKeyboardEvent, element: stdLib.Element, combo: java.lang.String): scala.Boolean = js.native
  def trigger(keys: java.lang.String): scala.Unit = js.native
  def trigger(keys: java.lang.String, action: java.lang.String): scala.Unit = js.native
  def unbind(keys: java.lang.String): scala.Unit = js.native
  def unbind(keys: java.lang.String, action: java.lang.String): scala.Unit = js.native
  def unbind(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def unbind(keys: js.Array[java.lang.String], action: java.lang.String): scala.Unit = js.native
}

