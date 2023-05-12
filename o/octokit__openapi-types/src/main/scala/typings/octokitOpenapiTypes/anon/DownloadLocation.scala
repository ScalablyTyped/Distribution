package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadLocation extends StObject {
  
  /**
    * @description A unique SPDX identifier for the package.
    * @example SPDXRef-Package
    */
  var SPDXID: js.UndefOr[String] = js.undefined
  
  /**
    * @description The location where the package can be downloaded,
    * or NOASSERTION if this has not been determined.
    * @example NOASSERTION
    */
  var downloadLocation: js.UndefOr[String] = js.undefined
  
  var externalRefs: js.UndefOr[js.Array[ReferenceCategory]] = js.undefined
  
  /**
    * @description Whether the package's file content has been subjected to
    * analysis during the creation of the SPDX document.
    * @example false
    */
  var filesAnalyzed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The license of the package as determined while creating the SPDX document.
    * @example MIT
    */
  var licenseConcluded: js.UndefOr[String] = js.undefined
  
  /**
    * @description The license of the package as declared by its author, or NOASSERTION if this information
    * was not available when the SPDX document was created.
    * @example NOASSERTION
    */
  var licenseDeclared: js.UndefOr[String] = js.undefined
  
  /**
    * @description The name of the package.
    * @example rubygems:github/github
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The distribution source of this package, or NOASSERTION if this was not determined.
    * @example NOASSERTION
    */
  var supplier: js.UndefOr[String] = js.undefined
  
  /**
    * @description The version of the package. If the package does not have an exact version specified,
    * a version range is given.
    * @example 1.0.0
    */
  var versionInfo: js.UndefOr[String] = js.undefined
}
object DownloadLocation {
  
  inline def apply(): DownloadLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadLocation] (val x: Self) extends AnyVal {
    
    inline def setDownloadLocation(value: String): Self = StObject.set(x, "downloadLocation", value.asInstanceOf[js.Any])
    
    inline def setDownloadLocationUndefined: Self = StObject.set(x, "downloadLocation", js.undefined)
    
    inline def setExternalRefs(value: js.Array[ReferenceCategory]): Self = StObject.set(x, "externalRefs", value.asInstanceOf[js.Any])
    
    inline def setExternalRefsUndefined: Self = StObject.set(x, "externalRefs", js.undefined)
    
    inline def setExternalRefsVarargs(value: ReferenceCategory*): Self = StObject.set(x, "externalRefs", js.Array(value*))
    
    inline def setFilesAnalyzed(value: Boolean): Self = StObject.set(x, "filesAnalyzed", value.asInstanceOf[js.Any])
    
    inline def setFilesAnalyzedUndefined: Self = StObject.set(x, "filesAnalyzed", js.undefined)
    
    inline def setLicenseConcluded(value: String): Self = StObject.set(x, "licenseConcluded", value.asInstanceOf[js.Any])
    
    inline def setLicenseConcludedUndefined: Self = StObject.set(x, "licenseConcluded", js.undefined)
    
    inline def setLicenseDeclared(value: String): Self = StObject.set(x, "licenseDeclared", value.asInstanceOf[js.Any])
    
    inline def setLicenseDeclaredUndefined: Self = StObject.set(x, "licenseDeclared", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSPDXID(value: String): Self = StObject.set(x, "SPDXID", value.asInstanceOf[js.Any])
    
    inline def setSPDXIDUndefined: Self = StObject.set(x, "SPDXID", js.undefined)
    
    inline def setSupplier(value: String): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setVersionInfo(value: String): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
