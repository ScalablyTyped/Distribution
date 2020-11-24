package typings.parseConflictJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If prefer is set to theirs, then the vaules of theirs and ours are switched in the resolver function.
  * (Ie, we'll apply their changes on top of our object, rather than the other way around.)
  * Parse the conflicted file into 3 pieces: ours, theirs, and parent
  * Get the diff from parent to ours.
  * Apply each change of that diff to theirs.
  * If any change in the diff set cannot be applied (ie, because they changed an object into a non-object and we changed a field on that object),
  * then replace the object at the specified path with the object at the path in ours.
  */
/* Rewritten from type alias, can be one of: 
  - typings.parseConflictJson.parseConflictJsonStrings.theirs
  - typings.parseConflictJson.parseConflictJsonStrings.ours
*/
trait Prefer extends js.Object
object Prefer {
  
  @scala.inline
  def ours: typings.parseConflictJson.parseConflictJsonStrings.ours = "ours".asInstanceOf[typings.parseConflictJson.parseConflictJsonStrings.ours]
  
  @scala.inline
  def theirs: typings.parseConflictJson.parseConflictJsonStrings.theirs = "theirs".asInstanceOf[typings.parseConflictJson.parseConflictJsonStrings.theirs]
}
