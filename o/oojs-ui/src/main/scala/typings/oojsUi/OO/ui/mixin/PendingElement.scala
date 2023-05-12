package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.mixin.PendingElement.Props
import typings.oojsUi.OO.ui.mixin.PendingElement.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PendingElement is a mixin that is used to create elements that notify users that something is
  * happening and that they should wait before proceeding. The pending state is visually represented
  * with a pending texture that appears in the head of a pending
  * {@link OO.ui.ProcessDialog process dialog} or in the input field of a
  * {@link OO.ui.TextInputWidget text input widget}.
  *
  * Currently, {@link OO.ui.ActionWidget Action widgets}, which mix in this class, can also be marked
  * as pending, but only when used in {@link OO.ui.MessageDialog message dialogs}. The behavior is
  * not currently supported for action widgets used in process dialogs.
  *
  *     function MessageDialog( config ) {
  *         MessageDialog.super.call( this, config );
  *     }
  *     OO.inheritClass( MessageDialog, OO.ui.MessageDialog );
  *
  *     MessageDialog.static.name = 'myMessageDialog';
  *     MessageDialog.static.actions = [
  *         { action: 'save', label: 'Done', flags: 'primary' },
  *         { label: 'Cancel', flags: 'safe' }
  *     ];
  *
  *     MessageDialog.prototype.initialize = function () {
  *         MessageDialog.super.prototype.initialize.apply( this, arguments );
  *         this.content = new OO.ui.PanelLayout( { padded: true } );
  *         this.content.$element.append( '<p>Click the \'Done\' action widget to see its pending ' +
  *             'state. Note that action widgets can be marked pending in message dialogs but not ' +
  *             'process dialogs.</p>' );
  *         this.$body.append( this.content.$element );
  *     };
  *     MessageDialog.prototype.getBodyHeight = function () {
  *         return 100;
  *     }
  *     MessageDialog.prototype.getActionProcess = function ( action ) {
  *         var dialog = this;
  *         if ( action === 'save' ) {
  *             dialog.getActions().get({actions: 'save'})[0].pushPending();
  *             return new OO.ui.Process()
  *             .next( 1000 )
  *             .next( function () {
  *                 dialog.getActions().get({actions: 'save'})[0].popPending();
  *             } );
  *         }
  *         return MessageDialog.super.prototype.getActionProcess.call( this, action );
  *     };
  *
  *     var windowManager = new OO.ui.WindowManager();
  *     $( document.body ).append( windowManager.$element );
  *
  *     var dialog = new MessageDialog();
  *     windowManager.addWindows( [ dialog ] );
  *     windowManager.openWindow( dialog );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.PendingElement
  */
trait PendingElement
  extends StObject
     with Props
     with Prototype
object PendingElement {
  
  inline def apply(
    $pending: JQuery[HTMLElement],
    isPending: () => Boolean,
    popPending: () => PendingElement,
    pushPending: () => PendingElement,
    setPendingElement: JQuery[HTMLElement] => Unit
  ): PendingElement = {
    val __obj = js.Dynamic.literal($pending = $pending.asInstanceOf[js.Any], isPending = js.Any.fromFunction0(isPending), popPending = js.Any.fromFunction0(popPending), pushPending = js.Any.fromFunction0(pushPending), setPendingElement = js.Any.fromFunction1(setPendingElement))
    __obj.asInstanceOf[PendingElement]
  }
  
  trait ConfigOptions extends StObject {
    
    /** Element to mark as pending, defaults to {@link Element.Props.$element this.$element} */
    @JSName("$pending")
    var $pending: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$pending(value: JQuery[HTMLElement]): Self = StObject.set(x, "$pending", value.asInstanceOf[js.Any])
      
      inline def set$pendingUndefined: Self = StObject.set(x, "$pending", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[PendingElement]
       with Instantiable1[/* config */ ConfigOptions, PendingElement]
  
  trait Props extends StObject {
    
    @JSName("$pending")
    var $pending: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply($pending: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($pending = $pending.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$pending(value: JQuery[HTMLElement]): Self = StObject.set(x, "$pending", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prototype extends StObject {
    
    /**
      * Check if an element is pending.
      *
      * @return Element is pending
      */
    def isPending(): Boolean
    
    /**
      * Decrease the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    def popPending(): this.type
    
    /**
      * Increase the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    def pushPending(): this.type
    
    /**
      * Set the pending element (and clean up any existing one).
      *
      * @param $pending The element to set to pending.
      */
    def setPendingElement($pending: JQuery[HTMLElement]): Unit
  }
  object Prototype {
    
    inline def apply(
      isPending: () => Boolean,
      popPending: () => Prototype,
      pushPending: () => Prototype,
      setPendingElement: JQuery[HTMLElement] => Unit
    ): Prototype = {
      val __obj = js.Dynamic.literal(isPending = js.Any.fromFunction0(isPending), popPending = js.Any.fromFunction0(popPending), pushPending = js.Any.fromFunction0(pushPending), setPendingElement = js.Any.fromFunction1(setPendingElement))
      __obj.asInstanceOf[Prototype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prototype] (val x: Self) extends AnyVal {
      
      inline def setIsPending(value: () => Boolean): Self = StObject.set(x, "isPending", js.Any.fromFunction0(value))
      
      inline def setPopPending(value: () => Prototype): Self = StObject.set(x, "popPending", js.Any.fromFunction0(value))
      
      inline def setPushPending(value: () => Prototype): Self = StObject.set(x, "pushPending", js.Any.fromFunction0(value))
      
      inline def setSetPendingElement(value: JQuery[HTMLElement] => Unit): Self = StObject.set(x, "setPendingElement", js.Any.fromFunction1(value))
    }
  }
}
