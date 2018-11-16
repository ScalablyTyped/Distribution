package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A class that is used to access all of the children of a many-to-many relationship.
     * Each instance of Parse.Relation is associated with a particular parent object and key.
     */
@JSGlobal("Parse.Relation")
@js.native
class Relation[S /* <: js.Object */, T /* <: js.Object */] () extends BaseObject {
  def this(parent: S) = this()
  def this(parent: S, key: java.lang.String) = this()
  var key: java.lang.String = js.native
  var parent: S = js.native
  var targetClassName: java.lang.String = js.native
  //Adds a Parse.Object or an array of Parse.Objects to the relation.
  def add(`object`: T): scala.Unit = js.native
  //Adds a Parse.Object or an array of Parse.Objects to the relation.
  def add(`object`: js.Array[T]): scala.Unit = js.native
  // Returns a Parse.Query that is limited to objects in this relation.
  def query(): Query[T] = js.native
  // Removes a Parse.Object or an array of Parse.Objects from this relation.
  def remove(`object`: T): scala.Unit = js.native
  // Removes a Parse.Object or an array of Parse.Objects from this relation.
  def remove(`object`: js.Array[T]): scala.Unit = js.native
}

