package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.RSGhost
  - typings.mongodb.mongodbStrings.RSArbiter
  - typings.mongodb.mongodbStrings.Unknown
  - typings.mongodb.mongodbStrings.Standalone
  - typings.mongodb.mongodbStrings.PossiblePrimary
  - typings.mongodb.mongodbStrings.RSSecondary
  - typings.mongodb.mongodbStrings.LoadBalancer
  - typings.mongodb.mongodbStrings.RSPrimary
  - typings.mongodb.mongodbStrings.RSOther
  - typings.mongodb.mongodbStrings.Mongos
*/
trait ServerType extends StObject
/* Inlined std.Readonly<{ readonly Standalone :'Standalone',  readonly Mongos :'Mongos',  readonly PossiblePrimary :'PossiblePrimary',  readonly RSPrimary :'RSPrimary',  readonly RSSecondary :'RSSecondary',  readonly RSArbiter :'RSArbiter',  readonly RSOther :'RSOther',  readonly RSGhost :'RSGhost',  readonly Unknown :'Unknown',  readonly LoadBalancer :'LoadBalancer'}> */
object ServerType {
  
  @JSImport("mongodb", "ServerType.LoadBalancer")
  @js.native
  val LoadBalancer: typings.mongodb.mongodbStrings.LoadBalancer = js.native
  
  @JSImport("mongodb", "ServerType.Mongos")
  @js.native
  val Mongos: typings.mongodb.mongodbStrings.Mongos = js.native
  
  @JSImport("mongodb", "ServerType.PossiblePrimary")
  @js.native
  val PossiblePrimary: typings.mongodb.mongodbStrings.PossiblePrimary = js.native
  
  @JSImport("mongodb", "ServerType.RSArbiter")
  @js.native
  val RSArbiter: typings.mongodb.mongodbStrings.RSArbiter = js.native
  
  @JSImport("mongodb", "ServerType.RSGhost")
  @js.native
  val RSGhost: typings.mongodb.mongodbStrings.RSGhost = js.native
  
  @JSImport("mongodb", "ServerType.RSOther")
  @js.native
  val RSOther: typings.mongodb.mongodbStrings.RSOther = js.native
  
  @JSImport("mongodb", "ServerType.RSPrimary")
  @js.native
  val RSPrimary: typings.mongodb.mongodbStrings.RSPrimary = js.native
  
  @JSImport("mongodb", "ServerType.RSSecondary")
  @js.native
  val RSSecondary: typings.mongodb.mongodbStrings.RSSecondary = js.native
  
  @JSImport("mongodb", "ServerType.Standalone")
  @js.native
  val Standalone: typings.mongodb.mongodbStrings.Standalone = js.native
  
  @JSImport("mongodb", "ServerType.Unknown")
  @js.native
  val Unknown: typings.mongodb.mongodbStrings.Unknown = js.native
}
