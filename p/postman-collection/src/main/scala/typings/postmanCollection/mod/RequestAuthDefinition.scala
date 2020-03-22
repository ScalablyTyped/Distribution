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

trait RequestAuthDefinition extends PropertyDefinition {
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
  def apply(
    apikey: js.Array[VariableDefinition] = null,
    awsv4: js.Array[VariableDefinition] = null,
    basic: js.Array[VariableDefinition] = null,
    bearer: js.Array[VariableDefinition] = null,
    description: String | DescriptionDefinition = null,
    digest: js.Array[VariableDefinition] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    edgegrid: js.Array[VariableDefinition] = null,
    hawk: js.Array[VariableDefinition] = null,
    id: String = null,
    name: String = null,
    ntlm: js.Array[VariableDefinition] = null,
    oauth1: js.Array[VariableDefinition] = null,
    oauth2: js.Array[VariableDefinition] = null,
    `type`: oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm = null
  ): RequestAuthDefinition = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey.asInstanceOf[js.Any])
    if (awsv4 != null) __obj.updateDynamic("awsv4")(awsv4.asInstanceOf[js.Any])
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (bearer != null) __obj.updateDynamic("bearer")(bearer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (edgegrid != null) __obj.updateDynamic("edgegrid")(edgegrid.asInstanceOf[js.Any])
    if (hawk != null) __obj.updateDynamic("hawk")(hawk.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ntlm != null) __obj.updateDynamic("ntlm")(ntlm.asInstanceOf[js.Any])
    if (oauth1 != null) __obj.updateDynamic("oauth1")(oauth1.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAuthDefinition]
  }
}

