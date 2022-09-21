package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that is used to access all of the children of a many-to-many relationship.
  * Each instance of Parse.Relation is associated with a particular parent object and key.
  */
@JSGlobal("Parse.Relation")
@js.native
open class Relation[S /* <: Object[Attributes] */, T /* <: Object[Attributes] */] () extends StObject {
  def this(parent: S) = this()
  def this(parent: S, key: String) = this()
  def this(parent: Unit, key: String) = this()
  
  // Adds a Parse.Object or an array of Parse.Objects to the relation.
  def add(`object`: T): Unit = js.native
  def add(`object`: js.Array[T]): Unit = js.native
  
  var key: String = js.native
  
  var parent: S = js.native
  
  // Returns a Parse.Query that is limited to objects in this relation.
  def query(): Query[T] = js.native
  
  // Removes a Parse.Object or an array of Parse.Objects from this relation.
  def remove(`object`: T): Unit = js.native
  def remove(`object`: js.Array[T]): Unit = js.native
  
  var targetClassName: String = js.native
  
  def toJSON(): Any = js.native
}
