package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.OO.EventEmitter
import typings.oojsUi.OO.ui.Element.Props
import typings.oojsUi.OO.ui.Layout.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layouts are containers for elements and are used to arrange other widgets of arbitrary type in
  * a way that is centrally controlled and can be updated dynamically. Layouts can be, and usually
  * are, combined.
  * See {@link OO.ui.FieldsetLayout FieldsetLayout}, {@link OO.ui.FieldLayout FieldLayout},
  * {@link OO.ui.FormLayout FormLayout}, {@link OO.ui.PanelLayout PanelLayout},
  * {@link OO.ui.StackLayout StackLayout}, {@link OO.ui.PageLayout PageLayout},
  * {@link OO.ui.HorizontalLayout HorizontalLayout}, and {@link OO.ui.BookletLayout BookletLayout}
  * for more information and examples.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Layout
  */
@js.native
trait Layout
  extends StObject
     with Props
     with Prototype
object Layout {
  
  type ConfigOptions = typings.oojsUi.OO.ui.Element.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[Layout]
       with Instantiable1[/* config */ ConfigOptions, Layout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Element.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Element.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.Element.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Element.Prototype
       with EventEmitter {
    
    /**
      * Reset scroll offsets
      *
      * @return The layout, for chaining
      */
    def resetScroll(): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Element.Static
}
