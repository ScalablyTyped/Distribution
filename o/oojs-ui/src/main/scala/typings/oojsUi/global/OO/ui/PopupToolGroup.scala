package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.PopupToolGroup.ConfigOptions
import typings.oojsUi.OO.ui.PopupToolGroup.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupToolGroup extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupToolGroup")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.oojsUi.OO.ui.PopupToolGroup {
    /**
      * @param toolbar
      * @param config Configuration options
      */
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar) = this()
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar, config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$clippable")
    var $clippable: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$clippableContainer")
    var $clippableContainer: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$floatable")
    var $floatable: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$floatableContainer")
    var $floatableContainer: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$handle")
    var $handle: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$indicator")
    var $indicator: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
  }
  
  @JSGlobal("OO.ui.PopupToolGroup")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupToolGroup.parent")
  @js.native
  open class parent protected ()
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup {
    /**
      * @param toolbar
      * @param config Configuration options
      */
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar) = this()
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar, config: typings.oojsUi.OO.ui.ToolGroup.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupToolGroup.super")
  @js.native
  open class `super` protected ()
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup {
    /**
      * @param toolbar
      * @param config Configuration options
      */
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar) = this()
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar, config: typings.oojsUi.OO.ui.ToolGroup.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `PopupToolGroup.foo` */
  override def _to: js.Object & Constructor = ^
}
