package typings.mongodb.mod

import typings.bson.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerDescription")
@js.native
open class ServerDescription () extends StObject {
  
  @JSName("$clusterTime")
  var $clusterTime: js.UndefOr[ClusterTime] = js.native
  
  var address: String = js.native
  
  def allHosts: js.Array[String] = js.native
  
  var arbiters: js.Array[String] = js.native
  
  var electionId: ObjectId | Null = js.native
  
  /**
    * Determines if another `ServerDescription` is equal to this one per the rules defined
    * in the {@link https://github.com/mongodb/specifications/blob/master/source/server-discovery-and-monitoring/server-discovery-and-monitoring.rst#serverdescription|SDAM spec}
    */
  def equals(): Boolean = js.native
  def equals(other: ServerDescription): Boolean = js.native
  
  var error: MongoError | Null = js.native
  
  def host: String = js.native
  
  /* Excluded from this release type: __constructor */
  def hostAddress: HostAddress = js.native
  
  var hosts: js.Array[String] = js.native
  
  /** Is this server data bearing */
  def isDataBearing: Boolean = js.native
  
  /** Is this server available for reads*/
  def isReadable: Boolean = js.native
  
  /** Is this server available for writes */
  def isWritable: Boolean = js.native
  
  var lastUpdateTime: scala.Double = js.native
  
  var lastWriteDate: scala.Double = js.native
  
  var logicalSessionTimeoutMinutes: scala.Double | Null = js.native
  
  var maxWireVersion: scala.Double = js.native
  
  var me: String | Null = js.native
  
  var minWireVersion: scala.Double = js.native
  
  var passives: js.Array[String] = js.native
  
  def port: scala.Double = js.native
  
  var primary: String | Null = js.native
  
  var roundTripTime: scala.Double = js.native
  
  var setName: String | Null = js.native
  
  var setVersion: scala.Double | Null = js.native
  
  var tags: TagSet = js.native
  
  var topologyVersion: TopologyVersion | Null = js.native
  
  var `type`: ServerType = js.native
}
