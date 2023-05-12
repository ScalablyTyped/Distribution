package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.PopupTool.ConfigOptions
import typings.oojsUi.OO.ui.PopupTool.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupTool extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupTool")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.oojsUi.OO.ui.PopupTool {
    /**
      * @param toolGroup
      * @param config Configuration options
      */
    def this(toolGroup: typings.oojsUi.OO.ui.ToolGroup) = this()
    def this(toolGroup: typings.oojsUi.OO.ui.ToolGroup, config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accel")
    var $accel: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$link")
    var $link: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$title")
    var $title: JQuery[HTMLElement] = js.native
    
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
    
    /**
      * Get popup.
      *
      * @return Popup widget
      */
    /* CompleteClass */
    override def getPopup(): typings.oojsUi.OO.ui.PopupWidget = js.native
  }
  
  @JSGlobal("OO.ui.PopupTool")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupTool.parent")
  @js.native
  open class parent protected ()
    extends StObject
       with typings.oojsUi.OO.ui.Tool {
    /**
      * @param toolGroup
      * @param config Configuration options
      */
    def this(toolGroup: typings.oojsUi.OO.ui.ToolGroup) = this()
    def this(toolGroup: typings.oojsUi.OO.ui.ToolGroup, config: typings.oojsUi.OO.ui.Tool.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accel")
    var $accel: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$link")
    var $link: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$title")
    var $title: JQuery[HTMLElement] = js.native
    
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupTool.super")
  @js.native
  open class `super` protected ()
    extends StObject
       with typings.oojsUi.OO.ui.Tool {
    /**
      * @param toolGroup
      * @param config Configuration options
      */
    def this(toolGroup: typings.oojsUi.OO.ui.ToolGroup) = this()
    def this(toolGroup: typings.oojsUi.OO.ui.ToolGroup, config: typings.oojsUi.OO.ui.Tool.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$accel")
    var $accel: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$flagged")
    var $flagged: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$link")
    var $link: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$tabIndexed")
    var $tabIndexed: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$title")
    var $title: JQuery[HTMLElement] = js.native
    
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
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `PopupTool.foo` */
  override def _to: js.Object & Constructor = ^
}
