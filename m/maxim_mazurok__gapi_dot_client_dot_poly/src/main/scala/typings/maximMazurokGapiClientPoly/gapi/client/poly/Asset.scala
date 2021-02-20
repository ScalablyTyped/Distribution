package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends StObject {
  
  /** The author's publicly visible name. Use this name when giving credit to the author. For more information, see [Licensing](/poly/discover/licensing). */
  var authorName: js.UndefOr[String] = js.native
  
  /** For published assets, the time when the asset was published. For unpublished assets, the time when the asset was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The human-readable description, set by the asset's author. */
  var description: js.UndefOr[String] = js.native
  
  /** The human-readable name, set by the asset's author. */
  var displayName: js.UndefOr[String] = js.native
  
  /** A list of Formats where each format describes one representation of the asset. */
  var formats: js.UndefOr[js.Array[Format]] = js.native
  
  /** Whether this asset has been curated by the Poly team. */
  var isCurated: js.UndefOr[Boolean] = js.native
  
  /** The license under which the author has made the asset available for use, if any. */
  var license: js.UndefOr[String] = js.native
  
  /**
    * Application-defined opaque metadata for this asset. This field is only returned when querying for the signed-in user's own assets, not for public assets. This string is limited to
    * 1K chars. It is up to the creator of the asset to define the format for this string (for example, JSON).
    */
  var metadata: js.UndefOr[String] = js.native
  
  /** The unique identifier for the asset in the form: `assets/{ASSET_ID}`. */
  var name: js.UndefOr[String] = js.native
  
  /** Hints for displaying the asset. Note that these parameters are not immutable; the author of an asset may change them post-publication. */
  var presentationParams: js.UndefOr[PresentationParams] = js.native
  
  /** The remix info for the asset. */
  var remixInfo: js.UndefOr[RemixInfo] = js.native
  
  /** The thumbnail image for the asset. */
  var thumbnail: js.UndefOr[File] = js.native
  
  /**
    * The time when the asset was last modified. For published assets, whose contents are immutable, the update time changes only when metadata properties, such as visibility, are
    * updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /** The visibility of the asset and who can access it. */
  var visibility: js.UndefOr[String] = js.native
}
object Asset {
  
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetMutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Array[Format]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: Format*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setIsCurated(value: Boolean): Self = StObject.set(x, "isCurated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCuratedUndefined: Self = StObject.set(x, "isCurated", js.undefined)
    
    @scala.inline
    def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    @scala.inline
    def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPresentationParams(value: PresentationParams): Self = StObject.set(x, "presentationParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentationParamsUndefined: Self = StObject.set(x, "presentationParams", js.undefined)
    
    @scala.inline
    def setRemixInfo(value: RemixInfo): Self = StObject.set(x, "remixInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemixInfoUndefined: Self = StObject.set(x, "remixInfo", js.undefined)
    
    @scala.inline
    def setThumbnail(value: File): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
