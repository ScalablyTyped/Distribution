package typings.meteor.mongoMod.Mongo

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectID extends js.Object {
  
  def equals(otherID: ObjectID): Boolean = js.native
  
  def toHexString(): String = js.native
}
@JSImport("meteor/mongo", "Mongo.ObjectID")
@js.native
object ObjectID extends TopLevel[ObjectIDStatic]
