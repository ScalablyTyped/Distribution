package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Containermetadata extends StObject {
  
  /** User */
  var author: js.UndefOr[Deleted | Null] = js.undefined
  
  var body: js.UndefOr[String | (Record[String, scala.Nothing])] = js.undefined
  
  var body_html: js.UndefOr[String] = js.undefined
  
  var container_metadata: js.UndefOr[Manifest | Null] = js.undefined
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var docker_metadata: js.UndefOr[js.Array[`454`]] = js.undefined
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var installation_command: String
  
  var manifest: js.UndefOr[String] = js.undefined
  
  var metadata: js.Array[StringDictionary[Any]]
  
  var name: String
  
  var npm_metadata: js.UndefOr[Bin | Null] = js.undefined
  
  var nuget_metadata: js.UndefOr[js.Array[IdNameValue] | Null] = js.undefined
  
  var package_files: js.Array[Md5]
  
  var package_url: js.UndefOr[String] = js.undefined
  
  var prerelease: js.UndefOr[Boolean] = js.undefined
  
  var release: js.UndefOr[Prerelease] = js.undefined
  
  var rubygems_metadata: js.UndefOr[js.Array[Homepage]] = js.undefined
  
  var source_url: js.UndefOr[String] = js.undefined
  
  var summary: String
  
  var tag_name: js.UndefOr[String] = js.undefined
  
  var target_commitish: js.UndefOr[String] = js.undefined
  
  var target_oid: js.UndefOr[String] = js.undefined
  
  var updated_at: js.UndefOr[String] = js.undefined
  
  var version: String
}
object Containermetadata {
  
  inline def apply(
    description: String,
    html_url: String,
    id: Double,
    installation_command: String,
    metadata: js.Array[StringDictionary[Any]],
    name: String,
    package_files: js.Array[Md5],
    summary: String,
    version: String
  ): Containermetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installation_command = installation_command.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_files = package_files.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Containermetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Containermetadata] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Deleted): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBody(value: String | (Record[String, scala.Nothing])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setContainer_metadata(value: Manifest): Self = StObject.set(x, "container_metadata", value.asInstanceOf[js.Any])
    
    inline def setContainer_metadataNull: Self = StObject.set(x, "container_metadata", null)
    
    inline def setContainer_metadataUndefined: Self = StObject.set(x, "container_metadata", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDocker_metadata(value: js.Array[`454`]): Self = StObject.set(x, "docker_metadata", value.asInstanceOf[js.Any])
    
    inline def setDocker_metadataUndefined: Self = StObject.set(x, "docker_metadata", js.undefined)
    
    inline def setDocker_metadataVarargs(value: `454`*): Self = StObject.set(x, "docker_metadata", js.Array(value*))
    
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
    
    inline def setNpm_metadata(value: Bin): Self = StObject.set(x, "npm_metadata", value.asInstanceOf[js.Any])
    
    inline def setNpm_metadataNull: Self = StObject.set(x, "npm_metadata", null)
    
    inline def setNpm_metadataUndefined: Self = StObject.set(x, "npm_metadata", js.undefined)
    
    inline def setNuget_metadata(value: js.Array[IdNameValue]): Self = StObject.set(x, "nuget_metadata", value.asInstanceOf[js.Any])
    
    inline def setNuget_metadataNull: Self = StObject.set(x, "nuget_metadata", null)
    
    inline def setNuget_metadataUndefined: Self = StObject.set(x, "nuget_metadata", js.undefined)
    
    inline def setNuget_metadataVarargs(value: IdNameValue*): Self = StObject.set(x, "nuget_metadata", js.Array(value*))
    
    inline def setPackage_files(value: js.Array[Md5]): Self = StObject.set(x, "package_files", value.asInstanceOf[js.Any])
    
    inline def setPackage_filesVarargs(value: Md5*): Self = StObject.set(x, "package_files", js.Array(value*))
    
    inline def setPackage_url(value: String): Self = StObject.set(x, "package_url", value.asInstanceOf[js.Any])
    
    inline def setPackage_urlUndefined: Self = StObject.set(x, "package_url", js.undefined)
    
    inline def setPrerelease(value: Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    
    inline def setRelease(value: Prerelease): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setRubygems_metadata(value: js.Array[Homepage]): Self = StObject.set(x, "rubygems_metadata", value.asInstanceOf[js.Any])
    
    inline def setRubygems_metadataUndefined: Self = StObject.set(x, "rubygems_metadata", js.undefined)
    
    inline def setRubygems_metadataVarargs(value: Homepage*): Self = StObject.set(x, "rubygems_metadata", js.Array(value*))
    
    inline def setSource_url(value: String): Self = StObject.set(x, "source_url", value.asInstanceOf[js.Any])
    
    inline def setSource_urlUndefined: Self = StObject.set(x, "source_url", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
    
    inline def setTarget_commitish(value: String): Self = StObject.set(x, "target_commitish", value.asInstanceOf[js.Any])
    
    inline def setTarget_commitishUndefined: Self = StObject.set(x, "target_commitish", js.undefined)
    
    inline def setTarget_oid(value: String): Self = StObject.set(x, "target_oid", value.asInstanceOf[js.Any])
    
    inline def setTarget_oidUndefined: Self = StObject.set(x, "target_oid", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
