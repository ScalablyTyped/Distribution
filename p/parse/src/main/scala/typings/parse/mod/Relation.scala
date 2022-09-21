package typings.parse.mod

import typings.parse.mod.global.Parse.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that is used to access all of the children of a many-to-many relationship.
  * Each instance of Parse.Relation is associated with a particular parent object and key.
  */
@JSImport("parse", "Relation")
@js.native
open class Relation[S /* <: typings.parse.mod.global.Parse.Object[Attributes] */, T /* <: typings.parse.mod.global.Parse.Object[Attributes] */] ()
  extends typings.parse.mod.global.Parse.Relation[S, T] {
  def this(parent: S) = this()
  def this(parent: S, key: String) = this()
  def this(parent: Unit, key: String) = this()
}
