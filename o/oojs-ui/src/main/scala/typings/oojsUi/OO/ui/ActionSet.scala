package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.ActionSet.ActionFilter
import typings.oojsUi.OO.ui.ActionSet.EventMap
import typings.oojsUi.anon.PartialRecordkeyofEventMa
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.click
import typings.oojsUi.oojsUiStrings.remove
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ActionSets manage the behavior of the {@link OO.ui.ActionWidget action widgets} that
  * comprise them.
  * Actions can be made available for specific contexts (modes) and circumstances
  * (abilities). Action sets are primarily used with {@link OO.ui.Dialog Dialogs}.
  *
  * ActionSets contain two types of actions:
  *
  * - Special: Special actions are the first visible actions with special flags, such as 'safe' and
  *  'primary', the default special flags. Additional special flags can be configured in subclasses
  *  with the static {@link ActionSet.Static.specialFlags specialFlags} property.
  * - Other: Other actions include all non-special visible actions.
  *
  * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Process_Dialogs#Action_sets)
  * for more information.
  *
  *     // Example: An action set used in a process dialog
  *     function MyProcessDialog( config ) {
  *         MyProcessDialog.super.call( this, config );
  *     }
  *     OO.inheritClass( MyProcessDialog, OO.ui.ProcessDialog );
  *     MyProcessDialog.static.title = 'An action set in a process dialog';
  *     MyProcessDialog.static.name = 'myProcessDialog';
  *     // An action set that uses modes ('edit' and 'help' mode, in this example).
  *     MyProcessDialog.static.actions = [
  *         {
  *           action: 'continue',
  *           modes: 'edit',
  *           label: 'Continue',
  *           flags: [ 'primary', 'progressive' ]
  *         },
  *         { action: 'help', modes: 'edit', label: 'Help' },
  *         { modes: 'edit', label: 'Cancel', flags: 'safe' },
  *         { action: 'back', modes: 'help', label: 'Back', flags: 'safe' }
  *     ];
  *
  *     MyProcessDialog.prototype.initialize = function () {
  *         MyProcessDialog.super.prototype.initialize.apply( this, arguments );
  *         this.panel1 = new OO.ui.PanelLayout( { padded: true, expanded: false } );
  *         this.panel1.$element.append( '<p>This dialog uses an action set (continue, help, ' +
  *             'cancel, back) configured with modes. This is edit mode. Click \'help\' to see ' +
  *             'help mode.</p>' );
  *         this.panel2 = new OO.ui.PanelLayout( { padded: true, expanded: false } );
  *         this.panel2.$element.append( '<p>This is help mode. Only the \'back\' action widget ' +
  *              'is configured to be visible here. Click \'back\' to return to \'edit\' mode.' +
  *              '</p>' );
  *         this.stackLayout = new OO.ui.StackLayout( {
  *             items: [ this.panel1, this.panel2 ]
  *         } );
  *         this.$body.append( this.stackLayout.$element );
  *     };
  *     MyProcessDialog.prototype.getSetupProcess = function ( data ) {
  *         return MyProcessDialog.super.prototype.getSetupProcess.call( this, data )
  *             .next( function () {
  *                 this.actions.setMode( 'edit' );
  *             }, this );
  *     };
  *     MyProcessDialog.prototype.getActionProcess = function ( action ) {
  *         if ( action === 'help' ) {
  *             this.actions.setMode( 'help' );
  *             this.stackLayout.setItem( this.panel2 );
  *         } else if ( action === 'back' ) {
  *             this.actions.setMode( 'edit' );
  *             this.stackLayout.setItem( this.panel1 );
  *         } else if ( action === 'continue' ) {
  *             var dialog = this;
  *             return new OO.ui.Process( function () {
  *                 dialog.close();
  *             } );
  *         }
  *         return MyProcessDialog.super.prototype.getActionProcess.call( this, action );
  *     };
  *     MyProcessDialog.prototype.getBodyHeight = function () {
  *         return this.panel1.$element.outerHeight( true );
  *     };
  *     var windowManager = new OO.ui.WindowManager();
  *     $( document.body ).append( windowManager.$element );
  *     var dialog = new MyProcessDialog( {
  *         size: 'medium'
  *     } );
  *     windowManager.addWindows( [ dialog ] );
  *     windowManager.openWindow( dialog );
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ActionSet
  */
