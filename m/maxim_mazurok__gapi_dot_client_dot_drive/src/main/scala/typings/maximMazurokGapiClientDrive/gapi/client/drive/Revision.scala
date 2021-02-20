package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Revision extends StObject {
  
  /** Links for exporting Docs Editors files to specific formats. */
  var exportLinks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.Revision with TopLevel[js.Any]
  ] = js.native
  
  /** The ID of the revision. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether to keep this revision forever, even if it is no longer the head revision. If not set, the revision will be automatically purged 30 days after newer content is uploaded. This
    * can be set on a maximum of 200 revisions for a file.
    * This field is only applicable to files with binary content in Drive.
    */
  var keepForever: js.UndefOr[Boolean] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#revision". */
  var kind: js.UndefOr[String] = js.native
  
  /** The last user to modify this revision. */
  var lastModifyingUser: js.UndefOr[User] = js.native
  
  /** The MD5 checksum of the revision's content. This is only applicable to files with binary content in Drive. */
  var md5Checksum: js.UndefOr[String] = js.native
  
  /** The MIME type of the revision. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The last time the revision was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[String] = js.native
  
  /** The original filename used to create this revision. This is only applicable to files with binary content in Drive. */
  var originalFilename: js.UndefOr[String] = js.native
  
  /** Whether subsequent revisions will be automatically republished. This is only applicable to Docs Editors files. */
  var publishAuto: js.UndefOr[Boolean] = js.native
  
  /** Whether this revision is published. This is only applicable to Docs Editors files. */
  var published: js.UndefOr[Boolean] = js.native
  
  /** A link to the published revision. This is only populated for Google Sites files. */
  var publishedLink: js.UndefOr[String] = js.native
  
  /** Whether this revision is published outside the domain. This is only applicable to Docs Editors files. */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  
  /** The size of the revision's content in bytes. This is only applicable to files with binary content in Drive. */
  var size: js.UndefOr[String] = js.native
}
object Revision {
  
  @scala.inline
  def apply(): Revision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportLinks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.Revision with TopLevel[js.Any]
    ): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = StObject.set(x, "keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepForeverUndefined: Self = StObject.set(x, "keepForever", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifyingUser(value: User): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
    
    @scala.inline
    def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    @scala.inline
    def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
    
    @scala.inline
    def setPublishAuto(value: Boolean): Self = StObject.set(x, "publishAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishAutoUndefined: Self = StObject.set(x, "publishAuto", js.undefined)
    
    @scala.inline
    def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedLink(value: String): Self = StObject.set(x, "publishedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedLinkUndefined: Self = StObject.set(x, "publishedLink", js.undefined)
    
    @scala.inline
    def setPublishedOutsideDomain(value: Boolean): Self = StObject.set(x, "publishedOutsideDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedOutsideDomainUndefined: Self = StObject.set(x, "publishedOutsideDomain", js.undefined)
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
