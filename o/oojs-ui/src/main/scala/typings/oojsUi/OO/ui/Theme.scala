package typings.oojsUi.OO.ui

import typings.oojsUi.anon.Off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Theme logic.
  *
  * ResourceLoader module: `oojs-ui-core`
  */
trait Theme extends StObject {
  
  /**
    * Get the transition duration in milliseconds for dialogs opening/closing
    *
    * The dialog should be fully rendered this many milliseconds after the
    * ready process has executed.
    *
    * @return Transition duration in milliseconds
    */
  def getDialogTransitionDuration(): Double
  
  /**
    * Get a list of classes to be applied to a widget.
    *
    * The 'on' and 'off' lists combined MUST contain keys for all classes the theme adds or removes,
    * otherwise state transitions will not work properly.
    *
    * @param element Element for which to get classes
    * @return Categorized class names with `on` and `off` lists
    */
  def getElementClasses(element: Element): Off
  
  /**
    * Queue {@link updateElementClasses} to be called for this element.
    *
    * @param element Element for which to update classes
    */
  def queueUpdateElementClasses(element: Element): Unit
  
  /**
    * Update CSS classes provided by the theme.
    *
    * For elements with theme logic hooks, this should be called any time there's a state change.
    *
    * @param element Element for which to update classes
    */
  def updateElementClasses(element: Element): Unit
}
object Theme {
  
  inline def apply(
    getDialogTransitionDuration: () => Double,
    getElementClasses: Element => Off,
    queueUpdateElementClasses: Element => Unit,
    updateElementClasses: Element => Unit
  ): Theme = {
    val __obj = js.Dynamic.literal(getDialogTransitionDuration = js.Any.fromFunction0(getDialogTransitionDuration), getElementClasses = js.Any.fromFunction1(getElementClasses), queueUpdateElementClasses = js.Any.fromFunction1(queueUpdateElementClasses), updateElementClasses = js.Any.fromFunction1(updateElementClasses))
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setGetDialogTransitionDuration(value: () => Double): Self = StObject.set(x, "getDialogTransitionDuration", js.Any.fromFunction0(value))
    
    inline def setGetElementClasses(value: Element => Off): Self = StObject.set(x, "getElementClasses", js.Any.fromFunction1(value))
    
    inline def setQueueUpdateElementClasses(value: Element => Unit): Self = StObject.set(x, "queueUpdateElementClasses", js.Any.fromFunction1(value))
    
    inline def setUpdateElementClasses(value: Element => Unit): Self = StObject.set(x, "updateElementClasses", js.Any.fromFunction1(value))
  }
}
