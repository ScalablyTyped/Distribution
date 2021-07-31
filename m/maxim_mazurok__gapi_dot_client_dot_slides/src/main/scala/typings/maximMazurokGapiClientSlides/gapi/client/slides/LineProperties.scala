package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineProperties extends StObject {
  
  /** The dash style of the line. */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /** The style of the arrow at the end of the line. */
  var endArrow: js.UndefOr[String] = js.undefined
  
  /** The connection at the end of the line. If unset, there is no connection. Only lines with a Type indicating it is a "connector" can have an `end_connection`. */
  var endConnection: js.UndefOr[LineConnection] = js.undefined
  
  /** The fill of the line. The default line fill matches the defaults for new lines created in the Slides editor. */
  var lineFill: js.UndefOr[LineFill] = js.undefined
  
  /** The hyperlink destination of the line. If unset, there is no link. */
  var link: js.UndefOr[Link] = js.undefined
  
  /** The style of the arrow at the beginning of the line. */
  var startArrow: js.UndefOr[String] = js.undefined
  
  /** The connection at the beginning of the line. If unset, there is no connection. Only lines with a Type indicating it is a "connector" can have a `start_connection`. */
  var startConnection: js.UndefOr[LineConnection] = js.undefined
  
  /** The thickness of the line. */
  var weight: js.UndefOr[Dimension] = js.undefined
}
object LineProperties {
  
  @scala.inline
  def apply(): LineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineProperties]
  }
  
  @scala.inline
  implicit class LinePropertiesMutableBuilder[Self <: LineProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndArrowUndefined: Self = StObject.set(x, "endArrow", js.undefined)
    
    @scala.inline
    def setEndConnection(value: LineConnection): Self = StObject.set(x, "endConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndConnectionUndefined: Self = StObject.set(x, "endConnection", js.undefined)
    
    @scala.inline
    def setLineFill(value: LineFill): Self = StObject.set(x, "lineFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineFillUndefined: Self = StObject.set(x, "lineFill", js.undefined)
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartArrowUndefined: Self = StObject.set(x, "startArrow", js.undefined)
    
    @scala.inline
    def setStartConnection(value: LineConnection): Self = StObject.set(x, "startConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartConnectionUndefined: Self = StObject.set(x, "startConnection", js.undefined)
    
    @scala.inline
    def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
