package typings.parseConflictJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse a JSON string that has git merge conflicts, resolving if possible.
    * If the JSON is valid, it just does JSON.parse as normal.
    * If either side of the conflict is invalid JSON, then an error is thrown for that.
    */
  inline def apply(text: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any],
    prefer: Prefer
  ): js.Any = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], prefer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(text: String, reviver: Unit, prefer: Prefer): js.Any = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], prefer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("parse-conflict-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * returns true if the data looks like a conflicted diff file
    */
  inline def isDiff(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiff")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  trait Prefer extends StObject
  object Prefer {
    
    inline def ours: typings.parseConflictJson.parseConflictJsonStrings.ours = "ours".asInstanceOf[typings.parseConflictJson.parseConflictJsonStrings.ours]
    
    inline def theirs: typings.parseConflictJson.parseConflictJsonStrings.theirs = "theirs".asInstanceOf[typings.parseConflictJson.parseConflictJsonStrings.theirs]
  }
}
