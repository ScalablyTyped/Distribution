package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentSwitcherAnimation extends StObject
@JSImport("sap/ui/unified/library", "ContentSwitcherAnimation")
@js.native
object ContentSwitcherAnimation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentSwitcherAnimation & String] = js.native
  
  /**
    * Content is faded (opacity change).
    */
  @js.native
  sealed trait Fade
    extends StObject
       with ContentSwitcherAnimation
  /* "Fade" */ val Fade: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.Fade & String = js.native
  
  /**
    * No animation. Content is switched instantly.
    */
  @js.native
  sealed trait None
    extends StObject
       with ContentSwitcherAnimation
  /* "None" */ val None: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.None & String = js.native
  
  /**
    * The new content rotates in. (Just like one of those old newspaper-animations.)
    */
  @js.native
  sealed trait Rotate
    extends StObject
       with ContentSwitcherAnimation
  /* "Rotate" */ val Rotate: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.Rotate & String = js.native
  
  /**
    * The new content slides in from the left while the old content slides out to the left at the same time.
    */
  @js.native
  sealed trait SlideOver
    extends StObject
       with ContentSwitcherAnimation
  /* "SlideOver" */ val SlideOver: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.SlideOver & String = js.native
  
  /**
    * The new slides in from the left (to the right).
    */
  @js.native
  sealed trait SlideRight
    extends StObject
       with ContentSwitcherAnimation
  /* "SlideRight" */ val SlideRight: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.SlideRight & String = js.native
  
  /**
    * The new content is "zoomed in" from the center and grows to fill the full content area.
    */
  @js.native
  sealed trait ZoomIn
    extends StObject
       with ContentSwitcherAnimation
  /* "ZoomIn" */ val ZoomIn: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.ZoomIn & String = js.native
  
  /**
    * The old content is "zoomed out", i.e. shrinks to a point at the center of the content area.
    */
  @js.native
  sealed trait ZoomOut
    extends StObject
       with ContentSwitcherAnimation
  /* "ZoomOut" */ val ZoomOut: typings.openui5.sapUiUnifiedLibraryMod.ContentSwitcherAnimation.ZoomOut & String = js.native
}
