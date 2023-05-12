package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DecoratedOptionWidgets are {@link OO.ui.OptionWidget options} that can be configured
  * with an {@link OO.ui.mixin.IconElement icon} and/or
  * {@link OO.ui.mixin.IndicatorElement indicator}.
  * This class is used with OO.ui.SelectWidget to create a selection of mutually exclusive
  * options. For more information about options and selects, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options).
  *
  *     // Decorated options in a select widget.
  *     var select = new OO.ui.SelectWidget( {
  *         items: [
  *             new OO.ui.DecoratedOptionWidget( {
  *                 data: 'a',
  *                 label: 'Option with icon',
  *                 icon: 'help'
  *             } ),
  *             new OO.ui.DecoratedOptionWidget( {
  *                 data: 'b',
  *                 label: 'Option with indicator',
  *                 indicator: 'next'
  *             } )
  *         ]
  *     } );
  *     $( document.body ).append( select.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.DecoratedOptionWidget
  */
@js.native
trait DecoratedOptionWidget
  extends StObject
     with Props
     with Prototype
object DecoratedOptionWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.OptionWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
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
  Instantiable0[DecoratedOptionWidget]
       with Instantiable1[/* config */ ConfigOptions, DecoratedOptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.OptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.OptionWidget.Constructor = js.native
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.OptionWidget.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.OptionWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.OptionWidget.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
}
