package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ActionFieldLayout.ConfigOptions
import typings.oojsUi.OO.ui.ActionFieldLayout.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionFieldLayout extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionFieldLayout")
  @js.native
  open class ^[T /* <: typings.oojsUi.OO.ui.Widget */] protected ()
    extends StObject
       with typings.oojsUi.OO.ui.ActionFieldLayout[T] {
    /**
      * @param fieldWidget Field widget
      * @param buttonWidget Button widget
      * @param config Configuration options
      */
    def this(fieldWidget: T, buttonWidget: typings.oojsUi.OO.ui.ButtonWidget) = this()
    def this(fieldWidget: T, buttonWidget: typings.oojsUi.OO.ui.ButtonWidget, config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$body")
    var $body: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$field")
    var $field: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$header")
    var $header: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$help")
    var $help: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$messages")
    var $messages: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.ActionFieldLayout")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionFieldLayout.parent")
  @js.native
  open class parent[T /* <: typings.oojsUi.OO.ui.Widget */] protected ()
    extends StObject
       with typings.oojsUi.OO.ui.FieldLayout[T] {
    /**
      * @param fieldWidget Field widget
      * @param config Configuration options
      * @throws {Error} An error is thrown if no widget is specified
      */
    def this(fieldWidget: T) = this()
    def this(fieldWidget: T, config: typings.oojsUi.OO.ui.FieldLayout.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$body")
    var $body: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$field")
    var $field: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$header")
    var $header: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$help")
    var $help: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$messages")
    var $messages: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionFieldLayout.super")
  @js.native
  open class `super`[T /* <: typings.oojsUi.OO.ui.Widget */] protected ()
    extends StObject
       with typings.oojsUi.OO.ui.FieldLayout[T] {
    /**
      * @param fieldWidget Field widget
      * @param config Configuration options
      * @throws {Error} An error is thrown if no widget is specified
      */
    def this(fieldWidget: T) = this()
    def this(fieldWidget: T, config: typings.oojsUi.OO.ui.FieldLayout.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$body")
    var $body: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$field")
    var $field: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$header")
    var $header: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$help")
    var $help: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$messages")
    var $messages: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$titled")
    var $titled: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `ActionFieldLayout.foo` */
  override def _to: js.Object & Constructor = ^
}
