package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.Element.Props
import typings.oojsUi.OO.ui.PanelLayout.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PanelLayouts expand to cover the entire area of their parent. They can be configured with
  * scrolling, padding, and a frame, and are often used together with
  * {@link OO.ui.StackLayout StackLayouts}.
  *
  *     // Example of a panel layout
  *     var panel = new OO.ui.PanelLayout( {
  *         expanded: false,
  *         framed: true,
  *         padded: true,
  *         $content: $( '<p>A panel layout with padding and a frame.</p>' )
  *     } );
  *     $( document.body ).append( panel.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.PanelLayout
  */
@js.native
trait PanelLayout
  extends StObject
     with Props
     with Prototype
object PanelLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions {
    
    /** Expand the panel to fill the entire parent element. */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /** Render the panel with a frame to visually separate it from outside content. */
    var framed: js.UndefOr[Boolean] = js.undefined
    
    /** Add padding between the content and the edges of the panel. */
    var padded: js.UndefOr[Boolean] = js.undefined
    
    /** Allow vertical scrolling */
    var scrollable: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFramed(value: Boolean): Self = StObject.set(x, "framed", value.asInstanceOf[js.Any])
      
      inline def setFramedUndefined: Self = StObject.set(x, "framed", js.undefined)
      
      inline def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[PanelLayout]
       with Instantiable1[/* config */ ConfigOptions, PanelLayout] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Layout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Layout.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.Layout.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Layout.Prototype {
    
    /**
      * Focus the panel layout
      *
      * The default implementation just focuses the first focusable element in the panel
      */
    def focus(): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Layout.Static
}
