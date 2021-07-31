package typings.postmanCollection.mod

import typings.postmanCollection.postmanCollectionStrings.apikey
import typings.postmanCollection.postmanCollectionStrings.awsv4
import typings.postmanCollection.postmanCollectionStrings.basic
import typings.postmanCollection.postmanCollectionStrings.bearer
import typings.postmanCollection.postmanCollectionStrings.digest
import typings.postmanCollection.postmanCollectionStrings.edgegrid
import typings.postmanCollection.postmanCollectionStrings.hawk
import typings.postmanCollection.postmanCollectionStrings.noauth
import typings.postmanCollection.postmanCollectionStrings.ntlm
import typings.postmanCollection.postmanCollectionStrings.oauth1
import typings.postmanCollection.postmanCollectionStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAuthDefinition
  extends StObject
     with PropertyDefinition {
  
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
  
  var `type`: js.UndefOr[
    oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
  ] = js.undefined
}
object RequestAuthDefinition {
  
  @scala.inline
  def apply(): RequestAuthDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAuthDefinition]
  }
  
  @scala.inline
  implicit class RequestAuthDefinitionMutableBuilder[Self <: RequestAuthDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApikey(value: js.Array[VariableDefinition]): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
    
    @scala.inline
    def setApikeyVarargs(value: VariableDefinition*): Self = StObject.set(x, "apikey", js.Array(value :_*))
    
    @scala.inline
    def setAwsv4(value: js.Array[VariableDefinition]): Self = StObject.set(x, "awsv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsv4Undefined: Self = StObject.set(x, "awsv4", js.undefined)
    
    @scala.inline
    def setAwsv4Varargs(value: VariableDefinition*): Self = StObject.set(x, "awsv4", js.Array(value :_*))
    
    @scala.inline
    def setBasic(value: js.Array[VariableDefinition]): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    @scala.inline
    def setBasicVarargs(value: VariableDefinition*): Self = StObject.set(x, "basic", js.Array(value :_*))
    
    @scala.inline
    def setBearer(value: js.Array[VariableDefinition]): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
    
    @scala.inline
    def setBearerVarargs(value: VariableDefinition*): Self = StObject.set(x, "bearer", js.Array(value :_*))
    
    @scala.inline
    def setDigest(value: js.Array[VariableDefinition]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setDigestVarargs(value: VariableDefinition*): Self = StObject.set(x, "digest", js.Array(value :_*))
    
    @scala.inline
    def setEdgegrid(value: js.Array[VariableDefinition]): Self = StObject.set(x, "edgegrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgegridUndefined: Self = StObject.set(x, "edgegrid", js.undefined)
    
    @scala.inline
    def setEdgegridVarargs(value: VariableDefinition*): Self = StObject.set(x, "edgegrid", js.Array(value :_*))
    
    @scala.inline
    def setHawk(value: js.Array[VariableDefinition]): Self = StObject.set(x, "hawk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHawkUndefined: Self = StObject.set(x, "hawk", js.undefined)
    
    @scala.inline
    def setHawkVarargs(value: VariableDefinition*): Self = StObject.set(x, "hawk", js.Array(value :_*))
    
    @scala.inline
    def setNtlm(value: js.Array[VariableDefinition]): Self = StObject.set(x, "ntlm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNtlmUndefined: Self = StObject.set(x, "ntlm", js.undefined)
    
    @scala.inline
    def setNtlmVarargs(value: VariableDefinition*): Self = StObject.set(x, "ntlm", js.Array(value :_*))
    
    @scala.inline
    def setOauth1(value: js.Array[VariableDefinition]): Self = StObject.set(x, "oauth1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth1Undefined: Self = StObject.set(x, "oauth1", js.undefined)
    
    @scala.inline
    def setOauth1Varargs(value: VariableDefinition*): Self = StObject.set(x, "oauth1", js.Array(value :_*))
    
    @scala.inline
    def setOauth2(value: js.Array[VariableDefinition]): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
    
    @scala.inline
    def setOauth2Varargs(value: VariableDefinition*): Self = StObject.set(x, "oauth2", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
