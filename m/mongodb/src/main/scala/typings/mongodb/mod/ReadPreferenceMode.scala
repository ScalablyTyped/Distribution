package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.primary
  - typings.mongodb.mongodbStrings.primaryPreferred
  - typings.mongodb.mongodbStrings.secondary
  - typings.mongodb.mongodbStrings.secondaryPreferred
  - typings.mongodb.mongodbStrings.nearest
*/
trait ReadPreferenceMode
  extends StObject
     with ReadPreferenceOrMode
object ReadPreferenceMode {
  
  inline def nearest: typings.mongodb.mongodbStrings.nearest = "nearest".asInstanceOf[typings.mongodb.mongodbStrings.nearest]
  
  inline def primary: typings.mongodb.mongodbStrings.primary = "primary".asInstanceOf[typings.mongodb.mongodbStrings.primary]
  
  inline def primaryPreferred: typings.mongodb.mongodbStrings.primaryPreferred = "primaryPreferred".asInstanceOf[typings.mongodb.mongodbStrings.primaryPreferred]
  
  inline def secondary: typings.mongodb.mongodbStrings.secondary = "secondary".asInstanceOf[typings.mongodb.mongodbStrings.secondary]
  
  inline def secondaryPreferred: typings.mongodb.mongodbStrings.secondaryPreferred = "secondaryPreferred".asInstanceOf[typings.mongodb.mongodbStrings.secondaryPreferred]
}
