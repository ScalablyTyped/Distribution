package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
  */
  trait MetadataSubType extends StObject
  object MetadataSubType {
    
    @scala.inline
    def boolean: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    @scala.inline
    def number: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    @scala.inline
    def `object`: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    @scala.inline
    def string: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
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
    
    @scala.inline
    def array: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array = "array".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array]
    
    @scala.inline
    def boolean: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    @scala.inline
    def number: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    @scala.inline
    def `object`: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    @scala.inline
    def string: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard
    - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
  */
  trait MetadataVisibility extends StObject
  object MetadataVisibility {
    
    @scala.inline
    def api: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api = "api".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api]
    
    @scala.inline
    def dashboard: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard = "dashboard".asInstanceOf[typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard]
    
    @scala.inline
    def worker: worker_ = "worker".asInstanceOf[worker_]
  }
  
  trait OnfleetMetadata extends StObject {
    
    var name: String
    
    var subtype: js.UndefOr[MetadataSubType] = js.undefined
    
    var `type`: MetadataType
    
    var value: js.Any
    
    var visibility: js.UndefOr[js.Array[MetadataVisibility]] = js.undefined
  }
  object OnfleetMetadata {
    
    @scala.inline
    def apply(name: String, `type`: MetadataType, value: js.Any): OnfleetMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetMetadata]
    }
    
    @scala.inline
    implicit class OnfleetMetadataMutableBuilder[Self <: OnfleetMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtype(value: MetadataSubType): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      
      @scala.inline
      def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibility(value: js.Array[MetadataVisibility]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setVisibilityVarargs(value: MetadataVisibility*): Self = StObject.set(x, "visibility", js.Array(value :_*))
    }
  }
}
