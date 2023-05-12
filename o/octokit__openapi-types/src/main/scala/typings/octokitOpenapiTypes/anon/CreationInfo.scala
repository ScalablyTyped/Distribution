package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationInfo extends StObject {
  
  /**
    * @description The SPDX identifier for the SPDX document.
    * @example SPDXRef-DOCUMENT
    */
  var SPDXID: String
  
  var creationInfo: Created
  
  /**
    * @description The license under which the SPDX document is licensed.
    * @example CC0-1.0
    */
  var dataLicense: String
  
  /** @description The name of the repository that the SPDX document describes. */
  var documentDescribes: js.Array[String]
  
  /**
    * @description The namespace for the SPDX document.
    * @example https://github.com/example/dependency_graph/sbom-123
    */
  var documentNamespace: String
  
  /**
    * @description The name of the SPDX document.
    * @example github/github
    */
  var name: String
  
  var packages: js.Array[DownloadLocation]
  
  /**
    * @description The version of the SPDX specification that this document conforms to.
    * @example SPDX-2.3
    */
  var spdxVersion: String
}
object CreationInfo {
  
  inline def apply(
    SPDXID: String,
    creationInfo: Created,
    dataLicense: String,
    documentDescribes: js.Array[String],
    documentNamespace: String,
    name: String,
    packages: js.Array[DownloadLocation],
    spdxVersion: String
  ): CreationInfo = {
    val __obj = js.Dynamic.literal(SPDXID = SPDXID.asInstanceOf[js.Any], creationInfo = creationInfo.asInstanceOf[js.Any], dataLicense = dataLicense.asInstanceOf[js.Any], documentDescribes = documentDescribes.asInstanceOf[js.Any], documentNamespace = documentNamespace.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], spdxVersion = spdxVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreationInfo] (val x: Self) extends AnyVal {
    
    inline def setCreationInfo(value: Created): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
    
    inline def setDataLicense(value: String): Self = StObject.set(x, "dataLicense", value.asInstanceOf[js.Any])
    
    inline def setDocumentDescribes(value: js.Array[String]): Self = StObject.set(x, "documentDescribes", value.asInstanceOf[js.Any])
    
    inline def setDocumentDescribesVarargs(value: String*): Self = StObject.set(x, "documentDescribes", js.Array(value*))
    
    inline def setDocumentNamespace(value: String): Self = StObject.set(x, "documentNamespace", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: js.Array[DownloadLocation]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesVarargs(value: DownloadLocation*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setSPDXID(value: String): Self = StObject.set(x, "SPDXID", value.asInstanceOf[js.Any])
    
    inline def setSpdxVersion(value: String): Self = StObject.set(x, "spdxVersion", value.asInstanceOf[js.Any])
  }
}
