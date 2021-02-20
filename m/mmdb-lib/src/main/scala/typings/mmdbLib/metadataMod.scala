package typings.mmdbLib

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("mmdb-lib/lib/metadata", "isLegacyFormat")
  @js.native
  def isLegacyFormat(db: Buffer): Boolean = js.native
  
  @JSImport("mmdb-lib/lib/metadata", "parseMetadata")
  @js.native
  def parseMetadata(db: Buffer): Metadata = js.native
  
  @js.native
  trait Metadata extends StObject {
    
    val binaryFormatMajorVersion: Double = js.native
    
    val binaryFormatMinorVersion: Double = js.native
    
    val buildEpoch: Date = js.native
    
    val databaseType: String = js.native
    
    val description: String = js.native
    
    val ipVersion: Double = js.native
    
    val languages: js.Array[String] = js.native
    
    val nodeByteSize: Double = js.native
    
    val nodeCount: Double = js.native
    
    val recordSize: Double = js.native
    
    val searchTreeSize: Double = js.native
    
    val treeDepth: Double = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(
      binaryFormatMajorVersion: Double,
      binaryFormatMinorVersion: Double,
      buildEpoch: Date,
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
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaryFormatMajorVersion(value: Double): Self = StObject.set(x, "binaryFormatMajorVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryFormatMinorVersion(value: Double): Self = StObject.set(x, "binaryFormatMinorVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildEpoch(value: Date): Self = StObject.set(x, "buildEpoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseType(value: String): Self = StObject.set(x, "databaseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpVersion(value: Double): Self = StObject.set(x, "ipVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
      
      @scala.inline
      def setNodeByteSize(value: Double): Self = StObject.set(x, "nodeByteSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordSize(value: Double): Self = StObject.set(x, "recordSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTreeSize(value: Double): Self = StObject.set(x, "searchTreeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDepth(value: Double): Self = StObject.set(x, "treeDepth", value.asInstanceOf[js.Any])
    }
  }
}
