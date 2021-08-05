package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.maximMazurokGapiClientStorage.anon.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /** An association between a role, which comes with a set of permissions, and members who may assume that role. */
  var bindings: js.UndefOr[js.Array[Condition]] = js.undefined
  
  /** HTTP 1.1  Entity tag for the policy. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The kind of item this is. For policies, this is always storage#policy. This field is ignored on input. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific
    * generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be
    * denoted with #0. This field is ignored on input.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /** The IAM policy format version. */
  var version: js.UndefOr[Double] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setBindings(value: js.Array[Condition]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: Condition*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
