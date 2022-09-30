package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.available
  - typings.mongodb.mongodbStrings.local
  - typings.mongodb.mongodbStrings.snapshot
  - typings.mongodb.mongodbStrings.linearizable
  - typings.mongodb.mongodbStrings.majority
*/
trait ReadConcernLevel
  extends StObject
     with ReadConcernLike
/* Inlined std.Readonly<{ readonly local :'local',  readonly majority :'majority',  readonly linearizable :'linearizable',  readonly available :'available',  readonly snapshot :'snapshot'}> */
object ReadConcernLevel {
  
  @JSImport("mongodb", "ReadConcernLevel.available")
  @js.native
  val available: typings.mongodb.mongodbStrings.available = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.linearizable")
  @js.native
  val linearizable: typings.mongodb.mongodbStrings.linearizable = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.local")
  @js.native
  val local: typings.mongodb.mongodbStrings.local = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.majority")
  @js.native
  val majority: typings.mongodb.mongodbStrings.majority = js.native
  
  @JSImport("mongodb", "ReadConcernLevel.snapshot")
  @js.native
  val snapshot: typings.mongodb.mongodbStrings.snapshot = js.native
}
