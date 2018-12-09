package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A class that is used to access all of the children of a many-to-many relationship.
     * Each instance of Parse.Relation is associated with a particular parent object and key.
     */
@JSImport("parse", "Relation")
@js.native
class Relation[S /* <: parseLib.ParseNs.Object */, T /* <: parseLib.ParseNs.Object */] ()
  extends parseLib.nodeMod.Relation[S, T] {
  def this(parent: S) = this()
  def this(parent: S, key: java.lang.String) = this()
}

