package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStartPosition extends StObject {
  
  /**
    * Same as {@link left}, but as a relative value between the left and right page margin:
    * 0 corresponds with the left page margin, 1 corresponds with the right page margin.
    */
  var horizontalRatio: Double
  
  /** Horizontal start position from the left edge of the page in `pt`. */
  var left: Double
  
  /** Height of the page in `pt`, with the vertical page margins subtracted. */
  var pageInnerHeight: Double
  
  /** Width of the page in `pt`, with the horizontal page margins subtracted. */
  var pageInnerWidth: Double
  
  /** Page number (starting from 1) the node starts on. */
  var pageNumber: Double
  
  /** Orientation of the page the node starts on. */
  var pageOrientation: PageOrientation
  
  /** Vertical start position from the top of the page in `pt`. */
  var top: Double
  
  /**
    * Same as {@link top}, but as a relative value between the top and bottom page margin:
    * 0 corresponds with the top page margin, 1 corresponds with the bottom page margin.
    */
  var verticalRatio: Double
}
object NodeStartPosition {
  
  inline def apply(
    horizontalRatio: Double,
    left: Double,
    pageInnerHeight: Double,
    pageInnerWidth: Double,
    pageNumber: Double,
    pageOrientation: PageOrientation,
    top: Double,
    verticalRatio: Double
  ): NodeStartPosition = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageInnerHeight = pageInnerHeight.asInstanceOf[js.Any], pageInnerWidth = pageInnerWidth.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStartPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeStartPosition] (val x: Self) extends AnyVal {
    
    inline def setHorizontalRatio(value: Double): Self = StObject.set(x, "horizontalRatio", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setPageInnerHeight(value: Double): Self = StObject.set(x, "pageInnerHeight", value.asInstanceOf[js.Any])
    
    inline def setPageInnerWidth(value: Double): Self = StObject.set(x, "pageInnerWidth", value.asInstanceOf[js.Any])
    
    inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setVerticalRatio(value: Double): Self = StObject.set(x, "verticalRatio", value.asInstanceOf[js.Any])
  }
}
