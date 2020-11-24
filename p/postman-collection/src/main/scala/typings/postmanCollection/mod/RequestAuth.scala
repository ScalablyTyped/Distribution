package typings.postmanCollection.mod

import typings.postmanCollection.anon.Key
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
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.RequestAuthDefinition because var conflicts: description, disabled, id, name. Inlined `type`, oauth2, hawk, basic, oauth1, apikey, digest, bearer, awsv4, edgegrid, ntlm */ @JSImport("postman-collection", "RequestAuth")
@js.native
class RequestAuth protected () extends Property[RequestAuthDefinition] {
  def this(options: RequestAuthDefinition) = this()
  def this(options: RequestAuthDefinition, parent: Property[PropertyDefinition]) = this()
  def this(options: RequestAuthDefinition, parent: PropertyList[RequestAuth]) = this()
  
  var apikey: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var awsv4: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var basic: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var bearer: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  def clear(`type`: String): Unit = js.native
  
  def current(): js.Any = js.native
  
  var digest: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var edgegrid: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var hawk: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var ntlm: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var oauth1: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var oauth2: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  def parameters(): VariableList = js.native
  
  var `type`: js.UndefOr[
    (NonNullable[
      js.UndefOr[
        oauth2 | hawk | noauth | basic | oauth1 | apikey | digest | bearer | awsv4 | edgegrid | ntlm
      ]
    ]) | apikey | awsv4 | basic | bearer | digest | edgegrid | hawk | noauth | ntlm | oauth1 | oauth2
  ] = js.native
  
  def update(options: js.Array[Key]): Unit = js.native
  def update(options: js.Array[Key], `type`: String): Unit = js.native
  def update(options: Key): Unit = js.native
  def update(options: Key, `type`: String): Unit = js.native
  def update(options: VariableList): Unit = js.native
  def update(options: VariableList, `type`: String): Unit = js.native
  
  def use(`type`: String, options: js.Array[Key]): Unit = js.native
  def use(`type`: String, options: Key): Unit = js.native
  def use(`type`: String, options: VariableList): Unit = js.native
}
/* static members */
@JSImport("postman-collection", "RequestAuth")
@js.native
object RequestAuth extends js.Object {
  
  def isValidType(`type`: js.Any): Boolean = js.native
}
