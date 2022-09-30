package typings.mongodb.mod

import typings.mongodb.mongodbStrings.after
import typings.mongodb.mongodbStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.before
  - typings.mongodb.mongodbStrings.after
*/
trait ReturnDocument extends StObject
/* Inlined std.Readonly<{ readonly BEFORE :'before',  readonly AFTER :'after'}> */
object ReturnDocument {
  
  @JSImport("mongodb", "ReturnDocument.AFTER")
  @js.native
  val AFTER: after = js.native
  
  @JSImport("mongodb", "ReturnDocument.BEFORE")
  @js.native
  val BEFORE: before = js.native
}
