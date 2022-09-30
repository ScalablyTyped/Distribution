package typings.meteor.global

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ReactiveDict")
@js.native
/**
  * Constructor for a ReactiveDict, which represents a reactive dictionary of key/value pairs.
  * @param name When a name is passed, preserves contents across Hot Code Pushes
  * @param initialValue The default values for the dictionary
  */
open class ReactiveDict[O] ()
  extends StObject
     with typings.meteor.ReactiveDict[O] {
  def this(name: String) = this()
  def this(name: String, initialValue: Partial[O]) = this()
  def this(name: Unit, initialValue: Partial[O]) = this()
}
