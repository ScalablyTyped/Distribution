package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LayoutVariant extends StObject
/**
  *
  * Represents the type of layout.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.LayoutVariant")
@js.native
object LayoutVariant extends StObject {
  
  /**
    *
    * Use Flowchart with BottomToTop orientation
    *
    */
  @js.native
  sealed trait flowchart_BottomToTop
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use Flowchart with LeftToRight orientation
    *
    */
  @js.native
  sealed trait flowchart_LeftToRight
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use Flowchart with RightToLeft orientation
    *
    */
  @js.native
  sealed trait flowchart_RightToLeft
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use Flowchart with TopToBottom orientation
    *
    */
  @js.native
  sealed trait flowchart_TopToBottom
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use the Page default layout
    *
    */
  @js.native
  sealed trait pageDefault
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Invalid layout
    *
    */
  @js.native
  sealed trait unknown
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use WideTree with DownThenLeft orientation
    *
    */
  @js.native
  sealed trait wideTree_DownThenLeft
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use WideTree with DownThenRight orientation
    *
    */
  @js.native
  sealed trait wideTree_DownThenRight
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use WideTree with LeftThenDown orientation
    *
    */
  @js.native
  sealed trait wideTree_LeftThenDown
    extends StObject
       with LayoutVariant
  
  /**
    *
    * Use WideTree with RightThenDown orientation
    *
    */
  @js.native
  sealed trait wideTree_RightThenDown
    extends StObject
       with LayoutVariant
}
