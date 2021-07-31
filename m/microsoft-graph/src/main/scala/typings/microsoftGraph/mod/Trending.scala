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
  
  @scala.inline
  def apply(): Trending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trending]
  }
  
  @scala.inline
  implicit class TrendingMutableBuilder[Self <: Trending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceReference(value: NullableOption[ResourceReference]): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceReferenceNull: Self = StObject.set(x, "resourceReference", null)
    
    @scala.inline
    def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResourceVisualization(value: NullableOption[ResourceVisualization]): Self = StObject.set(x, "resourceVisualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVisualizationNull: Self = StObject.set(x, "resourceVisualization", null)
    
    @scala.inline
    def setResourceVisualizationUndefined: Self = StObject.set(x, "resourceVisualization", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
