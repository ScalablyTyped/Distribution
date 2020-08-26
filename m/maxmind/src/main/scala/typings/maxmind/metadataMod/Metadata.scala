package typings.maxmind.metadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  val binaryFormatMajorVersion: Double = js.native
  val binaryFormatMinorVersion: Double = js.native
  val buildEpoch: Date = js.native
  val databaseType: String = js.native
  val description: js.Any = js.native
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
    description: js.Any,
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
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinaryFormatMajorVersion(value: Double): Self = this.set("binaryFormatMajorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinaryFormatMinorVersion(value: Double): Self = this.set("binaryFormatMinorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildEpoch(value: Date): Self = this.set("buildEpoch", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseType(value: String): Self = this.set("databaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: js.Any): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpVersion(value: Double): Self = this.set("ipVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeByteSize(value: Double): Self = this.set("nodeByteSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeCount(value: Double): Self = this.set("nodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordSize(value: Double): Self = this.set("recordSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchTreeSize(value: Double): Self = this.set("searchTreeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDepth(value: Double): Self = this.set("treeDepth", value.asInstanceOf[js.Any])
  }
  
}

