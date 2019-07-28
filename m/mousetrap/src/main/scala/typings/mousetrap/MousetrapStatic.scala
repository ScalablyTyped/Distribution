package typings.mousetrap

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousetrapStatic
  extends Instantiable0[MousetrapInstance]
     with Instantiable1[/* el */ Element, MousetrapInstance] {
  def apply(el: Element): MousetrapInstance = js.native
  def addKeycodes(keycodes: NumberDictionary[String]): Unit = js.native
  def bind(keys: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]): MousetrapInstance = js.native
  def bind(
    keys: String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
    action: String
  ): MousetrapInstance = js.native
  def bind(
    keys: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]
  ): MousetrapInstance = js.native
  def bind(
    keys: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
    action: String
  ): MousetrapInstance = js.native
  /** https://craig.is/killing/mice#extensions.global */
  def bindGlobal(keyArray: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]): Unit = js.native
  def bindGlobal(
    keyArray: String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
    action: String
  ): Unit = js.native
  def bindGlobal(
    keyArray: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _]
  ): Unit = js.native
  def bindGlobal(
    keyArray: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, _],
    action: String
  ): Unit = js.native
  def reset(): MousetrapInstance = js.native
  def stopCallback(e: ExtendedKeyboardEvent, element: Element, combo: String): Boolean = js.native
  def trigger(keys: String): MousetrapInstance = js.native
  def trigger(keys: String, action: String): MousetrapInstance = js.native
  def unbind(keys: String): MousetrapInstance = js.native
  def unbind(keys: String, action: String): MousetrapInstance = js.native
  def unbind(keys: js.Array[String]): MousetrapInstance = js.native
  def unbind(keys: js.Array[String], action: String): MousetrapInstance = js.native
}

