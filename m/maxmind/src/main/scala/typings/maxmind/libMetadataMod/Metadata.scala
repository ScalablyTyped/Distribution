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
    val __obj = js.Dynamic.literal(binaryFormatMajorVersion = binaryFormatMajorVersion.asInstanceOf[js.Any], binaryFormatMinorVersion = binaryFormatMinorVersion.asInstanceOf[js.Any], buildEpoch = buildEpoch.asInstanceOf[js.Any], databaseType = databaseType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ipVersion = ipVersion.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], nodeByteSize = nodeByteSize.asInstanceOf[js.Any], nodeCount = nodeCount.asInstanceOf[js.Any], recordSize = recordSize.asInstanceOf[js.Any], searchTreeSize = searchTreeSize.asInstanceOf[js.Any], treeDepth = treeDepth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

