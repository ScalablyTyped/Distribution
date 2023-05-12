package typings.oojsUi.global.OO.ui

import typings.oojsUi.OO.ui.Theme
import typings.oojsUi.anon.Off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("OO.ui.WikimediaUITheme")
@js.native
open class WikimediaUIThemeCls ()
  extends StObject
     with Theme {
  
  /**
    * Get the transition duration in milliseconds for dialogs opening/closing
    *
    * The dialog should be fully rendered this many milliseconds after the
    * ready process has executed.
    *
    * @return Transition duration in milliseconds
    */
  /* CompleteClass */
  override def getDialogTransitionDuration(): Double = js.native
  
  /**
    * Get a list of classes to be applied to a widget.
    *
    * The 'on' and 'off' lists combined MUST contain keys for all classes the theme adds or removes,
    * otherwise state transitions will not work properly.
    *
    * @param element Element for which to get classes
    * @return Categorized class names with `on` and `off` lists
    */
  /* CompleteClass */
  override def getElementClasses(element: typings.oojsUi.OO.ui.Element): Off = js.native
  
  /**
    * Queue {@link updateElementClasses} to be called for this element.
    *
    * @param element Element for which to update classes
    */
  /* CompleteClass */
  override def queueUpdateElementClasses(element: typings.oojsUi.OO.ui.Element): Unit = js.native
  
  /**
    * Update CSS classes provided by the theme.
    *
    * For elements with theme logic hooks, this should be called any time there's a state change.
    *
    * @param element Element for which to update classes
    */
  /* CompleteClass */
  override def updateElementClasses(element: typings.oojsUi.OO.ui.Element): Unit = js.native
}
