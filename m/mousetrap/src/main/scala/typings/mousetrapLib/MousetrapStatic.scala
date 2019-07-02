package typings
package mousetrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousetrapStatic
  extends org.scalablytyped.runtime.Instantiable0[MousetrapInstance]
     with org.scalablytyped.runtime.Instantiable1[/* el */ stdLib.Element, MousetrapInstance] {
  def apply(el: stdLib.Element): MousetrapInstance = js.native
  def addKeycodes(keycodes: org.scalablytyped.runtime.NumberDictionary[java.lang.String]): scala.Unit = js.native
  def bind(
    keys: java.lang.String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _]
  ): MousetrapInstance = js.native
  def bind(
    keys: java.lang.String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _],
    action: java.lang.String
  ): MousetrapInstance = js.native
  def bind(
    keys: js.Array[java.lang.String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _]
  ): MousetrapInstance = js.native
  def bind(
    keys: js.Array[java.lang.String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _],
    action: java.lang.String
  ): MousetrapInstance = js.native
  /** https://craig.is/killing/mice#extensions.global */
  def bindGlobal(
    keyArray: java.lang.String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _]
  ): scala.Unit = js.native
  def bindGlobal(
    keyArray: java.lang.String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _],
    action: java.lang.String
  ): scala.Unit = js.native
  def bindGlobal(
    keyArray: js.Array[java.lang.String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _]
  ): scala.Unit = js.native
  def bindGlobal(
    keyArray: js.Array[java.lang.String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ java.lang.String, _],
    action: java.lang.String
  ): scala.Unit = js.native
  def reset(): MousetrapInstance = js.native
  def stopCallback(e: ExtendedKeyboardEvent, element: stdLib.Element, combo: java.lang.String): scala.Boolean = js.native
  def trigger(keys: java.lang.String): MousetrapInstance = js.native
  def trigger(keys: java.lang.String, action: java.lang.String): MousetrapInstance = js.native
  def unbind(keys: java.lang.String): MousetrapInstance = js.native
  def unbind(keys: java.lang.String, action: java.lang.String): MousetrapInstance = js.native
  def unbind(keys: js.Array[java.lang.String]): MousetrapInstance = js.native
  def unbind(keys: js.Array[java.lang.String], action: java.lang.String): MousetrapInstance = js.native
}

