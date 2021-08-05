package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerVersion extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The built-in variables in the container that this version was taken from. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
  
  /** The clients in the container that this version was taken from. */
  var client: js.UndefOr[js.Array[Client]] = js.undefined
  
  /** The container that this version was taken from. */
  var container: js.UndefOr[Container] = js.undefined
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  
  /** The Container Version ID uniquely identifies the GTM Container Version. */
  var containerVersionId: js.UndefOr[String] = js.undefined
  
  /** The custom templates in the container that this version was taken from. */
  var customTemplate: js.UndefOr[js.Array[CustomTemplate]] = js.undefined
  
  /** A value of true indicates this container version has been deleted. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Container version description. @mutable tagmanager.accounts.containers.versions.update */
  var description: js.UndefOr[String] = js.undefined
  
  /** The fingerprint of the GTM Container Version as computed at storage time. This value is recomputed whenever the container version is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** The folders in the container that this version was taken from. */
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  
  /** Container version display name. @mutable tagmanager.accounts.containers.versions.update */
  var name: js.UndefOr[String] = js.undefined
  
  /** GTM ContainerVersions's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** The tags in the container that this version was taken from. */
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /** The triggers in the container that this version was taken from. */
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  
  /** The variables in the container that this version was taken from. */
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
  
  /** The zones in the container that this version was taken from. */
  var zone: js.UndefOr[js.Array[Zone]] = js.undefined
}
object ContainerVersion {
  
  inline def apply(): ContainerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerVersion]
  }
  
  extension [Self <: ContainerVersion](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    inline def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
    
    inline def setClient(value: js.Array[Client]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClientVarargs(value: Client*): Self = StObject.set(x, "client", js.Array(value :_*))
    
    inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    inline def setCustomTemplate(value: js.Array[CustomTemplate]): Self = StObject.set(x, "customTemplate", value.asInstanceOf[js.Any])
    
    inline def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
    
    inline def setCustomTemplateVarargs(value: CustomTemplate*): Self = StObject.set(x, "customTemplate", js.Array(value :_*))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFolder(value: js.Array[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setFolderVarargs(value: Folder*): Self = StObject.set(x, "folder", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTag(value: js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    inline def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    inline def setVariable(value: js.Array[Variable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: Variable*): Self = StObject.set(x, "variable", js.Array(value :_*))
    
    inline def setZone(value: js.Array[Zone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    
    inline def setZoneVarargs(value: Zone*): Self = StObject.set(x, "zone", js.Array(value :_*))
  }
}
