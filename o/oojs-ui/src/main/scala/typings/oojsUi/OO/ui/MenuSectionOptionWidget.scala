package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
import typings.oojsUi.OO.ui.DecoratedOptionWidget.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MenuSectionOptionWidgets are used inside {@link OO.ui.MenuSelectWidget menu select widgets} to
  * group one or more related {@link OO.ui.MenuOptionWidget menu options}. MenuSectionOptionWidgets
  * cannot be highlighted or selected.
  *
  *     var dropdown = new OO.ui.DropdownWidget( {
  *         menu: {
  *             items: [
  *                 new OO.ui.MenuSectionOptionWidget( {
  *                     label: 'Dogs'
  *                 } ),
  *                 new OO.ui.MenuOptionWidget( {
  *                     data: 'corgi',
  *                     label: 'Welsh Corgi'
  *                 } ),
  *                 new OO.ui.MenuOptionWidget( {
  *                     data: 'poodle',
  *                     label: 'Standard Poodle'
  *                 } ),
  *                 new OO.ui.MenuSectionOptionWidget( {
  *                     label: 'Cats'
  *                 } ),
  *                 new OO.ui.MenuOptionWidget( {
  *                     data: 'lion',
  *                     label: 'Lion'
  *                 } )
  *             ]
  *         }
  *     } );
  *     $( document.body ).append( dropdown.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MenuSectionOptionWidget
  */
@js.native
trait MenuSectionOptionWidget
  extends StObject
     with Props
     with Prototype
object MenuSectionOptionWidget {
  
  type ConfigOptions = typings.oojsUi.OO.ui.DecoratedOptionWidget.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MenuSectionOptionWidget]
       with Instantiable1[/* config */ ConfigOptions, MenuSectionOptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.DecoratedOptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.DecoratedOptionWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.DecoratedOptionWidget.Props
  
  type Prototype = typings.oojsUi.OO.ui.DecoratedOptionWidget.Prototype
  
  type Static = typings.oojsUi.OO.ui.DecoratedOptionWidget.Static
}
