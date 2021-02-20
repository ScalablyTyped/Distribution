package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerVersion extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.native
  
  /** The built-in variables in the container that this version was taken from. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
  
  /** The clients in the container that this version was taken from. */
  var client: js.UndefOr[js.Array[Client]] = js.native
  
  /** The container that this version was taken from. */
  var container: js.UndefOr[Container] = js.native
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.native
  
  /** The Container Version ID uniquely identifies the GTM Container Version. */
  var containerVersionId: js.UndefOr[String] = js.native
  
  /** The custom templates in the container that this version was taken from. */
  var customTemplate: js.UndefOr[js.Array[CustomTemplate]] = js.native
  
  /** A value of true indicates this container version has been deleted. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Container version description. @mutable tagmanager.accounts.containers.versions.update */
  var description: js.UndefOr[String] = js.native
  
  /** The fingerprint of the GTM Container Version as computed at storage time. This value is recomputed whenever the container version is modified. */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** The folders in the container that this version was taken from. */
  var folder: js.UndefOr[js.Array[Folder]] = js.native
  
  /** Container version display name. @mutable tagmanager.accounts.containers.versions.update */
  var name: js.UndefOr[String] = js.native
  
  /** GTM ContainerVersions's API relative path. */
  var path: js.UndefOr[String] = js.native
  
  /** The tags in the container that this version was taken from. */
  var tag: js.UndefOr[js.Array[Tag]] = js.native
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /** The triggers in the container that this version was taken from. */
  var trigger: js.UndefOr[js.Array[Trigger]] = js.native
  
  /** The variables in the container that this version was taken from. */
  var variable: js.UndefOr[js.Array[Variable]] = js.native
  
  /** The zones in the container that this version was taken from. */
  var zone: js.UndefOr[js.Array[Zone]] = js.native
}
object ContainerVersion {
  
  @scala.inline
  def apply(): ContainerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerVersion]
  }
  
  @scala.inline
  implicit class ContainerVersionMutableBuilder[Self <: ContainerVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    @scala.inline
    def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
    
    @scala.inline
    def setClient(value: js.Array[Client]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setClientVarargs(value: Client*): Self = StObject.set(x, "client", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    @scala.inline
    def setCustomTemplate(value: js.Array[CustomTemplate]): Self = StObject.set(x, "customTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
    
    @scala.inline
    def setCustomTemplateVarargs(value: CustomTemplate*): Self = StObject.set(x, "customTemplate", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
    
    @scala.inline
    def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    
    @scala.inline
    def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
  }
}
