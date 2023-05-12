package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.TagItemWidget.Props
import typings.oojsUi.OO.ui.TagItemWidget.Prototype
import typings.oojsUi.OO.ui.mixin.DraggableElement
import typings.oojsUi.oojsUiStrings.dragend
import typings.oojsUi.oojsUiStrings.dragstart
import typings.oojsUi.oojsUiStrings.drop
import typings.oojsUi.oojsUiStrings.fixed
import typings.oojsUi.oojsUiStrings.flag
import typings.oojsUi.oojsUiStrings.labelChange
import typings.oojsUi.oojsUiStrings.navigate
import typings.oojsUi.oojsUiStrings.remove
import typings.oojsUi.oojsUiStrings.select
import typings.oojsUi.oojsUiStrings.valid
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TagItemWidgets are used within a {@link OO.ui.TagMultiselectWidget TagMultiselectWidget}
  * to display the selected items.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.TagItemWidget
  */
@js.native
trait TagItemWidget
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
object TagItemWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.DraggableElement.ConfigOptions {
    
    /** Item is fixed. This means the item is always included in the values and cannot be removed. */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** Item is valid */
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TagItemWidget]
       with Instantiable1[/* config */ ConfigOptions, TagItemWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap
       with typings.oojsUi.OO.ui.mixin.DraggableElement.EventMap {
    
    var fixed: js.Array[/* isFixed */ Boolean]
    
    var navigate: js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction]
    
    var remove: js.Array[Any]
    
    var select: js.Array[Any]
    
    var valid: js.Array[/* isValid */ Boolean]
  }
  object EventMap {
    
    inline def apply(
      disable: js.Array[/* disabled */ Boolean],
      dragend: js.Array[Any],
      dragstart: js.Array[/* item */ DraggableElement],
      drop: js.Array[Any],
      fixed: js.Array[/* isFixed */ Boolean],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      labelChange: js.Array[Any],
      navigate: js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction],
      remove: js.Array[Any],
      select: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean],
      valid: js.Array[/* isValid */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: js.Array[/* isFixed */ Boolean]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedVarargs(value: (/* isFixed */ Boolean)*): Self = StObject.set(x, "fixed", js.Array(value*))
      
      inline def setNavigate(value: js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction]): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
      
      inline def setNavigateVarargs(value: (/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction)*): Self = StObject.set(x, "navigate", js.Array(value*))
      
      inline def setRemove(value: js.Array[Any]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveVarargs(value: Any*): Self = StObject.set(x, "remove", js.Array(value*))
      
      inline def setSelect(value: js.Array[Any]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectVarargs(value: Any*): Self = StObject.set(x, "select", js.Array(value*))
      
      inline def setValid(value: js.Array[/* isValid */ Boolean]): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidVarargs(value: (/* isValid */ Boolean)*): Self = StObject.set(x, "valid", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props
       with typings.oojsUi.OO.ui.mixin.DraggableElement.Props
  object Props {
    
    inline def apply(
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $handle: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $handle = $handle.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.DraggableElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_dragend(
      event: dragend,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_dragstart(
      event: dragstart,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ DraggableElement]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_drop(
      event: drop,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_fixed(
      event: fixed,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* isFixed */ Boolean]
    ): Boolean = js.native
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
    @JSName("emitThrow")
    def emitThrow_navigate(
      event: navigate,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_select(
      event: select,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_valid(
      event: valid,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* isValid */ Boolean]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_dragend(
      event: dragend,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_dragstart(
      event: dragstart,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* item */ DraggableElement]
    ): Boolean = js.native
    @JSName("emit")
    def emit_drop(
      event: drop,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_fixed(
      event: fixed,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* isFixed */ Boolean]
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
    @JSName("emit")
    def emit_navigate(
      event: navigate,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction]
    ): Boolean = js.native
    @JSName("emit")
    def emit_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_select(
      event: select,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_valid(
      event: valid,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* isValid */ Boolean]
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
      * Check whether the item is fixed
      *
      * @return
      */
    def isFixed(): Boolean = js.native
    
    /**
      * Check whether the item is valid
      *
      * @return Item is valid
      */
    def isValid(): Boolean = js.native
    
    @JSName("off")
    def off_dragend[C](event: dragend): this.type = js.native
    @JSName("off")
    def off_dragend[C](event: dragend, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_dragend[C](
      event: dragend,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_dragend[C](
      event: dragend,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_dragstart[C](event: dragstart): this.type = js.native
    @JSName("off")
    def off_dragstart[C](event: dragstart, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_dragstart[C](
      event: dragstart,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ DraggableElement], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_dragstart[C](
      event: dragstart,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* item */ DraggableElement], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_drop[C](event: drop): this.type = js.native
    @JSName("off")
    def off_drop[C](event: drop, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_drop[C](
      event: drop,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_drop[C](
      event: drop,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_fixed[C](event: fixed): this.type = js.native
    @JSName("off")
    def off_fixed[C](event: fixed, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_fixed[C](
      event: fixed,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* isFixed */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_fixed[C](
      event: fixed,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* isFixed */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
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
    @JSName("off")
    def off_navigate[C](event: navigate): this.type = js.native
    @JSName("off")
    def off_navigate[C](event: navigate, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_navigate[C](
      event: navigate,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_navigate[C](
      event: navigate,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](event: remove): this.type = js.native
    @JSName("off")
    def off_remove[C](event: remove, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_select[C](event: select): this.type = js.native
    @JSName("off")
    def off_select[C](event: select, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_select[C](
      event: select,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_select[C](
      event: select,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_valid[C](event: valid): this.type = js.native
    @JSName("off")
    def off_valid[C](event: valid, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_valid[C](
      event: valid,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* isValid */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_valid[C](
      event: valid,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* isValid */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
    
    /**
      * Handle a keydown event on the widget
      *
      * @param e Key down event
      * @return false to stop the operation
      */
    def onKeyDown(e: Event): Boolean | Unit = js.native
    
    @JSName("on")
    def on_dragend[A /* <: ArgTuple */, C](
      event: dragend,
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
    def on_dragend[A /* <: ArgTuple */, C](
      event: dragend,
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
    def on_dragend[A /* <: ArgTuple */, C](
      event: dragend,
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
    def on_dragend[A /* <: ArgTuple */, C](
      event: dragend,
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
    def on_dragstart[A /* <: ArgTuple */, C](
      event: dragstart,
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
    def on_dragstart[A /* <: ArgTuple */, C](
      event: dragstart,
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
    def on_dragstart[A /* <: ArgTuple */, C](
      event: dragstart,
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
    def on_dragstart[A /* <: ArgTuple */, C](
      event: dragstart,
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
    def on_drop[A /* <: ArgTuple */, C](
      event: drop,
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
    def on_drop[A /* <: ArgTuple */, C](
      event: drop,
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
    def on_drop[A /* <: ArgTuple */, C](
      event: drop,
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
    def on_drop[A /* <: ArgTuple */, C](
      event: drop,
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
    def on_fixed[A /* <: ArgTuple */, C](
      event: fixed,
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
    def on_fixed[A /* <: ArgTuple */, C](
      event: fixed,
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
    def on_fixed[A /* <: ArgTuple */, C](
      event: fixed,
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
    def on_fixed[A /* <: ArgTuple */, C](
      event: fixed,
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
    @JSName("on")
    def on_navigate[A /* <: ArgTuple */, C](
      event: navigate,
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
    def on_navigate[A /* <: ArgTuple */, C](
      event: navigate,
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
    def on_navigate[A /* <: ArgTuple */, C](
      event: navigate,
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
    def on_navigate[A /* <: ArgTuple */, C](
      event: navigate,
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
    // #region EventEmitter overloads
    @JSName("on")
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_select[A /* <: ArgTuple */, C](
      event: select,
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
    def on_valid[A /* <: ArgTuple */, C](
      event: valid,
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
    def on_valid[A /* <: ArgTuple */, C](
      event: valid,
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
    def on_valid[A /* <: ArgTuple */, C](
      event: valid,
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
    def on_valid[A /* <: ArgTuple */, C](
      event: valid,
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
    def once_dragend(event: dragend, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_dragstart(
      event: dragstart,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* item */ DraggableElement], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_drop(event: drop, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_fixed(
      event: fixed,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* isFixed */ Boolean], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_navigate(
      event: navigate,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Array[/* direction */ typings.oojsUi.OO.ui.TagMultiselectWidget.Direction], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_remove(event: remove, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_select(event: select, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_valid(
      event: valid,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* isValid */ Boolean], Unit]
    ): this.type = js.native
    
    /**
      * Handle removal of the item
      *
      * This is mainly for extensibility concerns, so other children
      * of this class can change the behavior if they need to. This
      * is called by both clicking the 'remove' button but also
      * on keypress, which is harder to override if needed.
      */
    def remove(): Unit = js.native
    
    /**
      * Select this item
      */
    def select(): Unit = js.native
    
    /**
      * Set this item as fixed, meaning it cannot be removed
      *
      * @param state Item is fixed, omit to toggle
      * @return The widget, for chaining
      */
    def setFixed(): this.type = js.native
    def setFixed(state: Boolean): this.type = js.native
    
    /**
      * Set the valid state of this item
      *
      * @param valid Item is valid, omit to toggle
      */
    def toggleValid(): Unit = js.native
    def toggleValid(valid: Boolean): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static
       with typings.oojsUi.OO.ui.mixin.DraggableElement.Static
}
