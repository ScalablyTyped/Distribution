package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.IndexLayout.Prototype
import typings.oojsUi.OO.ui.MenuLayout.Props
import typings.oojsUi.anon.PartialRecordkeyofEventMaSet
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.remove
import typings.oojsUi.oojsUiStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IndexLayouts contain {@link OO.ui.TabPanelLayout tab panel layouts} as well as
  * {@link OO.ui.TabSelectWidget tabs} that allow users to easily navigate through the tab panels
  * and select which one to display. By default, only one tab panel is displayed at a time. When a
  * user navigates to a new tab panel, the index layout automatically focuses on the first focusable
  * element, unless the default setting is changed.
  *
  *     // Example of a IndexLayout that contains two TabPanelLayouts.
  *
  *     function TabPanelOneLayout( name, config ) {
  *         TabPanelOneLayout.super.call( this, name, config );
  *         this.$element.append( '<p>First tab panel</p>' );
  *     }
  *     OO.inheritClass( TabPanelOneLayout, OO.ui.TabPanelLayout );
  *     TabPanelOneLayout.prototype.setupTabItem = function () {
  *         this.tabItem.setLabel( 'Tab panel one' );
  *     };
  *
  *     var tabPanel1 = new TabPanelOneLayout( 'one' ),
  *         tabPanel2 = new OO.ui.TabPanelLayout( 'two', { label: 'Tab panel two' } );
  *
  *     tabPanel2.$element.append( '<p>Second tab panel</p>' );
  *
  *     var index = new OO.ui.IndexLayout();
  *
  *     index.addTabPanels( [ tabPanel1, tabPanel2 ] );
  *     $( document.body ).append( index.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.IndexLayout
  */
@js.native
trait IndexLayout
  extends StObject
     with Props
     with Prototype
object IndexLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.MenuLayout.ConfigOptions {
    
    /**
      * Focus on the first focusable element when a new tab panel is displayed. Disabled on
      * mobile.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Show all tab panels, one after another */
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    /** Render the tabs with frames */
    var framed: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setFramed(value: Boolean): Self = StObject.set(x, "framed", value.asInstanceOf[js.Any])
      
      inline def setFramedUndefined: Self = StObject.set(x, "framed", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[IndexLayout]
       with Instantiable1[/* config */ ConfigOptions, IndexLayout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.MenuLayout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.MenuLayout.Constructor = js.native
  }
  
  trait EventMap extends StObject {
    
    var add: js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double]
    
    var remove: js.Array[/* tabPanels */ js.Array[TabPanelLayout]]
    
    var set: js.Array[/* tabPanel */ TabPanelLayout]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double],
      remove: js.Array[/* tabPanels */ js.Array[TabPanelLayout]],
      set: js.Array[/* tabPanel */ TabPanelLayout]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: js.Array[/* tabPanels */ js.Array[TabPanelLayout]]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveVarargs(value: (/* tabPanels */ js.Array[TabPanelLayout])*): Self = StObject.set(x, "remove", js.Array(value*))
      
      inline def setSet(value: js.Array[/* tabPanel */ TabPanelLayout]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetVarargs(value: (/* tabPanel */ TabPanelLayout)*): Self = StObject.set(x, "set", js.Array(value*))
    }
  }
  
  type Props = typings.oojsUi.OO.ui.MenuLayout.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.MenuLayout.Prototype {
    
    /**
      * Add tab panels to the index layout.
      *
      * When tab panels are added with the same names as existing tab panels, the existing tab panels
      * will be automatically removed before the new tab panels are added.
      *
      * @param tabPanels Tab panels to add
      * @param index Index of the insertion point
      * @return The layout, for chaining
      */
    def addTabPanels(tabPanels: js.Array[TabPanelLayout], index: Double): this.type = js.native
    
    /**
      * Clear all tab panels from the index layout.
      *
      * To remove only a subset of tab panels from the index, use the {@link removeTabPanels} method.
      *
      * @return The layout, for chaining
      */
    def clearTabPanels(): this.type = js.native
    
    def connect[T /* <: PartialRecordkeyofEventMaSet */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaSet */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def emit[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    def emitThrow[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* tabPanels */ js.Array[TabPanelLayout]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_set(
      event: set,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* tabPanel */ TabPanelLayout]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* tabPanels */ js.Array[TabPanelLayout]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_set(
      event: set,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* tabPanel */ TabPanelLayout]
    ): Boolean = js.native
    
    /**
      * Focus the first input in the current tab panel.
      *
      * If no tab panel is selected, the first selectable tab panel will be selected.
      * If the focus is already in an element on the current tab panel, nothing will happen.
      *
      * @param itemIndex A specific item to focus on
      */
    def focus(): Unit = js.native
    def focus(itemIndex: Double): Unit = js.native
    
    /**
      * Find the first focusable input in the index layout and focus
      * on it.
      */
    def focusFirstFocusable(): Unit = js.native
    
    /**
      * Get the tab panel closest to the specified tab panel.
      *
      * @param tabPanel Tab panel to use as a reference point
      * @return Tab panel closest to the specified
      */
    def getClosestTabPanel(tabPanel: TabPanelLayout): TabPanelLayout | Null = js.native
    
    /**
      * Get the current tab panel.
      *
      * @return Current tab panel, if found
      */
    def getCurrentTabPanel(): js.UndefOr[TabPanelLayout] = js.native
    
    /**
      * Get the symbolic name of the current tab panel.
      *
      * @return Symbolic name of the current tab panel
      */
    def getCurrentTabPanelName(): String | Null = js.native
    
    /**
      * Get a tab panel by its symbolic name.
      *
      * @param name Symbolic name of tab panel
      * @return Tab panel, if found
      */
    def getTabPanel(name: String): js.UndefOr[TabPanelLayout] = js.native
    
    /**
      * Get the tabs widget.
      *
      * @return Tabs widget
      */
    def getTabs(): TabSelectWidget = js.native
    
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_add[C](event: add): this.type = js.native
    @JSName("off")
    def off_add[C](event: add, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_add[C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_add[C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double], 
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
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* tabPanels */ js.Array[TabPanelLayout]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* tabPanels */ js.Array[TabPanelLayout]], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_set[C](event: set): this.type = js.native
    @JSName("off")
    def off_set[C](event: set, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_set[C](
      event: set,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* tabPanel */ TabPanelLayout], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_set[C](
      event: set,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* tabPanel */ TabPanelLayout], Unit]
        ],
      context: C
    ): this.type = js.native
    
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    def on_add[A /* <: ArgTuple */, C](
      event: add,
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
    // #region EventEmitter overloads
    @JSName("on")
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    def on_set[A /* <: ArgTuple */, C](
      event: set,
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
    
    def once[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'set' | 'add' | 'remove' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_add(
      event: add,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* tabPanels */ js.Array[TabPanelLayout], /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_remove(
      event: remove,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* tabPanels */ js.Array[TabPanelLayout]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_set(
      event: set,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* tabPanel */ TabPanelLayout], Unit]
    ): this.type = js.native
    
    /**
      * Remove the specified tab panels from the index layout.
      *
      * To remove all tab panels from the index, you may wish to use the {@link clearTabPanels} method instead.
      *
      * @param tabPanels An array of tab panels to remove
      * @return The layout, for chaining
      */
    def removeTabPanels(tabPanels: js.Array[TabPanelLayout]): this.type = js.native
    
    /**
      * Select the first selectable tab panel.
      *
      * @return The layout, for chaining
      */
    def selectFirstSelectableTabPanel(): this.type = js.native
    
    /**
      * Set the current tab panel by symbolic name.
      *
      * @param name Symbolic name of tab panel
      */
    def setTabPanel(name: String): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.MenuLayout.Static
}
