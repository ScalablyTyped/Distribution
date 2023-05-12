package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.Dialog.Props
import typings.oojsUi.OO.ui.Dialog.Prototype
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Dialog class serves as the base class for the other types of dialogs.
  * Unless extended to include controls, the rendered dialog box is a simple window
  * that users can close by hitting the Escape key. Dialog windows are used with OO.ui.WindowManager,
  * which opens, closes, and controls the presentation of the window. See the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Dialogs)
  * for more information.
  *
  *     // A simple dialog window.
  *     function MyDialog( config ) {
  *         MyDialog.super.call( this, config );
  *     }
  *     OO.inheritClass( MyDialog, OO.ui.Dialog );
  *     MyDialog.static.name = 'myDialog';
  *     MyDialog.prototype.initialize = function () {
  *         MyDialog.super.prototype.initialize.call( this );
  *         this.content = new OO.ui.PanelLayout( { padded: true, expanded: false } );
  *         this.content.$element.append( '<p>A simple dialog window. Press Escape key to ' +
  *             'close.</p>' );
  *         this.$body.append( this.content.$element );
  *     };
  *     MyDialog.prototype.getBodyHeight = function () {
  *         return this.content.$element.outerHeight( true );
  *     };
  *     var myDialog = new MyDialog( {
  *         size: 'medium'
  *     } );
  *     // Create and append a window manager, which opens and closes the window.
  *     var windowManager = new OO.ui.WindowManager();
  *     $( document.body ).append( windowManager.$element );
  *     windowManager.addWindows( [ myDialog ] );
  *     // Open the window!
  *     windowManager.openWindow( myDialog );
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Dialog
  */
@js.native
trait Dialog
  extends StObject
     with Props
     with Prototype
object Dialog {
  
  type ConfigOptions = typings.oojsUi.OO.ui.Window.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[Dialog]
       with Instantiable1[/* config */ ConfigOptions, Dialog] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Window.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Window.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Window.Props
       with typings.oojsUi.OO.ui.mixin.PendingElement.Props
  object Props {
    
    inline def apply(
      $content: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $focusTrapAfter: JQuery[HTMLElement],
      $focusTrapBefore: JQuery[HTMLElement],
      $focusTraps: JQuery[HTMLElement],
      $frame: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement],
      $pending: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($content = $content.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $focusTrapAfter = $focusTrapAfter.asInstanceOf[js.Any], $focusTrapBefore = $focusTrapBefore.asInstanceOf[js.Any], $focusTraps = $focusTraps.asInstanceOf[js.Any], $frame = $frame.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Window.Prototype
       with typings.oojsUi.OO.ui.mixin.PendingElement.Prototype {
    
    /**
      * Execute an action.
      *
      * @param action Symbolic name of action to execute
      * @return Promise resolved when action completes, rejected if it fails
      */
    def executeAction(action: String): Promise[Unit, js.Array[Any | Error], Any] = js.native
    
    /**
      * Get a process for taking action.
      *
      * When you override this method, you can create a new OO.ui.Process and return it, or
      * add additional accept steps to the process the parent method provides using the
      * {@link OO.ui.Process.first 'first'} and {@link OO.ui.Process.next 'next'} methods of
      * OO.ui.Process.
      *
      * @param action Symbolic name of action
      * @return Action process
      */
    def getActionProcess(): Process = js.native
    def getActionProcess(action: String): Process = js.native
    
    /**
      * Get action widget from config
      *
      * Override this method to change the action widget class used.
      *
      * @param config Action widget config
      * @return Action widget
      */
    def getActionWidget(config: typings.oojsUi.OO.ui.ActionWidget.ConfigOptions): ActionWidget = js.native
    
    /**
      * Get action widget config
      *
      * Override this method to modify the action widget config
      *
      * @param config Initial action widget config
      * @return Action widget config
      */
    def getActionWidgetConfig(config: typings.oojsUi.OO.ui.ActionWidget.ConfigOptions): typings.oojsUi.OO.ui.ActionWidget.ConfigOptions = js.native
    
    /**
      * Get action widgets from a list of configs
      *
      * @param actions Action widget configs
      * @return Action widgets
      */
    def getActionWidgets(actions: js.Array[typings.oojsUi.OO.ui.ActionWidget.ConfigOptions]): js.Array[ActionWidget] = js.native
    
    /**
      * Get the set of actions used by the dialog.
      *
      * @return
      */
    def getActions(): ActionSet = js.native
    
    def getSetupProcess(data: SetupDataMap & (Record[String, Any])): Process = js.native
    def getSetupProcess[T](
      data: /* import warning: importer.ImportType#apply Failed type conversion: T extends object ? never : T */ js.Any
    ): Process = js.native
    @JSName("getSetupProcess")
    def getSetupProcess_T[T](): Process = js.native
  }
  
  trait SetupDataMap extends StObject {
    
    /**
      * List of configuration options for each {@link OO.ui.ActionWidget action widget},
      * omit to use {@link Static.actions static actions}.
      */
    var actions: js.UndefOr[js.Array[typings.oojsUi.OO.ui.ActionWidget.ConfigOptions]] = js.undefined
    
    /** Dialog title, omit to use the {@link Static.title static title} */
    var title: js.UndefOr[JQuery[HTMLElement] | Deferrable[String] | Null] = js.undefined
  }
  object SetupDataMap {
    
    inline def apply(): SetupDataMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetupDataMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetupDataMap] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[typings.oojsUi.OO.ui.ActionWidget.ConfigOptions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.oojsUi.OO.ui.ActionWidget.ConfigOptions*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setTitle(value: JQuery[HTMLElement] | Deferrable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Window.Static {
    
    /**
      * An array of configured {@link OO.ui.ActionWidget action widgets}.
      *
      * Actions can also be specified with data passed to the constructor
      * (see {@link Prototype.getSetupProcess getSetupProcess}).
      * In this case, the static value will be overridden.
      */
    var actions: js.Array[typings.oojsUi.OO.ui.ActionWidget.ConfigOptions] = js.native
    
    /**
      * Close the dialog when the Escape key is pressed.
      */
    var escapable: Boolean = js.native
    
    /**
      * Symbolic name of dialog.
      *
      * The dialog class must have a symbolic name in order to be registered with OO.Factory.
      * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Window_managers)
      * for more information.
      */
    var name: String = js.native
    
    /**
      * The dialog title.
      *
      * The title can be specified as a plaintext string, a {@link OO.ui.mixin.LabelElement Label}
      * node, or a function that will produce a Label node or string. The title can also be
      * specified with data passed to the constructor (see {@link Prototype.getSetupProcess getSetupProcess}).
      * In this case, the static value will be overridden.
      */
    var title: JQuery[HTMLElement] | Deferrable[String] | Null = js.native
  }
}
