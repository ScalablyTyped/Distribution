package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  type MatchMetadata[T] = js.Function1[/* obj */ T, js.Promise[js.Array[MatchMetadataResult]]]
  
  trait MatchMetadataResult extends StObject {
    
    var id: String
    
    var metadata: js.Array[OnfleetMetadata]
  }
  object MatchMetadataResult {
    
    inline def apply(id: String, metadata: js.Array[OnfleetMetadata]): MatchMetadataResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchMetadataResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchMetadataResult] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
  */
  trait MetadataSubType extends StObject
  object MetadataSubType {
    
    inline def boolean: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    inline def number: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    inline def `object`: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    inline def string: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array
  */
  trait MetadataType extends StObject
  object MetadataType {
    
    inline def array: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array = "array".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array]
    
    inline def boolean: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    inline def number: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    inline def `object`: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    inline def string: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
  */
  trait MetadataVisibility extends StObject
  object MetadataVisibility {
    
    inline def api: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api = "api".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api]
    
    inline def dashboard: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard = "dashboard".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard]
    
    inline def worker: worker_ = "worker".asInstanceOf[worker_]
  }
  
  trait OnfleetMetadata extends StObject {
    
    var name: String
    
    var subtype: js.UndefOr[MetadataSubType] = js.undefined
    
    var `type`: MetadataType
    
    var value: Any
    
    var visibility: js.UndefOr[js.Array[MetadataVisibility]] = js.undefined
  }
  object OnfleetMetadata {
    
    inline def apply(name: String, `type`: MetadataType, value: Any): OnfleetMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnfleetMetadata] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: MetadataSubType): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      
      inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: js.Array[MetadataVisibility]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibilityVarargs(value: MetadataVisibility*): Self = StObject.set(x, "visibility", js.Array(value*))
    }
  }
}
