package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.OptionWidget.Props
import typings.oojsUi.OO.ui.OptionWidget.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RadioOptionWidget is an option widget that looks like a radio button.
  * The class is used with OO.ui.RadioSelectWidget to create a selection of radio options.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options#Button_selects_and_option)
  * for more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.RadioOptionWidget
  */
@js.native
trait RadioOptionWidget
  extends StObject
     with Props
     with Prototype
object RadioOptionWidget {
  
  type ConfigOptions = typings.oojsUi.OO.ui.OptionWidget.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[RadioOptionWidget]
       with Instantiable1[/* config */ ConfigOptions, RadioOptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.OptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.OptionWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.OptionWidget.Props
  
  type Prototype = typings.oojsUi.OO.ui.OptionWidget.Prototype
  
  type Static = typings.oojsUi.OO.ui.OptionWidget.Static
}
