package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.IndicatorWidget.Props
import typings.oojsUi.OO.ui.IndicatorWidget.Prototype
import typings.oojsUi.oojsUiStrings.labelChange
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IndicatorWidgets create indicators, which are small graphics that are generally used to draw
  * attention to the status of an item or to clarify the function within a control. For a list of
  * indicators included in the library, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Icons,_Indicators,_and_Labels#Indicators).
  *
  *     // An indicator widget.
  *     var indicator1 = new OO.ui.IndicatorWidget( {
  *             indicator: 'required'
  *         } ),
  *         // Create a fieldset layout to add a label.
  *         fieldset = new OO.ui.FieldsetLayout();
  *     fieldset.addItems( [
  *         new OO.ui.FieldLayout( indicator1, {
  *             label: 'A required indicator:'
  *         } )
  *     ] );
  *     $( document.body ).append( fieldset.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.IndicatorWidget
  */
@js.native
trait IndicatorWidget
  extends StObject
     with Props
     with Prototype
object IndicatorWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[IndicatorWidget]
       with Instantiable1[/* config */ ConfigOptions, IndicatorWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
  object EventMap {
    
    inline def apply(
      disable: js.Array[/* disabled */ Boolean],
      labelChange: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
  object Props {
    
    inline def apply(
      $element: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
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
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
}
