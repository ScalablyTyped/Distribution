package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MenuOptionWidget is an option widget that looks like a menu item. The class is used with
  * OO.ui.MenuSelectWidget to create a menu of mutually exclusive options. Please see
  * the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options#Menu_selects_and_options)
  * for more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MenuOptionWidget
  */
@js.native
trait MenuOptionWidget
  extends StObject
     with Props
     with Prototype
object MenuOptionWidget {
  
  type ConfigOptions = typings.oojsUi.OO.ui.DecoratedOptionWidget.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MenuOptionWidget]
       with Instantiable1[/* config */ ConfigOptions, MenuOptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.DecoratedOptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.DecoratedOptionWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
  
  type Prototype = typings.oojsUi.OO.ui.DecoratedOptionWidget.Prototype
  
  type Static = typings.oojsUi.OO.ui.DecoratedOptionWidget.Static
}
