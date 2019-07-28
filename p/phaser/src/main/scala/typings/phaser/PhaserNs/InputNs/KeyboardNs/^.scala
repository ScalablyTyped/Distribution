package typings.phaser.PhaserNs.InputNs.KeyboardNs

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.Keyboard")
@js.native
object ^ extends js.Object {
  /**
    * Returns `true` if the Key was pressed down within the `duration` value given, based on the current
    * game clock time. Or `false` if it either isn't down, or was pressed down longer ago than the given duration.
    * @param key The Key object to test.
    * @param duration The duration, in ms, within which the key must have been pressed down. Default 50.
    */
  def DownDuration(key: Key): Boolean = js.native
  def DownDuration(key: Key, duration: integer): Boolean = js.native
  /**
    * The justDown value allows you to test if this Key has just been pressed down or not.
    * 
    * When you check this value it will return `true` if the Key is down, otherwise `false`.
    * 
    * You can only call justDown once per key press. It will only return `true` once, until the Key is released and pressed down again.
    * This allows you to use it in situations where you want to check if this key is down without using an event, such as in a core game loop.
    * @param key The Key to check to see if it's just down or not.
    */
  def JustDown(key: Key): Boolean = js.native
  /**
    * The justUp value allows you to test if this Key has just been released or not.
    * 
    * When you check this value it will return `true` if the Key is up, otherwise `false`.
    * 
    * You can only call JustUp once per key release. It will only return `true` once, until the Key is pressed down and released again.
    * This allows you to use it in situations where you want to check if this key is up without using an event, such as in a core game loop.
    * @param key The Key to check to see if it's just up or not.
    */
  def JustUp(key: Key): Boolean = js.native
  /**
    * Returns `true` if the Key was released within the `duration` value given, based on the current
    * game clock time. Or returns `false` if it either isn't up, or was released longer ago than the given duration.
    * @param key The Key object to test.
    * @param duration The duration, in ms, within which the key must have been released. Default 50.
    */
  def UpDuration(key: Key): Boolean = js.native
  def UpDuration(key: Key, duration: integer): Boolean = js.native
}

