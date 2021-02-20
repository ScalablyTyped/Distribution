package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://mongodb.github.io/node-mongodb-native/3.1/api/global.html#ReadConcern
/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.local
  - typings.mongodb.mongodbStrings.available
  - typings.mongodb.mongodbStrings.majority
  - typings.mongodb.mongodbStrings.linearizable
  - typings.mongodb.mongodbStrings.snapshot
*/
trait ReadConcernLevel extends StObject
object ReadConcernLevel {
  
  @scala.inline
  def available: typings.mongodb.mongodbStrings.available = "available".asInstanceOf[typings.mongodb.mongodbStrings.available]
  
  @scala.inline
  def linearizable: typings.mongodb.mongodbStrings.linearizable = "linearizable".asInstanceOf[typings.mongodb.mongodbStrings.linearizable]
  
  @scala.inline
  def local: typings.mongodb.mongodbStrings.local = "local".asInstanceOf[typings.mongodb.mongodbStrings.local]
  
  @scala.inline
  def majority: typings.mongodb.mongodbStrings.majority = "majority".asInstanceOf[typings.mongodb.mongodbStrings.majority]
  
  @scala.inline
  def snapshot: typings.mongodb.mongodbStrings.snapshot = "snapshot".asInstanceOf[typings.mongodb.mongodbStrings.snapshot]
}
