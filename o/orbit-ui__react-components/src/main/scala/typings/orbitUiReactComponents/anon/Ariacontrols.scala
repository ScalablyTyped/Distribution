package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ariacontrols extends StObject {
  
  var `aria-controls`: String = js.native
  
  var `aria-expanded`: Boolean = js.native
  
  var `aria-haspopup`: dialog | menu | listbox = js.native
  
  var onBlur: Unit = js.native
  def onBlur(event: FocusEvent[Element, Element]): Unit = js.native
  
  var onClick: Unit = js.native
  def onClick(event: SyntheticEvent[Element, Event]): Unit = js.native
  
  var onFocus: Unit = js.native
  def onFocus(event: FocusEvent[Element, Element]): Unit = js.native
  
  var onKeyDown: Unit = js.native
  def onKeyDown(event: KeyboardEvent[Element]): Unit = js.native
  
  var onKeyUp: Unit = js.native
  def onKeyUp(event: KeyboardEvent[Element]): Unit = js.native
  
  var onMouseEnter: Unit = js.native
  def onMouseEnter(event: typings.react.mod.MouseEvent[Element, MouseEvent]): Unit = js.native
  
  var ref: MergedRef[HTMLElement] = js.native
  
  var tabIndex: Double = js.native
}
