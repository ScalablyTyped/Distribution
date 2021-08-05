package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedObjectPositioning extends StObject {
  
  /** The layout of this positioned object. */
  var layout: js.UndefOr[String] = js.undefined
  
  /**
    * The offset of the left edge of the positioned object relative to the beginning of the Paragraph it is tethered to. The exact positioning of the object can depend on other content in
    * the document and the document's styling.
    */
  var leftOffset: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The offset of the top edge of the positioned object relative to the beginning of the Paragraph it is tethered to. The exact positioning of the object can depend on other content in
    * the document and the document's styling.
    */
  var topOffset: js.UndefOr[Dimension] = js.undefined
}
object PositionedObjectPositioning {
  
  inline def apply(): PositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPositioning]
  }
  
  extension [Self <: PositionedObjectPositioning](x: Self) {
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLeftOffset(value: Dimension): Self = StObject.set(x, "leftOffset", value.asInstanceOf[js.Any])
    
    inline def setLeftOffsetUndefined: Self = StObject.set(x, "leftOffset", js.undefined)
    
    inline def setTopOffset(value: Dimension): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
  }
}
