package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("paper.Key")
@js.native
class Key ()
  extends StObject
     with typings.paper.paper.Key
object Key {
  
  @JSGlobal("paper.Key")
  @js.native
  val ^ : js.Any = js.native
  
  /** 
    * Checks whether the specified key is pressed.
    * 
    * @param key - any character or special key descriptor:
    *     {@values 'enter', 'space', 'shift', 'control', 'alt', 'meta',
    *     'caps-lock', 'left', 'up', 'right', 'down', 'escape', 'delete',
    *     ...}
    * 
    * @return true if the key is pressed
    */
  /* static member */
  inline def isDown(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDown")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** 
    * The current state of the keyboard modifiers.
    * 
    * @option modifiers.shift {Boolean} {@true if the shift key is
    *     pressed}.
    * @option modifiers.control {Boolean} {@true if the control key is
    *     pressed}.
    * @option modifiers.alt {Boolean} {@true if the alt/option key is
    *     pressed}.
    * @option modifiers.meta {Boolean} {@true if the meta/windows/command
    *     key is pressed}.
    * @option modifiers.capsLock {Boolean} {@true if the caps-lock key is
    *     active}.
    * @option modifiers.space {Boolean} {@true if the space key is
    *     pressed}.
    * @option modifiers.option {Boolean} {@true if the alt/option key is
    *     pressed}. This is the same as `modifiers.alt`
    * @option modifiers.command {Boolean} {@true if the meta key is pressed
    *     on Mac, or the control key is pressed on Windows and Linux}.
    */
  /* static member */
  @JSGlobal("paper.Key.modifiers")
  @js.native
  def modifiers: js.Any = js.native
  inline def modifiers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
}
