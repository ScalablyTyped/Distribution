package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the collection of {@link Word.CustomXmlPart} objects with a specific namespace.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@JSGlobal("Word.CustomXmlPartScopedCollection")
@js.native
open class CustomXmlPartScopedCollection ()
  extends StObject
     with typings.officeJs.Word.CustomXmlPartScopedCollection {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
