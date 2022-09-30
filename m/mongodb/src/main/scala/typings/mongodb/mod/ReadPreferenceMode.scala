package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.nearest
  - typings.mongodb.mongodbStrings.primary
  - typings.mongodb.mongodbStrings.primaryPreferred
  - typings.mongodb.mongodbStrings.secondary
  - typings.mongodb.mongodbStrings.secondaryPreferred
*/
trait ReadPreferenceMode
  extends StObject
     with ReadPreferenceLike
/* Inlined std.Readonly<{ readonly primary :'primary',  readonly primaryPreferred :'primaryPreferred',  readonly secondary :'secondary',  readonly secondaryPreferred :'secondaryPreferred',  readonly nearest :'nearest'}> */
object ReadPreferenceMode {
  
  @JSImport("mongodb", "ReadPreferenceMode.nearest")
  @js.native
  val nearest: typings.mongodb.mongodbStrings.nearest = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.primary")
  @js.native
  val primary: typings.mongodb.mongodbStrings.primary = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.primaryPreferred")
  @js.native
  val primaryPreferred: typings.mongodb.mongodbStrings.primaryPreferred = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.secondary")
  @js.native
  val secondary: typings.mongodb.mongodbStrings.secondary = js.native
  
  @JSImport("mongodb", "ReadPreferenceMode.secondaryPreferred")
  @js.native
  val secondaryPreferred: typings.mongodb.mongodbStrings.secondaryPreferred = js.native
}
