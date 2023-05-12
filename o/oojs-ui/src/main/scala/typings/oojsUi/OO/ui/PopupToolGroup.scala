package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.PopupToolGroup.Props
import typings.oojsUi.OO.ui.PopupToolGroup.Prototype
import typings.oojsUi.oojsUiStrings.flag
import typings.oojsUi.oojsUiStrings.labelChange
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PopupToolGroup is an abstract base class used by both {@link OO.ui.MenuToolGroup MenuToolGroup}
  * and {@link OO.ui.ListToolGroup ListToolGroup} to provide a popup (an overlaid menu or list of
  * tools with an optional icon and label). This class can be used for other base classes that
  * also use this functionality.
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.PopupToolGroup
  */
@js.native
trait PopupToolGroup
  extends StObject
     with Props
     with Prototype {
  
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
object PopupToolGroup {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.ClippableElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FloatableElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions {
    
    /** Text to display at the top of the popup */
    var header: js.UndefOr[String] = js.undefined
    
    /** See {@link Static.narrowConfig static.narrowConfig} */
    var narrowConfig: js.UndefOr[Pick[this.type, /* template literal string: invisibleLabel */ String]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setNarrowConfig(value: Pick[ConfigOptions, /* template literal string: invisibleLabel */ String]): Self = StObject.set(x, "narrowConfig", value.asInstanceOf[js.Any])
      
      inline def setNarrowConfigUndefined: Self = StObject.set(x, "narrowConfig", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param toolbar
    * @param config Configuration options
    */
  Instantiable1[/* toolbar */ Toolbar, PopupToolGroup]
       with Instantiable2[/* toolbar */ Toolbar, /* config */ ConfigOptions, PopupToolGroup] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.ToolGroup.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.ToolGroup.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap
  object EventMap {
    
    inline def apply(
      active: js.Array[/* visible */ Boolean],
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      labelChange: js.Array[Any],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      toggle: js.Array[/* visible */ Boolean],
      update: js.Array[Any]
    ): EventMap = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.ClippableElement.Props
       with typings.oojsUi.OO.ui.mixin.FloatableElement.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props {
    
    @JSName("$handle")
    var $handle: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $clippable: JQuery[HTMLElement],
      $clippableContainer: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $floatable: JQuery[HTMLElement],
      $floatableContainer: JQuery[HTMLElement],
      $group: JQuery[HTMLElement],
      $handle: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($clippable = $clippable.asInstanceOf[js.Any], $clippableContainer = $clippableContainer.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $floatable = $floatable.asInstanceOf[js.Any], $floatableContainer = $floatableContainer.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $handle = $handle.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$handle(value: JQuery[HTMLElement]): Self = StObject.set(x, "$handle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.ClippableElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FloatableElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
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
      * Check if the tool group is active.
      *
      * @return Tool group is active
      */
    def isActive(): Boolean = js.native
    
    @JSName("off")
    def off_flag[C](event: flag): this.type = js.native
    @JSName("off")
    def off_flag[C](event: flag, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    
    /**
      * Handle resize events from the toolbar
      */
    def onToolbarResize(): Unit = js.native
    
    @JSName("on")
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    
    @JSName("once")
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    
    /**
      * Switch into 'active' mode.
      *
      * When active, the popup is visible. A mouseup event anywhere in the document will trigger
      * deactivation.
      *
      * @param value The active state to set
      */
    def setActive(value: Boolean): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static {
    
    /**
      * Config options to change when toolbar is in narrow mode
      *
      * Supports `invisibleLabel`, `label` and `icon` properties.
      */
    var narrowConfig: (Pick[ConfigOptions, /* template literal string: invisibleLabel */ String]) | Null = js.native
  }
}
