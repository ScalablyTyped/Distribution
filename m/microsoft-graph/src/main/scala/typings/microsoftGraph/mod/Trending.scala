package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trending
  extends StObject
     with Entity {
  
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Used for navigating to the trending document.
  var resource: js.UndefOr[NullableOption[Entity]] = js.undefined
  
  // Reference properties of the trending document, such as the url and type of the document.
  var resourceReference: js.UndefOr[NullableOption[ResourceReference]] = js.undefined
  
  // Properties that you can use to visualize the document in your experience.
  var resourceVisualization: js.UndefOr[NullableOption[ResourceVisualization]] = js.undefined
  
  /**
    * Value indicating how much the document is currently trending. The larger the number, the more the document is currently
    * trending around the user (the more relevant it is). Returned documents are sorted by this value.
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object Trending {
  
  inline def apply(): Trending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trending] (val x: Self) extends AnyVal {
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    inline def setResourceReferenceNull: Self = StObject.set(x, "resourceReference", null)
    
    inline def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVisualization(value: NullableOption[ResourceVisualization]): Self = StObject.set(x, "resourceVisualization", value.asInstanceOf[js.Any])
    
    inline def setResourceVisualizationNull: Self = StObject.set(x, "resourceVisualization", null)
    
    inline def setResourceVisualizationUndefined: Self = StObject.set(x, "resourceVisualization", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
