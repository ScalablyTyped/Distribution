package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHit extends StObject {
  
  // The name of the content source that the externalItem is part of.
  var contentSource: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see
    * hitId format.
    */
  var hitId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The rank or the order of the result.
  var rank: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var resource: js.UndefOr[NullableOption[Entity]] = js.undefined
  
  /**
    * ID of the result template used to render the search result. This ID must map to a display layout in the resultTemplates
    * dictionary that is also included in the searchResponse.
    */
  var resultTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A summary of the result, if a summary is available.
  var summary: js.UndefOr[NullableOption[String]] = js.undefined
}
object SearchHit {
  
  inline def apply(): SearchHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchHit] (val x: Self) extends AnyVal {
    
    inline def setContentSource(value: NullableOption[String]): Self = StObject.set(x, "contentSource", value.asInstanceOf[js.Any])
    
    inline def setContentSourceNull: Self = StObject.set(x, "contentSource", null)
    
    inline def setContentSourceUndefined: Self = StObject.set(x, "contentSource", js.undefined)
    
    inline def setHitId(value: NullableOption[String]): Self = StObject.set(x, "hitId", value.asInstanceOf[js.Any])
    
    inline def setHitIdNull: Self = StObject.set(x, "hitId", null)
    
    inline def setHitIdUndefined: Self = StObject.set(x, "hitId", js.undefined)
    
    inline def setRank(value: NullableOption[Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankNull: Self = StObject.set(x, "rank", null)
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResultTemplateId(value: NullableOption[String]): Self = StObject.set(x, "resultTemplateId", value.asInstanceOf[js.Any])
    
    inline def setResultTemplateIdNull: Self = StObject.set(x, "resultTemplateId", null)
    
    inline def setResultTemplateIdUndefined: Self = StObject.set(x, "resultTemplateId", js.undefined)
    
    inline def setSummary(value: NullableOption[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
