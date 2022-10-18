package typings.mongodb.mod

import typings.bson.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "TopologyDescription")
@js.native
open class TopologyDescription protected () extends StObject {
  /**
    * Create a TopologyDescription
    */
  def this(
    topologyType: TopologyType,
    serverDescriptions: js.UndefOr[(typings.std.Map[String, ServerDescription]) | Null],
    setName: js.UndefOr[String | Null],
    maxSetVersion: js.UndefOr[scala.Double | Null],
    maxElectionId: js.UndefOr[ObjectId | Null],
    commonWireVersion: js.UndefOr[scala.Double | Null],
    options: js.UndefOr[TopologyDescriptionOptions | Null]
  ) = this()
  
  var commonWireVersion: scala.Double = js.native
  
  var compatibilityError: js.UndefOr[String] = js.native
  
  var compatible: Boolean = js.native
  
  /* Excluded from this release type: updateFromSrvPollingEvent */
  /* Excluded from this release type: update */
  def error: MongoServerError | Null = js.native
  
  /**
    * Determines if this topology description has a data-bearing server available.
    */
  def hasDataBearingServers: Boolean = js.native
  
  /**
    * Determines if the topology description has any known servers
    */
  def hasKnownServers: Boolean = js.native
  
  var heartbeatFrequencyMS: scala.Double = js.native
  
  var localThresholdMS: scala.Double = js.native
  
  var logicalSessionTimeoutMinutes: scala.Double | Null = js.native
  
  var maxElectionId: ObjectId | Null = js.native
  
  var maxSetVersion: scala.Double | Null = js.native
  
  var servers: typings.std.Map[String, ServerDescription] = js.native
  
  var setName: String | Null = js.native
  
  var stale: Boolean = js.native
  
  var `type`: TopologyType = js.native
}