@js.native
trait ActionSet
  extends StObject
     with EventEmitter {
  
  /**
    * Add action widgets to the action set.
    *
    * @param actions Action widgets to add
    * @return The widget, for chaining
    */
  def add(actions: js.Array[ActionWidget]): this.type = js.native
  
  /**
    * Remove all action widgets from the set.
    *
    * To remove only specified actions, use the {@link remove} method instead.
    *
    * @return The widget, for chaining
    */
  def clear(): this.type = js.native
  
  def connect[T /* <: PartialRecordkeyofEventMa */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
  
  def disconnect[T /* <: PartialRecordkeyofEventMa */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
  
  def emit[K /* <: String */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    args: Any*
  ): Boolean = js.native
  
  def emitThrow[K /* <: String */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    args: Any*
  ): Boolean = js.native
  @JSName("emitThrow")
  def emitThrow_add(
    event: add,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[/* added */ js.Array[ActionWidget]]
  ): Boolean = js.native
  @JSName("emitThrow")
  def emitThrow_change(
    event: change,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[Any]
  ): Boolean = js.native
  @JSName("emitThrow")
  def emitThrow_click(
    event: click,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[/* action */ ActionWidget]
  ): Boolean = js.native
  @JSName("emitThrow")
  def emitThrow_remove(
    event: remove,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[/* removed */ js.Array[ActionWidget]]
  ): Boolean = js.native
  
  @JSName("emit")
  def emit_add(
    event: add,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[/* added */ js.Array[ActionWidget]]
  ): Boolean = js.native
  @JSName("emit")
  def emit_change(
    event: change,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[Any]
  ): Boolean = js.native
  @JSName("emit")
  def emit_click(
    event: click,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[/* action */ ActionWidget]
  ): Boolean = js.native
  @JSName("emit")
  def emit_remove(
    event: remove,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ActionSet.EventMap[K] is not an array type */ args: js.Array[/* removed */ js.Array[ActionWidget]]
  ): Boolean = js.native
  
  def forEach(
    filter: Null,
    callback: js.Function3[/* action */ ActionWidget, /* index */ Double, /* list */ js.Array[ActionWidget], Unit]
  ): this.type = js.native
  /**
    * Executes a function once per action.
    *
    * When making changes to multiple actions, use this method instead of iterating over the
    * actions manually to defer emitting a {@link ActionSet.EventMap.change change} event until
    * after all actions have been changed.
    *
    * @param filter Filters to use to determine which actions to iterate over;
    *  see {@link get}
    * @param callback Callback to run for each action; callback is invoked with
    *  three arguments: the action, the action's index, the list of actions being iterated over
    * @return The widget, for chaining
    */
  def forEach(
    filter: ActionFilter,
    callback: js.Function3[/* action */ ActionWidget, /* index */ Double, /* list */ js.Array[ActionWidget], Unit]
  ): this.type = js.native
  
  /**
    * Get action widgets based on the specified filter: ‘actions’, ‘flags’, ‘modes’, ‘visible’,
    *  or ‘disabled’.
    *
    * @param filters Filters to use, omit to get all actions
    * @return Action widgets matching all criteria
    */
  def get(): js.Array[ActionWidget] = js.native
  def get(filters: ActionFilter): js.Array[ActionWidget] = js.native
  
  /**
    * Get 'other' actions.
    *
    * Other actions include all non-special visible action widgets.
    *
    * @return 'Other' action widgets
    */
  def getOthers(): js.Array[ActionWidget] = js.native
  
  /**
    * Get 'special' actions.
    *
    * Special actions are the first visible action widgets with special flags, such as 'safe' and
    * 'primary'.
    * Special flags can be configured in subclasses by changing the static
    * {@link ActionSet.Static.specialFlags specialFlags} property.
    *
    * @return 'Special' action widgets.
    */
  def getSpecial(): js.Array[ActionWidget] | Null = js.native
  
  /**
    * Check if an action is one of the special actions.
    *
    * @param action Action to check
    * @return Action is special
    */
  def isSpecial(action: ActionWidget): Boolean = js.native
  
  def off[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any
  ): this.type = js.native
  def off[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    method: Unit,
    context: C
  ): this.type = js.native
  def off[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
  ): this.type = js.native
  def off[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
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
      js.ThisFunction1[/* this */ C, /* args */ js.Array[/* added */ js.Array[ActionWidget]], Unit]
    ]
  ): this.type = js.native
  @JSName("off")
  def off_add[C](
    event: add,
    method: EventHandler[
      C, 
      js.ThisFunction1[/* this */ C, /* args */ js.Array[/* added */ js.Array[ActionWidget]], Unit]
    ],
    context: C
  ): this.type = js.native
  @JSName("off")
  def off_change[C](event: change): this.type = js.native
  @JSName("off")
  def off_change[C](event: change, method: Unit, context: C): this.type = js.native
  @JSName("off")
  def off_change[C](
    event: change,
    method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
  ): this.type = js.native
  @JSName("off")
  def off_change[C](
    event: change,
    method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
    context: C
  ): this.type = js.native
  @JSName("off")
  def off_click[C](event: click): this.type = js.native
  @JSName("off")
  def off_click[C](event: click, method: Unit, context: C): this.type = js.native
  @JSName("off")
  def off_click[C](
    event: click,
    method: EventHandler[
      C, 
      js.ThisFunction1[/* this */ C, /* args */ js.Array[/* action */ ActionWidget], Unit]
    ]
  ): this.type = js.native
  @JSName("off")
  def off_click[C](
    event: click,
    method: EventHandler[
      C, 
      js.ThisFunction1[/* this */ C, /* args */ js.Array[/* action */ ActionWidget], Unit]
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
      js.ThisFunction1[/* this */ C, /* args */ js.Array[/* removed */ js.Array[ActionWidget]], Unit]
    ]
  ): this.type = js.native
  @JSName("off")
  def off_remove[C](
    event: remove,
    method: EventHandler[
      C, 
      js.ThisFunction1[/* this */ C, /* args */ js.Array[/* removed */ js.Array[ActionWidget]], Unit]
    ],
    context: C
  ): this.type = js.native
  
  def on[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
  ): this.type = js.native
  def on[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
    args: js.Array[Any]
  ): this.type = js.native
  def on[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
    args: js.Array[Any],
    context: C
  ): this.type = js.native
  def on[K /* <: String */, C](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
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
  def on_change[A /* <: ArgTuple */, C](
    event: change,
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
  def on_change[A /* <: ArgTuple */, C](
    event: change,
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
  def on_change[A /* <: ArgTuple */, C](
    event: change,
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
  def on_change[A /* <: ArgTuple */, C](
    event: change,
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
  def on_click[A /* <: ArgTuple */, C](
    event: click,
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
  def on_click[A /* <: ArgTuple */, C](
    event: click,
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
  def on_click[A /* <: ArgTuple */, C](
    event: click,
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
  def on_click[A /* <: ArgTuple */, C](
    event: click,
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
  
  def once[K /* <: String */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'click' | 'add' | 'remove' | 'change' ? never : K */ js.Any,
    listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_add(
    event: add,
    listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* added */ js.Array[ActionWidget]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_change(event: change, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_click(
    event: click,
    listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* action */ ActionWidget], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remove(
    event: remove,
    listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* removed */ js.Array[ActionWidget]], Unit]
  ): this.type = js.native
  
  /**
    * Remove action widgets from the set.
    *
    * To remove all actions, you may wish to use the {@link clear} method instead.
    *
    * @param actions Action widgets to remove
    * @return The widget, for chaining
    */
  def remove(actions: js.Array[ActionWidget]): this.type = js.native
  
  /**
    * Set the abilities of the specified actions.
    *
    * Action widgets that are configured with the specified actions will be enabled
    * or disabled based on the boolean values specified in the `actions`
    * parameter.
    *
    * @param actions A list keyed by action name with boolean
    *  values that indicate whether or not the action should be enabled.
    * @return The widget, for chaining
    */
  def setAbilities(actions: Record[String, Boolean]): this.type = js.native
  
  /**
    * Set the mode (e.g., ‘edit’ or ‘view’). Only {@link ActionWidget.ConfigOptions.modes actions}
    * configured to be available in the specified mode will be made visible. All other actions
    * will be hidden.
    *
    * @param mode The mode. Only actions configured to be available in the specified
    *  mode will be made visible.
    * @return The widget, for chaining
    */
  def setMode(mode: String): this.type = js.native
}
object ActionSet {
  
  trait ActionFilter extends StObject {
    
    /** Actions that action widgets must have */
    var actions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Disabled state that action widgets must have, omit to get both enabled and disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Flags that action widgets must have (e.g., 'safe') */
    var flags: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Modes that action widgets must have */
    var modes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Visibility that action widgets must have, omit to get both visible and invisible */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ActionFilter {
    
    inline def apply(): ActionFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionFilter] (val x: Self) extends AnyVal {
      
      inline def setActions(value: String | js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlags(value: String | js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
      
      inline def setModes(value: String | js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
      
      inline def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ActionSet]
       with Instantiable1[/* config */ js.Object, ActionSet] {
    
    var static: Static = js.native
  }
  
  trait EventMap extends StObject {
    
    var add: js.Array[/* added */ js.Array[ActionWidget]]
    
    var change: js.Array[Any]
    
    var click: js.Array[/* action */ ActionWidget]
    
    var remove: js.Array[/* removed */ js.Array[ActionWidget]]
  }
  object EventMap {
    
    inline def apply(
      add: js.Array[/* added */ js.Array[ActionWidget]],
      change: js.Array[Any],
      click: js.Array[/* action */ ActionWidget],
      remove: js.Array[/* removed */ js.Array[ActionWidget]]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[/* added */ js.Array[ActionWidget]]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddVarargs(value: (/* added */ js.Array[ActionWidget])*): Self = StObject.set(x, "add", js.Array(value*))
      
      inline def setChange(value: js.Array[Any]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeVarargs(value: Any*): Self = StObject.set(x, "change", js.Array(value*))
      
      inline def setClick(value: js.Array[/* action */ ActionWidget]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickVarargs(value: (/* action */ ActionWidget)*): Self = StObject.set(x, "click", js.Array(value*))
      
      inline def setRemove(value: js.Array[/* removed */ js.Array[ActionWidget]]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveVarargs(value: (/* removed */ js.Array[ActionWidget])*): Self = StObject.set(x, "remove", js.Array(value*))
    }
  }
  
  trait Static extends StObject {
    
    /**
      * Symbolic name of the flags used to identify special actions. Special actions are
      * displayed in the header of a {@link OO.ui.ProcessDialog process dialog}.
      * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Process_Dialogs)
      * for more information and examples.
      */
    var specialFlags: js.Array[String]
  }
  object Static {
    
    inline def apply(specialFlags: js.Array[String]): Static = {
      val __obj = js.Dynamic.literal(specialFlags = specialFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setSpecialFlags(value: js.Array[String]): Self = StObject.set(x, "specialFlags", value.asInstanceOf[js.Any])
      
      inline def setSpecialFlagsVarargs(value: String*): Self = StObject.set(x, "specialFlags", js.Array(value*))
    }
  }
}
