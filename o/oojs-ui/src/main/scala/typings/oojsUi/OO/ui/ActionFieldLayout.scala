package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.oojsUi.OO.ui.FieldLayout.Props
import typings.oojsUi.OO.ui.FieldLayout.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ActionFieldLayouts are used with OO.ui.FieldsetLayout. The layout consists of a field-widget,
  * a button, and an optional label and/or help text. The field-widget (e.g., a
  * {@link OO.ui.TextInputWidget TextInputWidget}), is required and is specified before any optional
  * configuration settings.
  *
  * Labels can be aligned in one of four ways:
  *
  * - **left**: The label is placed before the field-widget and aligned with the left margin.
  *   A left-alignment is used for forms with many fields.
  * - **right**: The label is placed before the field-widget and aligned to the right margin.
  *   A right-alignment is used for long but familiar forms which users tab through,
  *   verifying the current field with a quick glance at the label.
  * - **top**: The label is placed above the field-widget. A top-alignment is used for brief forms
  *   that users fill out from top to bottom.
  * - **inline**: The label is placed after the field-widget and aligned to the left.
  *   An inline-alignment is best used with checkboxes or radio buttons.
  *
  * Help text is accessed via a help icon that appears in the upper right corner of the rendered
  * field layout when help text is specified.
  *
  *     // Example of an ActionFieldLayout
  *     var actionFieldLayout = new OO.ui.ActionFieldLayout(
  *         new OO.ui.TextInputWidget( {
  *             placeholder: 'Field widget'
  *         } ),
  *         new OO.ui.ButtonWidget( {
  *             label: 'Button'
  *         } ),
  *         {
  *             label: 'An ActionFieldLayout. This label is aligned top',
  *             align: 'top',
  *             help: 'This is help text'
  *         }
  *     );
  *
  *     $( document.body ).append( actionFieldLayout.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ActionFieldLayout
  */
@js.native
trait ActionFieldLayout[T /* <: Widget */]
  extends StObject
     with Props
     with Prototype[T]
object ActionFieldLayout {
  
  type ConfigOptions = typings.oojsUi.OO.ui.FieldLayout.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param fieldWidget Field widget
    * @param buttonWidget Button widget
    * @param config Configuration options
    */
  Instantiable2[/* fieldWidget */ Widget, /* buttonWidget */ ButtonWidget, ActionFieldLayout[Widget]]
       with Instantiable3[
          /* fieldWidget */ Widget, 
          /* buttonWidget */ ButtonWidget, 
          /* config */ ConfigOptions, 
          ActionFieldLayout[Widget]
        ] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.FieldLayout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.FieldLayout.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.FieldLayout.Props
  
  type Prototype[T /* <: Widget */] = typings.oojsUi.OO.ui.FieldLayout.Prototype[T]
  
  type Static = typings.oojsUi.OO.ui.FieldLayout.Static
}
