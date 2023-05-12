package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.CheckboxMultioptionWidget.Prototype
import typings.oojsUi.OO.ui.MultioptionWidget.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CheckboxMultioptionWidget is an option widget that looks like a checkbox.
  * The class is used with OO.ui.CheckboxMultiselectWidget to create a selection of checkbox options.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options#Button_selects_and_option)
  * for more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.CheckboxMultioptionWidget
  */
@js.native
trait CheckboxMultioptionWidget
  extends StObject
     with Props
     with Prototype
object CheckboxMultioptionWidget {
  
  type ConfigOptions = typings.oojsUi.OO.ui.MultioptionWidget.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[CheckboxMultioptionWidget]
       with Instantiable1[/* config */ ConfigOptions, CheckboxMultioptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.MultioptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.MultioptionWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.MultioptionWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.MultioptionWidget.Prototype {
    
    /**
      * Focus the widget.
      */
    def focus(): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.MultioptionWidget.Static
}
