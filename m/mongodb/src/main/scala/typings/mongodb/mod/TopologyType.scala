package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.Sharded
  - typings.mongodb.mongodbStrings.Unknown
  - typings.mongodb.mongodbStrings.Single
  - typings.mongodb.mongodbStrings.ReplicaSetNoPrimary
  - typings.mongodb.mongodbStrings.ReplicaSetWithPrimary
  - typings.mongodb.mongodbStrings.LoadBalanced
*/
trait TopologyType extends StObject
/* Inlined std.Readonly<{ readonly Single :'Single',  readonly ReplicaSetNoPrimary :'ReplicaSetNoPrimary',  readonly ReplicaSetWithPrimary :'ReplicaSetWithPrimary',  readonly Sharded :'Sharded',  readonly Unknown :'Unknown',  readonly LoadBalanced :'LoadBalanced'}> */
object TopologyType {
  
  @JSImport("mongodb", "TopologyType.LoadBalanced")
  @js.native
  val LoadBalanced: typings.mongodb.mongodbStrings.LoadBalanced = js.native
  
  @JSImport("mongodb", "TopologyType.ReplicaSetNoPrimary")
  @js.native
  val ReplicaSetNoPrimary: typings.mongodb.mongodbStrings.ReplicaSetNoPrimary = js.native
  
  @JSImport("mongodb", "TopologyType.ReplicaSetWithPrimary")
  @js.native
  val ReplicaSetWithPrimary: typings.mongodb.mongodbStrings.ReplicaSetWithPrimary = js.native
  
  @JSImport("mongodb", "TopologyType.Sharded")
  @js.native
  val Sharded: typings.mongodb.mongodbStrings.Sharded = js.native
  
  @JSImport("mongodb", "TopologyType.Single")
  @js.native
  val Single: typings.mongodb.mongodbStrings.Single = js.native
  
  @JSImport("mongodb", "TopologyType.Unknown")
  @js.native
  val Unknown: typings.mongodb.mongodbStrings.Unknown = js.native
}
