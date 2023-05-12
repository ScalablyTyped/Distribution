package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.OptionWidget.Props
import typings.oojsUi.OO.ui.OptionWidget.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TabOptionWidget is an item in a {@link OO.ui.TabSelectWidget TabSelectWidget}.
  *
  * Currently, this class is only used by {@link OO.ui.IndexLayout index layouts}, which contain
  * {@link OO.ui.TabPanelLayout tab panel layouts}. See {@link OO.ui.IndexLayout IndexLayout}
  * for an example.
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.TabOptionWidget
  */
@js.native
trait TabOptionWidget
  extends StObject
     with Props
     with Prototype
object TabOptionWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.OptionWidget.ConfigOptions {
    
    /** Hyperlink to add to TabOption. Mostly used in OOUI PHP. */
    var href: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TabOptionWidget]
       with Instantiable1[/* config */ ConfigOptions, TabOptionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.OptionWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.OptionWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.OptionWidget.Props
  
  type Prototype = typings.oojsUi.OO.ui.OptionWidget.Prototype
  
  type Static = typings.oojsUi.OO.ui.OptionWidget.Static
}
