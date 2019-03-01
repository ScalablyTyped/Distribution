package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  val binaryFormatMajorVersion: scala.Double
  val binaryFormatMinorVersion: scala.Double
  val buildEpoch: stdLib.Date
  val databaseType: java.lang.String
  val description: js.Any
  val ipVersion: scala.Double
  val languages: js.Array[java.lang.String]
  val nodeByteSize: scala.Double
  val nodeCount: scala.Double
  val recordSize: scala.Double
  val searchTreeSize: scala.Double
  val treeDepth: scala.Double
}

object Metadata {
  @scala.inline
  def apply(
    binaryFormatMajorVersion: scala.Double,
    binaryFormatMinorVersion: scala.Double,
    buildEpoch: stdLib.Date,
    databaseType: java.lang.String,
    description: js.Any,
    ipVersion: scala.Double,
    languages: js.Array[java.lang.String],
    nodeByteSize: scala.Double,
    nodeCount: scala.Double,
    recordSize: scala.Double,
    searchTreeSize: scala.Double,
    treeDepth: scala.Double
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binaryFormatMajorVersion")(binaryFormatMajorVersion)
    __obj.updateDynamic("binaryFormatMinorVersion")(binaryFormatMinorVersion)
    __obj.updateDynamic("buildEpoch")(buildEpoch)
    __obj.updateDynamic("databaseType")(databaseType)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("ipVersion")(ipVersion)
    __obj.updateDynamic("languages")(languages)
    __obj.updateDynamic("nodeByteSize")(nodeByteSize)
    __obj.updateDynamic("nodeCount")(nodeCount)
    __obj.updateDynamic("recordSize")(recordSize)
    __obj.updateDynamic("searchTreeSize")(searchTreeSize)
    __obj.updateDynamic("treeDepth")(treeDepth)
    __obj.asInstanceOf[Metadata]
  }
}

