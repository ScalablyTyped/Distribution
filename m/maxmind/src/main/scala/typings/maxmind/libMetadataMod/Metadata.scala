package typings.maxmind.libMetadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  val binaryFormatMajorVersion: Double
  val binaryFormatMinorVersion: Double
  val buildEpoch: Date
  val databaseType: String
  val description: js.Any
  val ipVersion: Double
  val languages: js.Array[String]
  val nodeByteSize: Double
  val nodeCount: Double
  val recordSize: Double
  val searchTreeSize: Double
  val treeDepth: Double
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
    val __obj = js.Dynamic.literal(binaryFormatMajorVersion = binaryFormatMajorVersion, binaryFormatMinorVersion = binaryFormatMinorVersion, buildEpoch = buildEpoch, databaseType = databaseType, description = description, ipVersion = ipVersion, languages = languages, nodeByteSize = nodeByteSize, nodeCount = nodeCount, recordSize = recordSize, searchTreeSize = searchTreeSize, treeDepth = treeDepth)
  
    __obj.asInstanceOf[Metadata]
  }
}

