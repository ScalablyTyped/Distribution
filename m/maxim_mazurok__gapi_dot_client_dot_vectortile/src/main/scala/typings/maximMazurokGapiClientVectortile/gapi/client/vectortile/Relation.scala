package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relation extends StObject {
  
  /** Zero-based index to look up the related feature from the list of features in the tile. */
  var relatedFeatureIndex: js.UndefOr[Double] = js.undefined
  
  /** Relation type between the origin feature to the related feature. */
  var relationType: js.UndefOr[String] = js.undefined
}
object Relation {
  
  inline def apply(): Relation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Relation] (val x: Self) extends AnyVal {
    
    inline def setRelatedFeatureIndex(value: Double): Self = StObject.set(x, "relatedFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setRelatedFeatureIndexUndefined: Self = StObject.set(x, "relatedFeatureIndex", js.undefined)
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
  }
}
