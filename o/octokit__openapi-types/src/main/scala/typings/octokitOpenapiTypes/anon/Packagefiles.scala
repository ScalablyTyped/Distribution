package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packagefiles extends StObject {
  
  var author: Receivedeventsurl
  
  var body: String
  
  var body_html: String
  
  var created_at: String
  
  var description: String
  
  var docker_metadata: js.UndefOr[js.Array[`532` | Null]] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  var html_url: String
  
  var id: Double
  
  var installation_command: String
  
  var manifest: js.UndefOr[String] = js.undefined
  
  var metadata: js.Array[StringDictionary[Any]]
  
  var name: String
  
  var package_files: js.Array[Sha256]
  
  var package_url: String
  
  var prerelease: js.UndefOr[Boolean] = js.undefined
  
  var release: js.UndefOr[Targetcommitish] = js.undefined
  
  var rubygems_metadata: js.UndefOr[js.Array[Homepage]] = js.undefined
  
  var summary: String
  
  var tag_name: js.UndefOr[String] = js.undefined
  
  var target_commitish: String
  
  var target_oid: String
  
  var updated_at: String
  
  var version: String
}
object Packagefiles {
  
  inline def apply(
    author: Receivedeventsurl,
    body: String,
    body_html: String,
    created_at: String,
    description: String,
    html_url: String,
    id: Double,
    installation_command: String,
    metadata: js.Array[StringDictionary[Any]],
    name: String,
    package_files: js.Array[Sha256],
    package_url: String,
    summary: String,
    target_commitish: String,
    target_oid: String,
    updated_at: String,
    version: String
  ): Packagefiles = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installation_command = installation_command.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_files = package_files.asInstanceOf[js.Any], package_url = package_url.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any], target_oid = target_oid.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packagefiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Packagefiles] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Receivedeventsurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDocker_metadata(value: js.Array[`532` | Null]): Self = StObject.set(x, "docker_metadata", value.asInstanceOf[js.Any])
    
    inline def setDocker_metadataUndefined: Self = StObject.set(x, "docker_metadata", js.undefined)
    
    inline def setDocker_metadataVarargs(value: (`532` | Null)*): Self = StObject.set(x, "docker_metadata", js.Array(value*))
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallation_command(value: String): Self = StObject.set(x, "installation_command", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setMetadata(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackage_files(value: js.Array[Sha256]): Self = StObject.set(x, "package_files", value.asInstanceOf[js.Any])
    
    inline def setPackage_filesVarargs(value: Sha256*): Self = StObject.set(x, "package_files", js.Array(value*))
    
    inline def setPackage_url(value: String): Self = StObject.set(x, "package_url", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    inline def setRelease(value: Targetcommitish): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setRubygems_metadata(value: js.Array[Homepage]): Self = StObject.set(x, "rubygems_metadata", value.asInstanceOf[js.Any])
    
    inline def setRubygems_metadataUndefined: Self = StObject.set(x, "rubygems_metadata", js.undefined)
    
    inline def setRubygems_metadataVarargs(value: Homepage*): Self = StObject.set(x, "rubygems_metadata", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setTarget_oid(value: String): Self = StObject.set(x, "target_oid", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
