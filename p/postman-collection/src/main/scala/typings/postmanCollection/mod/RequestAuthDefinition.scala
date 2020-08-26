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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestAuthDefinition extends PropertyDefinition {
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var `type`: js.UndefOr[
    oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
  ] = js.native
}

object RequestAuthDefinition {
  @scala.inline
  def apply(): RequestAuthDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestAuthDefinition]
  }
  @scala.inline
  implicit class RequestAuthDefinitionOps[Self <: RequestAuthDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApikeyVarargs(value: VariableDefinition*): Self = this.set("apikey", js.Array(value :_*))
    @scala.inline
    def setApikey(value: js.Array[VariableDefinition]): Self = this.set("apikey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApikey: Self = this.set("apikey", js.undefined)
    @scala.inline
    def setAwsv4Varargs(value: VariableDefinition*): Self = this.set("awsv4", js.Array(value :_*))
    @scala.inline
    def setAwsv4(value: js.Array[VariableDefinition]): Self = this.set("awsv4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsv4: Self = this.set("awsv4", js.undefined)
    @scala.inline
    def setBasicVarargs(value: VariableDefinition*): Self = this.set("basic", js.Array(value :_*))
    @scala.inline
    def setBasic(value: js.Array[VariableDefinition]): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setBearerVarargs(value: VariableDefinition*): Self = this.set("bearer", js.Array(value :_*))
    @scala.inline
    def setBearer(value: js.Array[VariableDefinition]): Self = this.set("bearer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearer: Self = this.set("bearer", js.undefined)
    @scala.inline
    def setDigestVarargs(value: VariableDefinition*): Self = this.set("digest", js.Array(value :_*))
    @scala.inline
    def setDigest(value: js.Array[VariableDefinition]): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    @scala.inline
    def setEdgegridVarargs(value: VariableDefinition*): Self = this.set("edgegrid", js.Array(value :_*))
    @scala.inline
    def setEdgegrid(value: js.Array[VariableDefinition]): Self = this.set("edgegrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgegrid: Self = this.set("edgegrid", js.undefined)
    @scala.inline
    def setHawkVarargs(value: VariableDefinition*): Self = this.set("hawk", js.Array(value :_*))
    @scala.inline
    def setHawk(value: js.Array[VariableDefinition]): Self = this.set("hawk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHawk: Self = this.set("hawk", js.undefined)
    @scala.inline
    def setNtlmVarargs(value: VariableDefinition*): Self = this.set("ntlm", js.Array(value :_*))
    @scala.inline
    def setNtlm(value: js.Array[VariableDefinition]): Self = this.set("ntlm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNtlm: Self = this.set("ntlm", js.undefined)
    @scala.inline
    def setOauth1Varargs(value: VariableDefinition*): Self = this.set("oauth1", js.Array(value :_*))
    @scala.inline
    def setOauth1(value: js.Array[VariableDefinition]): Self = this.set("oauth1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth1: Self = this.set("oauth1", js.undefined)
    @scala.inline
    def setOauth2Varargs(value: VariableDefinition*): Self = this.set("oauth2", js.Array(value :_*))
    @scala.inline
    def setOauth2(value: js.Array[VariableDefinition]): Self = this.set("oauth2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth2: Self = this.set("oauth2", js.undefined)
    @scala.inline
    def setType(
      value: oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

