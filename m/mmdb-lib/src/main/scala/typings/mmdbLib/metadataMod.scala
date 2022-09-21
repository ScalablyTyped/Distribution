package typings.mmdbLib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("mmdb-lib/lib/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLegacyFormat(db: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyFormat")(db.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseMetadata(db: Buffer): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMetadata")(db.asInstanceOf[js.Any]).asInstanceOf[Metadata]
  
  trait Metadata extends StObject {
    
    val binaryFormatMajorVersion: Double
    
    val binaryFormatMinorVersion: Double
    
    val buildEpoch: js.Date
    
    val databaseType: String
    
    val description: String
    
    val ipVersion: Double
    
    val languages: js.Array[String]
    
    val nodeByteSize: Double
    
    val nodeCount: Double
    
    val recordSize: Double
    
    val searchTreeSize: Double
    
    val treeDepth: Double
  }
  object Metadata {
    
    inline def apply(
      binaryFormatMajorVersion: Double,
      binaryFormatMinorVersion: Double,
      buildEpoch: js.Date,
      databaseType: String,
      description: String,
      ipVersion: Double,
      languages: js.Array[String],
      nodeByteSize: Double,
      nodeCount: Double,
      recordSize: Double,
      searchTreeSize: Double,
      treeDepth: Double
    ): Metadata = {
      val __obj = js.Dynamic.literal(binaryFormatMajorVersion = binaryFormatMajorVersion.asInstanceOf[js.Any], binaryFormatMinorVersion = binaryFormatMinorVersion.asInstanceOf[js.Any], buildEpoch = buildEpoch.asInstanceOf[js.Any], databaseType = databaseType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ipVersion = ipVersion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], nodeByteSize = nodeByteSize.asInstanceOf[js.Any], nodeCount = nodeCount.asInstanceOf[js.Any], recordSize = recordSize.asInstanceOf[js.Any], searchTreeSize = searchTreeSize.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setBinaryFormatMajorVersion(value: Double): Self = StObject.set(x, "binaryFormatMajorVersion", value.asInstanceOf[js.Any])
      
      inline def setBinaryFormatMinorVersion(value: Double): Self = StObject.set(x, "binaryFormatMinorVersion", value.asInstanceOf[js.Any])
      
      inline def setBuildEpoch(value: js.Date): Self = StObject.set(x, "buildEpoch", value.asInstanceOf[js.Any])
      
      inline def setDatabaseType(value: String): Self = StObject.set(x, "databaseType", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIpVersion(value: Double): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
      
      inline def setNodeByteSize(value: Double): Self = StObject.set(x, "nodeByteSize", value.asInstanceOf[js.Any])
      
      inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
      
      inline def setRecordSize(value: Double): Self = StObject.set(x, "recordSize", value.asInstanceOf[js.Any])
      
      inline def setSearchTreeSize(value: Double): Self = StObject.set(x, "searchTreeSize", value.asInstanceOf[js.Any])
      
      inline def setTreeDepth(value: Double): Self = StObject.set(x, "treeDepth", value.asInstanceOf[js.Any])
    }
  }
}
