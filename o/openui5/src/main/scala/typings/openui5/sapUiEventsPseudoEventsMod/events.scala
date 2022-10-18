package typings.openui5.sapUiEventsPseudoEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait events extends StObject
@JSImport("sap/ui/events/PseudoEvents", "events")
@js.native
object events extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[events & String] = js.native
  
  /**
    * Pseudo event for keyboard backspace without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapbackspace
    extends StObject
       with events
  /* "undefined" */ val sapbackspace: typings.openui5.sapUiEventsPseudoEventsMod.events.sapbackspace & String = js.native
  
  /**
    * Pseudo event for keyboard backspace with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapbackspacemodifiers
    extends StObject
       with events
  /* "undefined" */ val sapbackspacemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapbackspacemodifiers & String = js.native
  
  /**
    * Pseudo event for pseudo bottom event
    */
  @js.native
  sealed trait sapbottom
    extends StObject
       with events
  /* "undefined" */ val sapbottom: typings.openui5.sapUiEventsPseudoEventsMod.events.sapbottom & String = js.native
  
  /**
    * Pseudo event for pseudo collapse event (keyboard numpad -) without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapcollapse
    extends StObject
       with events
  /* "undefined" */ val sapcollapse: typings.openui5.sapUiEventsPseudoEventsMod.events.sapcollapse & String = js.native
  
  /**
    * Pseudo event for pseudo collapse event (keyboard numpad *)
    */
  @js.native
  sealed trait sapcollapseall
    extends StObject
       with events
  /* "undefined" */ val sapcollapseall: typings.openui5.sapUiEventsPseudoEventsMod.events.sapcollapseall & String = js.native
  
  /**
    * Pseudo event for pseudo collapse event (keyboard numpad -) with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapcollapsemodifiers
    extends StObject
       with events
  /* "undefined" */ val sapcollapsemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapcollapsemodifiers & String = js.native
  
  /**
    * Pseudo event for pseudo 'decrease' event without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapdecrease
    extends StObject
       with events
  /* "undefined" */ val sapdecrease: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdecrease & String = js.native
  
  /**
    * Pseudo event for pseudo 'decrease' event with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapdecreasemodifiers
    extends StObject
       with events
  /* "undefined" */ val sapdecreasemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdecreasemodifiers & String = js.native
  
  /**
    * Pseudo event indicating delayed double click (e.g. for inline edit)
    */
  @js.native
  sealed trait sapdelayeddoubleclick
    extends StObject
       with events
  /* "undefined" */ val sapdelayeddoubleclick: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdelayeddoubleclick & String = js.native
  
  /**
    * Pseudo event for keyboard delete without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapdelete
    extends StObject
       with events
  /* "undefined" */ val sapdelete: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdelete & String = js.native
  
  /**
    * Pseudo event for keyboard delete with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapdeletemodifiers
    extends StObject
       with events
  /* "undefined" */ val sapdeletemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdeletemodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard arrow down without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapdown
    extends StObject
       with events
  /* "undefined" */ val sapdown: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdown & String = js.native
  
  /**
    * Pseudo event for keyboard arrow down with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapdownmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapdownmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapdownmodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard End without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapend
    extends StObject
       with events
  /* "undefined" */ val sapend: typings.openui5.sapUiEventsPseudoEventsMod.events.sapend & String = js.native
  
  /**
    * Pseudo event for keyboard End with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapendmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapendmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapendmodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard enter without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapenter
    extends StObject
       with events
  /* "undefined" */ val sapenter: typings.openui5.sapUiEventsPseudoEventsMod.events.sapenter & String = js.native
  
  /**
    * Pseudo event for keyboard enter with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapentermodifiers
    extends StObject
       with events
  /* "undefined" */ val sapentermodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapentermodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard escape
    */
  @js.native
  sealed trait sapescape
    extends StObject
       with events
  /* "undefined" */ val sapescape: typings.openui5.sapUiEventsPseudoEventsMod.events.sapescape & String = js.native
  
  /**
    * Pseudo event for pseudo expand event (keyboard numpad +) without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapexpand
    extends StObject
       with events
  /* "undefined" */ val sapexpand: typings.openui5.sapUiEventsPseudoEventsMod.events.sapexpand & String = js.native
  
  /**
    * Pseudo event for pseudo expand event (keyboard numpad +) with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapexpandmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapexpandmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapexpandmodifiers & String = js.native
  
  /**
    * Pseudo event for pseudo 'hide' event (Alt + up-Arrow)
    */
  @js.native
  sealed trait saphide
    extends StObject
       with events
  /* "undefined" */ val saphide: typings.openui5.sapUiEventsPseudoEventsMod.events.saphide & String = js.native
  
  /**
    * Pseudo event for keyboard Home/Pos1 with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait saphome
    extends StObject
       with events
  /* "undefined" */ val saphome: typings.openui5.sapUiEventsPseudoEventsMod.events.saphome & String = js.native
  
  /**
    * Pseudo event for keyboard Home/Pos1 without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait saphomemodifiers
    extends StObject
       with events
  /* "undefined" */ val saphomemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.saphomemodifiers & String = js.native
  
  /**
    * Pseudo event for pseudo 'increase' event without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapincrease
    extends StObject
       with events
  /* "undefined" */ val sapincrease: typings.openui5.sapUiEventsPseudoEventsMod.events.sapincrease & String = js.native
  
  /**
    * Pseudo event for pseudo 'increase' event with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapincreasemodifiers
    extends StObject
       with events
  /* "undefined" */ val sapincreasemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapincreasemodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard arrow left without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapleft
    extends StObject
       with events
  /* "undefined" */ val sapleft: typings.openui5.sapUiEventsPseudoEventsMod.events.sapleft & String = js.native
  
  /**
    * Pseudo event for keyboard arrow left with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapleftmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapleftmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapleftmodifiers & String = js.native
  
  /**
    * Pseudo event for pressing the '-' (minus) sign.
    */
  @js.native
  sealed trait sapminus
    extends StObject
       with events
  /* "undefined" */ val sapminus: typings.openui5.sapUiEventsPseudoEventsMod.events.sapminus & String = js.native
  
  /**
    * Pseudo event for pseudo 'next' event without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapnext
    extends StObject
       with events
  /* "undefined" */ val sapnext: typings.openui5.sapUiEventsPseudoEventsMod.events.sapnext & String = js.native
  
  /**
    * Pseudo event for pseudo 'next' event with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapnextmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapnextmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapnextmodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard page down without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sappagedown
    extends StObject
       with events
  /* "undefined" */ val sappagedown: typings.openui5.sapUiEventsPseudoEventsMod.events.sappagedown & String = js.native
  
  /**
    * Pseudo event for keyboard page down with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sappagedownmodifiers
    extends StObject
       with events
  /* "undefined" */ val sappagedownmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sappagedownmodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard page up without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sappageup
    extends StObject
       with events
  /* "undefined" */ val sappageup: typings.openui5.sapUiEventsPseudoEventsMod.events.sappageup & String = js.native
  
  /**
    * Pseudo event for keyboard page up with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sappageupmodifiers
    extends StObject
       with events
  /* "undefined" */ val sappageupmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sappageupmodifiers & String = js.native
  
  /**
    * Pseudo event for pressing the '+' (plus) sign.
    */
  @js.native
  sealed trait sapplus
    extends StObject
       with events
  /* "undefined" */ val sapplus: typings.openui5.sapUiEventsPseudoEventsMod.events.sapplus & String = js.native
  
  /**
    * Pseudo event for pseudo 'previous' event without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapprevious
    extends StObject
       with events
  /* "undefined" */ val sapprevious: typings.openui5.sapUiEventsPseudoEventsMod.events.sapprevious & String = js.native
  
  /**
    * Pseudo event for pseudo 'previous' event with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sappreviousmodifiers
    extends StObject
       with events
  /* "undefined" */ val sappreviousmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sappreviousmodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard arrow right without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapright
    extends StObject
       with events
  /* "undefined" */ val sapright: typings.openui5.sapUiEventsPseudoEventsMod.events.sapright & String = js.native
  
  /**
    * Pseudo event for keyboard arrow right with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait saprightmodifiers
    extends StObject
       with events
  /* "undefined" */ val saprightmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.saprightmodifiers & String = js.native
  
  /**
    * Pseudo event for pseudo 'select' event... space, enter, ... without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapselect
    extends StObject
       with events
  /* "undefined" */ val sapselect: typings.openui5.sapUiEventsPseudoEventsMod.events.sapselect & String = js.native
  
  /**
    * Pseudo event for pseudo 'select' event... space, enter, ... with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapselectmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapselectmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapselectmodifiers & String = js.native
  
  /**
    * Pseudo event for pseudo 'show' event (F4, Alt + down-Arrow)
    */
  @js.native
  sealed trait sapshow
    extends StObject
       with events
  /* "undefined" */ val sapshow: typings.openui5.sapUiEventsPseudoEventsMod.events.sapshow & String = js.native
  
  /**
    * Pseudo event for pseudo skip back (F6 + shift modifier or ctrl + alt + ArrowUp)
    */
  @js.native
  sealed trait sapskipback
    extends StObject
       with events
  /* "undefined" */ val sapskipback: typings.openui5.sapUiEventsPseudoEventsMod.events.sapskipback & String = js.native
  
  /**
    * Pseudo event for pseudo skip forward (F6 + no modifier or ctrl + alt + ArrowDown)
    */
  @js.native
  sealed trait sapskipforward
    extends StObject
       with events
  /* "undefined" */ val sapskipforward: typings.openui5.sapUiEventsPseudoEventsMod.events.sapskipforward & String = js.native
  
  /**
    * Pseudo event for keyboard space without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapspace
    extends StObject
       with events
  /* "undefined" */ val sapspace: typings.openui5.sapUiEventsPseudoEventsMod.events.sapspace & String = js.native
  
  /**
    * Pseudo event for keyboard space with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapspacemodifiers
    extends StObject
       with events
  /* "undefined" */ val sapspacemodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapspacemodifiers & String = js.native
  
  /**
    * Pseudo event for keyboard tab (TAB + no modifier)
    */
  @js.native
  sealed trait saptabnext
    extends StObject
       with events
  /* "undefined" */ val saptabnext: typings.openui5.sapUiEventsPseudoEventsMod.events.saptabnext & String = js.native
  
  /**
    * Pseudo event for keyboard tab (TAB + shift modifier)
    */
  @js.native
  sealed trait saptabprevious
    extends StObject
       with events
  /* "undefined" */ val saptabprevious: typings.openui5.sapUiEventsPseudoEventsMod.events.saptabprevious & String = js.native
  
  /**
    * Pseudo event for pseudo top event
    */
  @js.native
  sealed trait saptop
    extends StObject
       with events
  /* "undefined" */ val saptop: typings.openui5.sapUiEventsPseudoEventsMod.events.saptop & String = js.native
  
  /**
    * Pseudo event for keyboard arrow up without modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapup
    extends StObject
       with events
  /* "undefined" */ val sapup: typings.openui5.sapUiEventsPseudoEventsMod.events.sapup & String = js.native
  
  /**
    * Pseudo event for keyboard arrow up with modifiers (Ctrl, Alt or Shift)
    */
  @js.native
  sealed trait sapupmodifiers
    extends StObject
       with events
  /* "undefined" */ val sapupmodifiers: typings.openui5.sapUiEventsPseudoEventsMod.events.sapupmodifiers & String = js.native
}
