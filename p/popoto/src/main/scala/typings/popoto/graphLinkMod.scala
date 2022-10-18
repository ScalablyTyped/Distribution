package typings.popoto

import typings.popoto.anon.ReadonlyRELATION0VALUE1SE
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphLinkMod {
  
  trait Link extends StObject {
    
    /**
      * Defines the different type of link.
      * RELATION is a relation link between two nodes.
      * VALUE is a link between a generic node and a value.
      */
    var LinkTypes: ReadonlyRELATION0VALUE1SE
    
    /**
      * Define whether or not to display path markers.
      */
    var SHOW_MARKER: Boolean
    
    /**
      * Offset added to text displayed on links.
      */
    var TEXT_DY: Double
    
    /**
      * Create new elements.
      */
    def addNewElements(enteringData: js.Array[SVGGElement]): Unit
    
    // Delete all related nodes from this link
    def clickLink(): Unit
    
    // ID of the g element in SVG graph containing all the link elements.
    var gID: String
    
    /**
      * Function called when mouse goes out of the link.
      * This function is used to reinitialize the CSS class of the link and query viewer element.
      */
    def mouseOutLink(): Unit
    
    /**
      * Function called when mouse is over the link.
      * This function is used to change the CSS class on hover of the link and query viewer element.
      *
      * TODO try to introduce event instead of directly access query spans here. This could be used in future extensions.
      */
    def mouseOverLink(): Unit
    
    /**
      * Clean links elements removed from the list.
      */
    def removeElements(exitingData: js.Array[SVGGElement]): Unit
    
    /**
      * Update the links element with data coming from dataModel.links.
      */
    def updateData(): Unit
    
    /**
      * Update all the elements (new + modified)
      */
    def updateElements(): Unit
    
    /**
      * Function to call to update the links after modification in the model.
      * This function will update the graph with all removed, modified or added links using d3.js mechanisms.
      */
    def updateLinks(): Unit
  }
  object Link {
    
    inline def apply(
      LinkTypes: ReadonlyRELATION0VALUE1SE,
      SHOW_MARKER: Boolean,
      TEXT_DY: Double,
      addNewElements: js.Array[SVGGElement] => Unit,
      clickLink: () => Unit,
      gID: String,
      mouseOutLink: () => Unit,
      mouseOverLink: () => Unit,
      removeElements: js.Array[SVGGElement] => Unit,
      updateData: () => Unit,
      updateElements: () => Unit,
      updateLinks: () => Unit
    ): Link = {
      val __obj = js.Dynamic.literal(LinkTypes = LinkTypes.asInstanceOf[js.Any], SHOW_MARKER = SHOW_MARKER.asInstanceOf[js.Any], TEXT_DY = TEXT_DY.asInstanceOf[js.Any], addNewElements = js.Any.fromFunction1(addNewElements), clickLink = js.Any.fromFunction0(clickLink), gID = gID.asInstanceOf[js.Any], mouseOutLink = js.Any.fromFunction0(mouseOutLink), mouseOverLink = js.Any.fromFunction0(mouseOverLink), removeElements = js.Any.fromFunction1(removeElements), updateData = js.Any.fromFunction0(updateData), updateElements = js.Any.fromFunction0(updateElements), updateLinks = js.Any.fromFunction0(updateLinks))
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setAddNewElements(value: js.Array[SVGGElement] => Unit): Self = StObject.set(x, "addNewElements", js.Any.fromFunction1(value))
      
      inline def setClickLink(value: () => Unit): Self = StObject.set(x, "clickLink", js.Any.fromFunction0(value))
      
      inline def setGID(value: String): Self = StObject.set(x, "gID", value.asInstanceOf[js.Any])
      
      inline def setLinkTypes(value: ReadonlyRELATION0VALUE1SE): Self = StObject.set(x, "LinkTypes", value.asInstanceOf[js.Any])
      
      inline def setMouseOutLink(value: () => Unit): Self = StObject.set(x, "mouseOutLink", js.Any.fromFunction0(value))
      
      inline def setMouseOverLink(value: () => Unit): Self = StObject.set(x, "mouseOverLink", js.Any.fromFunction0(value))
      
      inline def setRemoveElements(value: js.Array[SVGGElement] => Unit): Self = StObject.set(x, "removeElements", js.Any.fromFunction1(value))
      
      inline def setSHOW_MARKER(value: Boolean): Self = StObject.set(x, "SHOW_MARKER", value.asInstanceOf[js.Any])
      
      inline def setTEXT_DY(value: Double): Self = StObject.set(x, "TEXT_DY", value.asInstanceOf[js.Any])
      
      inline def setUpdateData(value: () => Unit): Self = StObject.set(x, "updateData", js.Any.fromFunction0(value))
      
      inline def setUpdateElements(value: () => Unit): Self = StObject.set(x, "updateElements", js.Any.fromFunction0(value))
      
      inline def setUpdateLinks(value: () => Unit): Self = StObject.set(x, "updateLinks", js.Any.fromFunction0(value))
    }
  }
}
