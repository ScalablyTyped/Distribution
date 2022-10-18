package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveOptions extends StObject
@JSImport("photoshop/dom/Constants", "SaveOptions")
@js.native
object SaveOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SaveOptions & Double] = js.native
  
  /**
    * Will close document without saving, discarding changes
    */
  @js.native
  sealed trait DONOTSAVECHANGES
    extends StObject
       with SaveOptions
  /* 0 */ val DONOTSAVECHANGES: typings.photoshop.domConstantsMod.SaveOptions.DONOTSAVECHANGES & Double = js.native
  
  /**
    * Will ask the user if they'd like to save changes, blocking the script
    */
  @js.native
  sealed trait PROMPTTOSAVECHANGES
    extends StObject
       with SaveOptions
  /* 1 */ val PROMPTTOSAVECHANGES: typings.photoshop.domConstantsMod.SaveOptions.PROMPTTOSAVECHANGES & Double = js.native
  
  /**
    * Will save all existing changes before closing, prompting if document is not saved yet
    */
  @js.native
  sealed trait SAVECHANGES
    extends StObject
       with SaveOptions
  /* 2 */ val SAVECHANGES: typings.photoshop.domConstantsMod.SaveOptions.SAVECHANGES & Double = js.native
}
