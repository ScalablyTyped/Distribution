package typings.oojsUi.OO.ui.mixin

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojsUi.OO.ui.PopupWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PopupElement is mixed into other classes to generate a {@link OO.ui.PopupWidget popup widget}.
  * A popup is a container for content. It is overlaid and positioned absolutely. By default, each
  * popup has an anchor, which is an arrow-like protrusion that points toward the popup’s origin.
  * See {@link OO.ui.PopupWidget PopupWidget} for an example.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.mixin.PopupElement
  */
trait PopupElement extends StObject {
  
  /**
    * Get popup.
    *
    * @return Popup widget
    */
  def getPopup(): PopupWidget
}
object PopupElement {
  
  inline def apply(getPopup: () => PopupWidget): PopupElement = {
    val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction0(getPopup))
    __obj.asInstanceOf[PopupElement]
  }
  
  trait ConfigOptions extends StObject {
    
    /** Configuration to pass to popup */
    var popup: js.UndefOr[typings.oojsUi.OO.ui.PopupWidget.ConfigOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setPopup(value: typings.oojsUi.OO.ui.PopupWidget.ConfigOptions): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[PopupElement]
       with Instantiable1[/* config */ ConfigOptions, PopupElement]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupElement] (val x: Self) extends AnyVal {
    
    inline def setGetPopup(value: () => PopupWidget): Self = StObject.set(x, "getPopup", js.Any.fromFunction0(value))
  }
}
