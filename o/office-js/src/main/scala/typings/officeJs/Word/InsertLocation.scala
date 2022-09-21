package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertLocation extends StObject
/**
  * The insertion location types.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  *
  * To be used with an API call, such as `obj.insertSomething(newStuff, location);`.
  * If the location is "Before" or "After", the new content will be outside of the modified object.
  * If the location is "Start" or "End", the new content will be included as part of the modified object.
  */
@JSGlobal("Word.InsertLocation")
@js.native
object InsertLocation extends StObject {
  
  /**
    * Add content after the contents of the calling object.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait after
    extends StObject
       with InsertLocation
  
  /**
    * Add content before the contents of the calling object.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait before
    extends StObject
       with InsertLocation
  
  /**
    * Append content to the contents of the calling object.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait end
    extends StObject
       with InsertLocation
  
  /**
    * Replace the contents of the current object.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait replace
    extends StObject
       with InsertLocation
  
  /**
    * Prepend content to the contents of the calling object.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait start
    extends StObject
       with InsertLocation
}
